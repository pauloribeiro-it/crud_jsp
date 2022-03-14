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
					<td>
						<select id="marca" name="marca" required>
							<option value="">Selecione</option>
							<option value="RENAULT">Renault</option>
							<option value="FORD">Ford</option>
							<option value="CHEVROLET">Chevrolet</option>
							<option value="FIAT">Fiat</option>
							<option value="NISSAN">Nissan</option>
							<option value="HYUNDAI">Hyundai</option>
							<option value="HONDA">Honda</option>
							<option value="TOYOTA">Toyota</option>
						</select>
					</td>
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
					<td>Automático: </td>
					<td>
						<label for="automaticoSIM">Sim</label>
						<input id="automaticoSIM" name="automatico" type="radio" value="SIM" />
						<label for="automaticoNAO">Não</label>
						<input id="automaticoNAO" name="automatico" type="radio" value="NAO" />
					</td>
				</tr>
				<tr>
					<td>Opcionais: </td>
					<td>
						<input type="checkbox" name="opcionais" value="AR_CONDICIONADO"/>
						<label for="ar">Ar-condicionado</label><br>
						<input type="checkbox" name="opcionais" value="FREIO_ABS"/>
						<label for="freioAbs">Freio ABS</label><br>
						<input type="checkbox" name="opcionais" value="AIRBAG"/>
						<label for="airbag">Airbag</label>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Submeter"></td>
					<td><input type="reset" value="Limpar"></td>
				</tr>
			</tbody>
		</table>											
	</form>
	
</body>
</html>