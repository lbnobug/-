package com.jt.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.sys.entity.SysConfig;
import com.jt.sys.service.SysConfigService;

@Controller
@RequestMapping("/config/")
public class SysConfigController {
	@Autowired
    private SysConfigService sysConfigService;
	
	@RequestMapping("configUI")
	public String configUI(){
		return "configs";
	}
	@RequestMapping(value="doFindPageObjects",
			        produces="application/json;charset=utf-8")
	@ResponseBody
	public List<SysConfig> doFindPageObjects(
		Integer pageCurrent){
		return sysConfigService.
		findPageObjects(pageCurrent);
	}//HttpMessageConverter
	@RequestMapping(value="doFindPageConfigs",produces="application/json;charset=utf-8")
	public String doFindPageConfigs(
		Model model,Integer pageCurrent){
		System.out.println("doFindPageConfigs");
		List<SysConfig> configs=sysConfigService.
		findPageObjects(pageCurrent);
		model.addAttribute("configs", configs);
		return "configs";
	}
}





