package com.labwinner.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.labwinner.domain.Analytics;
import com.labwinner.domain.ReactionDesign;

public interface ReactionDesignService {

	public void save(ReactionDesign reactionDesign);
	
	public void saveNoProject(ReactionDesign reactionDesign);
	
	public void update(ReactionDesign reactionDesign);
	
	public void updateNoProject(ReactionDesign reactionDesign);
	
	public void updateExecute(ReactionDesign reactionDesign);
	
	public void delete(Integer id);
	
	public ReactionDesign getFindDeleteById(Integer id);
	
	public ReactionDesign getSolutionById(Integer id);
	
	public ReactionDesign getReactionRecordsById(Integer id);
	
	public ReactionDesign getDesignTechnologyRelationById(Integer id);
	
	public ReactionDesign getReactionDesignById(Integer id);
	
	public ReactionDesign getById(Integer id);
	
	//根据登录人获取单一试验集合
	public List<ReactionDesign> getPrivateReactionByUserId(Integer userId);
	
	//根据（团队负责人）登录人获取单一试验集合
	public List<ReactionDesign> getPrivateReaction();
	
	//根据登录人获取组试验集合
	public List<ReactionDesign> getTeamReactionByUserId(Integer userId);
		
	//根据（团队负责人）登录人获取组试验集合
	public List<ReactionDesign> getTeamReaction();
	
	public List<ReactionDesign> getAll();
	
	public List<ReactionDesign> getReactionGropNameByType(Integer type);
	
	public List<ReactionDesign> getAllPageable(String keyword);
	
	//团队负责人根据关键字查询获团队设计工艺对象集合
	public List<ReactionDesign> getDesignTechnologyNoUserIdBykeyword(String keyword);

	//团队负责人获团队设计工艺对象集合
	public List<ReactionDesign> getDesignTechnologyNoUserId();
	
	//团队负责人关键字 获取过滤无工艺我的单一实验设计
	public List<ReactionDesign> getNoTechnologyAppMySingleDesignsByNoUserIdKeyword(@Param("keyword")String keyword,@Param("appType")Integer appType);
		
	//团队负责人获取我的单一实验设计过滤无工艺 
	public List<ReactionDesign> getNoTechnologyAppMySingleListByNoUserId();
	
	public List<ReactionDesign> getUserList(Integer userId);
	
	public List<ReactionDesign> getUserListByKeyword(String keyword,Integer userId);
	
	public Integer getCount(Integer numberId);
	
	public List<ReactionDesign> getAllDesigns(Integer page,Integer pageSize);
	
	public Integer getAllCount();
	
	public List<ReactionDesign> getUserDesigns(Integer userId,Integer page,Integer pageSize);
	
	public Integer getUserCount(Integer userId);
	
	public List<ReactionDesign> getAllDesignsByKeyword(String keyword,Integer page,Integer pageSize);
	
	public Integer getAllDesignsCount(String keyword);
	
	public List<ReactionDesign> getUserDesignsByKeyword(Integer userId,String keyword,Integer page,Integer pageSize);
	
	public Integer getUserDesignsCount(Integer userId,String keyword);
	
	public ReactionDesign getChemicals(Integer id);
	
	public List<ReactionDesign> getAllDesignsList();
	
	public List<ReactionDesign> getUserDesignsList(Integer userId);
	
	//关键字查询获取我的单一实验设计过滤掉无工艺
	public List<ReactionDesign> getNoTechnologyAppMySingleDesignsByKeyword(@Param("keyword")String keyword,@Param("userId")Integer userId,@Param("appType")Integer appType);
		
		//获取我的所有单一实验过滤掉无工艺
	public List<ReactionDesign> getNoTechnologyAppMySingleList(@Param("userId")Integer userId,@Param("appType")Integer appType);
		
	//根据登录人关键字查询获取单一试验工艺集合
	public List<ReactionDesign> getTechnologyByUserIdAndKeyword(@Param("userId")Integer userId,@Param("keyword")String keyword);
		
	//根据登录人获取单一试验工艺集合
	public List<ReactionDesign> getTechnologyByUserId(Integer userId);
	
	
	//根据登录人关键字查询获取试验工艺集合
	public List<ReactionDesign> getDesignTechnologyByUserId(@Param("userId")Integer userId,@Param("keyword")String keyword);
	
	//根据登录人获取试验工艺集合
	public List<ReactionDesign> getDesignTechnologyByUserIdNokeyword(Integer userId);
		
	
	//关键字查询获取我的实验设计
	public List<ReactionDesign> getMyDesignsByKeyword(String keyword,Integer userId);
	
	//获取我的所有分组实验
	public List<ReactionDesign> getMyList(Integer userId);
	
	//获取我的单一实验
	public List<ReactionDesign> getMySingleDesignList(Integer userId);
	
	//获取团队所有单一实验
	public List<ReactionDesign> getAllSingleDesigns();
		
	//获取团队单一实验
	public List<ReactionDesign> getTeamSingleDesigns(Integer userId);
	
	//————————————————————————————————————————App我的实验————————————————————————————————————————
	
	//关键字查询获取我的分组实验设计
	public List<ReactionDesign> getAppMyDesignsByKeyword(String keyword,Integer userId);
	
	
	//获取我的所有分组实验
	public List<ReactionDesign> getAppMyList(Integer userId);
	
	//关键字查询获取我的单一实验设计
	public List<ReactionDesign> getAppMySingleDesignsByKeyword(String keyword,Integer userId,Integer appType);
		
		
	//获取我的所有单一实验
	public List<ReactionDesign> getAppMySingleList(Integer userId,Integer appType);
	
	
	//————————————————————————————————————————App团队分组实验————————————————————————————————————————
	
	//关键字查询获取团队分组实验设计
	public List<ReactionDesign> getAppUserListByKeyword(String keyword,Integer userId);
	
	//关键字查询获取团队分组实验设计
	public List<ReactionDesign> getAppAllPageable(String keyword);
	
	//关键字查询获取团队分组实验设计
	public List<ReactionDesign> getAppUserList(Integer userId);
	
	//关键字查询获取团队分组实验设计
	public List<ReactionDesign> getAppAll();
	
	//————————————————————————————————————————App团队单一实验————————————————————————————————————————
	
	//关键字查询获取团队单一实验设计
	public List<ReactionDesign> getAppUserSingleByKeyword(String keyword,Integer userId,Integer appType);
		
	//关键字查询获取团队单一实验设计
	public List<ReactionDesign> getAppAllSinglePageable(String keyword,Integer appType);
		
	//关键字查询获取团队单一实验设计
	public List<ReactionDesign> getAppUserSingleList(Integer userId,Integer appType);
		
	//关键字查询获取团队单一实验设计
	public List<ReactionDesign> getAppAllSingle(Integer appType);
	
	//单一设计详情
	public ReactionDesign getAppSingleDesignById(Integer id);
	
	//关键字查询获取团队分组实验设计
	public List<ReactionDesign> getFirstTeamDesign();
	
	//关键字查询获取团队分组实验设计
	public List<ReactionDesign> getFirstTeamUserDesign(Integer userId);
	
	//关键字查询获取我的分组实验设计
	public List<ReactionDesign> getFirstMyDesigns(Integer userId);
	
	public List<String> getSingleNames();
}
