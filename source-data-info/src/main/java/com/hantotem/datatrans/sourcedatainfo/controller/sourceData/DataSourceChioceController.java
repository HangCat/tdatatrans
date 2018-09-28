package com.hantotem.datatrans.sourcedatainfo.controller.sourceData;

import com.hantotem.datatrans.sourcedatainfo.service.DataSourceChioceService;
import com.hantotem.datatrans.sourcedatainfo.support.reponse.DataTransResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: source-data-info
 * @description: 获取数据源接口
 * @author: zhouyp
 * @create: 2018-09-28
 */
@RestController
@RequestMapping("datasource/chioce")
public class DataSourceChioceController {

	@Autowired
	DataSourceChioceService dataSourceChioceService;

	public DataTransResponse getDataTypes(){
		DataTransResponse dataTransResponse = new DataTransResponse();
		dataTransResponse.setData(dataSourceChioceService.getDataTypes());


	}




}
