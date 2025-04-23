package com.controller;

import java.io.File;
import java.io.IOException;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Shanghufuwuyuding;
import com.server.ShanghufuwuyudingServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class ShanghufuwuyudingController {
	@Resource
	private ShanghufuwuyudingServer shanghufuwuyudingService;


   
	@RequestMapping("addShanghufuwuyuding.do")
	public String addShanghufuwuyuding(HttpServletRequest request,Shanghufuwuyuding shanghufuwuyuding,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		shanghufuwuyuding.setAddtime(time.toString().substring(0, 19));
		shanghufuwuyudingService.add(shanghufuwuyuding);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "shanghufuwuyudingList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:shanghufuwuyudingList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateShanghufuwuyuding.do")
	public String doUpdateShanghufuwuyuding(int id,ModelMap map,Shanghufuwuyuding shanghufuwuyuding){
		shanghufuwuyuding=shanghufuwuyudingService.getById(id);
		map.put("shanghufuwuyuding", shanghufuwuyuding);
		return "shanghufuwuyuding_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("shanghufuwuyudingDetail.do")
	public String shanghufuwuyudingDetail(int id,ModelMap map,Shanghufuwuyuding shanghufuwuyuding){
		shanghufuwuyuding=shanghufuwuyudingService.getById(id);
		map.put("shanghufuwuyuding", shanghufuwuyuding);
		return "shanghufuwuyuding_detail";
	}
//	前台详细
	@RequestMapping("shfwydDetail.do")
	public String shfwydDetail(int id,ModelMap map,Shanghufuwuyuding shanghufuwuyuding){
		shanghufuwuyuding=shanghufuwuyudingService.getById(id);
		map.put("shanghufuwuyuding", shanghufuwuyuding);
		return "shanghufuwuyudingdetail";
	}
//	
	@RequestMapping("updateShanghufuwuyuding.do")
	public String updateShanghufuwuyuding(int id,ModelMap map,Shanghufuwuyuding shanghufuwuyuding,HttpServletRequest request,HttpSession session){
		shanghufuwuyudingService.update(shanghufuwuyuding);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:shanghufuwuyudingList.do";
	}

//	分页查询
	@RequestMapping("shanghufuwuyudingList.do")
	public String shanghufuwuyudingList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shanghufuwuyuding shanghufuwuyuding, String bianhao, String mingcheng, String leibie, String shanghubianhao, String jiage, String shuliang1,String shuliang2, String jine, String riqi1,String riqi2, String beizhu, String yonghuming, String issh, String iszf){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}
		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}
		if(shanghubianhao==null||shanghubianhao.equals("")){pmap.put("shanghubianhao", null);}else{pmap.put("shanghubianhao", shanghubianhao);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(shuliang1==null||shuliang1.equals("")){pmap.put("shuliang1", null);}else{pmap.put("shuliang1", shuliang1);}
		if(shuliang2==null||shuliang2.equals("")){pmap.put("shuliang2", null);}else{pmap.put("shuliang2", shuliang2);}
		if(jine==null||jine.equals("")){pmap.put("jine", null);}else{pmap.put("jine", jine);}
		if(riqi1==null||riqi1.equals("")){pmap.put("riqi1", null);}else{pmap.put("riqi1", riqi1);}
		if(riqi2==null||riqi2.equals("")){pmap.put("riqi2", null);}else{pmap.put("riqi2", riqi2);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		
		int total=shanghufuwuyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shanghufuwuyuding> list=shanghufuwuyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shanghufuwuyuding_list";
	}
	
	@RequestMapping("shanghufuwuyudingList3.do")
	public String shanghufuwuyudingList3(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shanghufuwuyuding shanghufuwuyuding, String bianhao, String mingcheng, String leibie, String shanghubianhao, String jiage, String shuliang1,String shuliang2, String jine, String riqi1,String riqi2, String beizhu, String yonghuming, String issh, String iszf,HttpServletRequest request){
		/*if(session.getAttribute("user")==null){
			return "login";
		}*/
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		pmap.put("shanghubianhao", (String)request.getSession().getAttribute("username"));
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}
		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(shuliang1==null||shuliang1.equals("")){pmap.put("shuliang1", null);}else{pmap.put("shuliang1", shuliang1);}
		if(shuliang2==null||shuliang2.equals("")){pmap.put("shuliang2", null);}else{pmap.put("shuliang2", shuliang2);}
		if(jine==null||jine.equals("")){pmap.put("jine", null);}else{pmap.put("jine", jine);}
		if(riqi1==null||riqi1.equals("")){pmap.put("riqi1", null);}else{pmap.put("riqi1", riqi1);}
		if(riqi2==null||riqi2.equals("")){pmap.put("riqi2", null);}else{pmap.put("riqi2", riqi2);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		
		int total=shanghufuwuyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shanghufuwuyuding> list=shanghufuwuyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shanghufuwuyuding_list3";
	}
	@RequestMapping("shanghufuwuyudingList2.do")
	public String shanghufuwuyudingList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shanghufuwuyuding shanghufuwuyuding, String bianhao, String mingcheng, String leibie, String shanghubianhao, String jiage, String shuliang1,String shuliang2, String jine, String riqi1,String riqi2, String beizhu, String yonghuming, String issh, String iszf,HttpServletRequest request){
		/*if(session.getAttribute("user")==null){
			return "login";
		}*/
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		pmap.put("yonghuming", (String)request.getSession().getAttribute("username"));
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}
		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(shuliang1==null||shuliang1.equals("")){pmap.put("shuliang1", null);}else{pmap.put("shuliang1", shuliang1);}
		if(shuliang2==null||shuliang2.equals("")){pmap.put("shuliang2", null);}else{pmap.put("shuliang2", shuliang2);}
		if(jine==null||jine.equals("")){pmap.put("jine", null);}else{pmap.put("jine", jine);}
		if(riqi1==null||riqi1.equals("")){pmap.put("riqi1", null);}else{pmap.put("riqi1", riqi1);}
		if(riqi2==null||riqi2.equals("")){pmap.put("riqi2", null);}else{pmap.put("riqi2", riqi2);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		
		int total=shanghufuwuyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shanghufuwuyuding> list=shanghufuwuyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shanghufuwuyuding_list2";
	}
	
	
	@RequestMapping("shfwydList.do")
	public String shfwydList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shanghufuwuyuding shanghufuwuyuding, String bianhao, String mingcheng, String leibie, String shanghubianhao, String jiage, String shuliang1,String shuliang2, String jine, String riqi1,String riqi2, String beizhu, String yonghuming, String issh, String iszf){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}
		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}
		if(shanghubianhao==null||shanghubianhao.equals("")){pmap.put("shanghubianhao", null);}else{pmap.put("shanghubianhao", shanghubianhao);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(shuliang1==null||shuliang1.equals("")){pmap.put("shuliang1", null);}else{pmap.put("shuliang1", shuliang1);}
		if(shuliang2==null||shuliang2.equals("")){pmap.put("shuliang2", null);}else{pmap.put("shuliang2", shuliang2);}
		if(jine==null||jine.equals("")){pmap.put("jine", null);}else{pmap.put("jine", jine);}
		if(riqi1==null||riqi1.equals("")){pmap.put("riqi1", null);}else{pmap.put("riqi1", riqi1);}
		if(riqi2==null||riqi2.equals("")){pmap.put("riqi2", null);}else{pmap.put("riqi2", riqi2);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		
		int total=shanghufuwuyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shanghufuwuyuding> list=shanghufuwuyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shanghufuwuyudinglist";
	}
	
	@RequestMapping("deleteShanghufuwuyuding.do")
	public String deleteShanghufuwuyuding(int id,HttpServletRequest request){
		shanghufuwuyudingService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:shanghufuwuyudingList.do";
	}
	
	
}
