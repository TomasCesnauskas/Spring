<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <title>
        Customer list
    </title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer relationship manager</h2>
    </div>
</div>
<div id="container">
    <%--    add our html table here--%>
    <table>
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Email</th>
        </tr>

        <%--        loop and print out customers--%>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

