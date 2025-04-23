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
		<TITLE>添加农家院</TITLE>
	    <link rel="stylesheet" href="kindeditor_a5/themes/default/default.css" />
	<link rel="stylesheet" href="kindeditor_a5/plugins/code/prettify.css" />
	<script charset="utf-8" src="kindeditor_a5/kindeditor.js"></script>
	<script charset="utf-8" src="kindeditor_a5/lang/zh_CN.js"></script>
	<script charset="utf-8" src="kindeditor_a5/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="shanghujianjie"]', {
				cssPath : 'kindeditor_a5/plugins/code/prettify.css',
				uploadJson : 'kindeditor_a5/jsp/upload_json.jsp',
				fileManagerJson : 'kindeditor_a5/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>

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
	document.location.href="nongjiayuan_add.jsp?id=<%=id%>";
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
			<form action="addNongjiayuan.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">添加农家院</td>
						</tr>
						<tr ><td width="200">商家编号：</td><td><input name='shangjiabianhao' type='text' id='shangjiabianhao' value='' onblur='hsgcheck()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelshangjiabianhao' /></td></tr>		<tr ><td width="200">商户名称：</td><td><input name='shanghumingcheng' type='text' id='shanghumingcheng' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelshanghumingcheng' /></td></tr>		<tr ><td width="200">营业执照：</td><td><input name='yingyezhizhao' type='text' id='yingyezhizhao' size='50' value='' onblur='' style='border:solid 1px #000000; color:#666666' />&nbsp;<input type='button' value='上传' onClick="up('yingyezhizhao')" style='border:solid 1px #000000; color:#666666'/></td></tr>		<tr ><td width="200">服务热线：</td><td><input name='fuwurexian' type='text' id='fuwurexian' value='' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr>		<tr ><td width="200">商户地址：</td><td><input name='shanghudizhi' type='text' id='shanghudizhi' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666' /></td></tr>		<tr ><td width="200">主营项目：</td><td><input name='zhuyingxiangmu' type='text' id='zhuyingxiangmu' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666' /></td></tr>		<tr ><td width="200">商户简介：</td><td><textarea name="shanghujianjie" cols="100" rows="8" style="width:700px;height:200px;visibility:hidden;"></textarea></td></tr>		<tr ><td width="200">密码：</td><td><input name='mima' type='text' id='mima' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelmima' /></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>




<script language=javascript >  
function hsgcheck() {
		var shangjiabianhao = $("#shangjiabianhao").val();
		if(shangjiabianhao==""||(shangjiabianhao.length<6||shangjiabianhao.length>12)){
			 $("#clabelshangjiabianhao").html("<font color=red>商家编号不能为空且长度在3～12位之间！</font>");
			 $("input[id=shangjiabianhao]").focus();
			 $("#querenzhuce").attr("disabled","disabled");
			 return false;
		} 
		else
		{
			$("#clabelshangjiabianhao").html("");
			$.ajax({
				url : "quchongNongjiayuan.do",
				type : "post",
				data : "shangjiabianhao=" + shangjiabianhao,
				dataType : "json",
				success:function(result){
				if(result.info=="ng"){
					$("#clabelshangjiabianhao").html("<font color=red>商家编号已存在，请更换！</font>");
					$("input[id=shangjiabianhao]").focus();
					$("#querenzhuce").attr("disabled","disabled");
					return false;
				}
				else
				{
					$("#querenzhuce").removeAttr("disabled");
				}
				},
				error:function(){
					$("#clabelshangjiabianhao").html("系统异常，请检查错误！");
					$("input[id=shangjiabianhao]").focus();
					$("#querenzhuce").attr("disabled","disabled");
					return false;
				}
			});
		}
	}
</script>


<script language=javascript >  
 
 function checkform(){  
 
	var shangjiabianhaoobj = document.getElementById("shangjiabianhao"); if(shangjiabianhaoobj.value==""){document.getElementById("clabelshangjiabianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入商家编号</font>";return false;}else{document.getElementById("clabelshangjiabianhao").innerHTML="  "; } 	var shanghumingchengobj = document.getElementById("shanghumingcheng"); if(shanghumingchengobj.value==""){document.getElementById("clabelshanghumingcheng").innerHTML="&nbsp;&nbsp;<font color=red>请输入商户名称</font>";return false;}else{document.getElementById("clabelshanghumingcheng").innerHTML="  "; } 	var mimaobj = document.getElementById("mima"); if(mimaobj.value==""){document.getElementById("clabelmima").innerHTML="&nbsp;&nbsp;<font color=red>请输入密码</font>";return false;}else{document.getElementById("clabelmima").innerHTML="  "; } 	


return true;   
}   
popheight=450;
</script>  
