package com.labwinner.dao;

import java.util.List;

import com.labwinner.domain.Industry;
import com.labwinner.domain.PersonalReactionTemplateParameter;

/**
 * @Description 个人试验模板参数Dao
 * @author liuhq
 * @version V1.0
 * @date 2017年6月8日
 * 
 * @Company 西安博文同创信息技术有限公司
 * @Copyright Copyright (c) 2017, All rights reserved.
 */
public interface PersonalReactionTemplateParameterDao {

	/**
	 * @Description 获取所有对象列表
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	public List<PersonalReactionTemplateParameter> getAll();

	/**
	 * @Description 根据主键获取对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	PersonalReactionTemplateParameter getById(Integer id);

	/**
	 * @Description 保存对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	void save(PersonalReactionTemplateParameter personalReactionTemplateParameter);

	/**
	 * @Description 更新对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	void update(PersonalReactionTemplateParameter personalReactionTemplateParameter);

	/**
	 * @Description 删除对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	void delete(Integer id);

}