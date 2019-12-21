<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>All Products</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/style.css" rel="stylesheet">

  </head>

  <body>    

	<!-- Static navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="welcome">Brand Name</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		  <span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
		  <ul class="navbar-nav">
		    <li class="nav-item active">
		      <a class="nav-link" href="#">Login <span class="sr-only">(current)</span></a>
		    </li>
		    <li class="nav-item">
		      <a class="nav-link" href="registration">Registration</a>
		    </li>
		    <li class="nav-item">
		      <a class="nav-link" href="products">Products</a>
		    </li>
		    <li class="nav-item">
		      <a class="nav-link" href="add-product">Add Products</a>
		    </li>
		  </ul>
		</div>
	</nav>
	
	<!-- Main component for a primary marketing message or call to action -->
	<div class="container">
		
		<h3>Product List</h3>
		<hr/>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Product Name</th>
					<th>Price</th>
					<th>Profite Percentage</th>
					<th>Product Type</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${products}">
					<tr>
						<td>${product.name }</td>
						<td>${product.price }</td>
						<td>${product.profit_percentage }</td>
						<td>${product.product_type }</td>
						<td><a href="/updateproduct?pid=${product.pid}">edit</a></td>
						<td><a href="/delete-product?pid=${product.pid}">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	
	
	
	<!-- Bootstrap core JavaScript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="/js/bootstrap.min.js"></script>
    
  </body>
</html>
