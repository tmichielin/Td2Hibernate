<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>commande</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
</head>
<body>
<form method="post">
  
  
  <div class="mb-3 form-check">
   <label for="exampleInputPassword1" class="form-label">utilisateur</label>
    <input type="text" name="idU" class="form-control" id="exampleCheck1">
  </div>
  
  <div class="mb-3 form-check">
   <label for="exampleInputPassword1" class="form-label">Date commande (AAA-MM-JJ)</label>
    <input type="text" name="date" class="form-control" id="exampleCheck1">
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
  <button type="reset" class="btn btn-primary">Annuler</button>
</form>
</body>
</html>