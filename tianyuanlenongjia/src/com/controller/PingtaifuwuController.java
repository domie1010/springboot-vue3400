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

import com.entity.Pingtaifuwu;
import com.server.PingtaifuwuServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class PingtaifuwuController {
	@Resource
	private PingtaifuwuServer pingtaifuwuService;


   
	@RequestMapping("addPingtaifuwu.do")
	public String addPingtaifuwu(HttpServletRequest request,Pingtaifuwu pingtaifuwu,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		pingtaifuwu.setAddtime(time.toString().substring(0, 19));
		pingtaifuwuService.add(pingtaifuwu);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "pingtaifuwuList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:pingtaifuwuList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdatePingtaifuwu.do")
	public String doUpdatePingtaifuwu(int id,ModelMap map,Pingtaifuwu pingtaifuwu){
		pingtaifuwu=pingtaifuwuService.getById(id);
		map.put("pingtaifuwu", pingtaifuwu);
		return "pingtaifuwu_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("pingtaifuwuDetail.do")
	public String pingtaifuwuDetail(int id,ModelMap map,Pingtaifuwu pingtaifuwu){
		pingtaifuwu=pingtaifuwuService.getById(id);
		map.put("pingtaifuwu", pingtaifuwu);
		return "pingtaifuwu_detail";
	}
//	前台详细
	@RequestMapping("ptfwDetail.do")
	public String ptfwDetail(int id,ModelMap map,Pingtaifuwu pingtaifuwu){
		pingtaifuwu=pingtaifuwuService.getById(id);
		map.put("pingtaifuwu", pingtaifuwu);
		return "pingtaifuwudetail";
	}
//	
	@RequestMapping("updatePingtaifuwu.do")
	public String updatePingtaifuwu(int id,ModelMap map,Pingtaifuwu pingtaifuwu,HttpServletRequest request,HttpSession session){
		pingtaifuwuService.update(pingtaifuwu);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:pingtaifuwuList.do";
	}

//	分页查询
	@RequestMapping("pingtaifuwuList.do")
	public String pingtaifuwuList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Pingtaifuwu pingtaifuwu, String bianhao, String mingcheng, String leibie, String jiage1,String jiage2, String jianjie, String faburen){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}		if(faburen==null||faburen.equals("")){pmap.put("faburen", null);}else{pmap.put("faburen", faburen);}		
		int total=pingtaifuwuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Pingtaifuwu> list=pingtaifuwuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "pingtaifuwu_list";
	}
	
	@RequestMapping("pingtaifuwuList2.do")
	public String pingtaifuwuList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Pingtaifuwu pingtaifuwu, String bianhao, String mingcheng, String leibie, String jiage1,String jiage2, String jianjie, String faburen,HttpServletRequest request){
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
		
		pmap.put("faburen", (String)request.getSession().getAttribute("username"));
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}		
		
		int total=pingtaifuwuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Pingtaifuwu> list=pingtaifuwuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "pingtaifuwu_list2";
	}	
	
	@RequestMapping("ptfwList.do")
	public String ptfwList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Pingtaifuwu pingtaifuwu, String bianhao, String mingcheng, String leibie, String jiage1,String jiage2, String jianjie, String faburen){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}		if(leibie==null||leibie.equals("")){pmap.put("leibie", null);}else{pmap.put("leibie", leibie);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}		if(faburen==null||faburen.equals("")){pmap.put("faburen", null);}else{pmap.put("faburen", faburen);}		
		int total=pingtaifuwuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Pingtaifuwu> list=pingtaifuwuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "pingtaifuwulist";
	}
	
	@RequestMapping("deletePingtaifuwu.do")
	public String deletePingtaifuwu(int id,HttpServletRequest request){
		pingtaifuwuService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:pingtaifuwuList.do";
	}
	
	
}
