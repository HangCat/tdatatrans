package com.datatrans.sourcedatainfo.support.reponse;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @program: source-data-info
 * @description: 数据传输Response实体类
 * @author: zhouyp
 * @create: 2018-09-28
 */
@Data
public class DataTransResponse {

	private HttpStatus code;

	private Object data;

	private String commonMsg;

	private String noticeMsg;


}
