<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Nómina</title>
    </head>
    <body>
        <h1>Calcular nómina</h1>
        <form action="loginServlet" method="post" >
            <label for="nombres">Nombres:</label><br>
            <input type="text" name="nombres" id="nombres"><br><br>

            <label for="apellidos">Apellidos:</label><br>
            <input type="text" name="apellidos" id="apellidos"><br><br>

            <label for="documento">Documento:</label><br>
            <input type="text" name="documento" id="documento"><br><br>

            <label for="díasTrabajados">Días Trabajados:</label><br>
            <input type="text" name="díasTrabajados" id="díasTrabajados"><br><br>

            <label for="sueldoMensual">Sueldo Mensual:</label><br>
            <input type="text" name="sueldoMensual" id="sueldoMensual"><br><br>

            <input type="submit" value="Calcular">
        </form>
    </body>
</html>