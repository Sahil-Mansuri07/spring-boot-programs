<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Upload a File</h1>
    <form method="post" enctype="multipart/form-data" action="/myFiles/upload">
       <pre>
        <input type="file" name="file" required />
       
        <button type="submit">Upload</button>
    </pre>
    </form>
</body>
</html>