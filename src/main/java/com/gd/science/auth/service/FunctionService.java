package com.gd.science.auth.service;

import java.util.List;
import com.gd.science.auth.pojo.TbFunction;

import entity.PageResult;

/**
 * 服务层接口
 * 
 * @author Administrator
 *
 */
public interface FunctionService {

	/**
	 * 返回全部列表
	 * 
	 * @return
	 */
	public List<TbFunction> findAll();

	/**
	 * 返回分页列表
	 * 
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);

	/**
	 * 增加
	 */
	public void add(TbFunction function);

	/**
	 * 修改
	 */
	public void update(TbFunction function);

	/**
	 * 根据ID获取实体
	 * 
	 * @param id
	 * @return
	 */
	public TbFunction findOne(Long id);

	/**
	 * 批量删除
	 * 
	 * @param ids
	 */
	public void delete(Long[] ids);

	/**
	 * 分页
	 * 
	 * @param pageNum  当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbFunction function, int pageNum, int pageSize);

}
