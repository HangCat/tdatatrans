package com.hantotem.datatrans.sourcedatainfo.controller.base.impl;

import com.hantotem.datatrans.sourcedatainfo.controller.base.TransBaseController;
import com.hantotem.datatrans.sourcedatainfo.support.reponse.DataTransResponse;
import com.hantotem.datatrans.sourcedatainfo.support.reponse.DataTransResponseConstant;

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
		dataTransResponse.setCode(DataTransResponseConstant.CODE_OK);
		dataTransResponse.setMessege(DataTransResponseConstant.MESSEGE_OK);
		return dataTransResponse;
	}

	@Override
	public DataTransResponse getErrDataTransResponse() {
		DataTransResponse dataTransResponse = new DataTransResponse();
		dataTransResponse.setData(null);
		dataTransResponse.setCode(DataTransResponseConstant.CODE_ERR);
		dataTransResponse.setMessege(DataTransResponseConstant.MESSEGE_ERR);
		return dataTransResponse;
	}
}
