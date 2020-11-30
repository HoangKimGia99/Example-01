<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/libraries/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/libraries/ckfinder/ckfinder.js"></script>
</head>
<body>
<form action="" method="post">
<textarea rows="20"  cols="20" id="editor"></textarea>
<br/>
<input type="submit" name="submit" value="Submit"/>


</form>
<script >
var editor=CKEDITOR.replace("editor");
CKFinder.setupCKEditor(editor,'libraries/ckfinder/')
</script>
</body>
</html>