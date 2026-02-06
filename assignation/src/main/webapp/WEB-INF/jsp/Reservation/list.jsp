<h2>Filtrer par date d'arrivée</h2>

<form method="get" action="/reservations">
    <label for="dateFilter">Date (AAAA-MM-JJ) :</label>
    <input type="date" id="dateFilter" name="dateFilter" value="${param.dateFilter}">
    <input type="submit" value="Filtrer">
</form>

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
            <c:if test="${empty param.dateFilter || fn:startsWith(res.dateHeureArrivee, param.dateFilter)}">
                <tr>
                    <td>${res.id}</td>
                    <td>${res.idClient}</td>
                    <td>${res.nombrePassager}</td>
                    <td>${res.dateHeureArrivee}</td>
                    <td>${res.hotel}</td>
                </tr>
            </c:if>
        </c:forEach>
    </tbody>
</table>