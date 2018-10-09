package com.hantotem.datatrans.sourcedatainfo.controller.sourceData;

import com.hantotem.datatrans.sourcedatainfo.controller.base.impl.TransBaseControllerImpl;
import com.hantotem.datatrans.sourcedatainfo.service.DataSourceChioceService;
import com.hantotem.datatrans.sourcedatainfo.support.reponse.DataTransResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @program: source-data-info
 * @description: 获取数据源接口
 * @author: zhouyp
 * @create: 2018-09-28
 */
@RestController
@RequestMapping("datasource/chioce")
@Slf4j
public class DataSourceChioceController extends TransBaseControllerImpl {

	@Autowired
	DataSourceChioceService dataSourceChioceService;

	@GetMapping(value = "/dataTypes")
	public DataTransResponse getDataTypes() {
		DataTransResponse dataTransResponse;
		try {
			dataTransResponse = getOKDataTransResponse(
					dataSourceChioceService.getDataTypes());
		} catch (Exception e) {
			log.error(e.getMessage());
			dataTransResponse = getErrDataTransResponse();
			dataTransResponse.setNoticeMsg(e.getMessage());
		}
		return dataTransResponse;
	}

}
