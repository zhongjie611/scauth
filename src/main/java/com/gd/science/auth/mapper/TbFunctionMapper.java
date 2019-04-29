package com.gd.science.auth.mapper;

import com.gd.science.auth.pojo.TbFunction;
import com.gd.science.auth.pojo.TbFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFunctionMapper {
    int countByExample(TbFunctionExample example);

    int deleteByExample(TbFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbFunction record);

    int insertSelective(TbFunction record);

    List<TbFunction> selectByExample(TbFunctionExample example);

    TbFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbFunction record, @Param("example") TbFunctionExample example);

    int updateByExample(@Param("record") TbFunction record, @Param("example") TbFunctionExample example);

    int updateByPrimaryKeySelective(TbFunction record);

    int updateByPrimaryKey(TbFunction record);
}