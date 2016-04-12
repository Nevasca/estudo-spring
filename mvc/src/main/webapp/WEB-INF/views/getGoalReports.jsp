<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Metas Report</title>
</head>
<body>
	<table>
		<tr>
			<th>Minutos</th>
			<th>Minutos Exercícios</th>
			<th>Atividade</th>
		</tr>
		<c:forEach items="${goalReports}" var="goalReport">
			<tr>
				<td>${goalReport.metaMinutes}</td>
				<td>${goalReport.exercicioMinutes}</td>
				<td>${goalReport.exercicioActivity}</td>
			</tr>
		</c:forEach>		
	</table>

</body>
</html>