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
      <a href="posts.jsp" class="btn">Back To Posts</a>
      <div class="post bg-white p-1 my-1">
        <div>
          <a href="profileSession.jsp">
            <img
              class="round-img"
              src="https://www.gravatar.com/avatar/205e460b479e2e5b48aec07710c08d50?s=200"
              alt=""
            />
            <h4>John Doe</h4>
          </a>
        </div>
        <div>
          <p class="my-1">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Sint
            possimus corporis sunt necessitatibus! Minus nesciunt soluta
            suscipit nobis. Amet accusamus distinctio cupiditate blanditiis
            dolor? Illo perferendis eveniet cum cupiditate aliquam?
          </p>
        </div>
      </div>

      <div class="post-form">
        <div class="bg-primary p">
          <h3>Leave A Comment</h3>
        </div>
        <form class="form my-1">
          <textarea
            name="text"
            cols="30"
            rows="5"
            placeholder="Comment on this post"
            required
          ></textarea>
          <input type="submit" class="btn btn-dark my-1" value="Submit" />
        </form>
      </div>

      <div class="comments">
        <div class="post bg-white p-1 my-1">
          <div>
            <a href="profileSession.jsp">
              <img
                class="round-img"
                src="https://www.gravatar.com/avatar/205e460b479e2e5b48aec07710c08d50?s=200"
                alt=""
              />
              <h4>John Doe</h4>
            </a>
          </div>
          <div>
            <p class="my-1">
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Sint
              possimus corporis sunt necessitatibus! Minus nesciunt soluta
              suscipit nobis. Amet accusamus distinctio cupiditate blanditiis
              dolor? Illo perferendis eveniet cum cupiditate aliquam?
            </p>
             <p class="post-date">
                Posted on 04/16/2019
            </p>
          </div>
        </div>

        <div class="post bg-white p-1 my-1">
          <div>
            <a href="profileSession.jsp">
              <img
                class="round-img"
                src="https://www.gravatar.com/avatar/205e460b479e2e5b48aec07710c08d50?s=200"
                alt=""
              />
              <h4>John Doe</h4>
            </a>
          </div>
          <div>
            <p class="my-1">
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Sint
              possimus corporis sunt necessitatibus! Minus nesciunt soluta
              suscipit nobis. Amet accusamus distinctio cupiditate blanditiis
              dolor? Illo perferendis eveniet cum cupiditate aliquam?
            </p>
             <p class="post-date">
                Posted on 04/16/2019
            </p>
             <button      
            type="button"
            class="btn btn-danger"
          >
            <i class="fas fa-times"></i>
          </button>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
