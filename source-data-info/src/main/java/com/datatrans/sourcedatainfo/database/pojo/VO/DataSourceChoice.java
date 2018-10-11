package com.datatrans.sourcedatainfo.database.pojo.VO;

import com.datatrans.sourcedatainfo.database.databaseEnum.DataSourceType;
import com.datatrans.sourcedatainfo.database.pojo.DO.BaseDataSourceInfo;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @program: source-data-info
 * @description: 选择数据源
 * @author: zhouyp
 * @create: 2018-09-28
 */
@Data
public class DataSourceChoice {

	/**
	 * 数据源ID
	 */
	private String databaseId;
	private DataSourceType dataSourceType;
	private BaseDataSourceInfo baseDataSourceInfo;
	private List<JdbcTemplate> jdbcTemplateList;

}
