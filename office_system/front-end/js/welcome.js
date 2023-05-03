$(document).ready(function () {
  const x = sessionStorage.getItem("userName");

  if (x != null) {
    $(".greeting").html("<span> Welcome </span>" + " " + x);
  } else {
    $("#error").html("user could not recognize");
  }

  $("#logoutRequest").click(function () {
    sessionStorage.clear();
    window.location.replace("../index.html");
  });
});