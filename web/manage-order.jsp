<%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 5/14/2019
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage Order</title>
    <jsp:include page="views/styles-header.jsp"></jsp:include>
</head>
<body>

<jsp:include page="views/header.jsp"></jsp:include>

<section class="uk-card uk-card-default uk-card-hover uk-card-body align-items-center">
    <div>
        <h2 style="text-align: center">
            Manage Order
        </h2>
    </div>

    <div class="container">
        <button class="uk-button uk-button-primary" uk-toggle="target: #add-customer-modal" type="button">New Order</button>
        <button id="btnUpdateModal" class="uk-button uk-button-primary" uk-toggle="target: #update-order-modal" type="button">Update Order</button>
    </div>
</section>

<jsp:include page="views/footer.jsp"></jsp:include>
<jsp:include page="views/footer-tags.jsp"></jsp:include>
</body>
</html>
