<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- Pega as tags spring, vai procurar nos jars -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/mvc/resources/css/bootstrap.css">
<title><spring:message code="goal.titulo"/></title>

<script type="text/javascript" src="/mvc/resources/js/jquery-2.2.0.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$.getJSON('<spring:url value="activities.json"/>', {
			ajax: 'true'			
		}, function(data) {
			var html = '<option value="">Selecione...</option>';
			var len = data.length;
			for(var i = 0; i < len; i++) {
				html += '<option value="' + data[i].desc + '">' + data[i].desc + '</option>'; 
			}
			
			$("#activities").html(html);
		})
	});
</script>

</head>
<body>
	<div class="container">
		<spring:message code="goal.linguagem"/>: <a href="?language=en" class="btn btn-link">English</a> | <a href="?language=pt" class="btn-btn-link">Português</a>
		
		<div class="panel panel-primary">
			<div class="panel-heading" style="font-size: large"><spring:message code="goal.titulo"/></div>
			
			<div class="panel-body">							
				<form:form commandName="exercicio" class="form"> <!-- Custom Form do spring -->
					<div class="form-group">
						<label class="control-label" for="minutes"><spring:message code="goal.texto"/></label>						
						<!-- Dentro do 'exercicio' declarado no commandName existe um get e set chamado 'minutes' -->
							<form:input path="minutes" id="minutes" class="form-control"/>						
					</div>
					<div class="form-group">
						<label class="control-label" for="activities">Atividade</label>
						<form:select id="activities" path="activity" class="form-control"></form:select>
					</div>
					<div class="form-group">																								
							<button type="submit" class="btn btn-primary">Salvar Exercício</button>						
					</div>	
				</form:form>
			</div>
			<div class="panel-footer">
				A meta de hoje é: <b>${goal.minutes} minutos</b>
			</div>
		</div>					
	</div>	
</body>
</html>