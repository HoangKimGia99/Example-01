<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html> 
<head>
 <title>Image File Upload</title>
  </head> 
  <body>
   <h1>File Upload Example</h1>
    <form:form method="post" action="savefile" enctype="multipart/form-data">
     <p><label for="image">Choose Image</Label></p> 
     <p><input name="file" id="fileToUpload" type="file" /></p>
      <p><input type="submit" value="Upload"></p>
       </form:form>
        </body> 
        </html>