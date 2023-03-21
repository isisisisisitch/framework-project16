<%@ page import="ca.bytetube.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User("bytetube",6,new Date());
    request.setAttribute("user",user);

    List list = new LinkedList();
    list.add("dal");
    list.add(user);
    list = null;
    request.setAttribute("list",list);


    Map map = new HashMap();
    map.put("name","dal");
    map.put("user",user);
    request.setAttribute("map",map);



%>

<%--<c:if test="false" >--%>
<%--    code is here--%>
<%--</c:if>--%>
<c:if test="${empty list}">
   code is here
</c:if>

</body>
</html>
