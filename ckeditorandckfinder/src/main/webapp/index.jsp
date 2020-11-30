<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://cksource.com/ckfinder" prefix = "ckfinder"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type = "text/javascript" src="resources/ckeditor/ckeditor.js"></script>
<script type = "text/javascript" src="resources/ckfinder/ckfinder.js"></script>
</head>
<body>
	<form method="post">
		<textarea rows=3 cols= 3 id="discription" name="discription"></textarea>
			<script>
			var ckeditor = CKEDITOR.replace('discription',
			{
				filebrowserBrowseUrl : 'resources/ckfinder/ckfinder.html',
				filebrowserImageBrowseUrl : 'resources/ckfinder/ckfinder.html?type=Images',
				filebrowserFlashBrowseUrl : 'resources/ckfinder/ckfinder.html?type=Flash',
				filebrowserUploadUrl : 'resources/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files',
				filebrowserImageUploadUrl : 'resources/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images',
				filebrowserFlashUploadUrl : 'resources/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash',
				filebrowserWindowWidth: '1000' ,
			 	filebrowserWindowHeight: '700' 
			});
			CKFinder.setupCKEditor(ckeditor,'resources/ckfinder/')
			
	</script>
		<input type = "submit" name = "submit" value="Luu" />
	</form>
	<p>****************</p>
	<p>${ck.discription }</p>
	<img src="<%=request.getContextPath()%>/tomcat.png"/>
	
</body>
</html>