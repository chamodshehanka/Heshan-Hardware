var email = document.getElementsByName("email");
email.addEventListener("input", function (event) {
    if (email.validity.typeMismatch){
        email.setCustomValidity("Enter valid email!!!");
    }
});