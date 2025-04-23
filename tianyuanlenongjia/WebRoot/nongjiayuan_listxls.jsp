<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="nongjiayuanhsgb" scope="page" class="com.bean.NongjiayuanBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=nongjiayuan.xls");
%>
<html>
  <head>
    <title>农家院</title>
  </head>

  <body >
 <%
			String sql="select * from nongjiayuan  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>商家编号</td>    <td align='center'>商户名称</td>    <td  width='90' align='center'>营业执照</td>    <td align='center'>服务热线</td>    <td align='center'>商户地址</td>    <td align='center'>主营项目</td>        <td align='center'>密码</td>    <td  width='80' align='center'>是否审核</td>
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=nongjiayuanhsgb.getAllNongjiayuan(11);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.shangjiabianhao}</td>    <td>${u.shanghumingcheng}</td>    <td width='90' align='center'><a href='${u.yingyezhizhao}' target='_blank'><img src='${u.yingyezhizhao}' width=88 height=99 border=0 /></a></td>    <td>${u.fuwurexian}</td>    <td>${u.shanghudizhi}</td>    <td>${u.zhuyingxiangmu}</td>        <td>${u.mima}</td>    <td align='center'>${u.issh} <input type="button" value="审核" onclick="javascript:location.href='sh.jsp?id=${u.id}&yuan=${u.issh}&tablename=nongjiayuan'"/></td>
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

