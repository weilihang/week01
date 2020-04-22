<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="findAll">
		英雄:<input type="text" value="${list.hname}" name="hname">
		价格:<input type="text" value="${list.hprice}" name="hprice">
		阵营:<select id="cid" name="cid">
			<option value="${list.camp.cid}">${list.camp.cname}</option>
		</select>
		状态:<select name="hstatus">
		<option value="${list.hstatus}">${aa.hstatus}==0?已拥有:未拥有;</option>
		</select>
		<input type="submit" value="返回">
	</form>
</body>
</html>