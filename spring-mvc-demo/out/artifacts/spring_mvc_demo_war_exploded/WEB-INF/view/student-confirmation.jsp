<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
    Student is confirmed: ${student.firstName} ${student.lastName}
<br> <br>
    Country: ${student.country}
    <br> <br>
Favorite language: ${student.favoriteLanguage}
    <br> <br>
Operating system:
    <ul>
        <c:forEach var="operationSystem" items="${student.operatingSystems}">
            <li>
            ${operationSystem}
            </li>
        </c:forEach>
    </ul>
</body>
</html>
