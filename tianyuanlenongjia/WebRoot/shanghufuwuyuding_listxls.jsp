<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="shanghufuwuyudinghsgb" scope="page" class="com.bean.ShanghufuwuyudingBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=shanghufuwuyuding.xls");
%>
<html>
  <head>
    <title>商户服务预订</title>
  </head>

  <body >
 <%
			String sql="select * from shanghufuwuyuding  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>编号</td>    <td align='center'>名称</td>    <td align='center'>类别</td>    <td align='center'>商户编号</td>    <td align='center'>价格</td>    <td align='center'>数量</td>    <td align='center'>金额</td>    <td  width='65' align='center'>日期</td>        <td align='center'>用户名</td>    <td  width='80' align='center'>是否支付</td>    <td  width='80' align='center'>是否审核</td>
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=shanghufuwuyudinghsgb.getAllShanghufuwuyuding(14);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.bianhao}</td>    <td>${u.mingcheng}</td>    <td>${u.leibie}</td>    <td>${u.shanghubianhao}</td>    <td>${u.jiage}</td>    <td>${u.shuliang}</td>    <td>${u.jine}</td>    <td>${u.riqi}</td>        <td>${u.yonghuming}</td>    <td align='center'>${u.yonghuming}</td>    <td align='center'>${u.issh} <input type="button" value="审核" onclick="javascript:location.href='sh.jsp?id=${u.id}&yuan=${u.issh}&tablename=shanghufuwuyuding'"/></td>
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

