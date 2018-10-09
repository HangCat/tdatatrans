package com.hantotem.datatrans.baseService.rowMetaDate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: baseservice
 * @description: 值接口，实现类包括所有的数据库字段类型
 * @author: zhouyp
 * @create: 2018-09-26
 */
public interface ValueInterface {
	int getType();

	String getTypeName();

	String getTypeDesc();

	String getString();

	double getNumber();

	Date getDate();

	boolean getBoolean();

	long getInteger();

	BigDecimal getBigNumber();

	Serializable getSerializable();

	byte[] getBytes();

	void setString(String string);

	void setNumber(double number);

	void setDate(Date date);

	void setBoolean(boolean bool);

	void setInteger(long number);

	void setBigNumber(BigDecimal number);

	void setSerializable(Serializable ser);

	void setBytes(byte[] b);

	int getLength();

	int getPrecision();

	void setLength(int length);

	void setPrecision(int precision);

	void setLength(int length, int precision);

	Object clone();
}
