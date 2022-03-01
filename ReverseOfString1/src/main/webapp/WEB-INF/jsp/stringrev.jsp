<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>ReverseOfString</title>
<meta charset= "utf-8">
 <script>
String.prototype.reverse=function(){
 return this.split("").reverse().join("");
 }
 </script>
</head>
<body>
<h1>Reverse of String-Assignment1</h1>
 <p>
 <label for="string1">Input the String</label>
 <input type = "text" id = "string1" size = "100">
 </p>
 <p id = "textele">Reverse of String is</p>
 <input type = "button" id = "reverse1" value = "Reverse"
  onclick="document.getElementById('textele').innerHTML = document.getElementById('string1').value.reverse();">
</body>
</html>


