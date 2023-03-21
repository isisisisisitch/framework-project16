<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>admin login</title>

    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <script src="js/jquery-2.1.0.min.js"></script>
    
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
    </script>
  </head>
  <body>
  	<div class="container" style="width: 400px;">
  		<h3 style="text-align: center;">admin login</h3>
        <form action="login" method="post">
	      <div class="form-group">
	        <label for="user">username:</label>
	        <input type="text" name="user" class="form-control" id="user" placeholder="pls input username:"/>
	      </div>
	      
	      <div class="form-group">
	        <label for="password">password:</label>
	        <input type="password" name="password" class="form-control" id="password" placeholder="pls input password"/>
	      </div>
	      
	      <div class="form-inline">
	        <label for="vcode">verifycode:</label>
	        <input type="text" name="verifycode" class="form-control" id="verifycode" placeholder="pls input verifycode" style="width: 120px;"/>
	        <a href="javascript:refreshCode()"><img src="vcode" title="refresh" id="vcode"/></a>
	      </div>
	      <hr/>
	      <div class="form-group" style="text-align: center;">
	        <input class="btn btn btn-primary" type="submit" value="login">
	       </div>
	  	</form>
		
		<!-- 出错显示的信息框 -->
	  	<div class="alert alert-warning alert-dismissible" role="alert">
		  <button type="button" class="close" data-dismiss="alert" >
		  	<span>&times;</span></button>
		   <strong>fail to login!</strong>
		</div>
  	</div>
  </body>
</html>