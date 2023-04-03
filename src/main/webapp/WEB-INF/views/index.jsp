
<html>
<head>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Datatable plugin CSS file -->
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css" />

<!-- jQuery library file -->
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>

<!-- Datatable plugin JS library file -->
<script type="text/javascript" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
</head>

<title>Welcome Page</title>
<body>
	<a href="back" class="btn btn-primary">BACK</a>

	<a href="search" class="btn btn-primary float-right">SEARCH</a>


	<div class="container mt-6">

		<div class="row">

			<div class="col-md-12">
				<h1 class="text-center mb-3">[ Welcome To Product App ]</h1>


				<table id="tableID" class="table" style="width: 100%">
					<thead class="thead-dark">
						<tr>
						<th scope="col">Product Name</th>
							 <th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Delete</th>
							<th scope="col">Action</th>
							
						</tr>
					</thead>
					
					<tbody>
						<tr>
							<c:forEach items="${Product}" var="p">
								<!--  <td scope="row">${p.id}</td> -->
								<td>${p.name}</td>
								<td>${p.description }</td>
								<td class="font-weight-bold">&#x20B9;${p.price}</td>
								<td><a href="deleteProduct/${p.id}"><i class="fas fa-trash"></i></a>
								<td><a href="editProduct/${p.id}"><i
										class="fa-solid fa-pen-to-square"></i></a></td>
						</tr>

						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
    <script>
					$(document).ready(function() {
						$('#tableID').DataTable({});
					});
				</script>
</body>
</html>