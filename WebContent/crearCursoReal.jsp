<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Crear Curso</title>

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
    
    <%
   	ResultSet rs = (ResultSet)session.getAttribute("asignaturas");
        ResultSet rs2 = (ResultSet)session.getAttribute("cursos");
        ResultSet rs3 = (ResultSet)session.getAttribute("docentes");
    %>
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
                    <h2>Integración Cursos y Asignaturas</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
            
                <div class="col-sm-4 portfolio-item">
                    <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal">                    
                    <img src="http://3.bp.blogspot.com/-KxcqYxaBBgU/UWyHDYkbIiI/AAAAAAAABfU/DzfLkFvOdJ4/s1600/IMAGEN+BUZ%25C3%2593N.gif" class="img-responsive" alt="">
                    </a>
                </div> 
                <div class="row">
                <form name="sentMessage" method = "POST" action = "/LOGOS/asignaturacurso" id="contactForm" novalidate>
                <div class="col-md-7">
                        <div class="row">
                                <div class="col-md-2">
                                        <label>Curso :</label>
                                </div>
                                <div class="col-md-5">
                                    <select name = "idCurso" id = "idCurso">
                                            <% 
                                                    while(rs2.next()){
                                                            out.println("<option value = "+ rs2.getInt("idcurso") +">" + rs2.getString("nombrecurso")
                                                                            + "</option>");
                                                    }
                                            %>
                                    </select>
                                    <p class="help-block text-danger"></p>
                                 </div>
                        </div>
                        <div class="row">
                           <div class="col-md-2">
                                   <label>Asignatura :</label>
                           </div>
                           <div class="col-md-5">
                               <div class="col-md-5">
                                       <select name = "idAsignatura" id = "idAsignatura">
                                       <% 
                                               while(rs.next()){
                                                       out.println("<option value = "+ rs.getInt("idasignatura") +">" + rs.getString("nombreasignatura")
                                                                       + "</option>");
                                               }
                                       %>
                                       </select>
                                       <p class="help-block text-danger"></p>
                               </div>
                           </div>
                           <div class="row">
                           <div class="col-md-2">
                                   <label>Docente :</label>
                           </div>
                           <div class="col-md-5">
                               <div class="col-md-5">
                                       <select name = "idDocente" id = "idDocente">
                                       <% 
                                               while(rs3.next()){
                                                       out.println("<option value = "+ rs3.getInt("iddocente") +">" + rs3.getString("nombredocente")
                                                                       + "</option>");
                                               }
                                       %>
                                       </select>
                                       <p class="help-block text-danger"></p>
                               </div>

                           </div>
                        </div>
                        </div>					    
			<br>
                        <div id="success"></div>
                        <div class="row">
                            <div class="form-group col-xs-12">
                                <button type="submit" class="btn btn-success btn-lg">Crear</button>
                            </div>
                        </div>
		    	</div>
		    	</div>
		    	</form>
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

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="js/classie.js"></script>
    <script src="js/cbpAnimatedHeader.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/freelancer.js"></script>
    
    
</body>

</html>