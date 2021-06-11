<%@page language="java"%>
<%@page import="javax.servlet.http.*" %>
<html>

<frameset rows="100,*">
  <frame src="header.jsp">
  <frameset cols="250,*">
    <frame src="links.jsp" name="left">
    <frame src="home.jsp" name="right">
  </frameset>
</frameset>

</html>