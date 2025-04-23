<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>农家院预订详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  农家院预订详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>商家编号：</td><td width='39%'>${nongjiayuanyuding.shangjiabianhao}</td>     <td width='11%'>商户名称：</td><td width='39%'>${nongjiayuanyuding.shanghumingcheng}</td></tr><tr>     <td width='11%'>商户地址：</td><td width='39%'>${nongjiayuanyuding.shanghudizhi}</td>     <td width='11%'>游客人数：</td><td width='39%'>${nongjiayuanyuding.youkerenshu}</td></tr><tr>     <td width='11%'>预订时间：</td><td width='39%'>${nongjiayuanyuding.yudingshijian}</td>     <td width='11%'>游客留言：</td><td width='39%'>${nongjiayuanyuding.youkeliuyan}</td></tr><tr>     <td width='11%'>预订人：</td><td width='39%'>${nongjiayuanyuding.yudingren}</td>     <td width='11%'>预订状态：</td><td width='39%'>${nongjiayuanyuding.yudingzhuangtai}</td></tr><tr>     <td width='11%'>商家回复：</td><td width='39%'>${nongjiayuanyuding.shangjiahuifu}</td>     <td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

