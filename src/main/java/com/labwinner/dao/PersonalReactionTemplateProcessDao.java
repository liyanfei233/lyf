package com.labwinner.dao;

import java.util.List;

import com.labwinner.domain.Industry;
import com.labwinner.domain.PersonalReactionTemplateProcess;

/**
 * @Description 个人试验模板步骤Dao
 * @author liuhq
 * @version V1.0
 * @date 2017年6月8日
 * 
 * @Company 西安博文同创信息技术有限公司
 * @Copyright Copyright (c) 2017, All rights reserved.
 */
public interface PersonalReactionTemplateProcessDao {

	/**
	 * @Description 获取所有对象列表
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	public List<PersonalReactionTemplateProcess> getAll();

	/**
	 * @Description 根据主键获取对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	PersonalReactionTemplateProcess getById(Integer id);

	/**
	 * @Description 保存对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	void save(PersonalReactionTemplateProcess personalReactionTemplateProcess);

	/**
	 * @Description 更新对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	void update(PersonalReactionTemplateProcess personalReactionTemplateProcess);

	/**
	 * @Description 删除对象
	 * @author liuhq
	 * @version V1.0
	 * @date 2017年6月8日
	 */
	void delete(Integer id);

}
