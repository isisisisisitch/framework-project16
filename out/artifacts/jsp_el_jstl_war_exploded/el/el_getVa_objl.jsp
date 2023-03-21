<%@ page import="ca.bytetube.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        request.setAttribute("list",list);

        Map map = new HashMap();
        map.put("name","dal");
        map.put("user",user);
        request.setAttribute("map",map);



    %>
<%--    getXXX --->XXX ---> name --%>
<%--    ${user.birthStr}--%>
<%--    empty,null --%>
<%--${list[10]}--%>
${map.user.age}



</body>
</html>
