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
	<h1>Basic SQL</h1>
	<hr />
	
	<form:form method ="get" modelAttribute="pagination">
	<form:hidden path="pg" value ="1"/>
	<span>순서</span>
	<form:select path="ob" class="form-control autosubmit"
			itemValue="value" itemLabel="label" items="${orderBy}" />
	<span>검색내용</span>
	<form:select path="sb" class="form-control ml30"
			itemValue="value" itemLabel="label" items="${searchBy}" />
	<form:input path="st" class="form-control" placeholder="검색문자열"/>
	<button type="submit" class="btn btn-defaultW">
		<i class= "glyphicon goyphicon-search"></i>검색</button>				
	<c:if test="${pagination.sb> 0 || pagination.ob>0 }">
		<a class="btn btn-default" href="list?pg=1">
		<i class="glyphicon glyphicon-ban-circle"></i>검색취소</a>
	</c:if>
	<form:select path="sz" class="form-control autosubmit">
		<form:option value="10"/> <form:option value="15"/> <form:option value="30"/>
		
	</form:select>
	</form:form>
	
	<div style="border:1px solid gold; float:left;  witdth:300; height:300;">
		
 	<c:forEach var="basic" items="${ list }">
	   
	   <table  class="table table-bordered" >
	      <tr><th>id</th><td>${ basic.recipe_id }</td></tr>
          <tr><th>음식 이름</th> <td>${ basic.recipe_nm_ko }</td></tr>
          <tr><th>요약</th> <td>${ basic.sumry }</td></tr>
          <tr><th>유형분류</th><td>${ basic.nation_nm }</td></tr>
          <tr><th>음식분류</th> <td>${ basic.ty_nm }</td></tr>
          <tr><th>칼로리</th> <td>${ basic.calorie }</td></tr>
          <tr><th>이미지</th><td><img src=${ basic.img_url}></td></tr>
          <tr><th>상세페이지</th><td><a href = ${ basic.det_url }>연결</a></td></tr>
  	 
	</table>
 
	</c:forEach>
	<my:pagination pageSize="${pagination.sz}" recordCount="${pagination.recordCount}" />
	 
	</div>
	 
  </div>
</body>
</html>