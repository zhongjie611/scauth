package com.gd.science.auth.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gd.science.auth.pojo.TbRoleFunction;
import com.gd.science.auth.service.RoleFunctionService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/roleFunction")
public class RoleFunctionController {

	@Autowired
	private RoleFunctionService roleFunctionService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbRoleFunction> findAll(){			
		return roleFunctionService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return roleFunctionService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param roleFunction
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbRoleFunction roleFunction){
		try {
			roleFunctionService.add(roleFunction);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param roleFunction
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbRoleFunction roleFunction){
		try {
			roleFunctionService.update(roleFunction);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbRoleFunction findOne(Long id){
		return roleFunctionService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			roleFunctionService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbRoleFunction roleFunction, int page, int rows  ){
		return roleFunctionService.findPage(roleFunction, page, rows);		
	}
	
}
