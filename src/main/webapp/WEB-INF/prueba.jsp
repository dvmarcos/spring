
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
  <h1>Listado tabla pruebas</h1>
  <c:forEach var="p" items="${pruebas}">
   id: <c:out value="${p.id}"/><br>
   columna1: <c:out value="${p.columna1}"/><br>
   columna2: <c:out value="${p.columna2}"/><br>
  </c:forEach>
   
  <h1>Añadir prueba</h1>
  <form method="post" action="addPrueba">
  Columna1: <input type="text" name="columna1"/>
  Columna2: <input type="text" name="columna2"/>
  <button>Add</button>
  </form>
</body>
</html>