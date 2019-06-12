<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-1.8.2.min.js"></script>
<link rel="stylesheet" href="/resource/css/css.css">
</head>
<body>

<h1 style="font-size:30px;text-align:center">影片管理列表</h1>
<hr>
<input type="button" value="添加影片">
<input type="button" value="查询影片">
	<table>
		<tr>	
			<td>
				<input type="checkbox" id="qx">全选/全不选
				<input type="checkbox" id="fx">反选
			</td>
			<td>电影编号</td>
			<td>电影名称</td>
			<td>电影导演	</td>
			<td>售票价格</td>
			<td>上映时间</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="m">
			<tr>	
				<td><input type="checkbox" value="${m.mid }" class="a"></td>
				<td>${m.mid }</td>
				<td>${m.mname }</td>
				<td>${m.writer }</td>
				<td>${m.price }</td>
				<td>${m.mdate }</td>
				<td>${m.tname }</td>
				<td>${m.years }</td>
				<td>${m.quyu }</td>
				<td>
					<c:if test="${m.states==1 }">正在上映</c:if>
					<c:if test="${m.states==0 }">已经下架</c:if>
				</td>
				<td>
					<input type="button" value="详情">
					<input type="button" value="编辑">
					<c:if test="${m.states==0 }"><a href="update1?mid=${m.mid }"><input type="button" value="上架"></a></c:if>
					<c:if test="${m.states==1 }"><a href="update2?mid=${m.mid }"><input type="button" value="下架"></a></c:if>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td><input type="button" value="批量删除" id="plsc"></td>
			<td colspan="11">${page }</td>
		</tr>
	</table>
<script type="text/javascript">
	$(function(){
		$("input[value='添加影片']").click(function(){
			location.href="/toAdd";
		})
		
		$("input[value='查询影片']").click(function(){
			location.href="/toChaxun";
		})
		$("#qx").click(function(){
			$(".a").prop("checked",$(this).prop("checked"));
		})
		$("#fx").click(function(){
			$(".a").each(function(){
				$(this).prop("checked",!$(this).prop("checked"));
			})
		})
		$("#plsc").click(function(){
			var mids="";
			$(":checkbox:checked.a").each(function(){
				mids+=","+$(this).val();
			})
			mids=mids.substring(1);
			if(mids==""){
				alert("请选择你要删除的元素");
			}else{
				if(confirm("你确定要删除"+mids+"的元素吗?")){
					$.post("/del",{mids:mids},function(obj){
						if(obj){
							alert("删除成功");
							location.reload();
						}else{
							alert("删除失败");
							location.reloac();
						}
					})
				}
			}
		})
	})
</script>
</body>
</html>