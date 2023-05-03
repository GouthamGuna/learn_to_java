$(document).ready(function () {
  $("#registerRequest").click(function (e) {
    e.preventDefault();
    registerUser();
  });
  $("#success").hide();
});

function registerUser() {
  const urlString = "http://localhost:8080/register";

  let entity = {
    userMailId: $("#mailId").val(),
    userName: $("#username").val(),
    secret: $("#password").val(),
  };

  $.ajax({
    method: "POST",
    url: urlString,
    data: JSON.stringify(entity),
    contentType: "application/json",
    success: function (responseJSON) {
      $("#success").show();
      setTimeout(function () {
        window.location.replace("../index.html");
      }, 5000);
    },
    error: function (responseJSON) {
      $("#statusCode").html(
        "<span> Status Code : </span>" + " " + responseJSON.status
      );
      $("#message").html(
        "<span> Error Message : </span>" + " " + responseJSON.responseText
      );
    },
  });
}
