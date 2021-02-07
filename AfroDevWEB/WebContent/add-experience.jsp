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
       Add An Experience
      </h1>
      <p class="lead">
        <i class="fas fa-code-branch"></i> Add any developer/programming
        positions that you have had in the past
      </p>
      <small>* = required field</small>
      <form class="form">
        <div class="form-group">
          <input type="text" placeholder="* Job Title" name="title" required />
        </div>
        <div class="form-group">
          <input type="text" placeholder="* Company" name="company" required />
        </div>
        <div class="form-group">
          <input type="text" placeholder="Location" name="location" />
        </div>
        <div class="form-group">
          <h4>From Date</h4>
          <input type="date" name="from" />
        </div>
         <div class="form-group">
          <p><input type="checkbox" name="current" value="" /> Current Job</p>
        </div>
        <div class="form-group">
          <h4>To Date</h4>
          <input type="date" name="to" />
        </div>
        <div class="form-group">
          <textarea
            name="description"
            cols="30"
            rows="5"
            placeholder="Job Description"
          ></textarea>
        </div>
        <input type="submit" class="btn btn-primary my-1" />
        <a class="btn btn-light my-1" href="dashboard.jsp">Go Back</a>
      </form>
    </section>
  </body>
</html>
