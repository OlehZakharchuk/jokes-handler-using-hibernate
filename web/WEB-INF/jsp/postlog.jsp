<%-- 
    Document   : postlog
    Created on : Oct 8, 2018, 7:33:50 PM
    Author     : zakhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome to Application</h1>
        <h2><form action="jokes" >
                <input type="submit" value="Jokes" />
            </form>
        </h2>
        <h3>
            <input type="submit" value="About author" onclick="alert('@Oleh Zakharchuk')"/>
         </h3>
        
    </body>
    <footer>
         <h6>Hibernate Version: ${hibVer} | Spring Version: ${springVer}</h6>
    </footer>
</html>
