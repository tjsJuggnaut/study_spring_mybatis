package lorelei.tjsa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lorelei.tjsa.model.lori_student;
import lorelei.tjsa.service.lori_studentMapper;


public class lori_studentMapperIm implements lori_studentMapper {
	
	@Autowired
	private lori_studentMapper lsm;

	@Override
	public int deleteByPrimaryKey(Integer stuno) {
		return lsm.deleteByPrimaryKey(stuno);
	}

	@Override
	public int insert(lori_student record) {
		return lsm.insert(record);
	}

	@Override
	public int insertSelective(lori_student record) {
		return lsm.insertSelective(record);
	}

	@Override
	public lori_student selectByPrimaryKey(Integer stuno) {
		return lsm.selectByPrimaryKey(stuno);
	}

	@Override
	public int updateByPrimaryKeySelective(lori_student record) {
		return lsm.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(lori_student record) {
		return lsm.updateByPrimaryKey(record);
	}
}