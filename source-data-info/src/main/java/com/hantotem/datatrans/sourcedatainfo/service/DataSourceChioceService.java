package com.hantotem.datatrans.sourcedatainfo.service;

import com.hantotem.datatrans.sourcedatainfo.database.pojo.vo.DataSourceType;
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


	public List<String> getDataTypes(){
		List<String> dataTypes = new ArrayList<>();
		for (DataSourceType type : DataSourceType.values()) {
			dataTypes.add(type.getDatabaseType());
		}
		return dataTypes;
	}

}
