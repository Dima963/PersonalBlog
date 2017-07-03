<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <spring:url value="/resource/css/style.css" var="styleCss"/>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="${styleCss}" rel="stylesheet" />
</head>
<body>
<form action="/authentication"  method="post" enctype="text/html">

    <input class="entryField" name="name" type="text" size="45" value="Name" /><br><br>
    <input class="entryField" name="surname" type="text" size="45" value="Surname" /><br><br>
    <input class="entryField" name="email" type="text" size="45" value="Email" /><br><br>
    <input class="entryField" name="password" type="password" size="45" value="Password" /><br><br>

    <input class="button" name="btn_register" type="submit" value="Register" />

</form>
</body>
</html>