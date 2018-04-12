<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 	<title>测试</title>
 	<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
 	<script type="text/javascript">
 		$(function(){
 			var json = '{"aa":"aa","bb":"bb"}';
 			var obj = $.parseJSON(json);
 			alert(obj.aa);
 			$.each(obj,function(i,n){
 				alert("name:"+i+",value:"+n);
 			});
 		});
 	</script>
  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
