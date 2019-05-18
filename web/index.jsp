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

    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/uikit.min.css" />
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

                    <form action="${pageContext.request.contextPath}/login" method="post">
                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: user"></span>
                                <input id="txt-username" class="uk-input" type="text" placeholder="Username" name="username">
                            </div>
                        </div>

                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: lock"></span>
                                <input id="txt-password" class="uk-input" type="password" placeholder="password" name="password">
                            </div>
                        </div>

                        <button id="btn-signIn" class="uk-button uk-button-primary" type="submit">Sign In</button>
                    </form>

                </div>
            </div>


            <%--   SignUp Modal  --%>
            <div id="modal-signUp" uk-modal>
                <div class="uk-modal-dialog uk-modal-body">
                    <button class="uk-modal-close-default" type="button" uk-close></button>

                    <h2 class="uk-modal-title">Sign Up</h2>

                    <form action="${pageContext.request.contextPath}/signUp" method="post">

                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: mail"></span>
                                <input id="txt-email-reg" class="uk-input" type="text" placeholder="Email" name="email">
                            </div>
                        </div>

                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: user"></span>
                                <input id="txt-username-reg" class="uk-input" type="text" placeholder="Username" name="username">
                            </div>
                        </div>

                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: lock"></span>
                                <input id="txt-password-reg" class="uk-input" type="password" placeholder="Password" name="password">
                            </div>
                        </div>

                        <div class="uk-margin">
                            <div class="uk-inline">
                                <span class="uk-form-icon" uk-icon="icon: unlock"></span>
                                <input id="txt-password-confirm-reg" class="uk-input" type="password" placeholder="Confirm Password">
                            </div>
                        </div>

                        <button id="btn-signUp" class="uk-button uk-button-primary" type="submit">Sign Up</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
</header>


<jsp:include page="views/footer.jsp"></jsp:include>
<jsp:include page="views/footer-tags.jsp"></jsp:include>

</body>
</html>
