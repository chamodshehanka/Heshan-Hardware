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

        .uk-button-primary{
            background-color: #FFA726;
        }

        .uk-button-primary:hover{
            background-color: #FF9800;
        }
    </style>
</head>
<body>

<header class="header-section">
    <div class="header-container">
        <h1 class="header-banner-text">Heshan Hardware Inventory Management System</h1>

        <div>
            <button class="uk-button uk-button-primary" uk-toggle="target: #modal-signIn">Sign In</button>
            <button class="uk-button uk-button-secondary" uk-toggle="target: #modal-signUp">Sign Up</button>

            <%--   SignIn Modal   --%>
            <div id="modal-signIn" uk-modal>
                <div class="uk-modal-dialog uk-modal-body">
                    <button class="uk-modal-close-default" type="button" uk-close></button>

                    <h2 class="uk-modal-title">Sign In</h2>

                    <form>
                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: user"></span>
                                <input id="txt-username" class="uk-input" type="text" placeholder="Username">
                            </div>
                        </div>

                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: lock"></span>
                                <input id="txt-password" class="uk-input" type="password" placeholder="password">
                            </div>
                        </div>

                        <button id="btn-signIn" class="uk-button uk-button-primary">Sign In</button>
                    </form>

                </div>
            </div>


            <%--   SignUp Modal  --%>
            <div id="modal-signUp" uk-modal>
                <div class="uk-modal-dialog uk-modal-body">
                    <button class="uk-modal-close-default" type="button" uk-close></button>

                    <h2 class="uk-modal-title">Sign Up</h2>

                    <form>

                    </form>
                </div>
            </div>

        </div>
    </div>
</header>



</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit-icons.min.js"></script>
<script src="WEB-INF/assets/js/validationUtil.js" type="text/javascript"></script>
</html>
