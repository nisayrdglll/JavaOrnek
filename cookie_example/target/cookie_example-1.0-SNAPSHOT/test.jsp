<%-- 
    Document   : test
    Created on : 7 Kas 2022, 11:37:29
    Author     : narve
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="ahmet.*"%>
<%@page import="ostim.edu.tr.yazilim.ben.ders.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <jsp:include page="git12.jsp" flush="true"/>


    <%
        
        islemler is = new islemler();
        mehmet meh = new mehmet();
      ArrayList<ogrenci> ogrenci_jsp_liste =  is.test_ahmet();
        
        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        if (cookies != null) {
            out.println("<h2> Found Cookies Name and Value</h2>");
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                out.print("Name : " + cookie.getName() + ",  ");
                out.print("Value: " + cookie.getValue() + " <br/>");
            }
        } else {
            out.println("<h2>No cookies founds</h2>");
        }
    %> 


    %>

</body>
</html>
