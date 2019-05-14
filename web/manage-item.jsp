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
        <button id="btnSearchItem" class="uk-button uk-button-primary" >Search Item</button>
        <button class="uk-button uk-button-primary" uk-toggle="target: #update-item-modal">Update Item</button>

        <%--Modals--%>

        <%--Add Item Modal--%>
        <div id="add-item-modal" uk-modal>
            <div class="uk-modal-dialog uk-modal-body">
                <h2 class="uk-modal-title">Add Item</h2>
                <button class="uk-modal-close" type="button"></button>

                <form action="${pageContext.request.contextPath}/AddItem" method="post">


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

        <%--Update Item Modal--%>
        <div id="update-item-modal" uk-modal>
            <div class="uk-modal-dialog uk-modal-body">
                <h2 class="uk-modal-title">Update Item</h2>

                <div class="uk-alert-danger" uk-alert>
                    <a class="uk-alert-close" uk-close></a>
                    <%--<p id="">You need to click edit button first.</p>--%>
                </div>

                <%
                    Item item1 = (Item) request.getAttribute("item");
                    if (item1 == null){
                        item1 = new Item("N/A","N/A","N/A",0,0);
                    }
                %>

                <form action="${pageContext.request.contextPath}/UpdateItem" method="post">


                    <div class="uk-inline">
                        <span class="uk-form-icon" uk-icon="icon: item"></span>
                        <input class="uk-input" type="text" name="itemCode" placeholder="Item Code" value="<%=item1.getItemCode()%>">

                    </div>

                    <div class="uk-inline">
                        <input class="uk-input" type="text" name="description" placeholder="Description" value="<%=item1.getItemDescription()%>">
                    </div>

                    <div class="uk-inline">
                        <input class="uk-input" type="text" name="brand" placeholder="Brand" value="<%=item1.getItemBrand()%>">
                    </div>

                    <div class="uk-inline">
                        <input class="uk-input" type="text" name="unitPrice" placeholder="Unit Price" value="<%=item1.getUnitPrice()%>">
                    </div>

                    <div class="uk-inline">
                        <input class="uk-input" type="text" name="qty" placeholder="Quantity" value="<%=item1.getQty()%>">
                    </div>

                    <button class="uk-button uk-button-primary" type="submit"  uk-toggle="target: #update-item-modal">Update Item</button>
                </form>
            </div>
        </div>
        <%--End ITem Update Modal--%>

        <%--End Modals--%>
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
                    <th class="text-center">Edit</th>
                    <th class="text-center">Remove</th>
                </tr>

                <%
                    ItemService itemService1 = new ItemServiceImpl();
                    ArrayList<Item> itemArrayList = itemService1.getAll();

                    for (Item item : itemArrayList
                         ) {
                        %>

                        <tr>
                            <td id="itemCode" class="pt-3-half" contenteditable="true"><%=item.getItemCode()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getItemDescription()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getItemBrand()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getUnitPrice()%></td>
                            <td class="pt-3-half" contenteditable="true"><%=item.getQty()%></td>
                            <td class="pt-3-half">
                                <form method="post" action="${pageContext.request.contextPath}/SearchItem">
                                    <input type="hidden" name="itemCode" value="<%=item.getItemCode()%>">

                                    <button type="submit" class="btn btn-secondary btn-rounded btn-sm my-0">Edit</button>
                                </form>
                            </td>

                            <td>

                                <form method="post" action="${pageContext.request.contextPath}/DeleteItem">
                                    <input type="hidden" name="itemCode" value="<%=item.getItemCode()%>">

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
<!-- Editable table -->

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
