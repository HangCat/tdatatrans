package com.datatrans.sourcedatainfo.database.exception;

/**
 * @program: datatrans
 * @description: 配置异常
 * @author: zhouyp
 * @create: 2018-10-09
 */
public class ConfigException extends RuntimeException {

	public ConfigException() {
		super();
	}

	public ConfigException(String message) {
		super(message);
	}

	public ConfigException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfigException(Throwable cause) {
		super(cause);
	}

	public ConfigException(String message, Throwable cause,
							   boolean enableSuppression,
							   boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
