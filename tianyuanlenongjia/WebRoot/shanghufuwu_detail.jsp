<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>商户服务详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  商户服务详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>编号：</td><td width='39%'>${shanghufuwu.bianhao}</td><td  rowspan=6 align=center><a href=${shanghufuwu.zhutu} target=_blank><img src=${shanghufuwu.zhutu} width=228 height=215 border=0></a></td></tr><tr><td width='11%' height=44>名称：</td><td width='39%'>${shanghufuwu.mingcheng}</td></tr><tr><td width='11%' height=44>类别：</td><td width='39%'>${shanghufuwu.leibie}</td></tr><tr><td width='11%' height=44>价格：</td><td width='39%'>${shanghufuwu.jiage}</td></tr><tr><td width='11%' height=44>商户编号：</td><td width='39%'>${shanghufuwu.shanghubianhao}</td></tr><tr><td width='11%' height=44>商户名称：</td><td width='39%'>${shanghufuwu.shanghumingcheng}</td></tr><tr><td width='11%' height=100  >简介：</td><td width='39%' colspan=2 height=100 >${shanghufuwu.jianjie}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

