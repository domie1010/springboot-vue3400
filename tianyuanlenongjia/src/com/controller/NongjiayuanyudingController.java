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

import com.entity.Nongjiayuanyuding;
import com.server.NongjiayuanyudingServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class NongjiayuanyudingController {
	@Resource
	private NongjiayuanyudingServer nongjiayuanyudingService;


   
	@RequestMapping("addNongjiayuanyuding.do")
	public String addNongjiayuanyuding(HttpServletRequest request,Nongjiayuanyuding nongjiayuanyuding,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		nongjiayuanyuding.setAddtime(time.toString().substring(0, 19));
		nongjiayuanyudingService.add(nongjiayuanyuding);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "nongjiayuanyudingList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:nongjiayuanyudingList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateNongjiayuanyuding.do")
	public String doUpdateNongjiayuanyuding(int id,ModelMap map,Nongjiayuanyuding nongjiayuanyuding){
		nongjiayuanyuding=nongjiayuanyudingService.getById(id);
		map.put("nongjiayuanyuding", nongjiayuanyuding);
		return "nongjiayuanyuding_updt";
	}
	
	
	
	@RequestMapping("doUpdateNongjiayuanyudinglb.do")
	public String doUpdateNongjiayuanyudinglb(int id,ModelMap map,Nongjiayuanyuding nongjiayuanyuding){
		nongjiayuanyuding=nongjiayuanyudingService.getById(id);
		map.put("nongjiayuanyuding", nongjiayuanyuding);
		return "nongjiayuanyuding_updtlb";
	}
	
@RequestMapping("updateNongjiayuanyudinglb.do")
	public String updateNongjiayuanyudinglb(int id,ModelMap map,Nongjiayuanyuding nongjiayuanyuding){
		nongjiayuanyudingService.updatelb(nongjiayuanyuding);
		return "redirect:nongjiayuanyudingList.do";
	}
	
//	后台详细
	@RequestMapping("nongjiayuanyudingDetail.do")
	public String nongjiayuanyudingDetail(int id,ModelMap map,Nongjiayuanyuding nongjiayuanyuding){
		nongjiayuanyuding=nongjiayuanyudingService.getById(id);
		map.put("nongjiayuanyuding", nongjiayuanyuding);
		return "nongjiayuanyuding_detail";
	}
//	前台详细
	@RequestMapping("njyydDetail.do")
	public String njyydDetail(int id,ModelMap map,Nongjiayuanyuding nongjiayuanyuding){
		nongjiayuanyuding=nongjiayuanyudingService.getById(id);
		map.put("nongjiayuanyuding", nongjiayuanyuding);
		return "nongjiayuanyudingdetail";
	}
//	
	@RequestMapping("updateNongjiayuanyuding.do")
	public String updateNongjiayuanyuding(int id,ModelMap map,Nongjiayuanyuding nongjiayuanyuding,HttpServletRequest request,HttpSession session){
		nongjiayuanyudingService.update(nongjiayuanyuding);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:nongjiayuanyudingList.do";
	}

//	分页查询
	@RequestMapping("nongjiayuanyudingList.do")
	public String nongjiayuanyudingList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Nongjiayuanyuding nongjiayuanyuding, String shangjiabianhao, String shanghumingcheng, String shanghudizhi, String youkerenshu1,String youkerenshu2, String yudingshijian1,String yudingshijian2, String youkeliuyan, String yudingren, String yudingzhuangtai, String shangjiahuifu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(shangjiabianhao==null||shangjiabianhao.equals("")){pmap.put("shangjiabianhao", null);}else{pmap.put("shangjiabianhao", shangjiabianhao);}		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		if(shanghudizhi==null||shanghudizhi.equals("")){pmap.put("shanghudizhi", null);}else{pmap.put("shanghudizhi", shanghudizhi);}		if(youkerenshu1==null||youkerenshu1.equals("")){pmap.put("youkerenshu1", null);}else{pmap.put("youkerenshu1", youkerenshu1);}		if(youkerenshu2==null||youkerenshu2.equals("")){pmap.put("youkerenshu2", null);}else{pmap.put("youkerenshu2", youkerenshu2);}		if(yudingshijian1==null||yudingshijian1.equals("")){pmap.put("yudingshijian1", null);}else{pmap.put("yudingshijian1", yudingshijian1);}		if(yudingshijian2==null||yudingshijian2.equals("")){pmap.put("yudingshijian2", null);}else{pmap.put("yudingshijian2", yudingshijian2);}		if(youkeliuyan==null||youkeliuyan.equals("")){pmap.put("youkeliuyan", null);}else{pmap.put("youkeliuyan", youkeliuyan);}		if(yudingren==null||yudingren.equals("")){pmap.put("yudingren", null);}else{pmap.put("yudingren", yudingren);}		if(yudingzhuangtai==null||yudingzhuangtai.equals("")){pmap.put("yudingzhuangtai", null);}else{pmap.put("yudingzhuangtai", yudingzhuangtai);}		if(shangjiahuifu==null||shangjiahuifu.equals("")){pmap.put("shangjiahuifu", null);}else{pmap.put("shangjiahuifu", shangjiahuifu);}		
		int total=nongjiayuanyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Nongjiayuanyuding> list=nongjiayuanyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "nongjiayuanyuding_list";
	}
	
	@RequestMapping("nongjiayuanyudingList3.do")
	public String nongjiayuanyudingList3(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Nongjiayuanyuding nongjiayuanyuding, String shangjiabianhao, String shanghumingcheng, String shanghudizhi, String youkerenshu1,String youkerenshu2, String yudingshijian1,String yudingshijian2, String youkeliuyan, String yudingren, String yudingzhuangtai, String shangjiahuifu,HttpServletRequest request){
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
		
		pmap.put("shangjiabianhao", (String)request.getSession().getAttribute("username"));
		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		if(shanghudizhi==null||shanghudizhi.equals("")){pmap.put("shanghudizhi", null);}else{pmap.put("shanghudizhi", shanghudizhi);}		if(youkerenshu1==null||youkerenshu1.equals("")){pmap.put("youkerenshu1", null);}else{pmap.put("youkerenshu1", youkerenshu1);}		if(youkerenshu2==null||youkerenshu2.equals("")){pmap.put("youkerenshu2", null);}else{pmap.put("youkerenshu2", youkerenshu2);}		if(yudingshijian1==null||yudingshijian1.equals("")){pmap.put("yudingshijian1", null);}else{pmap.put("yudingshijian1", yudingshijian1);}		if(yudingshijian2==null||yudingshijian2.equals("")){pmap.put("yudingshijian2", null);}else{pmap.put("yudingshijian2", yudingshijian2);}		if(youkeliuyan==null||youkeliuyan.equals("")){pmap.put("youkeliuyan", null);}else{pmap.put("youkeliuyan", youkeliuyan);}		if(yudingzhuangtai==null||yudingzhuangtai.equals("")){pmap.put("yudingzhuangtai", null);}else{pmap.put("yudingzhuangtai", yudingzhuangtai);}		if(shangjiahuifu==null||shangjiahuifu.equals("")){pmap.put("shangjiahuifu", null);}else{pmap.put("shangjiahuifu", shangjiahuifu);}		
		
		int total=nongjiayuanyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Nongjiayuanyuding> list=nongjiayuanyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "nongjiayuanyuding_list3";
	}	@RequestMapping("nongjiayuanyudingList2.do")
	public String nongjiayuanyudingList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Nongjiayuanyuding nongjiayuanyuding, String shangjiabianhao, String shanghumingcheng, String shanghudizhi, String youkerenshu1,String youkerenshu2, String yudingshijian1,String yudingshijian2, String youkeliuyan, String yudingren, String yudingzhuangtai, String shangjiahuifu,HttpServletRequest request){
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
		
		pmap.put("yudingren", (String)request.getSession().getAttribute("username"));
		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		if(shanghudizhi==null||shanghudizhi.equals("")){pmap.put("shanghudizhi", null);}else{pmap.put("shanghudizhi", shanghudizhi);}		if(youkerenshu1==null||youkerenshu1.equals("")){pmap.put("youkerenshu1", null);}else{pmap.put("youkerenshu1", youkerenshu1);}		if(youkerenshu2==null||youkerenshu2.equals("")){pmap.put("youkerenshu2", null);}else{pmap.put("youkerenshu2", youkerenshu2);}		if(yudingshijian1==null||yudingshijian1.equals("")){pmap.put("yudingshijian1", null);}else{pmap.put("yudingshijian1", yudingshijian1);}		if(yudingshijian2==null||yudingshijian2.equals("")){pmap.put("yudingshijian2", null);}else{pmap.put("yudingshijian2", yudingshijian2);}		if(youkeliuyan==null||youkeliuyan.equals("")){pmap.put("youkeliuyan", null);}else{pmap.put("youkeliuyan", youkeliuyan);}		if(yudingzhuangtai==null||yudingzhuangtai.equals("")){pmap.put("yudingzhuangtai", null);}else{pmap.put("yudingzhuangtai", yudingzhuangtai);}		if(shangjiahuifu==null||shangjiahuifu.equals("")){pmap.put("shangjiahuifu", null);}else{pmap.put("shangjiahuifu", shangjiahuifu);}		
		
		int total=nongjiayuanyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Nongjiayuanyuding> list=nongjiayuanyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "nongjiayuanyuding_list2";
	}	
	
	@RequestMapping("njyydList.do")
	public String njyydList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Nongjiayuanyuding nongjiayuanyuding, String shangjiabianhao, String shanghumingcheng, String shanghudizhi, String youkerenshu1,String youkerenshu2, String yudingshijian1,String yudingshijian2, String youkeliuyan, String yudingren, String yudingzhuangtai, String shangjiahuifu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(shangjiabianhao==null||shangjiabianhao.equals("")){pmap.put("shangjiabianhao", null);}else{pmap.put("shangjiabianhao", shangjiabianhao);}		if(shanghumingcheng==null||shanghumingcheng.equals("")){pmap.put("shanghumingcheng", null);}else{pmap.put("shanghumingcheng", shanghumingcheng);}		if(shanghudizhi==null||shanghudizhi.equals("")){pmap.put("shanghudizhi", null);}else{pmap.put("shanghudizhi", shanghudizhi);}		if(youkerenshu1==null||youkerenshu1.equals("")){pmap.put("youkerenshu1", null);}else{pmap.put("youkerenshu1", youkerenshu1);}		if(youkerenshu2==null||youkerenshu2.equals("")){pmap.put("youkerenshu2", null);}else{pmap.put("youkerenshu2", youkerenshu2);}		if(yudingshijian1==null||yudingshijian1.equals("")){pmap.put("yudingshijian1", null);}else{pmap.put("yudingshijian1", yudingshijian1);}		if(yudingshijian2==null||yudingshijian2.equals("")){pmap.put("yudingshijian2", null);}else{pmap.put("yudingshijian2", yudingshijian2);}		if(youkeliuyan==null||youkeliuyan.equals("")){pmap.put("youkeliuyan", null);}else{pmap.put("youkeliuyan", youkeliuyan);}		if(yudingren==null||yudingren.equals("")){pmap.put("yudingren", null);}else{pmap.put("yudingren", yudingren);}		if(yudingzhuangtai==null||yudingzhuangtai.equals("")){pmap.put("yudingzhuangtai", null);}else{pmap.put("yudingzhuangtai", yudingzhuangtai);}		if(shangjiahuifu==null||shangjiahuifu.equals("")){pmap.put("shangjiahuifu", null);}else{pmap.put("shangjiahuifu", shangjiahuifu);}		
		int total=nongjiayuanyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Nongjiayuanyuding> list=nongjiayuanyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "nongjiayuanyudinglist";
	}
	
	@RequestMapping("deleteNongjiayuanyuding.do")
	public String deleteNongjiayuanyuding(int id,HttpServletRequest request){
		nongjiayuanyudingService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:nongjiayuanyudingList.do";
	}
	
	
}
