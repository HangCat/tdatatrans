package com.hantotem.datatrans.sourcedatainfo.controller.base;

import com.hantotem.datatrans.sourcedatainfo.support.reponse.DataTransResponse;

/**
 * @program: source-data-info
 * @description: 基本Controller类
 * @author: zhouyp
 * @create: 2018-10-08
 */
public interface TransBaseController {

	/**
	 * 整合返回正常的结果集
	 *
	 * @param data
	 * @return
	 */
	DataTransResponse getOKDataTransResponse(Object data);

	/**
	 * 整合返回异常的结果集
	 *
	 * @return
	 */
	DataTransResponse getErrDataTransResponse();

}
