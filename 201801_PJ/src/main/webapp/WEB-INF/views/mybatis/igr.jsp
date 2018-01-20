<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
	<h1> 재료 정보</h1>
	<hr />
	
	<table class="table table-bordered" >
		<thead>
			<tr> 
				<th>레시피 번호</th> 
				<th> 재료번호</th> 
				<th>재료 이름</th> 
				<th> 양</th> 
				<th> 유형</th> 
			</tr>
		</thead>
		
		<tbody>
		<c:forEach var="ingredient" items="${ingredients}">
			<tr> 
				<td> ${ ingredient.recipe_id} </td>
				<td> ${ ingredient.irdnt_sn } </td>
				<td> ${ ingredient.irdnt_nm } </td>
				<td> ${ ingredient.irdnt_cpcty } </td>
				<td> ${ ingredient.irdnt_ty_nm } </td>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	
	</div>






		<a href="dynamicSQL2" class="btn btn-info" >목록으로 </a>


</body>
</html>
