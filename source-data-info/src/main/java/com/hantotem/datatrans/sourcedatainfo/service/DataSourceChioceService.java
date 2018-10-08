package com.hantotem.datatrans.sourcedatainfo.service;

import com.hantotem.datatrans.sourcedatainfo.database.databaseEnum.DataSourceType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: source-data-info
 * @description: 获取datasource的业务逻辑代码
 * @author: zhouyp
 * @create: 2018-09-28
 */
@Service
public class DataSourceChioceService {


	/**
	 * 获取开放的，系统支持的 数据类型
	 * @return
	 */
	public List<String> getDataTypes(){
		List<String> dataTypes = new ArrayList<>(10);
		for (DataSourceType type : DataSourceType.values()) {
			if (!type.getHiddenFlag())
			dataTypes.add(type.getDatabaseType());
		}
		return dataTypes;
	}


	/**
	 * 选择数据类型，并且返回
	 * @return
	 */
	public List<String> choiseDataType(String dataType){
		List<String> dataTypes = new ArrayList<>(10);
		for (DataSourceType type : DataSourceType.values()) {
			if (!type.getHiddenFlag())
			dataTypes.add(type.getDatabaseType());
		}
		return dataTypes;
	}

}
