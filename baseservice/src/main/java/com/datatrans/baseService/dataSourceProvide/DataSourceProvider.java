package com.hantotem.datatrans.baseService.dataSourceProvide;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: baseservice
 * @description: 数据源提供者
 * @author: zhouyp
 * @create: 2018-09-26
 */
public interface DataSourceProvider {

	String getDataSourceId();

	String getDatabaseDriverName();

	DataSource getDataSource();

	void setDataSource(Properties properties);

	void setDataSource(InputStream inputStream);

}
