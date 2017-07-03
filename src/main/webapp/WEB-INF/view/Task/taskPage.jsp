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

<form id="CreateTask"  enctype="text/html">

    <input class="entryField" name="name" type="text" size="45" value="Name" /><br><br>
    <input class="entryField" name="title" type="text" size="45" value="Title" /><br><br>

    <input class="button" name="btn_enter" type="submit"  value="Save" onclick="SaveTask()" />

</form>
<script>
    form =  document.getElementById("CreateTask");
    function SaveTask() {
        form.action = "/task";
        form.method ="post"
        form.submit();
    }
</script>
</body>
</html>
