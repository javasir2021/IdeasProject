<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>TestCycles </title>
</head>
<body>
 
<H3 style="color:blue;"> Add TestCycles </H3>
 
<form:form method="post" action="add" commandName="testcycle11">
 
    <table>
    
    <tr>
        <td><form:label path="cycleId"><spring:message code="label.cycleId"/></form:label></td>
        <td><form:input path="cycleId" /></td>
    </tr>
    <tr>
        <td><form:label path="cycleName"><spring:message code="label.cycleName"/></form:label></td>
        <td><form:input path="cycleName" /></td>
    </tr>
    
          
    
    <tr>
        <td><form:label path="product"><spring:message code="label.product"/></form:label></td>
        <td><form:select path="product" items="${products11}">  
        </form:select></td>
        
        
    </tr>
    
    
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     <c:if test="${save eq true}">
        <h3> Success data is saved</h3>
     </c:if>
     
     <c:if test="${save eq false}">
        <h3> Exception: Data Not Saved</h3>
     </c:if>

 
</body>
</html>