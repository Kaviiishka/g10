<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method = "post"   action = "getDoctorservlet">
  <label for="Name">Name:</label><br>
  <input type="text" id="nme" name="nme"><br>
  <label for="UserName">UserName:</label><br>
  <input type="text" id="unme" name="unme"><br>
  <label for="Work">Work:</label><br>
  <input type="text" id="wrk" name="wrk">
  <label for="Specialization">Specialization:</label><br>
  <input type="text" id="spcl" name="spcl"><br>
  <label for="Experiance">Experiance:</label><br>
  <input type="exp" id="lname" name="exp">
  <label for="email">Email:</label><br>
  <input type="eml" id="mail" name="email">
  
  <input type = "submit" value = "submit">
  
</form>
</body>
</html>