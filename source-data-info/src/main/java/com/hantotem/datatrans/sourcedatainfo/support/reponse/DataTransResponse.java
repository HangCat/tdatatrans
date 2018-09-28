package com.hantotem.datatrans.sourcedatainfo.support.reponse;

import lombok.Data;

/**
 * @program: source-data-info
 * @description: 数据传输Response实体类
 * @author: zhouyp
 * @create: 2018-09-28
 */
@Data
public class DataTransResponse {

	private String code;

	private Object data;

	private String messege;


}
