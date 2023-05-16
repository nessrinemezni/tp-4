<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>affichage d'un client</title>
</head>
<body>
<jsp:useBean id="client" class="modeles.clientBean" scope="session"/>
<h2>Nom:
<jsp:getProperty name="client" property="nom" />
</h2>
<h2>prénom:
<jsp:getProperty name="client" property="prenom"/>
</h2>
<h2>adresse:
<jsp:getProperty name="client" property="adresse"/>
</h2>
<h2>email:
<jsp:getProperty name="client" property="email"/>
</h2>
<h2>téléphone:
<jsp:getProperty name="client" property="telephone"/>
</h2>
</body>
</html>