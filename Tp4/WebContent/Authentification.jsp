<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> bienvenu sur votre session</h2>
<%if(request.getParameter("nom").equals("")){%>
<jsp:useBean id="Authentification" type="modeles.Authentification" scope="session"/>
<h2>nom : <jsp:getProperty property="nom" name="Authentification"/></h2>
<h2>prenom : <jsp:getProperty property="prenom" name="Authentification"/></h2>
<%}else %>
<h2> nom :
<%=request.getParameter("nom") %>
</h2>
<h2> prenom :
<%=request.getParameter("prenom") %>
</h2>

</body>
</html>