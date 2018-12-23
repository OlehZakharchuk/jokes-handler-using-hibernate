<%-- 
    Document   : jokes_page
    Created on : Oct 8, 2018, 8:42:25 PM
    Author     : zakhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Be ready to laugh!</h1>
        <h2><form action="showjoke">
                <input type="submit" value="show joke" />
                <p>${jokecontent}</p>
            </form></h2>
    </body>
</html>
