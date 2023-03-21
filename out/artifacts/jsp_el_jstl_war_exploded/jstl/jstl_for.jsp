<%@ page import="ca.bytetube.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
for 类似于java中的for




<%

    User user = new User("bytetube",6,new Date());
    request.setAttribute("user",user);

    List list = new LinkedList();
    list.add("dal");
    list.add(user);
    request.setAttribute("list",list);


%>
int i = 0;
for(Element ele : container){

}
<hr>
<c:forEach items="${requestScope.list}" var="ele" varStatus="vs">
    ${vs.index}
    ${vs.count}
    ${ele}<br>

</c:forEach>


<%--for(int i = 0; i < 10; i+=2){}--%>
<%--<c:forEach begin="0" end="9" step="2" var="i">--%>
<%--    ${i}--%>
<%--</c:forEach>--%>


</body>
</html>
