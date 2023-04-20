<%-- 
    Document   : coo
    Created on : 7 Kas 2022, 11:33:51
    Author     : narve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%

   // Create cookies for first and last names.      
   Cookie firstName = new Cookie("first_name", "ahmet");
   Cookie secondName = new Cookie("soyad", "mungen");
   // Set expiry date after 24 Hrs for both the cookies.
   firstName.setMaxAge(60*60*24); 
   secondName.setMaxAge(60*60*24); 
   // Add both the cookies in the response header.
   response.addCookie( firstName );
   response.addCookie( secondName );


    %>

</body>
</html>
