<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login</title>

    <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
    <link href="estilos/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="estilos/css/freelancer.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="estilos/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
   
    
    <script src="dist/assets/js/modernizr-2.6.2.min.js"></script>

    <script type="text/javascript">
      var _gaq = _gaq || [];
      _gaq.push(['_setAccount', 'UA-3182578-6']);
      _gaq.push(['_trackPageview']);
      (function() {
         var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
         ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
         var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
      })();
    </script>
</head>
<body id="page-top" class="index">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#page-top">LOGOS</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="page-scroll">
                        <a href="#contacto">Contacto</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#perfil">Perfil</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#cerrarSesion">Cerrar Sesión</a>
                    </li>
                </ul>
                
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
	
	 <footer class="text-center">
        <div class="footer-below">
        <div class="container">
        </div>
        </div>
    </footer>
        
    <!-- About Section -->
    <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Login</h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row">
                <div class="row">
                <form name="sentMessage" id="contactForm" novalidate>
                <div class="row">
                </div>  
                <div class="col-md-4">
                </div>                
                <div class="col-md-6">
                        <div class="row">
                        	<div class="col-md-2">
                        		<label>Usuario : </label>
                        	</div>
                            <div class="col-md-5">
                                <input type="text" class="form-control" placeholder="Nombre" id="nombre" required data-validation-required-message="Please enter your name.">
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
		    			<div class="row">
			    			<div class="col-md-2">
			         			<label>Contraseña :</label>
			         		</div>
			         		<div class="col-md-5">
			           			<input  class="form-control" id="contrasena" name="contrasena" type="text" size="45" maxlength="40" placeholder="Contraseña" required="">
			         			<p class="help-block text-danger"></p>
			         		</div>
			    		</div>
			    		<br>
                        <div id="success"></div>
                        <div class="row">
                        	<div class="col-md-1">
			         		</div>
                            <div class="col-md-5">
                                <button type="submit" class="btn btn-info btn-lg">Ingresar</button>
                            </div>
                        </div>
		    	</div>
		    	</form>
            </div>
        </div>
       </div>
    </section>
    
</body>

</html>