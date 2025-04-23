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

import com.entity.Nongjiayuan;
import com.server.NongjiayuanServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class NongjiayuanController {
	@Resource
	private NongjiayuanServer nongjiayuanService;


   
	@RequestMapping("addNongjiayuan.do")
	public String addNongjiayuan(HttpServletRequest request,Nongjiayuan nongjiayuan,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		nongjiayuan.setAddtime(time.toString().substring(0, 19));
		nongjiayuanService.add(nongjiayuan);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "nongjiayuanList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:nongjiayuanList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateNongjiayuan.do")
	public String doUpdateNongjiayuan(int id,ModelMap map,Nongjiayuan nongjiayuan){
		nongjiayuan=nongjiayuanService.getById(id);
		map.put("nongjiayuan", nongjiayuan);
		return "nongjiayuan_updt";
	}
	
	@RequestMapping("doUpdateNongjiayuan2.do")
	public String doUpdateNongjiayuan2(ModelMap map,Nongjiayuan nongjiayuan,HttpServletRequest request){
		nongjiayuan=nongjiayuanService.getById(Integer.parseInt((String)request.getSession().getAttribute("uid")));
		map.put("nongjiayuan", nongjiayuan);
		return "nongjiayuan_updt2";
	}
	
@RequestMapping("updateNongjiayuan2.do")
	public String updateNongjiayuan2(int id,ModelMap map,Nongjiayuan nongjiayuan){
		nongjiayuanService.update(nongjiayuan);
		return "redirect:doUpdateNongjiayuan2.do";
	}
	
	
	
//	后台详细
	@RequestMapping("nongjiayuanDetail.do")
	public String nongjiayuanDetail(int id,ModelMap map,Nongjiayuan nongjiayuan){
		nongjiayuan=nongjiayuanService.getById(id);
		map.put("nongjiayuan", nongjiayuan);
		return "nongjiayuan_detail";
	}
//	前台详细
	@RequestMapping("njyDetail.do")
	public String njyDetail(int id,ModelMap map,Nongjiayuan nongjiayuan){
		nongjiayuan=nongjiayuanService.getById(id);
		map.put("nongjiayuan", nongjiayuan);
		return "nongjiayuandetail";
	}
//	
	@RequestMapping("updateNongjiayuan.do")
	public String updateNongjiayuan(int id,ModelMap map,Nongjiayuan nongjiayuan,HttpServletRequest request,HttpSession session){
		nongjiayuanService.update(nongjiayuan);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:nongjiayuanList.do";
	}

//	分页查询
	@RequestMapping("nongjiayuanList.do")
	public String nongjiayuanList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Nongjiayuan nongjiayuan, String shangjiabianhao, String shanghumingcheng, String yingyezhizhao, String fuwurexian, String shanghudizhi, String zhuyingxiangmu, String shanghujianjie, String mima, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(shangjiabianhao==null||shangjiabianhao.equals("")){pmap.put("shangjiabianhao", null);}else{pmap.put("shangjiabianhao", shangjiabianhao);}		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		if(yingyezhizhao==null||yingyezhizhao.equals("")){pmap.put("yingyezhizhao", null);}else{pmap.put("yingyezhizhao", yingyezhizhao);}		if(fuwurexian==null||fuwurexian.equals("")){pmap.put("fuwurexian", null);}else{pmap.put("fuwurexian", fuwurexian);}		if(shanghudizhi==null||shanghudizhi.equals("")){pmap.put("shanghudizhi", null);}else{pmap.put("shanghudizhi", shanghudizhi);}		if(zhuyingxiangmu==null||zhuyingxiangmu.equals("")){pmap.put("zhuyingxiangmu", null);}else{pmap.put("zhuyingxiangmu", zhuyingxiangmu);}		if(shanghujianjie==null||shanghujianjie.equals("")){pmap.put("shanghujianjie", null);}else{pmap.put("shanghujianjie", shanghujianjie);}		if(mima==null||mima.equals("")){pmap.put("mima", null);}else{pmap.put("mima", mima);}		
		int total=nongjiayuanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Nongjiayuan> list=nongjiayuanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "nongjiayuan_list";
	}
	
	
	
	@RequestMapping("njyList.do")
	public String njyList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Nongjiayuan nongjiayuan, String shangjiabianhao, String shanghumingcheng, String yingyezhizhao, String fuwurexian, String shanghudizhi, String zhuyingxiangmu, String shanghujianjie, String mima, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(shangjiabianhao==null||shangjiabianhao.equals("")){pmap.put("shangjiabianhao", null);}else{pmap.put("shangjiabianhao", shangjiabianhao);}		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		if(yingyezhizhao==null||yingyezhizhao.equals("")){pmap.put("yingyezhizhao", null);}else{pmap.put("yingyezhizhao", yingyezhizhao);}		if(fuwurexian==null||fuwurexian.equals("")){pmap.put("fuwurexian", null);}else{pmap.put("fuwurexian", fuwurexian);}		if(shanghudizhi==null||shanghudizhi.equals("")){pmap.put("shanghudizhi", null);}else{pmap.put("shanghudizhi", shanghudizhi);}		if(zhuyingxiangmu==null||zhuyingxiangmu.equals("")){pmap.put("zhuyingxiangmu", null);}else{pmap.put("zhuyingxiangmu", zhuyingxiangmu);}		if(shanghujianjie==null||shanghujianjie.equals("")){pmap.put("shanghujianjie", null);}else{pmap.put("shanghujianjie", shanghujianjie);}		if(mima==null||mima.equals("")){pmap.put("mima", null);}else{pmap.put("mima", mima);}		
		int total=nongjiayuanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Nongjiayuan> list=nongjiayuanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "nongjiayuanlist";
	}
	
	@RequestMapping("deleteNongjiayuan.do")
	public String deleteNongjiayuan(int id,HttpServletRequest request){
		nongjiayuanService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:nongjiayuanList.do";
	}
	
	@RequestMapping("quchongNongjiayuan.do")
	public void quchongNongjiayuan(Nongjiayuan nongjiayuan,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("shangjiabianhao", nongjiayuan.getShangjiabianhao());
		   System.out.println("shangjiabianhao==="+nongjiayuan.getShangjiabianhao());
		   System.out.println("shangjiabianhao222==="+nongjiayuanService.quchongNongjiayuan(map));
		   JSONObject obj=new JSONObject();
		   if(nongjiayuanService.quchongNongjiayuan(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "商家编号可以用！");
				  
			   }
		   response.setContentType("text/html;charset=utf-8");
		   PrintWriter out=null;
		   try {
			out=response.getWriter();
			out.print(obj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
}
