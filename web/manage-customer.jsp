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
