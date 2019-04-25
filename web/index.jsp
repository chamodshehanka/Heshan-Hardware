<%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 4/13/2019
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Heshan Hardware | Inventory Management</title>

    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/css/uikit.min.css" />
    <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">

    <style>

        .header-section{
            width: 100%;
            height: 90vh;
            background-image: url("https://www.vikingmergers.com/wp-content/uploads/2016/09/Hardware-Supplies.jpg");
            background-repeat: no-repeat;
            -webkit-background-size: 100%;
            -moz-background-size: 100%;
            background-size: 100%;
            /*opacity: 0.75;*/
        }

        .header-container{
            margin: auto;
            width: 65%;
            padding: 100px 10px 10px;
        }

        .header-banner-text {
            color: whitesmoke;
            font-family: 'Ubuntu', sans-serif;
            font-size: 72px;
            font-weight: bold;
            text-shadow: 2px 2px 4px black;
        }

        .login-section {
            width: 600px;
            height: 600px;
            background-color: #FFA726;
        }

        .uk-button-primary{
            background-color: #FFA726;
        }
    </style>
</head>
<body>

<header class="header-section">
    <div class="header-container">
        <h1 class="header-banner-text">Heshan Hardware Inventory Management System</h1>

        <div>
            <button class="uk-button uk-button-primary">Sign In</button>
            <button class="uk-button uk-button-secondary">Sign Up</button>
        </div>
    </div>
</header>

<section class="login-section">
    <form>
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                   placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <button type="submit" class="btn btn-warning">Submit</button>
    </form>
</section>

</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit-icons.min.js"></script>
</html>
