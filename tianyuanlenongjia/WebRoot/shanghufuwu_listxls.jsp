<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="shanghufuwuhsgb" scope="page" class="com.bean.ShanghufuwuBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=shanghufuwu.xls");
%>
<html>
  <head>
    <title>商户服务</title>
  </head>

  <body >
 <%
			String sql="select * from shanghufuwu  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>编号</td>    <td align='center'>名称</td>    <td  width='90' align='center'>主图</td>    <td align='center'>类别</td>    <td align='center'>价格</td>        <td align='center'>商户编号</td>    <td align='center'>商户名称</td>    
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=shanghufuwuhsgb.getAllShanghufuwu(10);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.bianhao}</td>    <td>${u.mingcheng}</td>    <td width='90' align='center'><a href='${u.zhutu}' target='_blank'><img src='${u.zhutu}' width=88 height=99 border=0 /></a></td>    <td>${u.leibie}</td>    <td>${u.jiage}</td>        <td>${u.shanghubianhao}</td>    <td>${u.shanghumingcheng}</td>    
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

