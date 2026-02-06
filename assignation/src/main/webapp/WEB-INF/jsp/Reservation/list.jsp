<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Page de réservation</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #eaeaea;
        }
    </style>
</head>
<body>

<h1>Page de réservation</h1>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>ID Client</th>
            <th>Nombre de passagers</th>
            <th>Date & Heure d'arrivée</th>
            <th>Hôtel</th>
        </tr>
    </thead>

    <tbody>
        <!-- Exemple de ligne statique -->
        <tr>
            <td>1</td>
            <td>CL001</td>
            <td>3</td>
            <td>10/02/2026 14:30</td>
            <td>Hilton</td>
        </tr>
    </tbody>
</table>

</body>
</html>
