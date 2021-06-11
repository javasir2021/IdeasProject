<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:if test="${deleted eq true}">
        <h3> Success data is Deleted</h3>
     </c:if>
     
     <c:if test="${deleted eq false}">
        <h3> Failure:: Data Not deleted</h3>
     </c:if>
