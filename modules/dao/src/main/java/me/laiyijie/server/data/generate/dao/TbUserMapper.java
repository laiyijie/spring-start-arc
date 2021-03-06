package me.laiyijie.server.data.generate.dao;

import java.util.List;
import me.laiyijie.server.data.generate.domain.TbUser;
import me.laiyijie.server.data.generate.domain.TbUserCriteria;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    long countByExample(TbUserCriteria example);

    int deleteByExample(TbUserCriteria example);

    int deleteByPrimaryKey(Integer ID);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserCriteria example);

    TbUser selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserCriteria example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserCriteria example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}