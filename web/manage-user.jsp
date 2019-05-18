<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chamodshehanka.heshanhardware.model.User" %>
<%@ page import="com.chamodshehanka.heshanhardware.controller.UserController" %><%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 5/14/2019
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage User</title>
    <jsp:include page="views/styles-header.jsp"></jsp:include>
</head>
<body>
<jsp:include page="views/header.jsp"></jsp:include>


<section class="uk-card uk-card-default uk-card-hover uk-card-body align-items-center">
    <div>
        <h2 style="text-align: center">
            Manage User
        </h2>
    </div>

    <div class="container">
        <button class="uk-button uk-button-primary" uk-toggle="target: #add-user-modal" type="button">New User</button>
        <button id="btnUpdateModal" class="uk-button uk-button-primary" uk-toggle="target: #update-user-modal" type="button">Update User</button>
    </div>

    <%--Modals--%>

    <%--Add User Modal--%>
    <div id="add-user-modal" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h2 class="uk-modal-title">Add User</h2>
            <button class="uk-modal-close" type="button"></button>

            <form action="${pageContext.request.contextPath}/AddUser" method="post">


                <div class="uk-margin">
                    <input class="uk-input" type="text" name="userID" value="<%=UserController.getNewUserID()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="username" placeholder="User Name">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="password" name="password" placeholder="Password">
                </div>

                <div class="uk-margin">
                    <select class="uk-select" name="type">
                        <option value="Admin">Admin</option>
                        <option value="Cashier">Cashier</option>
                        <option value="Store Keeper">Store Keeper</option>
                    </select>
                </div>

                <button class="uk-button uk-button-primary" type="submit">Add User</button>
            </form>
        </div>
    </div>
    <%--End Add User Modal--%>

    <%--Update Customer Modal--%>
    <div id="update-user-modal" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h2 class="uk-modal-title">Update User</h2>

            <%
                User user1 = (User) request.getAttribute("user");
                if (user1 == null){
                    user1 = new User("N/A","N/A","N/A","N/A");
                }
            %>

            <form action="${pageContext.request.contextPath}/UpdateUser" method="post">


                <div class="uk-margin">
                    <input id="txtUserID" class="uk-input" type="text" name="userID" placeholder="User ID" value="<%=user1.getUserID()%>">

                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="username" placeholder="User Name" value="<%=user1.getUserName()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="password" name="password" placeholder="Password" value="<%=user1.getUserPassword()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="type" placeholder="Type" value="<%=user1.getUserType()%>">
                </div>

                <button class="uk-button uk-button-primary" type="submit">Update User</button>
            </form>
        </div>
    </div>
    <%--End User Update Modal--%>

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
                    <th class="text-center">User ID</th>
                    <th class="text-center">User Name</th>
                    <th class="text-center">Type</th>
                    <th class="text-center">Edit</th>
                    <th class="text-center">Remove</th>
                </tr>

                <%
                    ArrayList<User> userArrayList = UserController.getAllUsers();

                    for (User user : userArrayList
                    ) {
                %>

                <tr>
                    <td class="pt-3-half" contenteditable="true"><%=user.getUserID()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=user.getUserName()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=user.getUserType()%></td>
                    <td class="pt-3-half">
                        <form method="post" action="${pageContext.request.contextPath}/SearchUser">
                            <input type="hidden" name="userID" value="<%=user.getUserID()%>">

                            <button type="submit" class="btn btn-secondary btn-rounded btn-sm my-0">Edit</button>
                        </form>
                    </td>

                    <td>

                        <form method="post" action="${pageContext.request.contextPath}/DeleteUser">
                            <input type="hidden" name="userID" value="<%=user.getUserID()%>">

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
    $(document).ready(function () {
        var userID =  $('#txtUserID').val();

        if (userID !== "N/A"){
            openUpdateModal();
        }
    });

    function openUpdateModal() {
        $('#btnUpdateModal').trigger('click');
    }
</script>
</body>
</html>
