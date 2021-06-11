<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>IDEAS</title>
</head>
<body>


<h3 style="color:blue;">List of Test Cycles</h3>

<c:if  test="${!empty testcycleList}">
<table class="data" border="1" bgcolor="yellow">
<tr>
    <th>TestCycleId</th>
    <th>TestCycleName</th>
    <th>Product</th>
    <th>&nbsp;</th>
    <th>&nbsp;</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${testcycleList}" var="tc">
    <tr>
        <td>${tc.cycleId}</td>
        <td>${tc.cycleName}</td>
        <td>${tc.product}</td>
        <td><a href="delete/${tc.cycleId}">delete</a></td> 
        <td><a href="update/${tc.cycleId}">Update</a></td> 
        <td><a href="Assign_to_User/${tc.cycleId}">Assign to User</a></td> 
        
    </tr>
</c:forEach>
</table>
</c:if>

<c:if  test="${empty testcycleList}">
<h1 color="red">There is No Data to Show</h1>
</c:if>


 

</body>
</html>