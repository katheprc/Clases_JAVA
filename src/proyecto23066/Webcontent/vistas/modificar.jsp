<%@page import="clases.SociosDAO"  %>
<%@page import="clases.Socios"%>
<%@page import="java.util.List"%>  


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar Socio</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1 class="text-center" >Modificar Socio</h1>

		<div class="row" >
		<%
		String id=request.getParameter("id");
		int mid;
		mid=Integer.parseInt(id);
		Socios resultado=null;
		SociosDAO socio=new SociosDAO();
		resultado=socio.mostrarSocio(mid);
		%>
			
		<form class="p-5" action="SociosController?accion=actualizar" method="post">
			
			<div class="mb-3">				
				<input type="hidden"  class="form-control" id="id" name="id"  value=<%=resultado.getId_socio()%> >
			</div>
			
			
			<div class="mb-3">
				<label for="nombre" class="form-label" >Nombre</label>
				<input type="text" class="form-control" id="nombre" name="nombre"  value=<%=resultado.getNombre() %> >
			</div>
			
			<div class="mb-3">
				<label for="apellido" class="form-label" >Apellido</label>
				<input type="text" class="form-control" id="apellido" name="apellido" value=<%=resultado.getApellido() %> >
			</div>
			
			<div class="mb-3">
				<label for="apellido" class="form-label" >DNI</label>
				<input type="number" class="form-control" id="dni" name="dni" value=<%=resultado.getDni() %> >
			</div>
			
			<div class="mb-3">
				<label for="apellido" class="form-label" >mail</label>
				<input type="text" class="form-control" id="mail" name="mail" value=<%=resultado.getMail() %> >
			</div>
			
			<button type="submit" class="btn btn-primary">Modificar</button>
			
			
			
			</form>
		
		
		
		
		</div>	
	
	
	</div>

</body>
</html>