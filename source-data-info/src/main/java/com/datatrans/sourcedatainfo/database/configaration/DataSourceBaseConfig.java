package com.datatrans.sourcedatainfo.database.configaration;

import com.alibaba.druid.pool.DruidDataSource;
import com.datatrans.sourcedatainfo.database.exception.ConfigException;
import com.datatrans.sourcedatainfo.database.pojo.DO.BaseDataSourceInfo;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

/**
 * @program: source-data-info
 * @description: Durid数据源基本配置
 * @author: zhouyp
 * @create: 2018-10-08
 */
@Component
public class DataSourceBaseConfig {

	private static final String BASE_DATASOURCE_NAME = "baseDatasourceConfig.properties";

	private Properties properties;

	DataSource dataSource;


	/**
	 * 加载数据源配置文件，使其成为一个全局缓存
	 * @throws IOException
	 */
	private void loadDataSourceProperties() throws IOException {
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(BASE_DATASOURCE_NAME);
		properties.load(inputStream);
	}


	/**
	 * 通过默认配置，以及给定的数据库类型，返回一个druid的datasource
	 * @param dataSourceInfo
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 */
	public DataSource loadBaseConfig(BaseDataSourceInfo dataSourceInfo) throws SQLException, IOException {
		DruidDataSource druidDataSource = new DruidDataSource();
		//先加载
		if (properties == null)
			loadDataSourceProperties();

		Optional<BaseDataSourceInfo> optional = Optional.of(dataSourceInfo);
		optional.filter(t -> t.getDriverClassName() != null)
				.filter(t -> t.getUrl() != null)
				.filter(t -> t.getUserName() != null)
				.filter(t -> t.getPassword() != null);
		if (optional.isPresent())
			throw new ConfigException("请传入正确的数据库配置信息！！！");

		druidDataSource.setDriverClassName(dataSourceInfo.getDriverClassName());
		druidDataSource.setUrl(dataSourceInfo.getUrl());
		druidDataSource.setUsername(dataSourceInfo.getUserName());
		druidDataSource.setPassword(dataSourceInfo.getPassword());


		druidDataSource.setInitialSize(Integer.parseInt(properties.getProperty("datasource.initialSize")));
		druidDataSource.setMinIdle(Integer.parseInt(properties.getProperty("datasource.minIdle")));
		druidDataSource.setMaxActive(Integer.parseInt(properties.getProperty("datasource.maxActive")));
		druidDataSource.setMaxWait(Integer.parseInt(properties.getProperty("datasource.maxWait")));
		druidDataSource.setTimeBetweenEvictionRunsMillis(
				Long.parseLong(properties.getProperty("datasource.timeBetweenEvictionRunsMillis")));
		druidDataSource.setMinEvictableIdleTimeMillis(
				Long.parseLong(properties.getProperty("datasource.minEvictableIdleTimeMillis")));
		druidDataSource.setValidationQuery(properties.getProperty("datasource.validationQuery"));
		druidDataSource.setTestWhileIdle(Boolean.parseBoolean(properties.getProperty("datasource.testWhileIdle")));
		druidDataSource.setTestOnBorrow(Boolean.parseBoolean(properties.getProperty("datasource.testOnBorrow")));
		druidDataSource.setTestOnReturn(Boolean.parseBoolean(properties.getProperty("datasource.testOnReturn")));
		druidDataSource.setPoolPreparedStatements(
				Boolean.parseBoolean(properties.getProperty("datasource.poolPreparedStatements")));
		druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(
				Integer.parseInt(properties.getProperty("datasource.maxPoolPreparedStatementPerConnectionSize")));
		druidDataSource.setFilters(properties.getProperty("datasource.filters"));
		druidDataSource.setDefaultAutoCommit(false);
		return druidDataSource;
	}

}
