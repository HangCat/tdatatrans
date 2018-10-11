package com.datatrans.sourcedatainfo.database.pojo.DO;

import lombok.Data;

import java.util.Map;

/**
 * @program: datatrans
 * @description: 基本的数据源信息
 * @author: zhouyp
 * @create: 2018-10-09
 */
@Data
public class DataSourceConnInfo {

	private String driverClassName;
	private String tableSpace;
	private String url;
	private String port;
	private String userName;
	private String password;
	private Map<String, String> datasourceProperty;

}
