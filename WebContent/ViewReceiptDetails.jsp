<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" import="java.sql.ResultSet" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="image\logo.ico" />
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script>
   function noBack()
   {
     window.history.forward();
       
   }
   </script>

</head>
<body bgcolor="#85FFFF"  onload="noBack()">

<center>
<div class="panel panel-primary">
 <div class="panel-heading"><center>RECEIPT DETAILS<center></div>
   
   <table cellpadding="5" border="0" class="table">


             <tr  class="success">
             <th align="left" width="140">TICKET NO</th>
             <th align="left" Width="140">TRAIN NO</th>
             <th align="left" width="140">TRAIN NAME</th>
             <th align="left" width="140">D.O.J</th>
             <th align="left" Width="140">SOURCE</th>
             <th align="left" width="140">DESTINATION</th>
             <th align="left" width="140">PARTY NAME</th>
             <th align="left" Width="140">NO.OF ITEMS</th>
             <th align="left" width="140">WEIGHT</th>
             <th align="left" width="140">FARE</th>
             <th align="left" Width="140">STATUS</th>
             <th align="left" width="140">RECEIPT NO.</th>
            
             </tr>
             
 
   


  <%
  ResultSet rs=(ResultSet)request.getAttribute("rs");
  //if(rs.next())
  while(rs.next())
  { %>                        
             <tr  class="info">
                 <td align="left" width="150"><%out.println(rs.getInt(1)); %></td>
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
                 <td align="left" width="140"><%out.println(rs.getInt(12)); %></td>
             </tr>

             <%
             }
         %>
         </table>
</CENTER>
         
         
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
<center>         
<button type="button" class="btn btn-success"><a href="clerkHomePage.html" style="text-decoration: none;">Go back</a></button>
</center>
</body>
</html>