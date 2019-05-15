<%@ page import="com.chamodshehanka.heshanhardware.service.custom.VendorService" %>
<%@ page import="com.chamodshehanka.heshanhardware.service.custom.impl.VendorServiceImpl" %>
<%@ page import="com.chamodshehanka.heshanhardware.model.Vendor" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 5/14/2019
  Time: 10:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage Vendor</title>

    <jsp:include page="views/styles-header.jsp"></jsp:include>
</head>
<body>

<jsp:include page="views/header.jsp"></jsp:include>

<section class="uk-card uk-card-default uk-card-hover uk-card-body align-items-center">
    <div>
        <h2 style="text-align: center">
            Manage Vendor
        </h2>
    </div>

    <div class="container">
        <button class="uk-button uk-button-primary" uk-toggle="target: #add-vendor-modal" type="button">New Vendor</button>
        <button id="btnUpdateModal" class="uk-button uk-button-primary" uk-toggle="target: #update-customer-modal" type="button">Update Vendor</button>
    </div>

    <%--Modals--%>

    <%--Add Vendor Modal--%>
    <div id="add-vendor-modal" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h2 class="uk-modal-title">Add Customer</h2>
            <button class="uk-modal-close" type="button"></button>

            <form action="${pageContext.request.contextPath}/AddVendor" method="post">


                <div class="uk-margin">
                    <%
                        VendorService vendorService = new VendorServiceImpl();
                    %>
                    <input class="uk-input" type="text" name="vendorID" value="<%=vendorService.getNewID()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="name" placeholder="Name">
                </div>

                <div class="uk-margin">
                    <select class="uk-select" name="type">
                        <option value="Local">Local</option>
                        <option value="Foreign">Foreign</option>
                    </select>
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="phone" placeholder="Phone Number">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="email" name="email" placeholder="Email">
                </div>

                <button class="uk-button uk-button-primary" type="submit">Add Vendor</button>
            </form>
        </div>
    </div>
    <%--End Add Vendor Modal--%>

    <%--Update Vendor Modal--%>
    <div id="update-customer-modal" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h2 class="uk-modal-title">Update Item</h2>

            <div class="uk-alert-danger" uk-alert>
                <a class="uk-alert-close" uk-close></a>
            </div>

            <%
                Vendor vendor1 = (Vendor) request.getAttribute("customer");
                if (vendor1 == null){
                    vendor1 = new Vendor("N/A","N/A","N/A",0,"N/A");
                }
            %>

            <form action="${pageContext.request.contextPath}/UpdateCustomer" method="post">


                <div class="uk-margin">
                    <span class="uk-form-icon" uk-icon="icon: item"></span>
                    <input id="txtCustomerID" class="uk-input" type="text" name="customerID" placeholder="Customer ID" value="<%=vendor1.getVendorID()%>">

                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="name" placeholder="Name" value="<%=vendor1.getName()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="gender" placeholder="Gender" value="<%=vendor1.getType()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="address" placeholder="Address" value="<%=vendor1.getPhone()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="phone" placeholder="Phone" value="<%=vendor1.getEmail()%>">
                </div>

                <button class="uk-button uk-button-primary" type="submit">Update Customer</button>
            </form>
        </div>
    </div>
    <%--End Customer Update Modal--%>

    <%--End Modals--%>

</section>

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
                    <th class="text-center">Vendor ID</th>
                    <th class="text-center">Name</th>
                    <th class="text-center">Type</th>
                    <th class="text-center">Phone</th>
                    <th class="text-center">Email</th>
                    <th class="text-center">Edit</th>
                    <th class="text-center">Remove</th>
                </tr>

                <%
                    ArrayList<Vendor> vendorArrayList = vendorService.getAll();

                    for (Vendor vendor : vendorArrayList
                    ) {
                %>

                <tr>
                    <td id="itemCode" class="pt-3-half" contenteditable="true"><%=vendor.getVendorID()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=vendor.getName()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=vendor.getType()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=vendor.getPhone()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=vendor.getEmail()%></td>
                    <td class="pt-3-half">
                        <form method="post" action="${pageContext.request.contextPath}/SearchCustomer">
                            <input type="hidden" name="customerID" value="<%=vendor.getVendorID()%>">

                            <button type="submit" class="btn btn-secondary btn-rounded btn-sm my-0">Edit</button>
                        </form>
                    </td>

                    <td>

                        <form method="post" action="${pageContext.request.contextPath}/DeleteCustomer">
                            <input type="hidden" name="itemCode" value="<%=vendor.getVendorID()%>">

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
<jsp:include page="views/footer-tags.jsp"></jsp:include>
<script>

</script>
</body>
</html>
