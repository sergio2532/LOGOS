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

    <title>Index Administrador</title>

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
      
      function elegir(entrada){
			alert(entrada);
			
			if (entrada = "asignatura"){
				$(location).attr('href','crearAsignatura.jsp');
			}
		}
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
                <a class="navbar-brand" href="indexAdministrador.jsp">LOGOS</a>
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
                        <a href="bye.jsp">Cerrar Sesión</a>
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
    
    <!-- Portfolio Grid Section -->
    <section id="portfolio">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Bienvenido Administrador</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
            
                <div class="col-sm-4 portfolio-item">
                    <a href = "/LOGOS/asignatura?flagCrear=true" class="portfolio-link" data-toggle="modal">
                        <div class="caption">
                            <div class="caption-content">
                                <i class="fa fa-search-plus fa-3x" >Asignatura</i>
                            </div>
                        </div>
                        <img src="http://www.matakishi.com/4959558.gif" class="img-responsive">
                    </a>
                </div>
                
                <div class="col-sm-4 portfolio-item">
                    <a href="crearSalon.jsp" class="portfolio-link" data-toggle="modal">
                        <div class="caption">
                            <div class="caption-content">
                                <i class="fa fa-search-plus fa-3x">Salón</i>
                            </div>
                        </div>
                        <img src="https://catsconnect.files.wordpress.com/2014/10/giphy-11.gif?w=300&h=208" class="img-responsive" alt="">
                    </a>
                </div>
                <div class="col-sm-4 portfolio-item">
                    <a href="crearCurso.jsp" class="portfolio-link" data-toggle="modal">
                        <div class="caption">
                            <div class="caption-content">
                                <i class="fa fa-search-plus fa-3x">Curso</i>
                            </div>
                        </div>
                        <img src="http://www.ozgunresimler.com/data/media/3446/gif_animate_scuola_04.gif" class="img-responsive" alt="">
                    </a>
                </div>
            </div>
            <div class="row">
                                
                <div class="col-sm-4 portfolio-item">
                    <a href="crearArea.jsp" class="portfolio-link" data-toggle="modal">
                        <div class="caption">
                            <div class="caption-content">
                                <i class="fa fa-search-plus fa-3x">Área</i>
                            </div>
                        </div>
                        <img src="http://library.vstu.by/wp-content/uploads/2015/04/%D0%BA%D0%BD%D0%B8%D0%B3%D0%B0-%D1%83%D1%85%D0%BE%D0%B4%D0%B8%D1%821.gif" class="img-responsive" alt="">
                    </a>
                </div>
                                                
                <div class="col-sm-4 portfolio-item">
                    <a href="crearEstudiante.jsp" class="portfolio-link" data-toggle="modal">
                        <div class="caption">
                            <div class="caption-content">
                                <i class="fa fa-search-plus fa-3x">Estudiante</i>
                            </div>
                        </div>
                        <img src="http://m.gifanimados.com/Gifs-Personas/Animaciones-Profesiones/Estudiantes/Estudiante-Estudiando-60757.gif" class="img-responsive" alt="">
                    </a>
                </div>  
                <div class="col-sm-4 portfolio-item">
                    <a href="/LOGOS/asignaturacurso?flagCrear=true" class="portfolio-link" data-toggle="modal">
                        <div class="caption">
                            <div class="caption-content">
                                <i class="fa fa-search-plus fa-3x">Integrar Cursos</i>
                            </div>
                        </div>
                        <img src="http://3.bp.blogspot.com/-KxcqYxaBBgU/UWyHDYkbIiI/AAAAAAAABfU/DzfLkFvOdJ4/s1600/IMAGEN+BUZ%25C3%2593N.gif" class="img-responsive" alt="">
                    </a>
                </div>  
            </div>
        </div>
    </section>
    

    <!-- About Section -->
    <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Acerca de Logos</h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-lg-offset-2">
                    <p>Logos, es una aplicación que permite a participantes de un entorno académico la gestión de múltiples servicios asociados a la educación. Aquí, estudiantes, docentes y administrativos tienen cabida, explorando e  interactuando con asignaturas, áreas, cursos, usuarios, notas, horarios, eentre otros. </p>
                </div>
            </div>
        </div>
    </section>
    
    <!-- Footer -->
    <footer class="text-center">
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Mayo de 2015
                    </div>
                </div>
            </div>
        </div>
    </footer>

</body>

</html>