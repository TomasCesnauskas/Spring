<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>

<body>
    <form:form action="processForm" modelAttribute="student" >
        First name: <form:input path="firstName" />
        <br><br>
        Last name: <form:input path="lastName" />
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}" />

<%--                <form:option value="Lithuania" label="Lithuania"/>--%>
<%--                <form:option value="Latvia" label="Latvia"/>--%>
<%--                <form:option value="Estonia" label="Estonia"/>--%>
        </form:select>
        <br><br>
        Favorite language:
        JAVA <form:radiobutton path="favoriteLanguage" value="java"/>
        C++ <form:radiobutton path="favoriteLanguage" value="c++"/>
        PHP <form:radiobutton path="favoriteLanguage" value="php"/>
        PHYTON <form:radiobutton path="favoriteLanguage" value="phyton"/>
        <br><br>
        Operating systems:
        Windows <form:checkbox path="operatingSystems" value="windows"/>
        Linux <form:checkbox path="operatingSystems" value="linux"/>
        IOS<form:checkbox path="operatingSystems" value="ios"/>
        <br><br>
        <input type="submit"/>
    </form:form>
</body>

</html>