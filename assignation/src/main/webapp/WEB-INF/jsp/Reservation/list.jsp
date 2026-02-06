<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>ID Client</th>
            <th>Nombre de passagers</th>
            <th>Date & Heure</th>
            <th>Hôtel</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="res" items="${reservations}">
            <tr>
                <td>${res.id}</td>
                <td>${res.idClient}</td>
                <td>${res.nombrePassager}</td>
                <td>${res.dateHeureArrivee}</td>
                <td>${res.hotel}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
