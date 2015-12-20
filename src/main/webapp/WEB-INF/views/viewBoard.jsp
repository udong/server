<%@page import="com.warmcompany.udong.club.model.ClubInfo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/viewBoard.css"
	rel="stylesheet">

<%@include file="navHead.jsp"%>
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
															$("#boardList")
																	.append(
																			);
														});
										$("#boardList")
												.append(
														);

									},
									complete : function(resultMap) {
										// 통신이 실패했어도 완료가 되었을 때 이 함수를 타게 된다.
										// TODO
									},
									error : function(xhr, status, error) {
										alert("Error!");
									}
								});
					})
</script>
<title>title</title>
</head>
<body>
	<!-- Navigation -->
	<div class="container">
		<div class="leftnav">
			<div class="thumbnail">
				<img src=" " alt="..." class=img-rounded>
			</div>
			
			<div class="notice">
				<div class="list-group">
					<a href="#" class="list-group-item active"> 공지사항 </a> 
					<a href="#" class="list-group-item">자유게시판</a> 
					<a href="#" class="list-group-item">앨범</a>
					<a href="#" class="list-group-item">기타</a>
					<a href="#" class="list-group-item">등등</a>
				</div>
			</div>
			
		</div>

		<div class="content">
			<div class="table-responsive">
  				<table class="table table-hover">
  					<thead>
  						<tr>
  							<th>Number</th>
  							<th>ID</th>
  							<th>Content</th>
  							<th>Date</th>
  							<th>Alamat</th>
  							<th>Aksi</th>
  						</tr>
  					</thead>	
  					<tbody>
  						<tr>
  							<td>00000220</td>
  							<td>N</td>
  							<td>ABCDEFGGGGGGGGGGGG</td>
  							<td>XXXX</td>
  							<td></td>
  							<td>
  								<a href=""><span class="glyphicon glyphicon-edit"></span></a>
  								<a href=""><span class="glyphicon glyphicon-edit"></span></a>
  							</td>
  						</tr>
  					</tbody>
    				
 				</table>
			</div>
			<br/>
			<nav>
			<ul class="pagination">
				<li><a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span></a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
			</ul>
			</nav>
		</div>

		<div class="rightnav">right</div>


	</div>
</body>
</html>