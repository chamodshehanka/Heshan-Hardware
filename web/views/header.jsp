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
                <a class="nav-link" href="#">Features</a>
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
    <a href="manage-order.jsp">Order</a>
    <a href="manage-customer.jsp">Customer</a>
    <a href="manage-vendor.jsp">Vendor</a>
    <a href="manage-user.jsp">User</a>
</div>
<%--/SideNav--%>