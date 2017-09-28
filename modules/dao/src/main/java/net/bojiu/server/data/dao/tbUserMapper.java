package net.bojiu.server.data.dao;

import java.util.List;
import net.bojiu.server.data.domain.tbUser;
import net.bojiu.server.data.domain.tbUserCriteria;
import org.apache.ibatis.annotations.Param;

public interface tbUserMapper {
    long countByExample(tbUserCriteria example);

    int deleteByExample(tbUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(tbUser record);

    int insertSelective(tbUser record);

    List<tbUser> selectByExample(tbUserCriteria example);

    tbUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tbUser record, @Param("example") tbUserCriteria example);

    int updateByExample(@Param("record") tbUser record, @Param("example") tbUserCriteria example);

    int updateByPrimaryKeySelective(tbUser record);

    int updateByPrimaryKey(tbUser record);
}