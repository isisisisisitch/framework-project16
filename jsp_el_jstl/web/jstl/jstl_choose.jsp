<%@ page import="ca.bytetube.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
choose 类似于java中的switch

<%

int num = 100;
request.setAttribute("num",num);

%>

<c:choose>
    <c:when test="${num % 2 == 0}">
        even num
    </c:when>

    <c:when test="${num % 2 != 0}">
        odd num
    </c:when>

    <c:otherwise>
        exception case
    </c:otherwise>



</c:choose>

</body>
</html>
