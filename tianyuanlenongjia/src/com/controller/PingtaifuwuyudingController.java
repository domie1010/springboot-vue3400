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

import com.entity.Pingtaifuwuyuding;
import com.server.PingtaifuwuyudingServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class PingtaifuwuyudingController {
	@Resource
	private PingtaifuwuyudingServer pingtaifuwuyudingService;


   
	@RequestMapping("addPingtaifuwuyuding.do")
	public String addPingtaifuwuyuding(HttpServletRequest request,Pingtaifuwuyuding pingtaifuwuyuding,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		pingtaifuwuyuding.setAddtime(time.toString().substring(0, 19));
		pingtaifuwuyudingService.add(pingtaifuwuyuding);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "pingtaifuwuyudingList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:pingtaifuwuyudingList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdatePingtaifuwuyuding.do")
	public String doUpdatePingtaifuwuyuding(int id,ModelMap map,Pingtaifuwuyuding pingtaifuwuyuding){
		pingtaifuwuyuding=pingtaifuwuyudingService.getById(id);
		map.put("pingtaifuwuyuding", pingtaifuwuyuding);
		return "pingtaifuwuyuding_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("pingtaifuwuyudingDetail.do")
	public String pingtaifuwuyudingDetail(int id,ModelMap map,Pingtaifuwuyuding pingtaifuwuyuding){
		pingtaifuwuyuding=pingtaifuwuyudingService.getById(id);
		map.put("pingtaifuwuyuding", pingtaifuwuyuding);
		return "pingtaifuwuyuding_detail";
	}
//	前台详细
	@RequestMapping("ptfwydDetail.do")
	public String ptfwydDetail(int id,ModelMap map,Pingtaifuwuyuding pingtaifuwuyuding){
		pingtaifuwuyuding=pingtaifuwuyudingService.getById(id);
		map.put("pingtaifuwuyuding", pingtaifuwuyuding);
		return "pingtaifuwuyudingdetail";
	}
//	
	@RequestMapping("updatePingtaifuwuyuding.do")
	public String updatePingtaifuwuyuding(int id,ModelMap map,Pingtaifuwuyuding pingtaifuwuyuding,HttpServletRequest request,HttpSession session){
		pingtaifuwuyudingService.update(pingtaifuwuyuding);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:pingtaifuwuyudingList.do";
	}

//	分页查询
	@RequestMapping("pingtaifuwuyudingList.do")
	public String pingtaifuwuyudingList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Pingtaifuwuyuding pingtaifuwuyuding, String bianhao, String mingcheng, String leibie, String jiage, String renshu1,String renshu2, String jine, String riqi1,String riqi2, String beizhu, String yonghuming, String issh, String iszf){
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
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(renshu1==null||renshu1.equals("")){pmap.put("renshu1", null);}else{pmap.put("renshu1", renshu1);}
		if(renshu2==null||renshu2.equals("")){pmap.put("renshu2", null);}else{pmap.put("renshu2", renshu2);}
		if(jine==null||jine.equals("")){pmap.put("jine", null);}else{pmap.put("jine", jine);}
		if(riqi1==null||riqi1.equals("")){pmap.put("riqi1", null);}else{pmap.put("riqi1", riqi1);}
		if(riqi2==null||riqi2.equals("")){pmap.put("riqi2", null);}else{pmap.put("riqi2", riqi2);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		
		int total=pingtaifuwuyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Pingtaifuwuyuding> list=pingtaifuwuyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "pingtaifuwuyuding_list";
	}
	
	@RequestMapping("pingtaifuwuyudingList2.do")
	public String pingtaifuwuyudingList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Pingtaifuwuyuding pingtaifuwuyuding, String bianhao, String mingcheng, String leibie, String jiage, String renshu1,String renshu2, String jine, String riqi1,String riqi2, String beizhu, String yonghuming, String issh, String iszf,HttpServletRequest request){
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
		if(renshu1==null||renshu1.equals("")){pmap.put("renshu1", null);}else{pmap.put("renshu1", renshu1);}
		if(renshu2==null||renshu2.equals("")){pmap.put("renshu2", null);}else{pmap.put("renshu2", renshu2);}
		if(jine==null||jine.equals("")){pmap.put("jine", null);}else{pmap.put("jine", jine);}
		if(riqi1==null||riqi1.equals("")){pmap.put("riqi1", null);}else{pmap.put("riqi1", riqi1);}
		if(riqi2==null||riqi2.equals("")){pmap.put("riqi2", null);}else{pmap.put("riqi2", riqi2);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		
		
		int total=pingtaifuwuyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Pingtaifuwuyuding> list=pingtaifuwuyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "pingtaifuwuyuding_list2";
	}
	
	
	@RequestMapping("ptfwydList.do")
	public String ptfwydList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Pingtaifuwuyuding pingtaifuwuyuding, String bianhao, String mingcheng, String leibie, String jiage, String renshu1,String renshu2, String jine, String riqi1,String riqi2, String beizhu, String yonghuming, String issh, String iszf){
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
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(renshu1==null||renshu1.equals("")){pmap.put("renshu1", null);}else{pmap.put("renshu1", renshu1);}
		if(renshu2==null||renshu2.equals("")){pmap.put("renshu2", null);}else{pmap.put("renshu2", renshu2);}
		if(jine==null||jine.equals("")){pmap.put("jine", null);}else{pmap.put("jine", jine);}
		if(riqi1==null||riqi1.equals("")){pmap.put("riqi1", null);}else{pmap.put("riqi1", riqi1);}
		if(riqi2==null||riqi2.equals("")){pmap.put("riqi2", null);}else{pmap.put("riqi2", riqi2);}
		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}
		if(yonghuming==null||yonghuming.equals("")){pmap.put("yonghuming", null);}else{pmap.put("yonghuming", yonghuming);}
		
		int total=pingtaifuwuyudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Pingtaifuwuyuding> list=pingtaifuwuyudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "pingtaifuwuyudinglist";
	}
	
	@RequestMapping("deletePingtaifuwuyuding.do")
	public String deletePingtaifuwuyuding(int id,HttpServletRequest request){
		pingtaifuwuyudingService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:pingtaifuwuyudingList.do";
	}
	
	
}
