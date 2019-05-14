<%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 5/6/2019
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inventory Management System | Dashboard</title>

    <link rel="stylesheet" href="assets/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/mdb.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/uikit.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/styles.css" type="text/css">

</head>
<body>

<jsp:include page="views/header.jsp"></jsp:include>

<div style="width: 100%;height: 10px"></div>
<div class="container">
    <div class="uk-alert-success" uk-alert>
        <a class="uk-alert-close" uk-close></a>
        <p><b>Tips : </b>Click menu icon to open side nav </p>
    </div>
</div>
<div class="container" style="width: 100%;height: 400px;">
    <div class="sales-activity">
        <div class="uk-card uk-card-primary uk-card-hover uk-card-body card-activity">
            <h3 class="uk-card-title">11 Qty</h3>
            <p>To be packed</p>
        </div>

        <div class="uk-card uk-card-primary uk-card-hover uk-card-body card-activity">
            <h3 class="uk-card-title">19 Pkgs</h3>
            <p>To be post</p>
        </div>

        <div class="uk-card uk-card-primary uk-card-hover uk-card-body card-activity">
            <h3 class="uk-card-title">9 Pkgs</h3>
            <p>To be Delivered</p>
        </div>

        <div class="uk-card uk-card-primary uk-card-hover uk-card-body card-activity">
            <h3 class="uk-card-title">1 Pkgs</h3>
            <p>To be Invoiced</p>
        </div>
    </div>

    <div class="inventory-summary">
        <h4>Inventory Summary</h4>
        <p>Quantity in Hand <span class="uk-badge">100</span></p>
        <p>Quantity to be Received <span class="uk-badge">10</span></p>
    </div>
</div>

<jsp:include page="views/footer.jsp"></jsp:include>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit-icons.min.js"></script>
<script>
    function openNav() {
        document.getElementById("mySidenav").style.width = "250px";
        document.getElementById("main").style.marginLeft = "250px";
    }

    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
        document.getElementById("main").style.marginLeft= "0";
    }
</script>
</body>
</html>
