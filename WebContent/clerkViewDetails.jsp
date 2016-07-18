<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.sql.ResultSet"%>
<%@ page language="java" import="java.io.PrintWriter"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="image\logo.ico" />
<title>View Details</title>
 <script>
   function noBack()
   {
     window.history.forward();
   }
   </script>
</head>
<body  onload="noBack()" bgcolor="#85FFFF">

<center>
   <h4>CONSOLIDATE REPORT</h4>
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
             <th bgcolor="CornflowerBlue" width="140">RECEIPT NO.</th>
            
             </tr>
             
  



	
  <%
  //PrintWriter o = response.getWriter();
  ResultSet rs=(ResultSet)request.getAttribute("rs");
  while(rs.next())
  {%>



       
             
             
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
                 <td align="center" width="140"><%out.println(rs.getInt(12)); %></td>
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