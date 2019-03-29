package lorelei.tjsa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lorelei.tjsa.model.lori_course;
import lorelei.tjsa.service.lori_courseMapper;


public class lori_courseMapperIm implements lori_courseMapper {
	@Autowired
	private lori_courseMapper lcm;


	public int deleteByPrimaryKey(Integer courseno) {
		return lcm.deleteByPrimaryKey(courseno);
	}


	public int insert(lori_course record) {
		return lcm.insert(record);
	}


	public int insertSelective(lori_course record) {
		return lcm.insert(record);
	}


	public lori_course selectByPrimaryKey(Integer courseno) {
		return lcm.selectByPrimaryKey(courseno);
	}


	public int updateByPrimaryKeySelective(lori_course record) {
		return lcm.updateByPrimaryKeySelective(record);
	}


	public int updateByPrimaryKey(lori_course record) {
		return lcm.updateByPrimaryKey(record);
	}
}