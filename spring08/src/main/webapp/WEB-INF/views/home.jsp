<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="resources/css/home.css">
</head>
<body>
<h1>
	Hello world!  
</h1>

<c:forEach items="${list }" var="bean">
	<p>${bean }</p>
</c:forEach>
</body>
</html>
