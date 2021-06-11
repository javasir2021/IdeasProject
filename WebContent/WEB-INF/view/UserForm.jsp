<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Users</title>
</head>
<body>
 
<H3 style="color:blue;"> Add Users</H3>
 
<form:form method="post" action="addUserOnly" commandName="userdata">
 
    <table>
    
    
    <tr>
        <td><form:label path="userName"><spring:message code="label.userName"/></form:label></td>
        <td><form:input path="userName" /></td>
           
    </tr>
     
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.addUser"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     

 
</body>
</html>