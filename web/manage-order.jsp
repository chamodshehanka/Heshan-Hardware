<%@ page import="com.chamodshehanka.heshanhardware.model.Order" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chamodshehanka.heshanhardware.controller.OrderController" %><%--
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
                    <th class="text-center">Order ID</th>
                    <th class="text-center">Order Date</th>
                    <th class="text-center">Customer ID</th>
                    <th class="text-center">View Order</th>
                    <th class="text-center">Edit</th>
                    <th class="text-center">Remove</th>
                </tr>

                <%
                    ArrayList<Order> orderArrayList = OrderController.getAllOrders();

                    for (Order order : orderArrayList
                    ) {
                %>

                <tr>
                    <td id="vendorID" class="pt-3-half" contenteditable="true"><%=order.getOrderID()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=order.getOrderDate()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=order.getCustomerID()%></td>
                    <td class="pt-3-half">
                        <form method="post" action="">
                            <input type="hidden" name="vendorID" value="<%=order.getOrderID()%>">
                            <button type="submit" class="btn btn-secondary btn-rounded btn-sm my-0">View Order</button>
                        </form>
                    </td>
                    <td class="pt-3-half">
                        <form method="post" action="${pageContext.request.contextPath}/SearchVendor">
                            <input type="hidden" name="vendorID" value="<%=order.getOrderID()%>">

                            <button type="submit" class="btn btn-secondary btn-rounded btn-sm my-0">Edit Order</button>
                        </form>
                    </td>

                    <td>

                        <form method="post" action="${pageContext.request.contextPath}/DeleteVendor">
                            <input type="hidden" name="vendorID" value="<%=order.getOrderID()%>">

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
</body>
</html>
