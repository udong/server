<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Login</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<div class="row">
		<div class="col-lg-6">
			<div class="container" id="loginContainer">
				<form class="form" role="form" method="post" action="login"
					accept-charset="UTF-8" id="login-nav">
					<div class="form-group">
						<label class="sr-only" for="exampleInputEmail2">Email
							address</label> <input type="email" class="form-control"
							id="exampleInputEmail2" placeholder="Email address" required>
					</div>
					<div class="form-group">
						<label class="sr-only" for="exampleInputPassword2">Password</label>
						<input type="password" class="form-control"
							id="exampleInputPassword2" placeholder="Password" required>
						<div class="help-block text-right">
							<a href="">비밀번호 찾기</a>
						</div>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">Sign
							in</button>
					</div>
					<div class="checkbox">
						<label> <input type="checkbox"> keep me logged-in
						</label>
					</div>
				</form>
			</div>
		</div>
		<div class="col-lg-6">
			<div class="containerR">
				<div class="neuRegi">
					<button type="submit" id="registrationBtn" class="btn btn-primary btn-block">Registration</button>
					<script type="text/javascript">
						var url="/udong/test/registration";
						document.getElementById("registrationBtn").onclick = function () {
					        location.href = url;
					    };
					</script>
					
					
				</div>
			</div>
		</div>
	</div>

</body>

</html>
