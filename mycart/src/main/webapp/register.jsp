<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New user</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>	
		<div class="container-fluid">
			
	<div class="row mt-5">
		<div class="col-md-4 offset-md-4">
		
			<div class="card"  >
				<div class="card-body px-5">
				<div class="container text-center">
					<img src="img/DSC_6466.JPG" style="max-width:100px" 
					class="img-fluid" alt="">
				</div>
					<h3 class="text-center my-3">Sign up Here !!</h3>
					<form action="RegisterServlet" method="doGet">
						<div class="form-group">
							<label for="name">User Name</label>
							 <input name="user_name" type="text" class="form-control" id="name"
							  placeholder="Enter name ">
						</div>

						<div class="form-group">
							<label for="email">User Email</label> 
							<input name="user_email" type="email" class="form-control" 
							id="email" placeholder="Enter email">
						</div>

						<div class="form-group">
							<label for="password">User Password</label>
							<input name="user_password" type="password" class="form-control" 
							id="password" placeholder="Enter password ">
						</div>

						<div class="form-group">
							<label for="phone">Phone number</label> 
							<input name="user_phone" type="number" class="form-control" 
							id="phone" placeholder="Enter phone number ">
						</div>

						<div class="form-group">
							<label for="address">User Address</label>
							<textarea name="user_address" style="height: 200px;" class="form-control"
							placeholder="Enter your address"></textarea>
						</div>

						<div class="container text-center">
							<button class="btn btn-outline-success">Register</button>
							<button class="btn btn-outline-warning">Reset</button>
						</div>

					</form>

				</div>

			</div>
		</div>

	</div>
	
</div>
</body>
</html>