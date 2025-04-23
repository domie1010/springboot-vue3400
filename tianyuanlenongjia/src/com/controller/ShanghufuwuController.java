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

import com.entity.Shanghufuwu;
import com.server.ShanghufuwuServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class ShanghufuwuController {
	@Resource
	private ShanghufuwuServer shanghufuwuService;


   
	@RequestMapping("addShanghufuwu.do")
	public String addShanghufuwu(HttpServletRequest request,Shanghufuwu shanghufuwu,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		shanghufuwu.setAddtime(time.toString().substring(0, 19));
		shanghufuwuService.add(shanghufuwu);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "shanghufuwuList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:shanghufuwuList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateShanghufuwu.do")
	public String doUpdateShanghufuwu(int id,ModelMap map,Shanghufuwu shanghufuwu){
		shanghufuwu=shanghufuwuService.getById(id);
		map.put("shanghufuwu", shanghufuwu);
		return "shanghufuwu_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("shanghufuwuDetail.do")
	public String shanghufuwuDetail(int id,ModelMap map,Shanghufuwu shanghufuwu){
		shanghufuwu=shanghufuwuService.getById(id);
		map.put("shanghufuwu", shanghufuwu);
		return "shanghufuwu_detail";
	}
//	前台详细
	@RequestMapping("shfwDetail.do")
	public String shfwDetail(int id,ModelMap map,Shanghufuwu shanghufuwu){
		shanghufuwu=shanghufuwuService.getById(id);
		map.put("shanghufuwu", shanghufuwu);
		return "shanghufuwudetail";
	}
//	
	@RequestMapping("updateShanghufuwu.do")
	public String updateShanghufuwu(int id,ModelMap map,Shanghufuwu shanghufuwu,HttpServletRequest request,HttpSession session){
		shanghufuwuService.update(shanghufuwu);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:shanghufuwuList.do";
	}

//	分页查询
	@RequestMapping("shanghufuwuList.do")
	public String shanghufuwuList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shanghufuwu shanghufuwu, String bianhao, String mingcheng, String zhutu, String leibie, String jiage1,String jiage2, String jianjie, String shanghubianhao, String shanghumingcheng){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}		if(zhutu==null||zhutu.equals("")){pmap.put("zhutu", null);}else{pmap.put("zhutu", zhutu);}		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}		if(shanghubianhao==null||shanghubianhao.equals("")){pmap.put("shanghubianhao", null);}else{pmap.put("shanghubianhao", shanghubianhao);}		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		
		int total=shanghufuwuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shanghufuwu> list=shanghufuwuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shanghufuwu_list";
	}
	
	@RequestMapping("shanghufuwuList2.do")
	public String shanghufuwuList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shanghufuwu shanghufuwu, String bianhao, String mingcheng, String zhutu, String leibie, String jiage1,String jiage2, String jianjie, String shanghubianhao, String shanghumingcheng,HttpServletRequest request){
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
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}		if(zhutu==null||zhutu.equals("")){pmap.put("zhutu", null);}else{pmap.put("zhutu", zhutu);}		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		
		
		int total=shanghufuwuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shanghufuwu> list=shanghufuwuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shanghufuwu_list2";
	}	
	
	@RequestMapping("shfwList.do")
	public String shfwList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Shanghufuwu shanghufuwu, String bianhao, String mingcheng, String zhutu, String leibie, String jiage1,String jiage2, String jianjie, String shanghubianhao, String shanghumingcheng){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}		if(zhutu==null||zhutu.equals("")){pmap.put("zhutu", null);}else{pmap.put("zhutu", zhutu);}		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}		if(shanghubianhao==null||shanghubianhao.equals("")){pmap.put("shanghubianhao", null);}else{pmap.put("shanghubianhao", shanghubianhao);}		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		
		int total=shanghufuwuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Shanghufuwu> list=shanghufuwuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "shanghufuwulist";
	}
	
	@RequestMapping("deleteShanghufuwu.do")
	public String deleteShanghufuwu(int id,HttpServletRequest request){
		shanghufuwuService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:shanghufuwuList.do";
	}
	
	
}
