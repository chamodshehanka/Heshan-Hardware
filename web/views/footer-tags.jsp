<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/uikit.min.js"></script>
<script src="assets/js/uikit.min.js"></script>
<script src="assets/js/uikit-icons.min.js"></script>
<script src="assets/js/validationUtil.js" type="text/javascript"></script>
<script src="assets/js/tableController.js" type="text/javascript"></script>

<%
    String message = (String) request.getAttribute("message");
%>

<script>
    function openNav() {
        document.getElementById("mySidenav").style.width = "250px";
        document.getElementById("main").style.marginLeft = "250px";
    }

    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
        document.getElementById("main").style.marginLeft= "0";
    }

    function toast(type) {
        if (type === "done"){
            UIkit.notification({message: 'Success ...', status: 'success'});
        }else if (type === "error"){
            UIkit.notification({message: 'Error ...', status: 'danger'});
        }

    }
</script>
<script>
    var m = "<%=message%>";
    toast(m);
</script>