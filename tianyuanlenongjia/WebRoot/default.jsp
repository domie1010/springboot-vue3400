<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.util.db"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>


<title>田园乐农家院团建平台</title>
<link rel="stylesheet" type="text/css" href="qtimages/css/base.css"/>
<link rel="stylesheet" type="text/css" href="qtimages/css/index.css"/>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript" src="js/koala.min.1.5.js"></script>
<script type="text/javascript" src="js/jquery.kxbdMarquee.js"></script>

<script type="text/javascript" src="qtimages/jquery.js"></script>
<script type="text/javascript" src="qtimages/inc.js"></script>
<link rel="stylesheet" href="qtimages/hsgbanner.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body>
<jsp:include page="qttop.jsp"></jsp:include>


<jsp:include page="hsgbanner.jsp"></jsp:include>

<jsp:include page="bht.jsp"></jsp:include>



<div class="intitle">
	<ul>
    	<li><h1>关于我们/</h1><span>About us</span></li>
    </ul>
</div>
<div class="box gsjj">
	<div class="gsjj-left">
    	<ul>
        	<li><img src="qtimages/ico11.gif" width="101" height="106"/><span>高效</span></li>
            <li><img src="qtimages/ico22.gif" width="101" height="106"/><span>安全</span></li>
            <li><img src="qtimages/ico33.gif" width="101" height="106"/><span>专业</span></li>
        </ul>
    </div>
    <div class="gsjj-right">
    	<p>
        
        <%=connDbBean.readzd("dx","content","leibie","关于我们")%>
        <%-- 本公司坚持走:以质量求生存,以科技求发展,重合同守信用的道路,生产经营得到迅速发展。我们将以优质的产品和最完善的售后服务来真诚与各界朋友开展广泛的合作,共同创造一个美好的未来!
公司行为准则:忠信仁义，以人为本。 
    忠：即忠诚，包括三重含义：企业忠于国家、忠于民族；企业忠于客户；员工忠于企业。 
    信：即诚信，做企业要立足根本道德、信义，要诚实、讲信用。 
    仁：即仁爱，上司对下属要仁爱、体贴，同事之间要关怀、友爱。 
    义：即大义，公司在与合作伙伴、客户的交往过程中，不做损人利己的事，明是非。  --%>
    </p><p>
    <span><a href="dx_detail.php?lb=关于我们">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></span></p>
        
    </div>
</div>
<!--<div class="intitle">
	<ul>
    	<li><h1>健康养生/</h1><span>Health</span></li>
    </ul>
