<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.sql.ResultSet" %>
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

    

    <script src="dist/js/sb-admin-2.js"></script>
    <script type="text/javascript">

	function verify1()
	{
		 verifyForm.status.value="accept";
		 verifyForm.action="VerificationController";
	}
	function verify2()
	{
   		 verifyForm.status.value="reject";
		 verifyForm.action="VerificationController";
	}
	
	
</script>
<script>
   function noBack()
   {
     window.history.forward();
   }
   </script>

</head>

<body   onload="noBack()">

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
                            <a href="parcelOfficerHomePage.html"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                        </li>
                        
                        <li>
                            <a href="VeiwPendingRequestsController" style="text-decoration: none;"> <i class="fa fa-table fa-fw"></i> Pending Requests</a>
                        </li>
                        <li>
                            <a href="LogOutController" style="text-decoration: none;"><i class="fa fa-edit fa-fw"></i> LogOut</a>
                        </li>
                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
                
 <div class="panel panel-primary">
 <div class="panel-heading"><center>PENDING DETAILS<center></div>

 
   

   <table cellpadding="5"  class="table" >


             <tr class="success">
             <th align="left"  width="140">TICKET NO</th>
             <th align="left"  Width="140">TRAIN NO</th>
             <th  align="left"  width="140">TRAIN NAME</th>
             <th align="left"  width="140">D.O.J</th>
             <th align="left"  Width="140">SOURCE</th>
             <th align="left"  width="140">DESTINATION</th>
             <th align="left"  width="140">PARTY NAME</th>
             <th align="left"  Width="140">NO.OF ITEMS</th>
             <th align="left"  width="140">WEIGHT</th>
             <th align="left"  width="140">FARE</th>
             <th  align="left"  Width="140">STATUS</th>
             
            
            
             </tr>
             

 
  <%
  ResultSet rs=(ResultSet)request.getAttribute("rs");
  while(rs.next())
  {%>



       
             
             
             <tr  class="info">
                 <td align="left" width="140"><%out.println(rs.getInt(1)); %></td>
                 <td align="left" width="140"><%out.println(rs.getInt(2)); %></td>
                 <td align="left" width="140"><%out.println(rs.getString(3)); %></td>
                 <td align="left" width="140"><%out.println(rs.getString(4)); %></td>
                 <td align="left" width="140"><%out.println(rs.getString(5)); %></td>
                 <td align="left" width="140"><%out.println(rs.getString(6)); %></td>
                 <td align="left" width="140"><%out.println(rs.getString(7)); %></td>
                 <td align="left" width="140"><%out.println(rs.getInt(8)); %></td>
                 <td align="left" width="140"><%out.println(rs.getInt(9)); %></td>
                 <td align="left" width="140"><%out.println(rs.getInt(10)); %></td>
                 <td align="left" width="140"><%out.println(rs.getString(11)); %></td>
                                 
             </tr>

             <% }
         %>
</table>
 </div>
<BR>
<BR>
<BR>
<center>
<form method="post" name="verifyForm">
Enter the Ticket Number:

<input type="hidden" name="status" >
<input type="text" name="ticketNo" required class="form-control" style="width:200px;">
<br>
<input type="submit" name="Accept" value="Accept" class="btn btn-primary"  onclick="verify1()" />
<input type="submit" name="Reject" value="Reject" class="btn btn-warning" onclick="verify2()">
</center>
</form>
<BR>
<BR>

				
				</div>
                
            </div>
            
        </div>
        
    </div>
    
</body>

</html>
