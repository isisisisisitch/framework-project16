<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    
    <meta charset="utf-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>user contact</title>

   
    <link href="css/bootstrap.min.css" rel="stylesheet">
   
    <script src="js/jquery-2.1.0.min.js"></script>
   
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">user list info</h3>
    <tr>
        <td colspan="8" align="center"><a class="btn btn-primary" href="add.jsp">add contact</a></td>
    </tr>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>id</th>
            <th>name</th>
            <th>sex</th>
            <th>age</th>
            <th>address</th>
            <th>facebook</th>
            <th>email</th>
            <th>operation</th>
        </tr>

        <c:forEach items="${requestScope.pb.list}" var="user" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${user.name}</td>
                <td>${user.sex}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
                <td>${user.facebook}</td>
                <td>${user.email}</td>
                <td><a class="btn btn-default btn-sm" href="update.jsp">modify</a>&nbsp;<a class="btn btn-default btn-sm" href="">del</a></td>
            </tr>
        </c:forEach>

       

    </table>
    <div>

        <nav aria-label="Page navigation">
            <ul class="pagination">

                <c:if test="${pb.curPage == 1}">
                    <li class="disabled">
                </c:if>

                    <c:if test="${pb.curPage != 1}">
                    <li>
                        </c:if>


                    <a href="${pageContext.request.contextPath}/FindUserByPageServlet?curPage=${pb.curPage - 1}&rows=5" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>

                <c:forEach begin="1" end="${pb.totalPage}" var="i">
                    <c:if test="${pb.curPage == i}">
                    <li class="active"><a href="${pageContext.request.contextPath}/FindUserByPageServlet?curPage=${i}&rows=5">${i}</a></li>
                    </c:if>

                    <c:if test="${pb.curPage != i}">
                        <li><a href="${pageContext.request.contextPath}/FindUserByPageServlet?curPage=${i}&rows=5">${i}</a></li>
                    </c:if>
                </c:forEach>
                <li>
                    <a href="${pageContext.request.contextPath}/FindUserByPageServlet?curPage=${pb.curPage + 1}&rows=5" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>

                <span style="font-size: 25px; margin-left: 10px">
                    ${requestScope.pb.totalCount} records, ${requestScope.pb.totalPage} pages
                </span>

            </ul>
        </nav>
    </div>
</div>
</body>
</html>
