<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/mvc/resources/css/bootstrap.css">
<title>Adicionar Meta</title>
</head>
<body>
	
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading" style="font-size: large">Adicionar Meta</div>
			<div class="panel-body">
				<form:form commandName="goal" class="form">
					<div class="form-group">
						<label class="control-label">Minutos:</label>
						<form:input path="minutes" class="form-control"/>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary">Adicionar Meta</button>
					</div>
				</form:form>
			</div>	
		</div>
	</div>
</body>
</html>