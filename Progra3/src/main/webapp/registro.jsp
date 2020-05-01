<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="util.css">
	<link rel="stylesheet" type="text/css" href="main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
				
					<span class="login100-form-title p-b-53">
						Registrate aqui:
					</span>
					<form action="ControladorR" method="post">
					<div class="p-t-31 p-b-9">
						<span class="txt1">
							Nombre
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "Nombre is required">
						<input class="input100" type="text" name="username" id="Usuario" >
						<span class="focus-input100"></span>
					</div>
					
					<div class="p-t-13 p-b-9">
						<span class="txt1">
							DUI
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "DUI is required">
						<input class="input100" type="text" name="pass" id="contraseña">
						<span class="focus-input100"></span>
					</div>
					<div class="container-login100-form-btn m-t-17">
                 <input type="submit" name="btn"  value="Guardar" class="login100-form-btn">
                 	</div>
                 		</form>
	           <div class="container-login100-form-btn m-t-17">
					<a href="index.jsp" class="login100-form-btn">Volver</a>
					</div>
				
				
				
					</div>
			</div>
		</div>
	

</body>
</html>