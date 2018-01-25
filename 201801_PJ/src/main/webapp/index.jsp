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
  <link rel="stylesheet" href="${R}res/bootstrap.css">
  <link rel="stylesheet" href="${R}res/recipe.css">
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only"></span> 
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">요리레시피</a>		
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.jsp">소개<span class="sr-only"></span></a></li>
					<li calss="dropdown">
						<a href="mybatis/dynamicSQL2" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">레시피<span class="caret">
						</span></a>
						<ul class="dropdown-menu">
							<li><a href="mybatis/dynamicSQL2?theme">테마</a></li>
							<li><a href="mybatis/dynamicSQL2?ingredient">재료</a></li>
						</ul>
					</li>
					<li><a href="mybatis/community.jsp">커뮤니티</a></li>
				</ul>
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="내용을 입력하세요.">
					</div>
					<button type="submit" class="btn btn-default">검색</button>				
				</form>
				<ul class="nav navbar-nav navbar-right">
 					<li class="dropdown">
						<a href="#" class="dropdown" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">접속하기<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="mybatis/login.jsp">로그인</a></li>
							<li><a href="mybatis/register.jsp">회원가입</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="jumbotron">
			<h1 class="text-center">요리 레시피를 소개합니다.</h1>
			<p class="text-center">요리 레시피를 소개합니다. 요리를 해봅시다</p>
			<p class="text-center"><a class="btn btn-primary btn-lg" href="#" role="button">레시피결정하기</a></p>
		</div>
		<div class="row">
			<div class="col-md-4">
				<h4>요리 레시피 커뮤니티</h4>
				<p>요리 레시피 커뮤니티는 자신이 레시피를 통해 만든 요리를 공유하는 카테고리입니다</p>
				<p><a class="btn btn-default" data-target="#modal" data-toggle="modal">자세히 알아보기</a></p>
			</div>
			<div class="col-md-4">
				<h4>요리 레시피 커뮤니티</h4>
				<p>요리 레시피 커뮤니티는 자신이 레시피를 통해 만든 요리를 공유하는 카테고리입니다</p>
				<p><a class="btn btn-default" href="#">자세히 알아보기</a></p>
			</div>
			<div class="col-md-4">
				<h4>요리 레시피 커뮤니티</h4>
				<p>요리 레시피 커뮤니티는 자신이 레시피를 통해 만든 요리를 공유하는 카테고리입니다</p>
				<p><a class="btn btn-default" href="#">자세히 알아보기</a></p>
			</div>
		</div>
		<hr>
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title"><span class="glyphicon-pencil"></span>
				&nbsp;&nbsp;최신 레시피 목록</h3>
			</div>
			<div class="panel-body">
				<div class="media">
					<div class="media-left">
						<a href="#"><img class="media-object" src="images/.jpg" alt="이미지"></a>
					</div>
					<div class="media-body">
						<h4 class="media-heading"><a href="">레시피(테마)</a>&nbsp;<span class="badge">New</span></h4>테마별 레시피가 추가되었습니다.
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer style="background-color: #FFAA28; color: #ffffff">
		<div class="container">
			<br>
			<div class="row">
				<div class="col-sm-2" style="text-align: center;"><h5>Copyright &copy; 2018</h5><h5>양다연(Yang Dayeon)</h5>
				<h5>전민선(Jeon Minseon)</h5>
				</div>
				<div class="col-sm-6"><h4>대표자 소개</h4><p>저희는 성공회대학교에서 공부를 하고 있으며, 요리 레시피 웹사이트를 만들어 웹 개발 공부를 하고 있습니다.</p></div>
				<div class="col-sm-2"><h4 style="text-align: center;">네비게이션</h4>
					<div class="list-group">
						<a href="#" class="list-group-item">소개</a>
						<a href="#" class="list-group-item">레시피</a>
						<a href="#" class="list-group-item">커뮤니티</a>
					</div>
				</div>
				<div class="col-sm-2"><h4 style="text-align: center;"><span class="glyphicon glyphicon-ok"></span>&nbsp;by 양다연</h4></div><h4 style="text-align: center;"><span class="glyphicon glyphicon-ok"></span>&nbsp;by 전민선</h4></div>
			</div>
		</div>
	</footer>
	<div class="row">
		<div class="modal" id="modal" tabindex="-1">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						요리 레시피 커뮤니티
						<button class="close" data-dismiss="modal">&times;</button>
					</div>
					<div class="modal-body" style="text-align: center;">
						자신이 만든 요리를 사람들과 공유해보세요. <br>
						<img src="images/레시피.jpg" id="imagepriview" style="width: 256p; height: 256px;">
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>