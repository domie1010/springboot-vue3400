<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="nongjiayuanyudinghsgb" scope="page" class="com.bean.NongjiayuanyudingBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=nongjiayuanyuding.xls");
%>
<html>
  <head>
    <title>农家院预订</title>
  </head>

  <body >
 <%
			String sql="select * from nongjiayuanyuding  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>商家编号</td>    <td align='center'>商户名称</td>    <td align='center'>商户地址</td>    <td align='center'>游客人数</td>    <td  width='65' align='center'>预订时间</td>        <td align='center'>预订人</td>    <td align='center'>预订状态</td>        
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=nongjiayuanyudinghsgb.getAllNongjiayuanyuding(11);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.shangjiabianhao}</td>    <td>${u.shanghumingcheng}</td>    <td>${u.shanghudizhi}</td>    <td>${u.youkerenshu}</td>    <td>${u.yudingshijian}</td>        <td>${u.yudingren}</td>    <td>${u.yudingzhuangtai}</td>        
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

