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

<!--Navbar-->
<nav class="navbar navbar-expand-lg navbar-dark primary-color" style="background-color: #0d0d0d">

    <!-- Navbar brand -->
    <a class="navbar-brand" href="#">Heshan Hardware</a>

    <!-- Collapse button -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
            aria-controls="basicExampleNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <!-- Collapsible content -->
    <div class="collapse navbar-collapse" id="basicExampleNav">

        <!-- Links -->
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home
                    <span class="sr-only">(current)</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="" onclick="openNav()">Features</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Pricing</a>
            </li>

            <!-- Dropdown -->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">Dropdown</a>
                <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>

        </ul>
        <!-- Links -->

        <div class="form-inline">
            <div class="md-form my-0">
                <a href="index.jsp"><button class="uk-button uk-button-danger" type="button">Log Out</button></a>
                <span style="font-size:30px;cursor:pointer;color: whitesmoke;" onclick="openNav()">&#9776;</span>
            </div>
        </div>
    </div>
    <!-- Collapsible content -->

</nav>
<!--Navbar-->

<%--SideNav--%>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>

    <a href="dashboard.jsp">Dashboard</a>
    <a href="manage-item.jsp">Items</a>
    <a href="#">Order</a>
    <a href="#">Customer</a>
    <a href="#">Contact</a>
</div>
<%--/SideNav--%>


<div style="width: 100%;height: 10px"></div>
<div class="container">
    <div class="uk-alert-warning" uk-alert>
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


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
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
