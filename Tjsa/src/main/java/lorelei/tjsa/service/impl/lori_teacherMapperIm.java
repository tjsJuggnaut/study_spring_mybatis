package lorelei.tjsa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lorelei.tjsa.model.lori_teacher;
import lorelei.tjsa.service.lori_teacherMapper;


public class lori_teacherMapperIm implements lori_teacherMapper {

	@Autowired
	private lori_teacherMapper ltm;

	@Override
	public int deleteByPrimaryKey(Integer teacherno) {
		return ltm.deleteByPrimaryKey(teacherno);
	}

	@Override
	public int insert(lori_teacher record) {
		return ltm.insert(record);
	}

	@Override
	public int insertSelective(lori_teacher record) {
		return ltm.insertSelective(record);
	}

	@Override
	public lori_teacher selectByPrimaryKey(Integer teacherno) {
		return ltm.selectByPrimaryKey(teacherno);
	}

	@Override
	public int updateByPrimaryKeySelective(lori_teacher record) {
		return ltm.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(lori_teacher record) {
		return ltm.updateByPrimaryKey(record);
	}
}