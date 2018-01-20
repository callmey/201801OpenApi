<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
        rel="stylesheet" media="screen">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="${R}res/common.js"></script>
  <link rel="stylesheet" href="${R}res/common.css">
  
  
  
</head>
<body>
  <div class="container">
	<h1>요리 순서</h1>
	<hr />
	
<div style="border:1px solid gold; float:left;  witdth:300; height:300;">
		
	<table class="table table-bordered" >
		<thead>
			<tr> 
				<th>레시피 번호</th> 
				<th> 요리 순서</th> 
				<th>요리 설명</th> 
				<th> 이미지</th> 
			</tr>
		</thead>
		
		<tbody>
		<c:forEach var="cooking" items="${list}">
			<tr> 
				<td> ${ cooking.recipe_id} </td>
				<td> ${ cooking.cooking_no } </td>
				<td> ${ cooking.cooking_dc } </td>
				<td> <img src=${ cooking.image_url}></td>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	 
  </div>
  
  
  
  
</body>
</html>