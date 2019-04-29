package com.gd.science.auth.springboot.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gd.science.auth.mapper.TbRoleMapper;
import com.gd.science.auth.pojo.TbRole;
import com.gd.science.auth.service.RoleService;

@Controller
public class HelloController {

	@Autowired
	private JdbcTemplate jt;

	@Autowired
	private TbRoleMapper tbRoleMapper;

	@Autowired
	private RoleService roleService;

	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> hello() {
		List<Map<String, Object>> list = jt.queryForList("select * FROM tb_role");
		return list.get(0);
	}

	@RequestMapping("/role")
	@ResponseBody
	public TbRole role() {
		List<TbRole> list = tbRoleMapper.selectByExample(null);
		return list.get(0);
	}

	@RequestMapping("/rolesc")
	@ResponseBody
	public TbRole roleSc() {
		List<TbRole> list = roleService.findAll();
		System.out.println("svc");
		return list.get(0);
	}

	// 查出用户数据，在页面展示
	@RequestMapping("/success")
	public String success(Map<String, Object> map) {
		map.put("hello", "<h1>你好</h1>");
		map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
		return "success";
	}
}
