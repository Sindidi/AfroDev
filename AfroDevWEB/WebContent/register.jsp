<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"/>
    <link rel="stylesheet" href="css/style.css" />
    <title>Bienvenu Dans AfroDev</title>
  </head>
  <body>
    <jsp:include page="header.jsp"></jsp:include>
    <section class="container">
      <h1 class="large text-primary">S'inscrire</h1>
      <p class="lead"><i class="fas fa-user"></i> Créez votre compte</p>
      <form class="form" method="post" action="TraitementRegistre" >
        <div class="form-group">
          <input type="text" placeholder="Prénom" name="pnom" required />
          <input type="text" placeholder="Nom" name="nom" required />
        </div>
        <div class="form-group">
          <input type="text" placeholder="Nom d'utilisateur" name="username" />
          <input type="email" placeholder="Email Address" name="email" />
          <small class="form-text">Ce site utilise Gravatar donc si vous voulez une image de profil, utilisez un email Gravatar</small>
          <input type="file" placeholder="Photo Profile" name="photo" />
        </div>
        <div class="form-group">
          <input type="password" placeholder="Mot de passe" name="password" minLength="6"/>
          <input type="password" placeholder="Confirmez le mot de passe" name="password2"  minLength="6"/>
        </div>
        <input type="submit" class="btn btn-primary" value="Register" />
      </form>
      <p class="my-1">
        Already have an account? <a href="login.jsp">Sign In</a>
      </p>
    </section>
  </body>
</html>
