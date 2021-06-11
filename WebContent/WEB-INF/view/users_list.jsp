<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>IDEAS</title>
</head>
<body>


<h3 style="color:blue;">List of Users & their Details</h3>

<c:if  test="${!empty UsersList}">
<table class="data" border="1" bgcolor="yellow">
<tr>
    <th>UserName</th>
    <th>TestCycleId</th>
    <th>Status</th>
    
</tr>
<c:forEach items="${UsersList}" var="tc">
    <tr>
        <td>${tc.userName}</td>
        <c:if  test="${!empty tc.testcycle.cycleId}">
          <td>${tc.testcycle.cycleId}</td>
          <td>${tc.status}</td>
        </c:if>
        <c:if  test="${empty tc.testcycle.cycleId}">
          <td>No Tasks</td>
          <td>No Tasks</td>
        </c:if>
          
        <td><a href="deleteUser/${tc.rowId}">delete</a></td> 
        <td><a href="updateUser/${tc.rowId}">Update</a></td> 
        
        
    </tr>
</c:forEach>
</table>
</c:if>

<c:if  test="${empty UsersList}">
<h3 style="color:green;">There is No Data to Show</h3>
</c:if>

 


</body>
</html>