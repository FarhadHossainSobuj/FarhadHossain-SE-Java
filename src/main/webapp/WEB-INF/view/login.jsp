<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Welcome</title>

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
		      <a class="nav-link" href="#">Registration</a>
		    </li>		    
		    <li class="nav-item">
		      <a class="nav-link" href="about">About</a>
		    </li>
		  </ul>
		</div>
	</nav>
	
	<!-- Main component for a primary marketing message or call to action -->
	<div class="container">
		<div class="jumbotron">
			<h2>Login to visit the site</h2>
			<div class="login-form-1">
		<form id="login-form" class="text-left" method="post" action="validate">
			<div class="login-form-main-message"></div>
			<input type="hidden" name="id" value="${user.id }">
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="lg_username" class="sr-only">Username</label>
						<input type="text" class="form-control" id="lg_username" name="lg_username" placeholder="username" required="required">
					</div>
					<div class="form-group">
						<label for="lg_password" class="sr-only">Password</label>
						<input type="password" class="form-control" id="lg_password" name="lg_password" placeholder="password" required="required">
					</div>
				</div>
				<button type="submit" class="login-button btn-primary">Login</button>
			</div>
			<div class="etc-login-form">
				<br>
				<p>new user? <a href="registration">create new account</a></p>
			</div>
		</form>
	</div>
		</div>
		
	</div>
	
	
	
	
	<!-- Bootstrap core JavaScript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
	<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="/js/bootstrap.min.js"></script>
    
  </body>
</html>
