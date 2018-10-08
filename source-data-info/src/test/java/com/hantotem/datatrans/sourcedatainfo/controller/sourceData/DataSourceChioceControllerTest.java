package com.hantotem.datatrans.sourcedatainfo.controller.sourceData;

import com.hantotem.datatrans.sourcedatainfo.controller.BaseControllerTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @program: source-data-info
 * @description:
 * @author: zhouyp
 * @create: 2018-10-08
 */
public class DataSourceChioceControllerTest extends BaseControllerTest {

	@Autowired
	DataSourceChioceController dataSourceChioceController;

	@Test
	public void getDataTypesTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/datasource/chioce/dataTypes"))
				.andExpect(status().isOk())
				.andDo(print());
	}


	@Override
	public void setController() {
		controller = dataSourceChioceController;
	}
}
