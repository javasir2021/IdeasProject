<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>IDEAS</title>
</head>
<body>
<h3 style="color:blue;"> Sucess Data is Saved</h1>

<%-- <h3>Test Cycles</h3>
<c:if  test="${!empty testcycleList}">
<table class="data">
<tr>
    <th>TestCycleId</th>
    <th>TestCycleName</th>
    <th>Product</th>
    
</tr>
<c:forEach items="${testcycleList}" var="tc">
    <tr>
        <td>${tc.cycleId}</td>
        <td>${tc.cycleName}</td>
        <td>${tc.product}</td>
        <td><a href="delete/${emp.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>

 --%>
</body>
</html>