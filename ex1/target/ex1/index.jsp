
<%@ page language="java" import="java.util.*"
         contentType="text/html;charset=UTF-8"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <meta charset="UTF-8">
    <title>test</title>
</head>
<script type="text/javascript">
    function check(form) {
        if(form.userId.value=='') {
            alert("请输入用户帐号!");
            form.userId.focus();
            return false;
        }
        if(form.password.value==''){
            alert("请输入登录密码!");
            form.password.focus();
            return false;
        }
        return true;
    }
</script>
<body>
<p id="test">Hello World!</p>
<a href="/view/success.jsp"> dsdasd</a>

<form action="/user/login" method="post">
    用户帐号<input type=text name="account" size="18" value="" ><br>
    登录密码<input type="password" name="password" size="19" value=""/>
    <input type=submit name="submit1" value="登陆" onclick="return check(this.form)">
</form>
</body>
</html>