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

<title>农家院预订</title>

<link rel="stylesheet" type="text/css" href="qtimages/css/base.css"/>
<link rel="stylesheet" type="text/css" href="qtimages/css/sonpage.css"/>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>

<script type="text/javascript" src="qtimages/jquery.js"></script>
<script type="text/javascript" src="qtimages/inc.js"></script>
<link rel="stylesheet" href="qtimages/hsgbanner.css">
<style type="text/css">
<!--
.STYLE1 {
	font-size: 18px;
	font-weight: bold;
	color: #147001;
}
-->
</style>
</head>
<%
if(request.getSession().getAttribute("username")==null)
{
	out.print("<script>alert('对不起,请您先登陆!');location.href='index.do';</script>");
	return;
}
  String id="";


 



   %>


	
	<script language="javascript">
function checkform()
{
	var youkerenshuobj = document.getElementById("youkerenshu"); if(youkerenshuobj.value==""){document.getElementById("clabelyoukerenshu").innerHTML="&nbsp;&nbsp;<font color=red>请输入游客人数</font>";return false;}else{document.getElementById("clabelyoukerenshu").innerHTML="  "; } 	var youkerenshuobj = document.getElementById("youkerenshu"); if(youkerenshuobj.value!=""){ if(/^[0-9]+.?[0-9]*$/.test(youkerenshuobj.value)){document.getElementById("clabelyoukerenshu").innerHTML=""; }else{document.getElementById("clabelyoukerenshu").innerHTML="&nbsp;&nbsp;<font color=red>必需数字型</font>"; return false;}}      var yudingshijianobj = document.getElementById("yudingshijian"); if(yudingshijianobj.value==""){document.getElementById("clabelyudingshijian").innerHTML="&nbsp;&nbsp;<font color=red>请输入预订时间</font>";return false;}else{document.getElementById("clabelyudingshijian").innerHTML="  "; } 	var yudingrenobj = document.getElementById("yudingren"); if(yudingrenobj.value==""){document.getElementById("clabelyudingren").innerHTML="&nbsp;&nbsp;<font color=red>请输入预订人</font>";return false;}else{document.getElementById("clabelyudingren").innerHTML="  "; } 	
}
function gow()
{
	document.location.href="nongjiayuanyudingadd.jsp?id=<%=id%>";
}
</script>


<body>

<jsp:include page="qttop.jsp"></jsp:include>
<jsp:include page="hsgbanner.jsp"></jsp:include>

<jsp:include page="bht.jsp"></jsp:include>


<div class="center-content">
	<div class="leftbox">
          <div class="c-left">
              <ul><h2>农家院预订/<span>Details</span></h2></ul>
              <!--<ol>
                  <li><a href="#">公司新闻</a></li>
                  <li><a href="#">行业动态</a></li>
				  <li><a href="#">公司新闻</a></li>
                  <li><a href="#">行业动态</a></li>
				  <li><a href="#">公司新闻</a></li>
                  <li><a href="#">行业动态</a></li>
              </ol>-->
          </div>

          <div class="albaba">
          	<a href="#"><img src="qtimages/alibaba.png" width="250" height="500"/></a>
          </div>
                    <div class="conacts">
                	
					<ul>
                    	<li>公司地址：xxxxxxxxC-xxxxxx室
</li>
                     	<li>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;编：xxxx</li>
                        <li>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：xxx-xxxx xxx-xxxxx</li>
                        <li>传&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;真：0871-xxxxx</li>
                        <li>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：xxxxxxx@163.com
</li>                 
                    </ul>
           </div>
    </div>
    <div class="c-right">
    	<div class="tree-nav">
        	<h2>农家院预订</h2>
            <p><a href="index.do">首页</a>/ 农家院预订</p>
        </div>
<div class="news_content">
                                
								<% 




%>

  
<form action="addNongjiayuanyuding.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CCCCCC" style="border-collapse:collapse" class="newsline">
						
						<tr ><td width="200">商家编号：</td><td><input name='shangjiabianhao' type='text' id='shangjiabianhao' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.shangjiabianhao.value='<%=connDbBean.readzd("nongjiayuan","shangjiabianhao","id",request.getParameter("id"))%>';document.form1.shangjiabianhao.setAttribute("readOnly",'true');</script>		<tr ><td width="200">商户名称：</td><td><input name='shanghumingcheng' type='text' id='shanghumingcheng' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.shanghumingcheng.value='<%=connDbBean.readzd("nongjiayuan","shanghumingcheng","id",request.getParameter("id"))%>';document.form1.shanghumingcheng.setAttribute("readOnly",'true');</script>		<tr ><td width="200">商户地址：</td><td><input name='shanghudizhi' type='text' id='shanghudizhi' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.shanghudizhi.value='<%=connDbBean.readzd("nongjiayuan","shanghudizhi","id",request.getParameter("id"))%>';document.form1.shanghudizhi.setAttribute("readOnly",'true');</script>		<tr ><td width="200">游客人数：</td><td><input name='youkerenshu' type='text' id='youkerenshu' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelyoukerenshu' /></td></tr>		<tr ><td width="200">预订时间：</td><td><input name='yudingshijian' type='text' id='yudingshijian' value='<%=connDbBean.getdate()%>' onblur='checkform()' readonly='readonly' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:100px; height:16px; border:solid 1px #000000; color:#666666'/>&nbsp;*<label id='clabelyudingshijian' /></td></tr>		<tr ><td width="200">游客留言：</td><td><textarea name='youkeliuyan' cols='50' rows='5' id='youkeliuyan' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>		<tr ><td width="200">预订人：</td><td><input name='yudingren' type='text' id='yudingren' onblur='checkform()' style='border:solid 1px #000000; color:#666666' value='<%=(String)request.getSession().getAttribute("username")%>' readonly="readonly" />&nbsp;*<label id='clabelyudingren' /></td></tr>		<tr style='display:none'><td width="200">预订状态：</td><td><select name='yudingzhuangtai' id='yudingzhuangtai'><option value="待确认">待确认</option><option value="成功">成功</option><option value="客满">客满</option></select></td></tr>		<tr style='display:none'><td width="200">商家回复：</td><td><textarea name='shangjiahuifu' cols='50' rows='5' id='shangjiahuifu' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>		
		
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
			<script language="javascript">popheight = 450;</script>
					  
      </div>
                            
    </div>
</div>




<jsp:include page="qtdown.jsp"></jsp:include>

</body>
</html>
