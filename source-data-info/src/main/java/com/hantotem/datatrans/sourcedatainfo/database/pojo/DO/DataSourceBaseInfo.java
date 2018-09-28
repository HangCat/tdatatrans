package com.hantotem.datatrans.sourcedatainfo.database.pojo.DO;

import java.util.Map;

/**
 * @program: source-data-info
 * @description: 数据源基本信息
 * @author: zhouyp
 * @create: 2018-09-28
 */
public class DataSourceBaseInfo {

	private String databaseId;
	private String databaseName;
	private String tableSpace;
	private String jdbcUrl;
	private String port;
	private String name;
	private String password;
	private Map<String, String> datasourceProperty;

	public String getDatabaseId() {
		return databaseId;
	}

	public void setDatabaseId(String databaseId) {
		this.databaseId = databaseId;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getTableSpace() {
		return tableSpace;
	}

	public void setTableSpace(String tableSpace) {
		this.tableSpace = tableSpace;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, String> getDatasourceProperty() {
		return datasourceProperty;
	}

	public void setDatasourceProperty(Map<String, String> datasourceProperty) {
		this.datasourceProperty = datasourceProperty;
	}

}
