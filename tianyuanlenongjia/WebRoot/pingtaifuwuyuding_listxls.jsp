<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="pingtaifuwuyudinghsgb" scope="page" class="com.bean.PingtaifuwuyudingBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=pingtaifuwuyuding.xls");
%>
<html>
  <head>
    <title>ƽ̨����Ԥ��</title>
  </head>

  <body >
 <%
			String sql="select * from pingtaifuwuyuding  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td align='center'>���</td>    <td align='center'>����</td>    <td align='center'>���</td>    <td align='center'>�۸�</td>    <td align='center'>����</td>    <td align='center'>���</td>    <td  width='65' align='center'>����</td>        <td align='center'>�û���</td>    <td  width='80' align='center'>�Ƿ�֧��</td>    <td  width='80' align='center'>�Ƿ����</td>
	
    <td width="120" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
  </tr>
   <%		
				List pagelist3=pingtaifuwuyudinghsgb.getAllPingtaifuwuyuding(13);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.bianhao}</td>    <td>${u.mingcheng}</td>    <td>${u.leibie}</td>    <td>${u.jiage}</td>    <td>${u.renshu}</td>    <td>${u.jine}</td>    <td>${u.riqi}</td>        <td>${u.yonghuming}</td>    <td align='center'>${u.yonghuming}</td>    <td align='center'>${u.issh} <input type="button" value="���" onclick="javascript:location.href='sh.jsp?id=${u.id}&yuan=${u.issh}&tablename=pingtaifuwuyuding'"/></td>
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

