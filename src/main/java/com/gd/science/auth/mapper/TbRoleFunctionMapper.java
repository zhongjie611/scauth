package com.gd.science.auth.mapper;

import com.gd.science.auth.pojo.TbRoleFunction;
import com.gd.science.auth.pojo.TbRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRoleFunctionMapper {
    int countByExample(TbRoleFunctionExample example);

    int deleteByExample(TbRoleFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRoleFunction record);

    int insertSelective(TbRoleFunction record);

    List<TbRoleFunction> selectByExample(TbRoleFunctionExample example);

    TbRoleFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRoleFunction record, @Param("example") TbRoleFunctionExample example);

    int updateByExample(@Param("record") TbRoleFunction record, @Param("example") TbRoleFunctionExample example);

    int updateByPrimaryKeySelective(TbRoleFunction record);

    int updateByPrimaryKey(TbRoleFunction record);
}