<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>平台服务详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  平台服务详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>编号：</td><td width='39%'>${pingtaifuwu.bianhao}</td>     <td width='11%'>名称：</td><td width='39%'>${pingtaifuwu.mingcheng}</td></tr><tr>     <td width='11%'>类别：</td><td width='39%'>${pingtaifuwu.leibie}</td>     <td width='11%'>价格：</td><td width='39%'>${pingtaifuwu.jiage}</td></tr><tr>     <td width='11%'>简介：</td><td width='39%'>${pingtaifuwu.jianjie}</td>     <td width='11%'>发布人：</td><td width='39%'>${pingtaifuwu.faburen}</td>     </tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

