package lorelei.tjsa.service;

import lorelei.tjsa.model.lori_teacher;

public interface lori_teacherMapper {
    int deleteByPrimaryKey(Integer teacherno);

    int insert(lori_teacher record);

    int insertSelective(lori_teacher record);

    lori_teacher selectByPrimaryKey(Integer teacherno);

    int updateByPrimaryKeySelective(lori_teacher record);

    int updateByPrimaryKey(lori_teacher record);
}