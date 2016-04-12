<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Goals Report</title>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>Minutos</th>
		</tr>
		<c:forEach items="${metas}" var="meta">
			<tr>
				<td>${meta.id}</td>
				<td>${meta.minutes}</td>
				<td>
					<table>
						<tr>
							<th>Exercicio ID</th>
							<th>Exercicio Minutos</th>
							<th>Exercicio Atividade</th>							
						</tr>
						<c:forEach items="${meta.exercicios}" var="exercicio">
							<tr>
								<td>${exercicio.id}</td>
								<td>${exercicio.minutes}</td>
								<td>${exercicio.activity}</td>
							</tr>
						</c:forEach>						
					</table>
				</td>
			</tr>
		</c:forEach>		
	</table>	

</body>
</html>