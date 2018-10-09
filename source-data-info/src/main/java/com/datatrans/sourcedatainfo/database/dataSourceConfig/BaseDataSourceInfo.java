package com.datatrans.sourcedatainfo.database.dataSourceConfig;

import lombok.Data;

/**
 * @program: datatrans
 * @description: 基本的数据源信息
 * @author: zhouyp
 * @create: 2018-10-09
 */
@Data
public class BaseDataSourceInfo {

	private String 	driverClassName;
	private String 	url;
	private String 	userName;
	private String 	password;

}
