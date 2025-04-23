<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>

<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>农家院</title>

<link rel="stylesheet" type="text/css" href="qtimages/css/base.css"/>
<link rel="stylesheet" type="text/css" href="qtimages/css/sonpage.css"/>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>

<script type="text/javascript" src="qtimages/jquery.js"></script>
<script type="text/javascript" src="qtimages/inc.js"></script>
<link rel="stylesheet" href="qtimages/hsgbanner.css">
<style type="text/css">
<!--
.STYLE1 {
	font-size: 18px;
	font-weight: bold;
	color: #147001;
}
-->
</style>
</head>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>

<%

%>

<body>

<jsp:include page="qttop.jsp"></jsp:include>
<jsp:include page="hsgbanner.jsp"></jsp:include>

<jsp:include page="bht.jsp"></jsp:include>


<div class="center-content">
	<div class="leftbox">
          <div class="c-left">
              <ul><h2>农家院/<span>Details</span></h2></ul>
              <!--<ol>
                  <li><a href="#">公司新闻</a></li>
                  <li><a href="#">行业动态</a></li>
				  <li><a href="#">公司新闻</a></li>
                  <li><a href="#">行业动态</a></li>
				  <li><a href="#">公司新闻</a></li>
                  <li><a href="#">行业动态</a></li>
              </ol>-->
          </div>

          <div class="albaba">
          	<a href="#"><img src="qtimages/alibaba.png" width="250" height="500"/></a>
          </div>
                    <div class="conacts">
                	
					<ul>
                    	<li>公司地址：xxxxxxxxC-xxxxxx室
</li>
                     	<li>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;编：xxxx</li>
                        <li>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：xxx-xxxx xxx-xxxxx</li>
                        <li>传&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;真：0871-xxxxx</li>
                        <li>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：xxxxxxx@163.com
</li>                 
                    </ul>
           </div>
    </div>
    <div class="c-right">
    	<div class="tree-nav">
        	<h2>农家院</h2>
            <p><a href="index.do">首页</a>/ 农家院</p>
        </div>
<div class="news_content">
                                
								
<form action="njyList.do" name="myform" method="post">
									查询   商家编号：<input name="shangjiabianhao" type="text" id="shangjiabianhao" style='border:solid 1px #000000; color:#666666' size="12" />  商户名称：<input name="shanghumingcheng" type="text" id="shanghumingcheng" style='border:solid 1px #000000; color:#666666' size="12" />  商户地址：<input name="shanghudizhi" type="text" id="shanghudizhi" style='border:solid 1px #000000; color:#666666' size="12" />  主营项目：<input name="zhuyingxiangmu" type="text" id="zhuyingxiangmu" style='border:solid 1px #000000; color:#666666' size="12" />
									<input type="submit" value="查询" /> <input type="button" name="Submit2" value="切换视图"  onClick="javascript:location.href='njyListtp.do';" />
								</form>	

	
<br />
<table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#ebf0f7">
                          <tr>
                            <td align="center" bgcolor="#ebf0f7" width="30px">序号</td>
                            <td bgcolor='#ebf0f7'>商家编号</td>    <td bgcolor='#ebf0f7'>商户名称</td>    <td bgcolor='#ebf0f7' width='90' align='center'>营业执照</td>    <td bgcolor='#ebf0f7'>服务热线</td>    <td bgcolor='#ebf0f7'>商户地址</td>    <td bgcolor='#ebf0f7'>主营项目</td>        <td bgcolor='#ebf0f7'>密码</td>    
                            <td align="center" bgcolor="#ebf0f7" width="150px"> 添加时间 </td>
                            <td align="center" bgcolor="#ebf0f7" width="50px"> 操作 </td>
                          </tr>
                          <%
					int i=0;
				%>
                          <c:forEach items="${list}" var="u">
                            <%
					i++;
				%>
                            <tr align="center" bgcolor="#FFFFFF">
                              <td align="center"><%=i%></td>
                             <td>${u.shangjiabianhao}</td>    <td>${u.shanghumingcheng}</td>    <td width='90'><a href='${u.yingyezhizhao}' target='_blank'><img src='${u.yingyezhizhao}' width=88 height=99 border=0 /></a></td>    <td>${u.fuwurexian}</td>    <td>${u.shanghudizhi}</td>    <td>${u.zhuyingxiangmu}</td>        <td>${u.mima}</td>    
                              <td align="center"> ${u.addtime} </td>
                              <td align="center"><a href="njyDetail.do?id=${u.id}">详细</a></td>
                            </tr>
                          </c:forEach>
                        </table>
<br>

<p align="center"> <c:if test="${sessionScope.p==1 }">
		 <c:if test="${page.page>1}">
              <a href="njyList.do?page=1" >首页</a>
             <a href="njyList.do?page=${page.page-1 }"> 上一页</a>             </c:if>
    	     <c:if test="${page.page<page.totalPage}">
			<a href="njyList.do?page=${page.page+1 }">下一页</a>
			<a href="njyList.do?page=${page.totalPage }">末页</a>		    </c:if>		
	</c:if>
	</p>




					  
      </div>
                            
    </div>
</div>




<jsp:include page="qtdown.jsp"></jsp:include>

</body>
</html>
