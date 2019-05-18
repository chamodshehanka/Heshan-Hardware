<%@ page import="com.chamodshehanka.heshanhardware.controller.StaffController" %>
<%@ page import="com.chamodshehanka.heshanhardware.model.Staff" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: chamodshehanka
  Date: 5/18/2019
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage Staff</title>

    <jsp:include page="views/styles-header.jsp"></jsp:include>
</head>
<body>
<jsp:include page="views/header.jsp"></jsp:include>

<section class="uk-card uk-card-default uk-card-hover uk-card-body align-items-center">
    <div>
        <h2 style="text-align: center">
            Manage Staff
        </h2>
    </div>

    <div class="container">
        <button class="uk-button uk-button-primary" uk-toggle="target: #add-staff-modal" type="button">New Staff Member</button>
        <button id="btnUpdateModal" class="uk-button uk-button-primary" uk-toggle="target: #update-staff-modal" type="button">Update Staff Member</button>
    </div>

    <%--Modals--%>

    <%--Add Staff Modal--%>
    <div id="add-staff-modal" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h2 class="uk-modal-title">Add Staff</h2>
            <button class="uk-modal-close" type="button"></button>

            <form action="${pageContext.request.contextPath}/AddStaff" method="post">


                <div class="uk-margin">
                    <input class="uk-input" type="text" name="staffID" value="<%=StaffController.getNewStaffID()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="name" placeholder="Name">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="username" placeholder="User Name">
                </div>

                <div class="uk-margin">
                    <select class="uk-select" name="type">
                        <option value="Store Keeper">Store Keeper</option>
                        <option value="Cashier">Cashier</option>
                    </select>
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="phone" placeholder="Phone Number">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="email" name="email" placeholder="Email">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="password" name="password">
                </div>


                <button class="uk-button uk-button-primary" type="submit">Add Staff</button>
            </form>
        </div>
    </div>
    <%--End Add Staff Modal--%>

    <%--Update Staff Modal--%>
    <div id="update-staff-modal" uk-modal>
        <div class="uk-modal-dialog uk-modal-body">
            <h2 class="uk-modal-title">Update Item</h2>

            <div class="uk-alert-danger" uk-alert>
                <a class="uk-alert-close" uk-close></a>
            </div>

            <%
                Staff staff1 = (Staff) request.getAttribute("staff");
                if (staff1 == null){
                    staff1 = new Staff("N/A","N/A",0,"","N/A");
                }
            %>

            <form action="${pageContext.request.contextPath}/UpdateStaff" method="post">


                <div class="uk-margin">
                    <input id="txtStaffID" class="uk-input" type="text" name="staffID" placeholder="Staff ID" value="<%=staff1.getStaffID()%>">

                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="name" placeholder="Name" value="<%=staff1.getName()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="type" placeholder="Type" value="<%=staff1.getType()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="text" name="phone" placeholder="Phone" value="<%=staff1.getPhone()%>">
                </div>

                <div class="uk-margin">
                    <input class="uk-input" type="email" name="email" placeholder="Email" value="<%=staff1.getEmail()%>">
                </div>

                <button class="uk-button uk-button-primary" type="submit">Update Staff</button>
            </form>
        </div>
    </div>
    <%--End Staff Update Modal--%>

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
                    <th class="text-center">Staff ID</th>
                    <th class="text-center">Name</th>
                    <th class="text-center">Type</th>
                    <th class="text-center">Phone</th>
                    <th class="text-center">Email</th>
                    <th class="text-center">Edit</th>
                    <th class="text-center">Remove</th>
                </tr>

                <%
                    ArrayList<Staff> staffArrayList = StaffController.getAllStaff();

                    for (Staff staff : staffArrayList
                    ) {
                %>

                <tr>
                    <td id="vendorID" class="pt-3-half" contenteditable="true"><%=staff.getStaffID()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=staff.getName()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=staff.getType()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=staff.getPhone()%></td>
                    <td class="pt-3-half" contenteditable="true"><%=staff.getEmail()%></td>
                    <td class="pt-3-half">
                        <form method="post" action="${pageContext.request.contextPath}/SearchStaff">
                            <input type="hidden" name="staffID" value="<%=staff.getStaffID()%>">

                            <button type="submit" class="btn btn-secondary btn-rounded btn-sm my-0">Edit</button>
                        </form>
                    </td>

                    <td>

                        <form method="post" action="${pageContext.request.contextPath}/DeleteStaff">
                            <input type="hidden" name="staffID" value="<%=staff.getStaffID()%>">

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
        var staffID =  $('#txtStaffID').val();

        if (staffID !== "N/A"){
            openUpdateModal();
        }
    });

    function openUpdateModal() {
        $('#btnUpdateModal').trigger('click');
    }
</script>
</body>
</html>
