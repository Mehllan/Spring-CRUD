<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Staff Details</h3>
        <form:form method="POST" action="/addStaff" modelAttribute="staff">
             <table>
                <tr>
                    <td><label>Name</label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><label>Phone</label></td>
                    <td><form:input path="phone" /></td>
                </tr>
                <tr>
                    <td><label>Father Name</label></td>
                    <td><form:input path="fathername"/></td>
                </tr>
                <tr>
                    <td><label>Date Of Birth</label></td>
                    <td><form:input path="dob"/></td>
                </tr>
                <tr>
                    <td><label>Address</label></td>
                    <td><form:input path="address"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>