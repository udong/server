<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.warmcompany.udong.club.model.ClubInfo"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Main Page</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/shop-item.css"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						var clublist = [];
						jQuery
								.ajax({
									url : "http://localhost:8080/udong/club/list",
									type : "GET",
									success : function(resultMap) {
										// TODO

										clublist = resultMap.clubList;
										$
												.each(
														clublist,
														function(index, value) {
															console
																	.log(index
																			+ " : "
																			+ value.leader);
															$("#listThumb")
																	.append(
																			'<div class="col-sm-6 col-md-4"><div class="thumbnail"><img src="' + value.logoUrl + '" alt= "..." class=img-rounded>'
																					+ '<div class= "tagName>'
																					+ '<span class="label label-default">'
																					+ value.region
																					+ '</span>'
																					+ '</div>'
																					+ '<div class="caption">'
																					+ '<h3>'
																					+ value.leader
																					+ '</h3>'
																					+ '</div></div></div>');
														});
										$("#listThumb")
												.append(
														'<div class="col-sm-6 col-md-4"><div class="thumbnail"><img src="'  + '" alt= "..." class=img-rounded>'
																+ '<div class="caption">'
																+ '<h3>'
																+ "추가"
																+ '</h3>'
																+ '</div></div></div>');

									},
									complete : function(resultMap) {
										// 통신이 실패했어도 완료가 되었을 때 이 함수를 타게 된다.
										// TODO
									},
									error : function(xhr, status, error) {
										alert("Error!");
									}
								});
					});
</script>

<%@include file="navHead.jsp"%>

</head>

<body>
	<!-- Navigation -->

	<!-- Page Content -->
	<ul class="nav nav-pills" id="topNav">
		<li role="presentation" class="active"><a href="#">Home</a></li>
		<li role="presentation"><a href="#">Profile</a></li>
		<li role="presentation"><a href="#">Messages</a></li>
		<script type="text/javascript">
			$("#presentation").onclick(function(){
				
			})
		</script>
	</ul>
	</nav>
	<div class="container">
		<div class="row" id="listThumb"></div>
	</div>
	<!-- /.container -->


	<div class="container">
		<hr>

		<!-- Footer -->
		<footer>
		<div class="row">
			<div class="col-lg-12">
				<p>Copyright &copy; UDong</p>
			</div>
		</div>
		</footer>
	</div>
	<!-- /.container -->


	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>

</html>
