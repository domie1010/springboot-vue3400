package com.controller;

import java.io.File;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.entity.Xinwentongzhi;
import com.entity.Yonghuzhuce;
import com.entity.Nongjiayuan;import com.entity.Shanghufuwu;//jixacxishxu1

import com.server.XinwentongzhiServer;
import com.server.YonghuzhuceServer;
import com.server.NongjiayuanServer;import com.server.ShanghufuwuServer;//jixacxishxu2

import com.util.PageBean;

@Controller
public class IndexController {
	
	
	@Resource
	private XinwentongzhiServer xinwentongzhiService;
	@Resource
	private YonghuzhuceServer yonghuzhuceServer;
	@Resource	private NongjiayuanServer nongjiayuanServer;	@Resource	private ShanghufuwuServer shanghufuwuServer;	//jixacxishxu3
	
	
	
//	首页显示内容
	@RequestMapping("index.do")
	public String showIndex(ModelMap map){

		List<Xinwentongzhi> syxinwentongzhi1=xinwentongzhiService.getsyxinwentongzhi1(null);
		List<Xinwentongzhi> syxinwentongzhi2=xinwentongzhiService.getsyxinwentongzhi2(null);
		List<Xinwentongzhi> syxinwentongzhi3=xinwentongzhiService.getsyxinwentongzhi3(null);

		List<Yonghuzhuce> syyonghuzhuce1=yonghuzhuceServer.getsyyonghuzhuce1(null);
		List<Nongjiayuan> synongjiayuan1=nongjiayuanServer.getsynongjiayuan1(null);		List<Nongjiayuan> synongjiayuan2=nongjiayuanServer.getsynongjiayuan2(null);		List<Nongjiayuan> synongjiayuan3=nongjiayuanServer.getsynongjiayuan3(null);		List<Shanghufuwu> syshanghufuwu1=shanghufuwuServer.getsyshanghufuwu1(null);		List<Shanghufuwu> syshanghufuwu2=shanghufuwuServer.getsyshanghufuwu2(null);		List<Shanghufuwu> syshanghufuwu3=shanghufuwuServer.getsyshanghufuwu3(null);		//jixacxishxu4
		
	    map.put("syxinwentongzhi1", syxinwentongzhi1);
	    map.put("syxinwentongzhi2", syxinwentongzhi2);
	    map.put("syxinwentongzhi3", syxinwentongzhi3);
	    map.put("syyonghuzhuce1", syyonghuzhuce1);
	    map.put("synongjiayuan1", synongjiayuan1);	    map.put("synongjiayuan2", synongjiayuan2);	    map.put("synongjiayuan3", synongjiayuan3);	    map.put("syshanghufuwu1", syshanghufuwu1);	    map.put("syshanghufuwu2", syshanghufuwu2);	    map.put("syshanghufuwu3", syshanghufuwu3);	    //jixacxishxu5

		return "default";
	}

	

	
}
