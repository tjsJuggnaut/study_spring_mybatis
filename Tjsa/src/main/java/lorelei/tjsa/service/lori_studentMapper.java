package lorelei.tjsa.service;

import lorelei.tjsa.model.lori_student;

public interface lori_studentMapper {
	int deleteByPrimaryKey(Integer stuno);

	int insert(lori_student record);

	int insertSelective(lori_student record);

	lori_student selectByPrimaryKey(Integer stuno);

	int updateByPrimaryKeySelective(lori_student record);

	int updateByPrimaryKey(lori_student record);
}