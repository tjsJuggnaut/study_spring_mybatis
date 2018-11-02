package lorelei.tjsa.service;

import lorelei.tjsa.model.lori_course;

public interface lori_courseMapper {
	int deleteByPrimaryKey(Integer courseno);

	int insert(lori_course record);

	int insertSelective(lori_course record);

	lori_course selectByPrimaryKey(Integer courseno);

	int updateByPrimaryKeySelective(lori_course record);

	int updateByPrimaryKey(lori_course record);
}