package com.hantotem.datatrans.sourcedatainfo.database.pojo.vo;

import java.util.Map;

/**
 * @program: source-data-info
 * @description: 数据源类型
 * @author: zhouyp
 * @create: 2018-09-28
 */
public enum DataSourceType {
	MYSQL("MySQL"),ORACLE("Oracle"),POSTGRESQL("postresql");

	private String databaseType;

	DataSourceType(String databaseType){
		this.databaseType = databaseType;
	}

	public String getDatabaseType(){
		return this.databaseType;
	}

}
