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
<title>Insert title here</title>
</head>
<body bgcolor="#85FFFF">

<div class="panel panel-primary">
 <div class="panel-heading"><center>Booking Status<center></div>

   
   <table cellpadding="5" border="0" class="table">


             <tr class="success">
             <th align="left" width="160">TICKET NUMBER</th>
             <th align="left" Width="160">PARTY NAME</th>
             <th align="left" width="160">BOOKING STATUS</th>
            
             </tr>
             
 

 <%
  ResultSet rs=(ResultSet)request.getAttribute("rs");
  while(rs.next())
  {%>
  
 


       
             
             
             <tr  class="info">
                 <td align="left" width="160"><%out.println(rs.getInt(1)); %></td>
                 <td align="left" width="160"><%out.println(rs.getString(2)); %></td>
                 <td align="left" width="160"><%out.println(rs.getString(3)); %></td>
         
             </tr>

             <% }
         %>
         </table>
</div>
<br>
<br>
<br>
<br>
<center>
<button type="button" class="btn btn-success">
<a href="clerkHomePage.html" style="text-decoration: none;">Go back</a></button>
</center>
</body>
</html>