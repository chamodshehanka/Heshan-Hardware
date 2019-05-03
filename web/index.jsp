<%@ page import="com.chamodshehanka.heshanhardware.service.custom.UserService" %>
<%@ page import="com.chamodshehanka.heshanhardware.service.custom.impl.UserServiceImpl" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chamodshehanka.heshanhardware.model.User" %>
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
    <link rel="stylesheet" type="text/css" href="assets/css/styles.css">

    <style>

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

<div>
    <%
        UserService userService = new UserServiceImpl();
        ArrayList<User> userArrayList = userService.getAll();

        for (User user: userArrayList) {
            out.println("<h5>" + user.getUserName() + "</h5>");
        }
    %>

    <%--<%
        Date date = new Date();
        out.print("<h2>" + date.toString() + "</h2>");
    %>--%>
</div>

</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit-icons.min.js"></script>
<script src="assets/js/validationUtil.js" type="text/javascript"></script>
</html>
