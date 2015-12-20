<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet">
<title>Registration</title>
</head>
<body>
	<form class="form-horizontal" action='' method="POST">

		<div id="legend">
			<legend class="">Register</legend>
		</div>

		<div class="control-group">
			<!-- E-mail -->
			<label class="control-label" for="email">E-mail</label>
			<div class="controls">
				<input type="text" id="email" name="email" placeholder="e-mail"
					class="input-xlarge">
				<p class="help-block">Please provide your E-mail</p>
			</div>
		</div>

		<div class="control-group">
			<!-- Password-->
			<label class="control-label" for="password">Password</label>
			<div class="controls">
				<input type="password" id="password" name="password"
					placeholder="password" class="input-xlarge">
				<p class="help-block">Password should be at least 4 characters</p>
			</div>
		</div>

		<div class="control-group">
			<!-- Password -->
			<label class="control-label" for="password_confirm">Password
				(Confirm)</label>
			<div class="controls">
				<input type="password" id="password_confirm" name="password_confirm"
					placeholder="password" class="input-xlarge">
				<p class="help-block">Please confirm password</p>
			</div>
		</div>

		<div class="control-group">
			<!-- Username -->
			<label class="control-label" for="nickname">닉네임</label>
			<div class="controls">
				<input type="text" id="nickname" name="nickname"
					placeholder="nickname" class="input-xlarge">
				<p class="help-block">Username can contain any letters or
					numbers, without spaces</p>
			</div>
		</div>

		<div class="control-group">
			<!-- Username -->
			<label class="control-label" for="dateofbirth">생년월일</label>
			<div class="controls">
				<input type="text" id="dateofbirth" name="dateofbirth"
					placeholder="Date of Birth" class="input-xlarge">
				<p class="help-block">nickname can contain any letters or
					numbers, without spaces</p>
			</div>
		</div>

		<div class="control-group">
			<!-- Username -->
			<label class="control-label" for="sex">성별</label>
			<div class="controls">
					<label> <input type="checkbox" id="male"> Male
						</label>
						<label> <input type="checkbox" id="female"> Female
						</label>
				<p class="help-block">Username can contain any letters or
					numbers, without spaces</p>
			</div>
		</div>

		<div class="control-group">
			<!-- Button -->
			<div class="controls">
				<button class="btn btn-success">Register</button>
			</div>
		</div>



	</form>
</body>
</html>