package com.datatrans.sourcedatainfo.service;

import com.datatrans.sourcedatainfo.database.configaration.DatasourceFactory;
import com.datatrans.sourcedatainfo.database.databaseEnum.DataSourceType;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: source-data-info
 * @description: RPC调用数据源相关服务
 * @author: zhouyp
 * @create: 2018-10-09
 */
public class TransDataSourceRPCService {


	/**
	 * 选择数据类型，并且返回
	 * @return
	 */
	public JdbcTemplate choiseDataType(String dataType){
		DatasourceFactory factory = new DatasourceFactory();
//		factory
		List<String> dataTypes = new ArrayList<>(10);
		for (DataSourceType type : DataSourceType.values()) {
			if (!type.getHiddenFlag())
				dataTypes.add(type.getDatabaseType());
		}
//		return dataTypes;
		return null;
	}

}
