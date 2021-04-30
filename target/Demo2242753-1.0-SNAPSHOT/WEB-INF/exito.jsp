<%--
  Created by IntelliJ IDEA.
  User: Angie Palma
  Date: 29/04/2021
  Time: 10:29 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1">
    <tr>
        <td>Nombres</td>
        <td>Apellidos</td>
        <td>Documento</td>
        <td>Días Trabajados</td>
        <td>Sueldo Mensual</td>
    </tr>
    <%
        Arraylist<Trabajador> Trabajadores =
                (Arraylist<Trabajador>) request.getSession().getAttribute("Trabajadores");

        if (Trabajadores == null) {
            System.out.println("<tr><td>No hay trabajadores.<td>");
            System.out.println("<td>No hay trabajadores.<td>");
            System.out.println("<td>No hay trabajadores.<td>");
            System.out.println("<td>No hay trabajadores.<td>");
            System.out.println("<td>No hay trabajadores.<td><tr>");
        }
        else {
            for (int i = 0; 1 < Trabajadores.size(); i++) {
                System.out.println("<tr>");
                System.out.println("<td>+Trabajadores.get(i).getNombres()+<td>");
                System.out.println("<td>+Trabajadores.get(i).getNombres()+<td>");
                System.out.println("<td>+Trabajadores.get(i).getDocumento()+<td>");
                System.out.println("<td>+Trabajadores.get(i).getdíasTrabajados()+<td>");
                System.out.println("<td>+Trabajadores.get(i).getsueldoMensua()+<td>");
                System.out.println("</tr>");

            }
        }
    %>


</table>

</body>
</html>
