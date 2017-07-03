<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>EVA</title>
    <span style="float: right">
    <a href="?lang=en">en</a>
    |
    <a href="?lang=de">ru</a>
</span>
</head>
<body>
<form id="HomePage"  enctype="text/html">

    <input class="button" name="btn_project" type="submit"  value="Create Project"  onclick="GetCreateProjectPage()" />
    <input class="button" name="btn_project" type="submit"  value="Create Task"  onclick="GetCreateTaskPage()" />

</form>


<script>
    form =  document.getElementById("HomePage");
    function GetCreateProjectPage() {
        form.action="/project";
        form.method ="get"
        form.submit();
    }
    function GetCreateTaskPage() {
        form.action="/task";
        form.method ="get"
        form.submit();
    }
</script>


</body>
</html>
