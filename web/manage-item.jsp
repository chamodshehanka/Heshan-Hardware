<%@ page import="com.chamodshehanka.heshanhardware.service.custom.ItemService" %>
<%@ page import="com.chamodshehanka.heshanhardware.service.custom.impl.ItemServiceImpl" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chamodshehanka.heshanhardware.model.Item" %>
<%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 5/5/2019
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage Items</title>

    <link rel="stylesheet" href="assets/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/mdb.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/addons/datatables.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/addons/datatables-select.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/uikit.min.css" type="text/css">
    <link rel="stylesheet" href="assets/css/styles.css" type="text/css">

    <style>
        .pt-3-half {
            padding-top: 1.4rem;
        }
    </style>
</head>
<body>

<!--Navbar-->
<nav class="navbar navbar-expand-lg navbar-dark primary-color" style="background-color: #0d0d0d">

    <!-- Navbar brand -->
    <a class="navbar-brand" href="#">Navbar</a>

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

        <form class="form-inline">
            <div class="md-form my-0">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            </div>
        </form>
    </div>
    <!-- Collapsible content -->

</nav>
<!--Navbar-->

<section class="uk-card uk-card-default uk-card-hover uk-card-body">
    <div class="container">
        <button class="uk-button uk-button-primary" uk-toggle="target: #add-item-modal">New Item</button>
        <button class="uk-button uk-button-primary">Search Item</button>
        <button class="uk-button uk-button-primary">Update Item</button>
        <button class="uk-button uk-button-danger">Delete Item</button>
    </div>
</section>

<%--Modals--%>

<%--Add Item Modal--%>
<div id="add-item-modal" uk-modal>
    <div class="uk-modal-dialog uk-modal-body">
        <h2 class="uk-modal-title">Add Item</h2>
        <button class="uk-modal-close" type="button"></button>

        <form action="/AddItem" method="post">


            <div class="uk-inline">
                <span class="uk-form-icon" uk-icon="icon: item"></span>
                <%
                    ItemServiceImpl itemService = new ItemServiceImpl();
                    out.println("<input class='uk-input' type='text' name='itemCode' value='"+ itemService.getNewID()+"'>");
                %>
            </div>

            <div class="uk-inline">
                <input class="uk-input" type="text" name="description" placeholder="Description">
            </div>

            <div class="uk-inline">
                <input class="uk-input" type="text" name="brand" placeholder="Brand">
            </div>

            <div class="uk-inline">
                <input class="uk-input" type="text" name="unitPrice" placeholder="Unit Price">
            </div>

            <div class="uk-inline">
                <input class="uk-input" type="text" name="qty" placeholder="Quantity">
            </div>

            <button class="uk-button uk-button-primary" type="submit">Add Item</button>
        </form>
    </div>
</div>
<%--End Add Item Modal--%>

<%--End Modals--%>

<!-- Editable table -->
<div class="card">
<%--    <h3 class="card-header text-center font-weight-bold text-uppercase py-4">Manage Items</h3>--%>
    <div class="card-body">
        <div id="table" class="table-editable">
      <span class="table-add float-right mb-3 mr-2">
          <a href="#!" class="text-success">
              <i class="fas fa-plus fa-2x" aria-hidden="true"></i>
          </a>
      </span>
            <table class="table table-bordered table-responsive-md table-striped text-center">
                <tr>
                    <th class="text-center">Item Code</th>
                    <th class="text-center">Description</th>
                    <th class="text-center">Brand</th>
                    <th class="text-center">Unit Price(LKR)</th>
                    <th class="text-center">Quantity</th>
                    <th class="text-center">Sort</th>
                    <th class="text-center">Remove</th>
                </tr>

                <%
                    ItemService itemService1 = new ItemServiceImpl();
                    ArrayList<Item> itemArrayList = itemService1.getAll();

                    for (Item item : itemArrayList
                         ) {
                        %>
                        <tr>
                            <td class="pt-3-half" contenteditable="true"><%=item.getItemCode()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getItemDescription()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getItemBrand()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getUnitPrice()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getQty()%></td>
                            <td class="pt-3-half">
                        <span class="table-up">
                            <a href="#!" class="indigo-text">
                                <i class="fas fa-long-arrow-alt-up" aria-hidden="true"></i>
                            </a>
                        </span>
                                <span class="table-down">
                            <a href="#!" class="indigo-text">
                                <i class="fas fa-long-arrow-alt-down" aria-hidden="true"></i>
                            </a>
                        </span>
                            </td>
                            <td>
                        <span class="table-remove">
                            <button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Remove</button>
                        </span>
                            </td>
                        </tr>
                <%
                    }
                %>

                <%--<tr>
                    <td class="pt-3-half" contenteditable="true">I001</td>
                    <td class="pt-3-half" contenteditable="true">Cement</td>
                    <td class="pt-3-half" contenteditable="true">Tokyo</td>
                    <td class="pt-3-half" contenteditable="true">1000</td>
                    <td class="pt-3-half" contenteditable="true">100</td>
                    <td class="pt-3-half">
                        <span class="table-up">
                            <a href="#!" class="indigo-text">
                                <i class="fas fa-long-arrow-alt-up" aria-hidden="true"></i>
                            </a>
                        </span>
                        <span class="table-down">
                            <a href="#!" class="indigo-text">
                                <i class="fas fa-long-arrow-alt-down" aria-hidden="true"></i>
                            </a>
                        </span>
                    </td>
                    <td>
                        <span class="table-remove">
                            <button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Remove</button>
                        </span>
                    </td>
                </tr>--%>
                <!-- This is our clonable table line -->

            </table>
        </div>
    </div>
</div>
<!-- Editable table -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/validationUtil.js" type="text/javascript"></script>
<script src="assets/js/tableController.js" type="text/javascript"></script>
</body>
</html>
