<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title> Login Page </title>
<link rel="shortcut icon" href="image\logo.ico" />

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript">
   function noBack()
   {
     window.history.forward();
     
   }
   function validate(userName,password)
	{
		
		if((userName.value=="") && (password.value==""))
			{
				alert("Enter User Name and Password");
			
			}
		
		else if(userName.value=="")
			alert("Enter the User Name");
		else if(password.value=="")
			alert("Enter the Pass Word");
		else
			loginForm.action="LoginController";
		
	}
</script>



</head>

<body bgcolor="#85FFFF" onload="noBack()" style="margin:150;margin-top: 100px;"> 

<center><img alt="RailwayLogo" src="image\logo.png" height="100" width="100"></center>
<div class="container">
	<div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                   <center> <h3 class="panel-title">Indian Railways Luggage Booking Portal</h3></center>
                </div>
                <div class="panel-body">
                    <form role="form" method="post" name="loginForm">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="Name" name="userName"  size="20" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name="password"  size="20" type="password" value="">
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <input type="submit" class="btn btn-success btn-block" value="LogIn" onclick="validate(userName,password)"></input>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<%
if(request.getAttribute("msg")==null){
}
else 
 {%>
 <center>
<div class="alert alert-danger" style="width:250px">
    <strong>Wrong Credentials !</strong>
</div> </center>
  <%}%>    
  
  <%
response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires",-1);
%>

</body>
</html>