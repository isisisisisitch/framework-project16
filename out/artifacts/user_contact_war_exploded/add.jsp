<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 
    <meta charset="utf-8">
  
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1">
  
    <title>add user</title>

   
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <script src="js/jquery-2.1.0.min.js"></script>
    
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <center><h3>add contact</h3></center>
    <form action="" method="post">
        <div class="form-group">
            <label for="name">name:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="input name">
        </div>

        <div class="form-group">
            <label>sex:</label>
            <input type="radio" name="sex" value="male" checked="checked"/>male
            <input type="radio" name="sex" value="female"/>female
        </div>

        <div class="form-group">
            <label for="age">age：</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="input age">
        </div>

        <div class="form-group">
            <label for="address">address：</label>
            <select name="address" class="form-control" id="address">
                <option value="trt">trt</option>
                <option value="van">van</option>
                <option value="mtl">mtl</option>
            </select>
        </div>

        <div class="form-group">
            <label for="facebook：">facebook：</label>
            <input type="text" class="form-control" name="facebook" placeholder="input facebook num"/>
        </div>

        <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" class="form-control" name="email" placeholder="input email"/>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="submit" />
            <input class="btn btn-default" type="reset" value="reset" />
            <input class="btn btn-default" type="button" value="back" />
        </div>
    </form>
</div>
</body>
</html>