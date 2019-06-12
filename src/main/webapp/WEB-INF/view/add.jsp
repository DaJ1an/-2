<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
<link rel="stylesheet" href="/resource/css/css.css">
</head>
<body>

<h1 style="font-size:30px;text-align:center">影片添加</h1>
<hr>
<form action="">
	<table>
		<tr>
			<td>电影名称</td>
			<td><input type="text" name="mname"></td>
		</tr>
		<tr>
			<td>电影导演</td>
			<td><input type="text" name="writer"></td>
		</tr>
		<tr>
			<td>售票价格</td>
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td>上映时间</td>
			<td><input type="text" name="mdate" onclick="WdatePicker()"></td>
		</tr>
		<tr>
			<td>类型</td>
			<td>
				<select name="tid" id="tid">
					<option>--请选择--</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>年代</td>
			<td><input type="text" name="years"></td>
		</tr>
		<tr>
			<td>区域</td>
			<td><input type="text" name="quyu"></td>
		</tr>
		<tr>
			<td>状态</td>
			<td><input type="text" name="states"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="button" value="提交"></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$.post("/xial",function(obj){
		for(var i in obj){
			$("#tid").append("<option value='"+obj[i].tid+"'>"+obj[i].tname+"</option>");
		}
	})
	$("input[value='提交']").click(function(){
		$.post("/add",$("form").serialize(),function(obj){
			if(obj){
				alert("添加成功");
				location.href="/list";
			}else{
				alert("添加失败");
			}
		})
	})
</script>
</body>
</html>