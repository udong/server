<%@page import="java.sql.DriverManager"%>
<%@page import="javax.naming.spi.DirectoryManager"%>
<%@page import="java.util.*,java.io.*,java.sql.*"%>
<%@page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>

<%!Connection connection;
   Statement statement;
   ResultSet resultSet;

   String driver = "org.postgresql.Driver";
   String url = "jdbc:postgresql://ec2-107-21-223-147.compute-1.amazonaws.com:5432/daglgi6h4uplbn?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
   String uid = "yecchlcvincsjw";
   String upw = "lEDqlfI_jh7cSi4wynix9GzI8b";
   String query = "select * from member";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

   <%
      try {
         Class.forName(driver);
         connection = DriverManager.getConnection(url, uid, upw);
         statement = connection.createStatement();
         resultSet = statement.executeQuery(query);

         while (resultSet.next()) {
            

            out.println("id");
         }
         out.println("id");
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (resultSet != null)
               resultSet.close();
            if (statement != null)
               statement.close();
            if (connection != null)
               connection.close();

         } catch (Exception e2) {
            e2.printStackTrace();
         }

      }
   %>




</body>
</html>