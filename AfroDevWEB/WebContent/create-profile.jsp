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
    <section class="container">
      <h1 class="large text-primary">
        Create Your Profile
      </h1>
      <p class="lead"> <i class="fas fa-user"></i> Obtenons quelques informations pour faire ressortir votre profil </p>
      <small><h5>*</h5> = champ obligatoire</small>
      <form class="form" method="post" action="TraitementProfile" >
        <div class="form-group">
          <select name="status">
            <option value="0">* Select Professional Status</option>
            <option value="Developer">Developer</option>
            <option value="Junior Developer">Junior Developer</option>
            <option value="Senior Developer">Senior Developer</option>
            <option value="Manager">Manager</option>
            <option value="Student or Learning">Student or Learning</option>
            <option value="Instructor">Instructor or Teacher</option>
            <option value="Intern">Intern</option>
            <option value="Other">Other</option>
          </select>
          <small class="form-text"
            >Donnez-nous une idée de votre situation dans votre carrière</small
          >
        </div>
        <div class="form-group">
          <input type="text" placeholder="Company" name="company" />
          <small class="form-text">Peut-être votre propre entreprise ou celle pour laquelle vous travaillez</small>
        </div>
        <div class="form-group">
          <input type="text" placeholder="Website" name="website" />
          <small class="form-text">Il peut s'agir du vôtre ou du site Web d'une entreprise</small>
        </div>
        <div class="form-group">
          <input type="text" placeholder="Location" name="location" />
          <small class="form-text">Ville et état suggérés (par exemple, Dakar)</small>
        </div>
        <div class="form-group">
          <input type="text" placeholder="* Skills" name="skills" />
          <small class="form-text">Veuillez utiliser des valeurs séparées par des virgules (par exemple, HTML, CSS, JavaScript, PHP)</small>
        </div>
        <div class="form-group">
          <input type="text" placeholder="Github Username" name="githubusername"/>
          <small class="form-text">Si vous voulez vos derniers dépôts et un lien Github, incluez votre nom d'utilisateur</small>
        </div>
        <div class="form-group">
          <textarea placeholder="A short bio of yourself" name="bio"></textarea>
          <small class="form-text">Parle-nous un peu de toi</small>
        </div>

        <div class="my-2">
          <button type="button" class="btn btn-light">
            Ajouter des liens de réseau social
          </button>
          <span>Optionnel</span>
        </div>

        <div class="form-group social-input">
          <i class="fab fa-twitter fa-2x"></i>
          <input type="text" placeholder="Twitter URL" name="twitter" />
        </div>

        <div class="form-group social-input">
          <i class="fab fa-facebook fa-2x"></i>
          <input type="text" placeholder="Facebook URL" name="facebook" />
        </div>

        <div class="form-group social-input">
          <i class="fab fa-youtube fa-2x"></i>
          <input type="text" placeholder="YouTube URL" name="youtube" />
        </div>

        <div class="form-group social-input">
          <i class="fab fa-linkedin fa-2x"></i>
          <input type="text" placeholder="Linkedin URL" name="linkedin" />
        </div>

        <div class="form-group social-input">
          <i class="fab fa-instagram fa-2x"></i>
          <input type="text" placeholder="Instagram URL" name="instagram" />
        </div>
        <input type="submit" class="btn btn-primary my-1" />
        <a class="btn btn-light my-1" href="registre.jsp">Go Back</a>
      </form>
    </section>
  </body>
</html>
