<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>农家院详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  农家院详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>商家编号：</td><td width='39%'>${nongjiayuan.shangjiabianhao}</td><td  rowspan=6 align=center><a href=${nongjiayuan.yingyezhizhao} target=_blank><img src=${nongjiayuan.yingyezhizhao} width=228 height=215 border=0></a></td></tr><tr><td width='11%' height=44>商户名称：</td><td width='39%'>${nongjiayuan.shanghumingcheng}</td></tr><tr><td width='11%' height=44>服务热线：</td><td width='39%'>${nongjiayuan.fuwurexian}</td></tr><tr><td width='11%' height=44>商户地址：</td><td width='39%'>${nongjiayuan.shanghudizhi}</td></tr><tr><td width='11%' height=44>主营项目：</td><td width='39%'>${nongjiayuan.zhuyingxiangmu}</td></tr><tr><td width='11%' height=44>密码：</td><td width='39%'>${nongjiayuan.mima}</td></tr><tr><td width='11%' height=100  >商户简介：</td><td width='39%' colspan=2 height=100 >${nongjiayuan.shanghujianjie}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

