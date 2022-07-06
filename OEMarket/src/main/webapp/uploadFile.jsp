<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오이마켓</title>
<style type="text/css">
ul li {
	display: inline-block;
	margin-left: 15px;
}
</style>
</head>
<body>

	<div style="text-align: center;">상품 등록</div>
	<form action="uploadFile.do" name="uploadForm" method="post" enctype="multipart/form-data">
		<input type="hidden" name="id" value="123">
		<input type="hidden" name="pass" value="123">
		<input type="hidden" name="name" value="수정">
		<table style="padding: 10px; margin: 0 auto;">
			<tr>
				<th style="text-align: center;">제목</th>
				<td><input type="text" name="title" style="width: 100%;"></td>
			</tr>
			<tr>
				<th style="text-align: center;">가격</th>
				<td><input type="text" name="price" style="width: 100%;"></td>
			</tr>
			<tr>
				<th style="text-align: center;">내용</th>
				<td><textarea cols="50" rows="20" name="content"></textarea></td>
			</tr>
			<tr>
				<th style="text-align: center;">파일</th>
				<td>
				<input type="file" name="imgFile" style="width: 100%;" name="pictureurl">
				</td>
			</tr>
			<!-- <tr>
				<th style="text-align: center;">비밀번호</th>
				<td><input type="text" name="pass" style="width: 100%;"></td>
			</tr> -->
			<tr>
				<td colspan="2" style="text-align: center;">
				<input type="submit" value="등록" onclick="location.href='index.jsp'"> 
				<input type="reset" value="취소"> 
				<input type="button" value="목록" onclick="location.href='#'">
				</td>
			</tr>
			
		</table>
	</form>



</body>
</html>