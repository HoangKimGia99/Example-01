<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<p>Your</p>
First Name:${reservation.firsName}
<br>
Last Name:${reservation.lastName}
<br>
Gender:${reservation.gender}
<ul>
    <c:forEach var="meal" items="${reservation.food}">
    <li>${meal}</li>
    </c:forEach>
</ul>
Leaving from:${reservation.cityFrom}
<br>
Going to:${reservation.cityTo}
</body>
</html>