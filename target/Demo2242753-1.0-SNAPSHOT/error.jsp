<%--
  Created by IntelliJ IDEA.
  User: Angie Palma
  Date: 29/04/2021
  Time: 7:06 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ocurrio un error!</title>

    <h2>
        <%
            String error = (String)request.getSession().getAttribute("error");
            System.out.println(error);
        %>
    </h2>
</head>
<body>

</body>
</html>
