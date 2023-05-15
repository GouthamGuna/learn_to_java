$(document).ready(function () {
  $("#loginRequest").click(function (e) {
    e.preventDefault();
    validateUser();
  });
});

function validateUser() {
  const urlString = "http://192.168.0.104:8080/login";

  let formdata = {
    userName: $("#username").val(),
    secret: $("#password").val(),
  };

  $.ajax({
    method: "POST",
    url: urlString,
    data: JSON.stringify(formdata),
    contentType: "application/json",
    success: function (responseJSON) {
      sessionStorage.setItem("userName", responseJSON);
      window.location.replace("./html/welcome.html");
    },
    error: function (responseJSON) {
      $("#message").html("Invalid username or password.");
    },
  });
}