</div>
<div class="box news-box">
	<div class="banner-box2">
                    
          <div id="fsD1" class="focus" >  
              <div id="D1pic1" class="fPic">  
                  <div class="fcon" style="display: none;">
                      <a target="_blank" href="http://www.lanrentuku.com/"><img src="qtimages/01.jpg" width="660" height="380" style="opacity: 1; "></a>
                      <span class="shadow"><a target="_blank" href="index.html">大姚御春农葛根种植基地</a></span>                  </div>
                  
                  <div class="fcon" style="display: none;">
                      <a target="_blank" href="http://www.lanrentuku.com/"><img src="qtimages/02.jpg" style="opacity: 1; "></a>
                      <span class="shadow"><a target="_blank" href="index.html">佟大为登封面表情搞怪</a></span>                  </div>
                  
                  <div class="fcon" style="display: none;">
                      <a target="_blank" href="http://www.lanrentuku.com/"><img src="qtimages/03.jpg" style="opacity: 1; "></a>
                      <span class="shadow"><a target="_blank" href="index.html">21岁出柜超模巴厘自曝搞笑全裸照</a></span>                  </div>
                  
                  <div class="fcon" style="display: none;">
                      <a target="_blank" href="http://www.lanrentuku.com/"><img src="qtimages/04.jpg" style="opacity: 1; "></a>
                      <span class="shadow"><a target="_blank" href="index.html">21年 皮肤白皙越长越“嫩”！</a></span>                  </div>    
              </div>
              <div class="fbg">  
              <div class="D1fBt" id="D1fBt">  
                  <a href="javascript:void(0)" hidefocus="true" target="_self" class=""><i>1</i></a>  
                  <a href="javascript:void(0)" hidefocus="true" target="_self" class=""><i>2</i></a>  
                  <a href="javascript:void(0)" hidefocus="true" target="_self" class="current"><i>3</i></a>  
                  <a href="javascript:void(0)" hidefocus="true" target="_self" class=""><i>4</i></a>              </div>  
              </div>      
          </div>  
          <script type="text/javascript">
              Qfast.add('widgets', { path: "js/terminator2.2.min.js", type: "js", requires: ['fx'] });  
              Qfast(false, 'widgets', function () {
                  K.tabs({
                      id: 'fsD1',   //焦点图包裹id  
                      conId: "D1pic1",  //** 大图域包裹id  
                      tabId:"D1fBt",  
                      tabTn:"a",
                      conCn: '.fcon', //** 大图域配置class       
                      auto: 1,   //自动播放 1或0
                      effect: 'fade',   //效果配置
                      eType: 'click', //** 鼠标事件
                      pageBt:true,//是否有按钮切换页码
                      bns: ['.prev', '.next'],//** 前后按钮配置class                          
                      interval: 3000  //** 停顿时间  
                  }) 
              })  
          </script>
          
    </div>
    <div class="ys-box">
    	<div class="ysbnt">
        	<ul>
            	<li>葛根知识</li>
                <li>木瓜知识</li>
                <li>魔芋知识</li>
                <li>杏仁知识</li>
                <li>薏仁知识</li>
                <li>核桃知识</li>
            </ul>
        </div>
        <div class="ys-content">
        	<ul>
				<a href="#"><li><h3>网站建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
                <a href="#"><li><h3>网站建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
                <a href="#"><li><h3>网站建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
                <a href="#"><li><h3>网站建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
            </ul>
        </div>
        <div class="ys-content">
            <ul>
				<a href="#"><li><h3>网站2建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
                <a href="#"><li><h3>网站2建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
                <a href="#"><li><h3>网站2建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
                <a href="#"><li><h3>网站2建设中我们应当注意什么问题?</h3><p>会因为一些急功近利的做法让自己的推广工作失去意义，下面青岛创之信提出几点在推广……</p></li></a>
            </ul>
        </div>
        <div class="ys-content">
            3
        </div>
        <div class="ys-content">
            4
        </div>
        <div class="ys-content">
            5
        </div>
        <div class="ys-content">
            6
        </div>
    </div>
</div>-->
<div class="intitle">
	<ul>
    	<li><h1>农家院/</h1><span>New Products</span></li>
    </ul>
</div>
<div class="box p-list">
	<a href="#" class="more-products">了解更多农家院>></a>
    <ul>
        <c:forEach items="${syshanghufuwu1 }" var="a">
    	<li><a href="shfwDetail.do?id=${a.id}"><img src="${a.zhutu}" width="299" height="304"/><span>${a.shanghumingcheng}</span></a></li>
        </c:forEach>
       <%-- <li><a href="#"><img src="<%=map.get("jingdiantupian")%>" width="299" height="304"/><span><%=map.get("jingdiantupian")%></span></a></li>
         <li><a href="#"><img src="qtimages/index_26.png" width="299" height="304"/><span>葛根粉系列</span></a></li>
    	<li><a href="#"><img src="qtimages/index_26.png" width="299" height="304"/><span>葛根粉系列</span></a></li>
        <li><a href="#"><img src="qtimages/index_26.png" width="299" height="304"/><span>葛根粉系列</span></a></li>
        <li><a href="#"><img src="qtimages/index_26.png" width="299" height="304"/><span>葛根粉系列</span></a></li> --%>
    </ul>
