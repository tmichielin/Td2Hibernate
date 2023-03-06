<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
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
<body>
<form method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Login</label>
    <input type="text" name="login" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
   
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" name="mdp" class="form-control" id="exampleInputPassword1">
  </div>
  <div class="mb-3 form-check">
   <label for="exampleInputPassword1" class="form-label">adresse</label>
    <input type="text" name="adresse" class="form-control" id="exampleCheck1">
    
  </div>
  
  <div class="mb-3 form-check">
   <label for="exampleInputPassword1" class="form-label">cp</label>
    <input type="number" name="cp" class="form-control" id="exampleCheck1">

  </div>
  
  <div class="mb-3 form-check">
   <label for="exampleInputPassword1" class="form-label">ville</label>
    <input type="text" name="ville" class="form-control" id="exampleCheck1">

  </div>
  
  <div class="mb-3 form-check">
   <label for="exampleInputPassword1" class="form-label">tel</label>
    <input type="text" name="tel" pattern="[0-9]{10}" name="adresse" class="form-control" id="exampleCheck1">

  </div>
  
   <div class="mb-3 form-check">
   <label for="exampleInputPassword1" class="form-label">email</label>
    <input type="email" name="mail" name="adresse" class="form-control" id="exampleCheck1">

  </div>
  
  <input type="radio" class="btn-check" name="formule" id="option1" autocomplete="off" checked>
<label class="btn btn-secondary" for="option1">Classique</label>

<input type="radio" class="btn-check" name="formule" id="option2" autocomplete="off">
<label class="btn btn-secondary" for="option2">Abonné</label>


<input type="radio" class="btn-check" name="options" id="option3" autocomplete="off">
<label class="btn btn-secondary" for="option2"></label>Vip</label>


  
  
  <button type="submit" class="btn btn-primary">Submit</button>
  <button type="reset" class="btn btn-primary">Annuler</button>
</form>
</body>
</html>