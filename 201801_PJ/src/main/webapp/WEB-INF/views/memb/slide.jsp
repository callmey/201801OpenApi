<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
	
<!-- <div style="border:1px solid gold; float:left;  witdth:300; height:300;">
		
	<table class="table table-bordered" >
		<thead>
			<tr> 
				<th>레시피 번호</th> 
				<th> 요리 순서</th> 
				<th>요리 설명</th> 
				<th> 이미지</th> 
			</tr>
		</thead>
		
		<tbody> -->
			
  <div id="myCarousel" class="carousel slide" data-ride="carousel" style="width:50% ; margin:50px 0 0 -50px; argin: ">
    <!-- Indicators -->
    <ol class="carousel-indicators">
    <c:forEach var="cooking" items="${list}">
    	<c:set var="cn" value="${cooking.cooking_no}" />
    	<fmt:formatNumber value="${cn}" type="number"/>
    	<c:set var="i" value="0" />
		<c:choose>    	
    	<c:when test="${cn eq 1}">
      	<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      	</c:when>
      	<c:otherwise>
      	<c:set var="i" value="${i+1}" /> 
      	<li data-target="#myCarousel" data-slide-to="i"></li>
      	</c:otherwise>
      </c:choose>
    </c:forEach>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner"> 
    <c:forEach var="cooking" items="${list}">
      <c:choose> 
	      <c:when test="${cooking.cooking_no eq 1}">
	    	  <div class="item active">
	        <img src=${ cooking.image_url } style="width:100%"/>
	      	</div>
	      </c:when> 
	      <c:otherwise>
		      	<div class="item">
		        <img src=${ cooking.image_url } style="width:100%"/>
		      	</div>
	      </c:otherwise>
      </c:choose>
     </c:forEach>
    </div>
	
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </div>

<!--		
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
-->	 
  </div>
  
  
  
  
</body>
</html>