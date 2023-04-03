<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
 <div class="container mt-3">
		<div class="row">
			<div class="Col-md-6 offset-md-3">
				<h1 class="text-center mb-3">[Registration Page]</h1>


				<form action="Registration" method="POST">
					<div class="form-group">
						<label for="name">User Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="Enter User name">
					</div>

				
					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							placeholder="Enter password" name="password">
					</div>

					<div class="container text-center">
						
						<button type="submit" class="btn btn-primary">Add</button>  
					</div>


				</form>

			</div>

		</div>
	</div>



</body>
</html>