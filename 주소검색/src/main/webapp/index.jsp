<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<form method="post" action="join" name="frm">
		<input type="button" value="주소검색" class="btn btn-success"  onclick="goPopup()"><br><br>
		주소 : <input type="text" name="addr" size="100" id="address">
	</form>
	
<script language="javascript">
function goPopup(){
	var pop = window.open("jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
}
function jusoCallBack(roadFullAddr){
		document.frm.address.value = roadFullAddr;
}
</script>

</body>
</html>