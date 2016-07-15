<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" import="java.sql.ResultSet" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#85FFFF">

<center>
   <h4>Booking Status</h4>
   </center>
   
  <CENTER> 
   <table cellpadding="5" border="2" >


             <tr>
             <th bgcolor="CornflowerBlue" width="160">TICKET NUMBER</th>
             <th bgcolor="CornflowerBlue" Width="160">PARTY NAME</th>
             <th bgcolor="CornflowerBlue" width="160">BOOKING STATUS</th>
            
             </tr>
             
 

 <%
  ResultSet rs=(ResultSet)request.getAttribute("rs");
  while(rs.next())
  {%>
  
 


       
             
             
             <tr>
                 <td align="center" width="160"><%out.println(rs.getInt(1)); %></td>
                 <td align="center" width="160"><%out.println(rs.getString(2)); %></td>
                 <td align="center" width="160"><%out.println(rs.getString(3)); %></td>
         
             </tr>

             <% }
         %>
         </table>
</CENTER>
<br>
<br>
<br>
<br>
<center>
<a href="clerkHomePage.html">Go back</a>
</center>
</body>
</html>