<%-- 
    Document   : principal
    Created on : 07-dic-2020, 18:30:39
    Author     : sergi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" type="text/css" href="css/principal.css" media="screen" />
    </head>
    <body>
        <h1 id="mensaje1">Bienvenido</h1>
        <div id="cuadro">
            <form action="prueba" method="POST">
                <hr>
                <label id="titulo1">Iniciar Sesión</label>
                <br/>
                <label id="titulo2" >Nombre de usuario:</label>
                <br/>
                <input type="text" class="entrada" name="username"/>
                <br/>
                <label id="titulo3">Contraseña:</label>
                <br/>
                <input type="password" class="entrada" name="contra"/>
                <br/>
                <input type="submit" value="entrar" id="boton"/>
            </form>
        </div>
    </body>
</html>
