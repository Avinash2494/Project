<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
   <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">


    <!-- Custom Fonts -->
    <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    
     <script src="bower_components/jquery/dist/jquery.min.js"></script>
     <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <script src="dist/js/sb-admin-2.js"></script>

</head>

<body>

    <div id="wrapper">
        
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                
                <center><a class="navbar-brand" href="index.html">Indian Railway Luggage Booking Portal Head</a></center>
            </div>
            

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                       <li>
                            <a href="clerkHomePage.html"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                        
                        <li>
                            <a href="clerkBookingPage.html"><i class="fa fa-table fa-fw"></i> Booking</a>
                        </li>
                        <li>
                            <a href="clerkReceiptPage.jsp"><i class="fa fa-edit fa-fw"></i> GenerateReceipt</a>
                        </li>
                        <li>
                            <a href="clerkAnalysis.html"><i class="fa fa-bar-chart fa-fw"></i> Analysis</a>
                        </li>
                        <li>
                            <a href="Loginpage.jsp"><i class="fa fa-edit fa-fw"></i> LogOut</a>
                        </li>
                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
      
        <div id="page-wrapper">
          
               
		<center>
	    <form name="receiptForm" method="post" action="PrintReceiptController">
		<br><br><br><br>
		Enter Ticket No:<input type="text" name="ticketNo" class="form-control" style ="width:300px;" required>
		<br>
		<input type="submit" value="Get Details" class="btn btn-success">
	    </form>
       </center>
       <br><br>
        <%
        if(request.getAttribute("msg")==null){
         }
         else 
         {%>
         <center>
         <div class="alert alert-danger" style="width:300px">
         <strong>Please Enter Correct Ticket Number !</strong>
         </div>
         </center>
       <%}%>  
				</div>
                
            </div>
            
        </div>
        
    </div>
    
       
</body>

</html>
