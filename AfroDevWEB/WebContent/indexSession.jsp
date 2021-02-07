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
    <jsp:include page="HeaderSession.jsp"></jsp:include>
    <section class="landing">
      <div class="dark-overlay">
        <div class="landing-inner">
          <h1 class="x-large">Dévelopeur SénoAfricaine</h1>
          <p class="lead">
            Create a developer profile/portfolio, share posts and get help from
            other developers
          </p>
          <div class="buttons">
            <a href="register.jsp" class="btn btn-primary">Sign Up</a>
            <a href="login.jsp" class="btn btn-light">Login</a>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
