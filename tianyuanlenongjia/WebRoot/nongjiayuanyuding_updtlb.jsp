<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>

<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<TITLE>设置农家院预订</TITLE>
	    
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>
       
	</head>
<%
  String id="";
//islbd1q 
   %>
<script language="javascript">

function gows()
{
	document.location.href="nongjiayuanyuding_add.jsp?id=<%=id%>";
}
function hsgxia2shxurxu(nstr,nwbk)
{
	if (eval("form1."+nwbk).value.indexOf(nstr)>=0)
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value.replace(nstr+"；", "");
	}
	else
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value+nstr+"；";
	}
}
</script>
	<body>
			<form action="updateNongjiayuanyuding.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">设置农家院预订<input type="hidden" name="id" value="${nongjiayuanyuding.id}" /></td>
						</tr>
						<tr style='display:none'><td width="200">商家编号：</td><td><input name='shangjiabianhao' type='text' id='shangjiabianhao' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr style='display:none'><td width="200">商户名称：</td><td><input name='shanghumingcheng' type='text' id='shanghumingcheng' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr style='display:none'><td width="200">商户地址：</td><td><input name='shanghudizhi' type='text' id='shanghudizhi' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr style='display:none'><td width="200">游客人数：</td><td><input name='youkerenshu' type='text' id='youkerenshu' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelyoukerenshu' /></td></tr>		<tr style='display:none'><td width="200">预订时间：</td><td><input name='yudingshijian' type='text' id='yudingshijian' value='<%=connDbBean.getdate()%>' onblur='checkform()' readonly='readonly' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:100px; height:16px; border:solid 1px #000000; color:#666666'/>&nbsp;*<label id='clabelyudingshijian' /></td></tr>		<tr style='display:none'><td width="200">游客留言：</td><td><textarea name='youkeliuyan' cols='50' rows='5' id='youkeliuyan' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>		<tr style='display:none'><td width="200">预订人：</td><td><input name='yudingren' type='text' id='yudingren' onblur='checkform()' style='border:solid 1px #000000; color:#666666' value='<%=(String)request.getSession().getAttribute("username")%>' readonly="readonly" />&nbsp;*<label id='clabelyudingren' /></td></tr>		<tr ><td width="200">预订状态：</td><td><select name='yudingzhuangtai' id='yudingzhuangtai'><option value="待确认">待确认</option><option value="成功">成功</option><option value="客满">客满</option></select></td></tr>		<tr ><td width="200">商家回复：</td><td><textarea name='shangjiahuifu' cols='50' rows='5' id='shangjiahuifu' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
						<script language="javascript">document.form1.shangjiabianhao.value='${nongjiayuanyuding.shangjiabianhao}';</script>	<script language="javascript">document.form1.shanghumingcheng.value='${nongjiayuanyuding.shanghumingcheng}';</script>	<script language="javascript">document.form1.shanghudizhi.value='${nongjiayuanyuding.shanghudizhi}';</script>	<script language="javascript">document.form1.youkerenshu.value='${nongjiayuanyuding.youkerenshu}';</script>	<script language="javascript">document.form1.yudingshijian.value='${nongjiayuanyuding.yudingshijian}';</script>	<script language="javascript">document.form1.youkeliuyan.value='${nongjiayuanyuding.youkeliuyan}';</script>	<script language="javascript">document.form1.yudingren.value='${nongjiayuanyuding.yudingren}';</script>	<script language="javascript">document.form1.yudingzhuangtai.value='${nongjiayuanyuding.yudingzhuangtai}';</script>	<script language="javascript">document.form1.shangjiahuifu.value='${nongjiayuanyuding.shangjiahuifu}';</script>	
					 </table>
			</form>
   </body>
</html>





<script language=javascript >  
 
 function checkform(){  
 
	var youkerenshuobj = document.getElementById("youkerenshu"); if(youkerenshuobj.value==""){document.getElementById("clabelyoukerenshu").innerHTML="&nbsp;&nbsp;<font color=red>请输入游客人数</font>";return false;}else{document.getElementById("clabelyoukerenshu").innerHTML="  "; } 	    var yudingshijianobj = document.getElementById("yudingshijian"); if(yudingshijianobj.value==""){document.getElementById("clabelyudingshijian").innerHTML="&nbsp;&nbsp;<font color=red>请输入预订时间</font>";return false;}else{document.getElementById("clabelyudingshijian").innerHTML="  "; } 	var yudingrenobj = document.getElementById("yudingren"); if(yudingrenobj.value==""){document.getElementById("clabelyudingren").innerHTML="&nbsp;&nbsp;<font color=red>请输入预订人</font>";return false;}else{document.getElementById("clabelyudingren").innerHTML="  "; } 	


return true;   
}   
popheight=450;
</script>  