</div>


<%-- <div class="intitle">
	<ul>
    	<li><h1>推荐产品/</h1><span>Produced Product</span></li>
    </ul>
</div>
<div class="box zzjd">
	<ul>
    	<li><a href="#"><img src="qtimages/index_30.png" width="292" height="192"/><span>大姚葛根种植基地</span></a></li>
        <li><a href="#"><img src="qtimages/index_30.png" width="292" height="192"/><span>大姚葛根种植基地</span></a></li>
        <li><a href="#"><img src="qtimages/index_30.png" width="292" height="192"/><span>大姚葛根种植基地</span></a></li>
        <li><a href="#"><img src="qtimages/index_30.png" width="292" height="192"/><span>大姚葛根种植基地</span></a></li>
        <li><a href="#"><img src="qtimages/index_30.png" width="292" height="192"/><span>大姚葛根种植基地</span></a></li>
        <li><a href="#"><img src="qtimages/index_30.png" width="292" height="192"/><span>大姚葛根种植基地</span></a></li>
    </ul>
    <a href="#" class="readmore"></a>
</div> --%>


<%-- 
<div class="intitle" style=" margin-top:10px;">
	<ul>
    	<li><h1>会员风彩/</h1><span>Users</span></li>
    </ul>
</div>




<div class="box jg-box">
	<div class="box dpimg" id="al" >
	<ul style="width: 3000px;">
  <%
			String sqlyhzc="select  * from yonghuzhuce   order by id desc limit 0,5";
			ResultSet RS_resultyhzc=connDbBean.executeQuery(sqlyhzc);
while(RS_resultyhzc.next())
{
		%>
        <img src="<%=RS_resultyhzc.getString("touxiang")%>" width="232" height="174" alt="" onclick="javascript:location.href='<%=RS_resultyhzc.getString("touxiang")%>';" style="cursor:pointer" />
		 <%
							}
  	
  %>
       
       
    </ul>
</div>
</div> --%>
<script src="/javascript/jquery.kxbdMarquee.js" type="text/javascript"></script>
<script type="text/javascript">
    $('#al').kxbdMarquee({ direction: 'left', scrollSize: 160, scrollDelay: 40 });
</script>

<div class="contact">
	<div class="box contact-content">
      <div class="liuyan">
      	<div class="news-list-title2">
        	<h2>站内新闻/<span>News</span></h2>
            <a href="news.php?lb=站内新闻"></a>
        </div>
        <div class="n-lists2">
        	<ul>
			<c:forEach items="${syxinwentongzhi1 }" var="a">
            	<li><a href="xwtzDetail.do?id=${a.id}">${fn:substring(a.biaoti, 0, 50)}</a></li>
               </c:forEach>
			
            </ul>
        </div>
      
      </div>
      <div class=" liuyan lianxi">
      <h2 style="margin-bottom:15px;">联系我们</h2>
      <img src="qtimages/index_45.png" width="60" height="57"/><img src="qtimages/index_46.png" width="178" height="57"/>
      <h2 style="margin-bottom:15px; margin-top:10px;">联系我们</h2>
      <div class="bshare-custom icon-medium-plus"><a title="分享到QQ空间" class="bshare-qzone"></a><a title="分享到新浪微博" class="bshare-sinaminiblog"></a><a title="分享到人人网" class="bshare-renren"></a><a title="分享到腾讯微博" class="bshare-qqmb"></a><a title="分享到网易微博" class="bshare-neteasemb"></a><a title="更多平台" class="bshare-more bshare-more-icon more-style-addthis"></a><span class="BSHARE_COUNT bshare-share-count">0</span></div><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/bshareC0.js"></script>
      </div>
    </div>
</div>
<jsp:include page="yqlj.jsp"></jsp:include>
<jsp:include page="qtdown.jsp"></jsp:include>


</body>
</html>
