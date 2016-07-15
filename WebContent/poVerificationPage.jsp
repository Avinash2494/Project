<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.sql.ResultSet" %>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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
<title>Insert title here</title>
</head>
<body bgcolor="#85FFFF">
 

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
<center>
<button type="button" class="btn btn-success"><a href="parcelOfficerHomePage.html" style="text-decoration: none;">Go back</a></button>

</center>

</body>
</html>