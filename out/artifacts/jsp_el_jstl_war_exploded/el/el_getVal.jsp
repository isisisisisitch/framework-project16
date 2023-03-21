<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%

//       域对象
//        request;
//        session;
//        pageContext;
//        ServletContext;



        session.setAttribute("name","bytetube2");
        request.setAttribute("name","bytetube1");


    %>

    ${sessionScope.name}


</body>
</html>
