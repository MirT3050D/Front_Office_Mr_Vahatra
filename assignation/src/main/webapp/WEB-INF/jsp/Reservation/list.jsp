<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des Réservations</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-50 min-h-screen py-8">
<div class="container mx-auto px-4 max-w-7xl">
    <h1 class="text-3xl font-bold text-gray-800 mb-8">Réservations</h1>
    
    <div class="bg-white rounded-lg shadow-md p-6 mb-6">
        <h2 class="text-xl font-semibold text-gray-700 mb-4">Filtrer par date de départ</h2>
        
        <form method="get" action="/reservations" class="flex gap-4 items-end">
            <div class="flex-1">
                <label for="dateFilter" class="block text-sm font-medium text-gray-700 mb-2">Date (AAAA-MM-JJ) :</label>
                <input type="date" id="dateFilter" name="dateFilter" value="${param.dateFilter}" 
                       class="w-full px-4 py-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-blue-500 focus:border-transparent">
            </div>
            <button type="submit" 
                    class="px-6 py-2 bg-blue-600 text-white font-medium rounded-lg hover:bg-blue-700 transition duration-200">
                Filtrer
            </button>
        </form>
    </div>

    <div class="bg-white rounded-lg shadow-md overflow-hidden">
        <div class="overflow-x-auto">
            <table class="min-w-full divide-y divide-gray-200">
                <thead class="bg-gray-100">
                    <tr>
                        <th class="px-6 py-3 text-left text-xs font-medium text-gray-700 uppercase tracking-wider">ID</th>
                        <th class="px-6 py-3 text-left text-xs font-medium text-gray-700 uppercase tracking-wider">ID Client</th>
                        <th class="px-6 py-3 text-left text-xs font-medium text-gray-700 uppercase tracking-wider">Nombre de passagers</th>
                        <th class="px-6 py-3 text-left text-xs font-medium text-gray-700 uppercase tracking-wider">Date & Heure de départ</th>
                        <th class="px-6 py-3 text-left text-xs font-medium text-gray-700 uppercase tracking-wider">ID Hôtel</th>
                    </tr>
                </thead>
                <tbody class="bg-white divide-y divide-gray-200">
                    <c:forEach var="res" items="${reservations}">
                        <c:if test="${empty param.dateFilter || fn:startsWith(res.dateHeureDepart, param.dateFilter)}">
                            <tr class="hover:bg-gray-50 transition duration-150">
                                <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">${res.id}</td>
                                <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-700">${res.client}</td>
                                <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-700">${res.nbPassager}</td>
                                <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-700">${res.dateHeureDepart}</td>
                                <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-700">${res.hotel}</td>
                            </tr>
                        </c:if>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>