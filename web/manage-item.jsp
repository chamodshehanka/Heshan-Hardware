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

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/mdb.min.css">
    <link rel="stylesheet" href="assets/css/addons/datatables.min.css">
    <link rel="stylesheet" href="assets/css/addons/datatables-select.min.css">
    <link rel="stylesheet" href="assets/css/uikit.min.css"/>
    <link rel="stylesheet" href="assets/css/styles.css">

    <style>
        .pt-3-half {
            padding-top: 1.4rem;
        }
    </style>
</head>
<body>

<nav class="uk-navbar-container" style="background-color: #0d0d0d" uk-navbar>

    <div class="uk-navbar-left">

        <ul class="uk-navbar-nav">
            <li class="uk-active"><a href="#">Active</a></li>
            <li>
                <a href="#">Parent</a>
                <div class="uk-navbar-dropdown">
                    <ul class="uk-nav uk-navbar-dropdown-nav">
                        <li class="uk-active"><a href="#">Active</a></li>
                        <li><a href="#">Item</a></li>
                        <li><a href="#">Item</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="#">Item</a></li>
        </ul>

    </div>

    <div class="uk-navbar-right">

        <ul class="uk-navbar-nav">
            <li class="uk-active"><a href="#">Active</a></li>
            <li>
                <a href="#">Parent</a>
                <div class="uk-navbar-dropdown">
                    <ul class="uk-nav uk-navbar-dropdown-nav">
                        <li class="uk-active"><a href="#">Active</a></li>
                        <li><a href="#">Item</a></li>
                        <li><a href="#">Item</a></li>
                    </ul>
                </div>
            </li>
            <li><a href="#">Item</a></li>
        </ul>

    </div>

</nav>

<section class="uk-card uk-card-default uk-card-hover uk-card-body">
    <div class="container">
        <form>
            <div class="row">
                <div class="col-2">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: item"></span>
                        <input id="txt-username" class="uk-input" type="text" placeholder="Item Code">
                    </div>
                </div>

                <div class="col-3">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: item"></span>
                        <input class="uk-input" type="text" placeholder="Description">
                    </div>
                </div>

                <div class="col-2">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: item"></span>
                        <input class="uk-input" type="text" placeholder="Brand">
                    </div>
                </div>

                <div class="col-3">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: item"></span>
                        <input class="uk-input" type="text" placeholder="Unit Price">
                    </div>
                </div>

                <div class="col-2">
                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: item"></span>
                        <input class="uk-input" type="text" placeholder="Quantity">
                    </div>
                </div>

            </div>
            <!--Grid column-->

            <br>

            <div style="float: right">
                <button class="uk-button uk-button-primary">Submit</button>
                <button class="uk-button uk-button-danger">Reset</button>
            </div>
        </form>
    </div>
</section>

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

                <tr>
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
                </tr>
                <!-- This is our clonable table line -->
                <tr>
                    <td class="pt-3-half" contenteditable="true">I002</td>
                    <td class="pt-3-half" contenteditable="true">Sand</td>
                    <td class="pt-3-half" contenteditable="true">River</td>
                    <td class="pt-3-half" contenteditable="true">3500</td>
                    <td class="pt-3-half" contenteditable="true">300</td>
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
