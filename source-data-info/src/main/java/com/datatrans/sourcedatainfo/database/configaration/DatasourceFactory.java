package com.datatrans.sourcedatainfo.database.configaration;

import com.alibaba.druid.pool.DruidDataSource;
import com.datatrans.sourcedatainfo.database.pojo.DO.DataSourceConnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @program: source-data-info
 * @description: 数据源创建工厂
 * @author: zhouyp
 * @create: 2018-10-08
 */
public class DatasourceFactory {

	@Autowired
	DataSourceBaseConfig baseConfig;

	public void asd(){

		DruidDataSource dataSource = new DruidDataSource();
		DataSourceConnInfo info = new DataSourceConnInfo();

		dataSource.setDriverClassName(info.getDriverClassName());
		dataSource.setUrl(info.getUrl());
		dataSource.setUsername(info.getUserName());
		dataSource.setPassword(info.getPassword());

		DataSourceBaseConfig baseConfig = new DataSourceBaseConfig();

		JdbcTemplate template = new JdbcTemplate();

	}

}
