package com.datatrans.sourcedatainfo.controller;

import com.datatrans.sourcedatainfo.SourceDataInfoApplicationTests;
import com.datatrans.sourcedatainfo.controller.base.TransBaseController;
import org.junit.Before;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @program: source-data-info
 * @description:
 * @author: zhouyp
 * @create: 2018-10-08
 */
//@AutoConfigureMockMvc//自动装配mockmvc类 只需要autowire一个mockmvc便可以使用
public abstract class BaseControllerTest extends SourceDataInfoApplicationTests {

	protected MockMvc mockMvc;

	protected TransBaseController controller;

	public abstract void setController();

	@Before
	public void setUp(){
		setController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}


}
