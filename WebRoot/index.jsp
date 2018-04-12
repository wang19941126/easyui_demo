<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>测试</title>
	<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
	<script type="text/javascript">
		function ok(){
			$.ajax({
				url:"addStudent2.do",
				type:"post",
				dataType:"json",
				data:{
					name: $("#name").val(),
					password:$("#password").val()
				},
				success:function(data){
					alert("添加"+data.status+"成功");
				},
				error:function(){
					alert("系统错误");
				}
			});
		}
	</script>
  </head>
  
  <body>
  返回视图：<br/>
  <form action="addStudent1.do" method="post">
	用户名：<input name="name" type="text" /><br/>
	密码：<input name="password" type="text" /><br/>
	<input type="submit" value="提交"><br/>
  </form>
  返回json:<br/>
  <form>
	用户名：<input id="name" name="name" type="text" /><br/>
	密码：<input id="password" name="password" type="text" /><br/>
	<input type="button" value="提交" onclick="ok()" ><br/>
  </form>
  </body>
</html>
