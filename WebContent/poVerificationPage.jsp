<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.sql.ResultSet" %>

<html>
<head>
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
 
 <center>
   <h4>PENDING DETAILS</h4>
   </center>
   
  <CENTER> 
   <table cellpadding="5" border="2" >


             <tr>
             <th bgcolor="CornflowerBlue" width="140">TICKET NO</th>
             <th bgcolor="CornflowerBlue" Width="140">TRAIN NO</th>
             <th bgcolor="CornflowerBlue" width="140">TRAIN NAME</th>
             <th bgcolor="CornflowerBlue" width="140">D.O.J</th>
             <th bgcolor="CornflowerBlue" Width="140">SOURCE</th>
             <th bgcolor="CornflowerBlue" width="140">DESTINATION</th>
             <th bgcolor="CornflowerBlue" width="140">PARTY NAME</th>
             <th bgcolor="CornflowerBlue" Width="140">NO.OF ITEMS</th>
             <th bgcolor="CornflowerBlue" width="140">WEIGHT</th>
             <th bgcolor="CornflowerBlue" width="140">FARE</th>
             <th bgcolor="CornflowerBlue" Width="140">STATUS</th>
             
            
            
             </tr>
             
  </TABLE>  
   </CENTER>
 
  <%
  ResultSet rs=(ResultSet)request.getAttribute("rs");
  while(rs.next())
  {%>
<table cellpadding="5" border="2" >


       
             
             
             <tr>
                 <td align="center" width="140"><%out.println(rs.getInt(1)); %></td>
                 <td align="center" width="140"><%out.println(rs.getInt(2)); %></td>
                 <td align="center" width="140"><%out.println(rs.getString(3)); %></td>
                 <td align="center" width="140"><%out.println(rs.getString(4)); %></td>
                 <td align="center" width="140"><%out.println(rs.getString(5)); %></td>
                 <td align="center" width="140"><%out.println(rs.getString(6)); %></td>
                 <td align="center" width="140"><%out.println(rs.getString(7)); %></td>
                 <td align="center" width="140"><%out.println(rs.getInt(8)); %></td>
                 <td align="center" width="140"><%out.println(rs.getInt(9)); %></td>
                 <td align="center" width="140"><%out.println(rs.getInt(10)); %></td>
                 <td align="center" width="140"><%out.println(rs.getString(11)); %></td>
                                 
             </tr>
</table>
             <% }
         %>

<BR>
<BR>
<BR>
<form method="post" name="verifyForm">
Enter the Ticket Number:
<input type="hidden" name="status" >
<input type="text" name="ticketNo">
<input type="submit" name="Accept" value="Accept" onclick="verify1()">
<input type="submit" name="Reject" value="Reject" onclick="verify2()">

</form>
<BR>
<BR>
<center>
<a href="parcelOfficerHomePage.html">Go back</a>
</center>

</body>
</html>