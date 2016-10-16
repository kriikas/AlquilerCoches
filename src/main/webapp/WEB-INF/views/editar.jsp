<%-- 
    Document   : crear
    Created on : 06-may-2010, 0:57:37
    Author     : especialista
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Editar coche</title>
    </head>
    <body>
        <h1>Editar coche</h1>
        <form:form modelAttribute="coche">
            Matrícula: ${coche.matricula} <br/>
            Modelo: <form:input path="modelo"/> <br/>
            Fecha de matriculación: <form:input path="fechaMatriculacion"/> <br/>
            Km: <form:input path="km"/> <br/>
            Precio/día: <form:input path="precio"/> <br/>
            <input type="submit" value="guardar"/>
        </form:form>
    </body>
</html>
