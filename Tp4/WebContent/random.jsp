<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random Number Generator</title>
</head>
<body>


    <% int max = Integer.parseInt(request.getParameter("max")); %>

    <h1>Nombre aléatoire</h1>
    <p>Le nombre aléatoire entre 0 et <%= max %> is <b><%= request.getAttribute("randomNum") %></b>.</p>
    <br>
    <a href="random.html">Générer un autre numéro</a>
</body>
</html>