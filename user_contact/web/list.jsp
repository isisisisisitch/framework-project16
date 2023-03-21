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
        <tr>
            <td>1</td>
            <td>sam</td>
            <td>male</td>
            <td>20</td>
            <td>trt</td>
            <td>44444222</td>
            <td>sam@gmail.com</td>
            <td><a class="btn btn-default btn-sm" href="update.jsp">modify</a>&nbsp;<a class="btn btn-default btn-sm" href="">del</a></td>
        </tr>
        <tr>
            <td>2</td>
            <td>tony</td>
            <td>male</td>
            <td>22</td>
            <td>van</td>
            <td>4447222</td>
            <td>tony@gmail.com</td>
            <td><a class="btn btn-default btn-sm" href="update.jsp">modify</a>&nbsp;<a class="btn btn-default btn-sm" href="">del</a></td>
        </tr>
        <tr>
            <td>3</td>
            <td>susan</td>
            <td>female</td>
            <td>20</td>
            <td>mtl</td>
            <td>3467890</td>
            <td>susan@gmail.com</td>
            <td><a class="btn btn-default btn-sm" href="update.jsp">modify</a>&nbsp;<a class="btn btn-default btn-sm" href="">del</a></td>
        </tr>
        <tr>
            <td>4</td>
            <td>alida</td>
            <td>female</td>
            <td>43</td>
            <td>van</td>
            <td>3278902</td>
            <td>alida@gmail.com</td>
            <td><a class="btn btn-default btn-sm" href="update.jsp">modify</a>&nbsp;<a class="btn btn-default btn-sm" href="">del</a></td>
        </tr>
       
        <tr>
            <td colspan="8" align="center"><a class="btn btn-primary" href="add.jsp">add contact</a></td>
        </tr>
    </table>
</div>
</body>
</html>
