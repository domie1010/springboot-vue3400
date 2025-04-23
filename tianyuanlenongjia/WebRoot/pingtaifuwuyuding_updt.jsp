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
		<TITLE>修改平台服务预订</TITLE>
	    
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
 
   %>
<script language="javascript">

function gows()
{
	document.location.href="pingtaifuwuyuding_add.jsp?id=<%=id%>";
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
			<form action="updatePingtaifuwuyuding.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">修改平台服务预订<input type="hidden" name="id" value="${pingtaifuwuyuding.id}" /></td>
						</tr>
						<tr ><td width="200">编号：</td><td><input name='bianhao' type='text' id='bianhao' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">名称：</td><td><input name='mingcheng' type='text' id='mingcheng' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">类别：</td><td><input name='leibie' type='text' id='leibie' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">价格：</td><td><input name='jiage' type='text' id='jiage' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr>		<tr ><td width="200">人数：</td><td><input name='renshu' type='text' id='renshu' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelrenshu' /></td></tr>		<tr ><td width="200">金额：</td><td><input name='jine' type='text' id='jine' value='' onblur='' style='border:solid 1px #000000; color:#666666' readonly='readonly' /> 此项不必填写，系统自动计算</td></tr>		<tr ><td width="200">日期：</td><td><input name='riqi' type='text' id='riqi' value='<%=connDbBean.getdate()%>' onblur='checkform()' readonly='readonly' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:100px; height:16px; border:solid 1px #000000; color:#666666'/>&nbsp;*<label id='clabelriqi' /></td></tr>		<tr ><td width="200">备注：</td><td><textarea name='beizhu' cols='50' rows='5' id='beizhu' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>		<tr ><td width="200">用户名：</td><td><input name='yonghuming' type='text' id='yonghuming' onblur='' style='border:solid 1px #000000; color:#666666' value='<%=(String)request.getSession().getAttribute("username")%>' readonly="readonly" /></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
						<script language="javascript">document.form1.bianhao.value='${pingtaifuwuyuding.bianhao}';</script>	<script language="javascript">document.form1.mingcheng.value='${pingtaifuwuyuding.mingcheng}';</script>	<script language="javascript">document.form1.leibie.value='${pingtaifuwuyuding.leibie}';</script>	<script language="javascript">document.form1.jiage.value='${pingtaifuwuyuding.jiage}';</script>	<script language="javascript">document.form1.renshu.value='${pingtaifuwuyuding.renshu}';</script>	<script language="javascript">document.form1.jine.value='${pingtaifuwuyuding.jine}';</script>	<script language="javascript">document.form1.riqi.value='${pingtaifuwuyuding.riqi}';</script>	<script language="javascript">document.form1.beizhu.value='${pingtaifuwuyuding.beizhu}';</script>	<script language="javascript">document.form1.yonghuming.value='${pingtaifuwuyuding.yonghuming}';</script>	
					 </table>
			</form>
   </body>
</html>






<script language=javascript >  
 
 function checkform(){  
 
	var renshuobj = document.getElementById("renshu"); if(renshuobj.value==""){document.getElementById("clabelrenshu").innerHTML="&nbsp;&nbsp;<font color=red>请输入人数</font>";return false;}else{document.getElementById("clabelrenshu").innerHTML="  "; } 	    var riqiobj = document.getElementById("riqi"); if(riqiobj.value==""){document.getElementById("clabelriqi").innerHTML="&nbsp;&nbsp;<font color=red>请输入日期</font>";return false;}else{document.getElementById("clabelriqi").innerHTML="  "; } 	var jinej=1;if(document.getElementById("jiage").value!=""){jinej=jinej*parseFloat(document.getElementById("jiage").value);}if(document.getElementById("renshu").value!=""){jinej=jinej*parseFloat(document.getElementById("renshu").value);}document.getElementById("jine").value=jinej;	


return true;   
}   
popheight=450;
</script>  
