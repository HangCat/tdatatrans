package com.datatrans.sourcedatainfo.service;

import com.datatrans.sourcedatainfo.database.configaration.DatasourceFactory;
import com.datatrans.sourcedatainfo.database.databaseEnum.DataSourceType;
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
	 * 获取开放的，系统支持的 数据类型
	 * @return
	 */
	public List<String> getDataSources(){
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
