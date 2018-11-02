package lorelei.tjsa.service;

import lorelei.tjsa.model.lori_score;

public interface lori_scoreMapper {
    int insert(lori_score record);

    int insertSelective(lori_score record);
}