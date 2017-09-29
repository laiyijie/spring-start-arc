package me.laiyijie.server.data.dao;

import java.util.List;
import me.laiyijie.server.data.domain.TbProduction;
import me.laiyijie.server.data.domain.TbProductionCriteria;
import org.apache.ibatis.annotations.Param;

public interface TbProductionMapper {
    long countByExample(TbProductionCriteria example);

    int deleteByExample(TbProductionCriteria example);

    int deleteByPrimaryKey(Integer ID);

    int insert(TbProduction record);

    int insertSelective(TbProduction record);

    List<TbProduction> selectByExample(TbProductionCriteria example);

    TbProduction selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") TbProduction record, @Param("example") TbProductionCriteria example);

    int updateByExample(@Param("record") TbProduction record, @Param("example") TbProductionCriteria example);

    int updateByPrimaryKeySelective(TbProduction record);

    int updateByPrimaryKey(TbProduction record);
}