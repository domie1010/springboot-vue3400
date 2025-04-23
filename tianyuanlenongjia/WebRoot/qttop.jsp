<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<div class="header">
	<div class="box logo">
      <div class="logopart">
          <a href="index.do">田园乐农家院团建平台</a>
      </div>
	   <div style="padding-top:50px; position:absolute; padding-left:120px;">
         <div style="font-family:宋体; color:#0c9b25; WIDTH: 100%; FONT-WEIGHT: bold; FONT-SIZE: 19pt; margin-top:5pt">
                    <div align="left">田园乐农家院团建平台</div>
                </div>
      </div>
      <div class="phonepart">
			<div class="toplink">

                <%
    if((String)request.getSession().getAttribute("username")==null || (String)request.getSession().getAttribute("username")==""){
     %>	
                <a href="nongjiayuanadd.jsp">商户注册</a>|
                <a href="userreg.jsp">用户注册</a>|
                <a href="userlog.jsp">用户登陆</a>
                <%
							}
				  else
				  {
				 %>
                 <%=request.getSession().getAttribute("username")%> <%=request.getSession().getAttribute("cx")%> <a href='logout.jsp'>退出</a> <a href='main.jsp'>后台</a>
                 
                 <%
						  }
						  %>
            </div>
            <div class="f_c"></div>
            <div class="dplink">
            	
                <img src="qtimages/phone.png" width="198" height="46"/>
            </div>
      </div>
    </div>
</div>