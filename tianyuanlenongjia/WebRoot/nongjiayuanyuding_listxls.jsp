<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="nongjiayuanyudinghsgb" scope="page" class="com.bean.NongjiayuanyudingBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=nongjiayuanyuding.xls");
%>
<html>
  <head>
    <title>ũ��ԺԤ��</title>
  </head>

  <body >
 <%
			String sql="select * from nongjiayuanyuding  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td align='center'>�̼ұ��</td>    <td align='center'>�̻�����</td>    <td align='center'>�̻���ַ</td>    <td align='center'>�ο�����</td>    <td  width='65' align='center'>Ԥ��ʱ��</td>        <td align='center'>Ԥ����</td>    <td align='center'>Ԥ��״̬</td>        
	
    <td width="120" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
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

