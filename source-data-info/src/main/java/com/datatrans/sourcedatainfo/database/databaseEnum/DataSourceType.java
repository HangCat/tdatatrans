package com.datatrans.sourcedatainfo.database.databaseEnum;

/**
 * @program: source-data-info
 * @description: 数据源类型
 * @author: zhouyp
 * @create: 2018-09-28
 */
public enum DataSourceType {
	MYSQL("MySQL"),ORACLE("Oracle"),POSTGRESQL("postresql"),H2DATABASE("h2database", true);

	private String databaseType;
	/**
	 * 是否对外开放该数据源
	 */
	private boolean hiddenFlag;

	DataSourceType(String databaseType){
		this(databaseType, false);
	}

	DataSourceType(String databaseType, boolean hiddenFlag){
		this.databaseType = databaseType;
		this.hiddenFlag = hiddenFlag;
	}

	public String getDatabaseType(){
		return this.databaseType;
	}

	public boolean getHiddenFlag(){
		return this.hiddenFlag;
	}

}
