<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire de Réservation de Vol</title>
</head>
<body>
<h2>Formulaire de Réservation de Vol</h2>
<form action="save" method="POST">
    <label for="ville_depart">Ville de départ:</label><br>
    <input type="text" id="ville_depart" name="ville_depart" required><br>

    <label for="date_depart">Date de départ:</label><br>
    <input type="date" id="date_depart" name="date_depart" required><br>

    <label for="destination">Destination:</label><br>
    <input type="text" id="destination" name="destination" required><br>

    <label for="nombre_passagers">Nombre de passagers:</label><br>
    <input type="number" id="nombre_passagers" name="nombre_passagers" required><br>

    <label for="prix">Prix:</label><br>
    <input type="number" id="prix" name="prix" required><br>

    <label for="compagnie">Compagnie:</label><br>
    <input type="text" id="compagnie" name="compagnie" required><br><br>

    <input type="submit" value="Réserver">
</form>
</body>
</html>


