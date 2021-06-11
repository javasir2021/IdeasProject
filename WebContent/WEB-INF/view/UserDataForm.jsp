<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Data </title>
</head>
<body>
 
<H3 style="color:blue;"> Assign testcycles to User</H3>
 
<form:form method="post" action="addUser" commandName="userdata">
 
    <table>
    
    <tr>
        <td><form:label path="testcycle.cycleId"><spring:message code="label.cycleId"/></form:label></td>
        <td><form:input path="testcycle.cycleId" value="${testcycleId}"/></td>
    </tr>
    
    
    <tr>
        <td><form:label path="userName"><spring:message code="label.userName"/></form:label></td>
        <td><form:select path="userName" items="${usersList}">  
        </form:select></td>
             
    </tr>
    
    
    
    <tr>
        <td><form:label path="status"><spring:message code="label.status"/></form:label></td>
        <td><form:input path="status" /></td>
    </tr>
      
        
   
    
    
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     

 
</body>
</html>