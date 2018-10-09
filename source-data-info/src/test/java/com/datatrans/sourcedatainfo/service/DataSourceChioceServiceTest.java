package com.datatrans.sourcedatainfo.service;

import com.datatrans.sourcedatainfo.SourceDataInfoApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * @program: source-data-info
 * @description:
 * @author: zhouyp
 * @create: 2018-10-08
 */
public class DataSourceChioceServiceTest extends SourceDataInfoApplicationTests {

	@Autowired
	DataSourceChioceService dataSourceChioceService;

	@Test
	public void getDataTypes(){
		List<String> dataTypes = dataSourceChioceService.getDataTypes();
		System.out.println(Arrays.toString(dataTypes.toArray()));
		Assert.assertEquals(3 ,dataTypes.size());
	}

}
