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

<h1 style="font-size:30px;text-align:center">影片查询</h1>
<hr>
<table>
	<tr>
		<td>影片名称:<input type="text" name="mname" id="mname"></td>
		<td>
			上映时间:<input type="text" name="sydate" id="sydate" onclick="WdatePicker()" placeholder="上映时间" > 至 
			<input type="text" name="jsdate" id="jsdate" onclick="WdatePicker()" placeholder="结束时间">
		</td>
	</tr>
	<tr>
		<td>导演名称:<input type="text" name="writer" id="writer"></td>
		<td>
			价格:<input type="text" name="minprice" id="minprice"  placeholder="最低价">--
			<input type="text" name="maxprice" id="maxprice"  placeholder="最高价">
		</td>
	</tr>
		<tr>
		<td>电影年代:<input type="text" name="years" id="years"></td>
		<td>
			电影时长:<input type="text" name="mindate"  placeholder="最短时长">--
			<input type="text" name="maxdate"  placeholder="最长时长">
		</td>
	</tr>
	<tr>
		<td colspan="11"><input type="button" value="查询影片"><input type="reset" value="重置查询"></td>
	</tr>
</table>
	
<script type="text/javascript">
	$("input[value='查询影片']").click(function(){
		var mname=$("#mname").val();
		var writer=$("#writer").val();
		var years=$("#years").val();
		var sydate=$("#sydate").val();
		var jsdate=$("#jsdate").val();
		var minprice=$("#minprice").val();
		var maxprice=$("#maxprice").val();
		location.href="/list?mname="+mname+"&writer="+writer+"&years="+years+"&sydate="+sydate+"&jsdate="+jsdate+"&minprice="+minprice+"&maxprice="+maxprice;
	})
	</script>
</body>
</html>