<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="nongjiayuanhsgb" scope="page" class="com.bean.NongjiayuanBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=nongjiayuan.xls");
%>
<html>
  <head>
    <title>ũ��Ժ</title>
  </head>

  <body >
 <%
			String sql="select * from nongjiayuan  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td align='center'>�̼ұ��</td>    <td align='center'>�̻�����</td>    <td  width='90' align='center'>Ӫҵִ��</td>    <td align='center'>��������</td>    <td align='center'>�̻���ַ</td>    <td align='center'>��Ӫ��Ŀ</td>        <td align='center'>����</td>    <td  width='80' align='center'>�Ƿ����</td>
	
    <td width="120" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
  </tr>
   <%		
				List pagelist3=nongjiayuanhsgb.getAllNongjiayuan(11);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.shangjiabianhao}</td>    <td>${u.shanghumingcheng}</td>    <td width='90' align='center'><a href='${u.yingyezhizhao}' target='_blank'><img src='${u.yingyezhizhao}' width=88 height=99 border=0 /></a></td>    <td>${u.fuwurexian}</td>    <td>${u.shanghudizhi}</td>    <td>${u.zhuyingxiangmu}</td>        <td>${u.mima}</td>    <td align='center'>${u.issh} <input type="button" value="���" onclick="javascript:location.href='sh.jsp?id=${u.id}&yuan=${u.issh}&tablename=nongjiayuan'"/></td>
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

