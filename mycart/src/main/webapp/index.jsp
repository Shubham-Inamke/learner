<%@page import="com.learn.mycart.helper.FactoryProvider"%>
<html>
<head>
	<title> Mycart - Home</title>
	
	<%@include file="components/common_css_js.jsp" %>
<body>
<%@include file="components/navbar.jsp" %>
<h2>Hello World!</h2>
<h1> Creating Session factory object</h1>
<%
/* singleton design pattern*/
out.println(FactoryProvider.getFactory()+"<br>");
out.println(FactoryProvider.getFactory()+"<br>");
out.println(FactoryProvider.getFactory());

%>
</body>
</html>
