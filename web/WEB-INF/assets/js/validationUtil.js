$('#btn-signIn').click(function () {
    var email = $('#txt-username').val();
    var password = $('#txt-password').val();

    console.log(email);

    if (email.length !== 0 && password.length !== 0) {
        console.log("Hi");
    }
});