<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>平台服务预订详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  平台服务预订详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>编号：</td><td width='39%'>${pingtaifuwuyuding.bianhao}</td>     <td width='11%'>名称：</td><td width='39%'>${pingtaifuwuyuding.mingcheng}</td></tr><tr>     <td width='11%'>类别：</td><td width='39%'>${pingtaifuwuyuding.leibie}</td>     <td width='11%'>价格：</td><td width='39%'>${pingtaifuwuyuding.jiage}</td></tr><tr>     <td width='11%'>人数：</td><td width='39%'>${pingtaifuwuyuding.renshu}</td>     <td width='11%'>金额：</td><td width='39%'>${pingtaifuwuyuding.jine}</td></tr><tr>     <td width='11%'>日期：</td><td width='39%'>${pingtaifuwuyuding.riqi}</td>     <td width='11%'>备注：</td><td width='39%'>${pingtaifuwuyuding.beizhu}</td></tr><tr>     <td width='11%'>用户名：</td><td width='39%'>${pingtaifuwuyuding.yonghuming}</td>     <td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

