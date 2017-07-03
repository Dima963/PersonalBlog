<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <spring:url value="/resource/css/style.css" var="styleCss"/>
        <title>EVA</title>
        <meta charset="utf-8" />
        <link href="${styleCss}" rel="stylesheet" />
    </head>
    <body>

        <form id="Authentication"  enctype="text/html">

            <input class="entryField" name="user_name" type="text" size="45" value="Name" /><br><br>
            <input class="entryField" name="email" type="text" size="45" value="Email" /><br><br>
            <input class="entryField" name="user_password" type="password" size="45" value="Password" />
            <input class="checkbox" type="checkbox" value="Remember me" />Remember me?<br>
            <a href="/WEB-INF/view/reset%20_password.jsp">Forgot password</a><br>

            <input class="button" name="btn_enter" type="submit"  value="Log In" onclick="LogIn()" />
            <input class="button" name="btn_register" type="submit"  value="Register"  onclick="Registration()" />

        </form>
    <script>
        form =  document.getElementById("Authentication");
        function LogIn() {
            form.action = "/";
            form.method ="post"
            form.submit();
        }
        function Registration() {
            form.action="/authentication";
            form.method ="get"
            form.submit();
        }
    </script>
    </body>
</html>
