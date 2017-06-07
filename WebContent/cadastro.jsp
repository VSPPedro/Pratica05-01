<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Nome: ${aluno}</h3>

	<c:forEach items="${notas}" var="nota" varStatus="status">
		<c:if test="${status.first}">
			<h4>
				Suas notas:<br>
			</h4>
			<ul>
		</c:if>
		<li><c:out value="${nota}" /></li>
		<c:if test="${status.last}">
			</ul>
		</c:if>
	</c:forEach>
	
	<c:forEach items="${disciplinas}" var="disciplina" varStatus="status">
		<c:if test="${status.first}">
			<h4>
				Suas disciplinas:<br>
			</h4>
			<ul>
		</c:if>
		<li><c:out value="${disciplina}" /></li>
		<c:if test="${status.last}">
			</ul>
		</c:if>
	</c:forEach>
	
	<h3>Data: ${hoje}</h3>
	<h3>Media: ${media}</h3>
</body>
</html>