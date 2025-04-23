<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>商户服务预订详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  商户服务预订详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>编号：</td><td width='39%'>${shanghufuwuyuding.bianhao}</td>     <td width='11%'>名称：</td><td width='39%'>${shanghufuwuyuding.mingcheng}</td></tr><tr>     <td width='11%'>类别：</td><td width='39%'>${shanghufuwuyuding.leibie}</td>     <td width='11%'>商户编号：</td><td width='39%'>${shanghufuwuyuding.shanghubianhao}</td></tr><tr>     <td width='11%'>价格：</td><td width='39%'>${shanghufuwuyuding.jiage}</td>     <td width='11%'>数量：</td><td width='39%'>${shanghufuwuyuding.shuliang}</td></tr><tr>     <td width='11%'>金额：</td><td width='39%'>${shanghufuwuyuding.jine}</td>     <td width='11%'>日期：</td><td width='39%'>${shanghufuwuyuding.riqi}</td></tr><tr>     <td width='11%'>备注：</td><td width='39%'>${shanghufuwuyuding.beizhu}</td>     <td width='11%'>用户名：</td><td width='39%'>${shanghufuwuyuding.yonghuming}</td>     </tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

