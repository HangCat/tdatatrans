package com.hantotem.datatrans.sourcedatainfo.database.pojo.DO;

import lombok.Data;

import java.util.Map;

/**
 * @program: source-data-info
 * @description: 数据源基本信息
 * @author: zhouyp
 * @create: 2018-09-28
 */
@Data
public class TableBaseInfo {

	private String databaseId;
	private String databaseName;
	private String tableSpace;
	private String jdbcUrl;
	private String port;
	private String name;
	private String password;
	private Map<String, String> datasourceProperty;

}
