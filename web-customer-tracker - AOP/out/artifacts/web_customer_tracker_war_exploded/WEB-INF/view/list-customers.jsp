<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
    <%--    reference our stylesheet--%>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
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
    <div id="content">
        <%--        put new button-add customer--%>
        <input type="button" value="Add customer"
               onclick="window.location.href='showFormForAdd'; return false;"
               class="add-button"/>
    </div>

    <%--    add our html table here--%>
    <table>
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Email</th>
            <th>Action</th>
        </tr>

        <%--        loop and print out customers--%>
        <c:forEach var="customer" items="${customers}">

            <%--                Construct update link with customer id--%>
            <c:url var="updateLink" value="/customer/showFormForUpdate">
                <c:param name="customerId" value="${customer.id}"></c:param>
            </c:url>
            <%--  Construct delete link with customer id      --%>
        <c:url var="deleteLink" value="/customer/deleteCustomer">
            <c:param name="customerId" value="${customer.id}"></c:param>
        </c:url>
            </tr>

        <tr>
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
            <td>${customer.email}</td>
            <td>
                <%--                display update link--%>
                <a href="${updateLink}">Update</a>
                |
                    <a href="${deleteLink}"
                       onclick="if (!(confirm('Are you sure you want to delete this customer?')))
                    return false">Delete</a>
            </td>

            </c:forEach>
    </table>
</body>
</html>

