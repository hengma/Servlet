<%@page import="java.util.*"%>
<%@page import="com.company.model.User"%>

<%
	List<User> userList = (List<User>) session.getAttribute("userList");
%>
<script language="javascript">
    function setSelectedItem(elementId) {
    	alert('test');
    	alert(elementId);
        if (confirm("Do you really want to delete this item?")){
        	var elem = document.getElementById("selecteditem");
        	elem.value = elementId;
        	document.form["user"].submit();
        }
    }
</script>
<html>
<body>
	<form action="/sample-servlet3-1.01-SNAPSHOT/MainServlet" method="GET" name="user">
		<input id="selecteditem" type="hidden"  value="" />
		<div align="center">
			<table border="1">
				<caption>User List:</caption>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Delete</th>
				</tr>
				<%
					for (User user : userList) {
				%>
				<tr>
					<td><%=user.getId()%></td>
					<td><%=user.getName()%></td>
					<td><input type="submit"  value="Delete" onclick="setSelectedItem('<%=user.getId()%>');"/></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</form>
</body>
</html>