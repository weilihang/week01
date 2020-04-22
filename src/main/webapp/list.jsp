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
		<form action="findAll" method="post">
		<select id="cid" name="cid">
			
		</select>
		<select id="hstatus" name="hstatus">
			<option value="0">未拥有</option>
			<option value="1">已拥有</option>
		</select>
		价格区间:<input type="text" name="stprice">~<input type="text" name="endprice">
		<input type="submit" value="查询">
		</form>
		<button id="xz">新增</button>
	<table>
  <tr>
    <th>ID</th>
    <th>英雄</th>
    <th>阵营</th>
    <th>价格</th>
    <th>状态</th>
    <th>上线时间</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${plist.list}" var="aa">
  <tr>
    <td>${aa.hid}</td>
    <td>${aa.hname}</td>
    <td>${aa.camp.cname}</td>
    <td>${aa.hprice}</td>
    <td>${aa.hstatus}==0?已拥有:未拥有;</td>
    <td>${aa.huptime}</td>
     <td><a href="show?hid=${aa.hid}">详情</a>
     <a href="gm?hid=${aa.hid}">购买</a></td>
  </tr>
  </c:forEach>
 	<tr>
 	<td colspan="8">
 	<a href="findAll?pageNum=${plist.firstPage}">首页</a>
 	<a href="findAll?pageNum=${plist.prePage}">上一页</a>
 	<a href="findAll?pageNum=${plist.nextPage}">下一页</a>
 	<a href="findAll?pageNum=${plist.lastPage}">末页</a>
 	</tr>
</table>

</body>
<script type="text/javascript">
	$.post("findCamp",function(data){
		for(var i in data){
			$("#cid").append("<option value='"+data[i].cid+"'>"+data[i].cname+"</option>")
		}
	},"json")
	$("#xz").click(function(){
		location.href="add.jsp"
	})
	
	

</script>
</html>