<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>

<div class="banner-box">
    <div class="banner" id="banner" >
	<%
			int xxbhti=0;
			String sqlbht="select id, shouyetupian from xinwentongzhi where leibie='变幻图'  order by id desc limit 0,5";
			ResultSet RS_resultbht=connDbBean.executeQuery(sqlbht);
while(RS_resultbht.next())
{
	xxbhti++;
		%>
        <a href="xwtzDetail.do?id=<%=RS_resultbht.getString("id")%>" class="d1" style="background:url(<%=RS_resultbht.getString("shouyetupian")%>) center no-repeat;"></a>
		<%
		}
		%>

        <div class="d2" id="banner_id">
            <ul>
                <%
		for(int bhti=0;bhti<xxbhti;bhti++)
		{
		%>
			<li></li>
			<%
	  }
	  %>
            </ul>
        </div>
    </div>
</div>
<script type="text/javascript">banner()</script>


