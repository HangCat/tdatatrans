package com.hantotem.datatrans.sourcedatainfo.controller.base.impl;

import com.hantotem.datatrans.sourcedatainfo.controller.base.TransBaseController;
import com.hantotem.datatrans.sourcedatainfo.support.reponse.DataTransResponse;
import com.hantotem.datatrans.sourcedatainfo.support.reponse.DataTransResponseConstant;
import org.springframework.http.HttpStatus;

/**
 * @program: source-data-info
 * @description: 基本类实现
 * @author: zhouyp
 * @create: 2018-10-08
 */
public class TransBaseControllerImpl implements TransBaseController {

	@Override
	public DataTransResponse getOKDataTransResponse(Object data) {
		DataTransResponse dataTransResponse = new DataTransResponse();
		dataTransResponse.setData(data);
		dataTransResponse.setCode(HttpStatus.OK);
		dataTransResponse.setCommonMsg(DataTransResponseConstant.MESSEGE_OK);
		dataTransResponse.setNoticeMsg(DataTransResponseConstant.MESSEGE_OK);
		return dataTransResponse;
	}

	@Override
	public DataTransResponse getErrDataTransResponse() {
		DataTransResponse dataTransResponse = new DataTransResponse();
		dataTransResponse.setData(null);
		dataTransResponse.setCode(HttpStatus.BAD_REQUEST);
		dataTransResponse.setCommonMsg(DataTransResponseConstant.MESSEGE_ERR);
		dataTransResponse.setNoticeMsg(DataTransResponseConstant.MESSEGE_ERR);
		return dataTransResponse;
	}
}
