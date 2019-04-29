package com.gd.science.auth.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gd.science.auth.mapper.TbFunctionMapper;
import com.gd.science.auth.pojo.TbFunction;
import com.gd.science.auth.pojo.TbFunctionExample;
import com.gd.science.auth.pojo.TbFunctionExample.Criteria;
import com.gd.science.auth.service.FunctionService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class FunctionServiceImpl implements FunctionService {

	@Autowired
	private TbFunctionMapper functionMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbFunction> findAll() {
		return functionMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbFunction> page=   (Page<TbFunction>) functionMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbFunction function) {
		functionMapper.insert(function);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbFunction function){
		functionMapper.updateByPrimaryKey(function);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbFunction findOne(Long id){
		return functionMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			functionMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbFunction function, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbFunctionExample example=new TbFunctionExample();
		Criteria criteria = example.createCriteria();
		
		if(function!=null){			
						if(function.getFunctionCode()!=null && function.getFunctionCode().length()>0){
				criteria.andFunctionCodeLike("%"+function.getFunctionCode()+"%");
			}
			if(function.getFunctionName()!=null && function.getFunctionName().length()>0){
				criteria.andFunctionNameLike("%"+function.getFunctionName()+"%");
			}
			if(function.getDescription()!=null && function.getDescription().length()>0){
				criteria.andDescriptionLike("%"+function.getDescription()+"%");
			}
			if(function.getFunctionUrl()!=null && function.getFunctionUrl().length()>0){
				criteria.andFunctionUrlLike("%"+function.getFunctionUrl()+"%");
			}
			if(function.getGenerateMenu()!=null && function.getGenerateMenu().length()>0){
				criteria.andGenerateMenuLike("%"+function.getGenerateMenu()+"%");
			}
			if(function.getCreateBy()!=null && function.getCreateBy().length()>0){
				criteria.andCreateByLike("%"+function.getCreateBy()+"%");
			}
	
		}
		
		Page<TbFunction> page= (Page<TbFunction>)functionMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
