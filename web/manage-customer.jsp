<%@ page import="com.chamodshehanka.heshanhardware.service.custom.CustomerService" %>
<%@ page import="com.chamodshehanka.heshanhardware.service.custom.impl.CustomerServiceImpl" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chamodshehanka.heshanhardware.model.Customer" %>
<%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 5/8/2019
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage Customers</title>

    <jsp:include page="views/styles-header.jsp"></jsp:include>
</head>
<body>

<jsp:include page="views/header.jsp"></jsp:include>

<section class="uk-card uk-card-default uk-card-hover uk-card-body align-items-center">
    <div>
        <h2 style="text-align: center">
            Manage Customer
        </h2>
    </div>

    <div class="container">
        <button class="uk-button uk-button-primary" uk-toggle="target: #add-item-modal" type="button">New Item</button>
    </div>

    <%--Modals--%>

    <%--Add Customer Modal--%>

    <%--End Add Customer Modal--%>
    <div id="add-item-modal" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h2 class="uk-modal-title">Add Customer</h2>
            <button class="uk-modal-close" type="button"></button>

            <form action="${pageContext.request.contextPath}/AddCustomer" method="post">


                <div class="uk-margin">
                    <%
                        CustomerService customerService = new CustomerServiceImpl();
                    %>
                    <input class="uk-input" type="text" name="customerID" value="<%=customerService.getNewID()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="name" placeholder="Name">
                </div>

                <div class="uk-margin">
                    <div class="uk-form-label">Gender</div>
                    <div class="uk-form-controls">
                        <label><input class="uk-radio" type="radio" name="gender"> Male</label><br>
                        <label><input class="uk-radio" type="radio" name="gender"> Female</label>
                    </div>
                </div>

                <div class="uk-margin">
                    <textarea class="uk-textarea" rows="4" placeholder="Address" name="address"></textarea>
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="phone" placeholder="Phone Number">
                </div>

                <button class="uk-button uk-button-primary" type="submit">Add Customer</button>
            </form>
        </div>
    </div>
    <%--End Modals--%>

</section>

<%--Table--%>
<div class="card">
    <div class="card-body">
        <div id="table" class="table-editable">
      <span class="table-add float-right mb-3 mr-2">
          <a href="#!" class="text-success">
              <i class="fas fa-plus fa-2x" aria-hidden="true"></i>
          </a>
      </span>
            <table class="table table-bordered table-responsive-md table-striped text-center">
                <tr>
                    <th class="text-center">Customer ID</th>
                    <th class="text-center">Name</th>
                    <th class="text-center">Gender</th>
                    <th class="text-center">Address</th>
                    <th class="text-center">Phone</th>
                    <th class="text-center">Edit</th>
                    <th class="text-center">Remove</th>
                </tr>

                <%
                    ArrayList<Customer> customerArrayList = customerService.getAll();

                    for (Customer customer : customerArrayList
                    ) {
                %>

                <tr>
                    <td id="itemCode" class="pt-3-half" contenteditable="true"><%=customer.getCustomerID()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=customer.getName()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=customer.getGender()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=customer.getAddress()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=customer.getPhone()%></td>
                    <td class="pt-3-half">
                        <form method="post" action="${pageContext.request.contextPath}/SearchCustomer">
                            <input type="hidden" name="itemCode" value="<%=customer.getCustomerID()%>">

                            <button type="submit" class="btn btn-secondary btn-rounded btn-sm my-0">Edit</button>
                        </form>
                    </td>

                    <td>

                        <form method="post" action="${pageContext.request.contextPath}/DeleteCustomer">
                            <input type="hidden" name="itemCode" value="<%=customer.getCustomerID()%>">

                            <span class="table-remove">
                                        <button type="submit" class="btn btn-danger btn-rounded btn-sm my-0">Remove</button>
                                    </span>
                        </form>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
    </div>
</div>
<%--End Table--%>


<jsp:include page="views/footer.jsp"></jsp:include>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.4/js/uikit-icons.min.js"></script>
<script src="assets/js/validationUtil.js" type="text/javascript"></script>
<script src="assets/js/tableController.js" type="text/javascript"></script>
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
