<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recherche de Vols</title>
</head>
<body>
<h2>Recherche de Vols</h2>
<form action="SearchServlet" method="POST">
    <label for="departure">Ville de Départ:</label><br>
    <input type="text" id="departure" name="departure"><br>

    <label for="destination">Destination:</label><br>
    <input type="text" id="destination" name="destination"><br>

    <label for="departDate">Date de Départ:</label><br>
    <input type="date" id="departDate" name="departDate"><br>

    <label for="returnDate">Date de Retour:</label><br>
    <input type="date" id="returnDate" name="returnDate"><br>

    <label for="passengers">Nombre de Passagers:</label><br>
    <input type="number" id="passengers" name="passengers" min="1"><br><br>

    <input type="submit" value="Rechercher">
</form>
</body>
</html>

