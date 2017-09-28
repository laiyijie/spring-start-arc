package net.bojiu.server.data.dao;

import java.util.List;
import net.bojiu.server.data.domain.tbProduction;
import net.bojiu.server.data.domain.tbProductionCriteria;
import org.apache.ibatis.annotations.Param;

public interface tbProductionMapper {
    long countByExample(tbProductionCriteria example);

    int deleteByExample(tbProductionCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(tbProduction record);

    int insertSelective(tbProduction record);

    List<tbProduction> selectByExample(tbProductionCriteria example);

    tbProduction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tbProduction record, @Param("example") tbProductionCriteria example);

    int updateByExample(@Param("record") tbProduction record, @Param("example") tbProductionCriteria example);

    int updateByPrimaryKeySelective(tbProduction record);

    int updateByPrimaryKey(tbProduction record);
}