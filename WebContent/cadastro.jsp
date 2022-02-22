<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="crud.entities.Carro" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de carro</title>
</head>
<body>
	<%Carro carro = (Carro) request.getAttribute("carro"); %>
	<form method="get" action="cadastro">
		<input type="hidden" value="<%=carro != null?carro.getId():"" %>" id="id" name="id">
		<table style="margin-left: 40%;">
			<thead>
				<tr>
					<th colspan="2"><% if(carro == null){
										%>Cadastro<%}
										else{ %>
										Alteração<%} %> 
										 de carros</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Marca: </td>
					<td><input type="text" id="marca" name="marca" value="<%=carro != null?carro.getMarca():"" %>"></td>
				</tr>
				<tr>
					<td>Modelo: </td>
					<td><input type="text" id="modelo" name="modelo" value="<%=carro != null?carro.getModelo():"" %>"></td>
				</tr>
				<tr>
					<td>Ano: </td>
					<td><input type="number" id="ano" name="ano" value="<%=carro != null?carro.getAno():"" %>"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submeter"></td>
					<td><input type="reset" value="Limpar"></td>
				</tr>
			</tbody>
		</table>											
	</form>
	
	<h3>Atributo da sessão: <%=request.getSession().getAttribute("timestamp") %></h3>
</body>
</html>