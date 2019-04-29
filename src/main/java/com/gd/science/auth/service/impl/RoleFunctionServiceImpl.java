package com.gd.science.auth.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gd.science.auth.mapper.TbRoleFunctionMapper;
import com.gd.science.auth.pojo.TbRoleFunction;
import com.gd.science.auth.pojo.TbRoleFunctionExample;
import com.gd.science.auth.pojo.TbRoleFunctionExample.Criteria;
import com.gd.science.auth.service.RoleFunctionService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RoleFunctionServiceImpl implements RoleFunctionService {

	@Autowired
	private TbRoleFunctionMapper roleFunctionMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRoleFunction> findAll() {
		return roleFunctionMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRoleFunction> page=   (Page<TbRoleFunction>) roleFunctionMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRoleFunction roleFunction) {
		roleFunctionMapper.insert(roleFunction);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRoleFunction roleFunction){
		roleFunctionMapper.updateByPrimaryKey(roleFunction);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRoleFunction findOne(Long id){
		return roleFunctionMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			roleFunctionMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbRoleFunction roleFunction, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRoleFunctionExample example=new TbRoleFunctionExample();
		Criteria criteria = example.createCriteria();
		
		if(roleFunction!=null){			
						if(roleFunction.getCreatedBy()!=null && roleFunction.getCreatedBy().length()>0){
				criteria.andCreatedByLike("%"+roleFunction.getCreatedBy()+"%");
			}
	
		}
		
		Page<TbRoleFunction> page= (Page<TbRoleFunction>)roleFunctionMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
