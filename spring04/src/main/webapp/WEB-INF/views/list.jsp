<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%@ include file="template/header.jspf" %>
</head>
<body>
<%@ include file="template/menu.jspf" %>

<div class="page-header">
  <h1>DEPT List <small>dept</small></h1>
</div>

<table class="table">
	<thead>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>loc</th>
		</tr>
	</thead>
	<tbody>
		${list }
	</tbody>
</table>

</body>
</html>