<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/8/11
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

<script>

    function getRoot() {
        var hostname = location.hostname;
        var pathname = location.pathname;
        var port = location.port;
        var protocol = location.protocol;
        return protocol + "//" + hostname + ":" + port + "/" ;
    }
    var BASE_URL = getRoot();

    window.location.href =BASE_URL+ "index.jsp";
</script>
</head>
<body>
退出登录
</body>
</html>
