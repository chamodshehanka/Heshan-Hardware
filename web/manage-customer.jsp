<%@ page import="com.chamodshehanka.heshanhardware.service.custom.CustomerService" %>
<%@ page import="com.chamodshehanka.heshanhardware.service.custom.impl.CustomerServiceImpl" %>
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
            Manage Items
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
            <h2 class="uk-modal-title">Add Item</h2>
            <button class="uk-modal-close" type="button"></button>

            <form action="${pageContext.request.contextPath}/AddCustomer" method="post">


                <div class="uk-margin">
                    <%
                        CustomerService customerService = new CustomerServiceImpl();
                    %>
                    <input class="uk-input" type="text" name="customerID" value="<%=customerService.getNewID()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="description" placeholder="Description">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="brand" placeholder="Brand">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="unitPrice" placeholder="Unit Price">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="qty" placeholder="Quantity">
                </div>

                <button class="uk-button uk-button-primary" type="submit">Add Item</button>
            </form>
        </div>
    </div>
    <%--End Modals--%>

</section>



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
