<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="crud.entities.Carro" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem</title>
</head>
<body>
	<%List<Carro> carros = (List<Carro>) request.getAttribute("carros"); %>
	<table border="1" style="margin-left:40%;">
		<thead>
			<tr>
				<td colspan="4" style="text-align:center">Carros</td>
			</tr>
			<tr>
				<td>Marca</td>
				<td>Modelo</td>
				<td>Ano</td>
				<td>Ações</td>
			</tr>
		</thead>
		<tbody>
			<%for(Carro carro: carros){ %>
			<tr>
				<td><%=carro.getMarca() %></td>
				<td><%=carro.getModelo() %></td>
				<td><%=carro.getAno() %></td>
				<td><a href="exclusao?id=<%= carro.getId()%>">Excluir</a>/<a href="alteracao?id=<%= carro.getId()%>">Alteração</a></td>
			</tr>
			<%}%>
			<tr>
				<td colspan="4"><a href="<%= request.getServletContext().getContextPath() %>/">Novo carro</a></td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>