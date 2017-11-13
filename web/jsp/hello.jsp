<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Spring MVC</title>
</head>

<body>
<h2>${message}</h2>
<p>Using <b>org.springframework.web.servlet.DispatcherServlet</b> handles all the HTTP requests and responses.</p>
<p>The url-pattern is <b>*.do</b></p>
<p>Following links are configured in the Spring config file using with two View Resolvers -
    <b>InternalResourceViewResolver</b> and <b>BeanNameViewResolver</b>.</p>
<a href="./pageOne.do"><h3>Sub Page 1</h3></a>
<a href="./pageTwo.do"><h3>Sub Page 2</h3></a>
<a href="./pageThree.do"><h3>Sub Page 3</h3></a>
<a href="./viewWebXml.do"><h5>View web.xml</h5></a>
<a href="./viewSpringConfig.do"><h5>View Spring Config</h5></a>
</body>
</html>