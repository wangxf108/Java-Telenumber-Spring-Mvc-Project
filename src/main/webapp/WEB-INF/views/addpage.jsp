<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page import="jp.co.telesystem.model2.TeleModel"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TELE SYSTEM</title>
</head>
<body>

<f:form modelAttribute="KONGBAI" action="doAddDB" method="POST">

UserName: <f:input path="userName"/> <br>

TelePhone Number : <f:input path="teleNum"/> <br>



<input type="submit" value="Add"/>

</f:form>



</body>
</html>