package lorelei.tjsa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lorelei.tjsa.model.lori_score;
import lorelei.tjsa.service.lori_scoreMapper;


public class lori_scoreMapperIm implements lori_scoreMapper {
	//@Autowired adapt itself to jdk1.5 or greater,
	//对类成员变量、方法及构造函数进行标注，完成自动装配的工作。 通过 @Autowired的使用来消除 set ，get方法
	@Autowired
	private lori_scoreMapper lsm;

	//implements a interface usually use the @Override
	@Override
	public int insert(lori_score record) {
		return lsm.insert(record);
	}

	@Override
	public int insertSelective(lori_score record) {
		return lsm.insertSelective(record);
	}
}