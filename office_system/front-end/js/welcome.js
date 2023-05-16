$(document).ready(function () {
  const x = sessionStorage.getItem("userName");

  if (x != null) {
    $(".greeting").html("<span> Welcome </span>" + " " + x);
    allStudentList();
  } else {
    $("#error").html("user could not recognize");
  }

  $("#logoutRequest").click(function () {
    sessionStorage.clear();
    window.location.replace("../index.html");
  });
});

const baseURL = "http://192.168.0.104:8080/api";

function allStudentList() {
  $.ajax({
    type: "GET",
    url: baseURL + "/studentList",
    contentType: "application/json",
    success: function (responseJSON) {
      if (responseJSON.length > 0) {
        for (let i = 0; i < responseJSON.length; i++) {
          $("#tableid tbody").append(
            "<tr>" +
              "<td>" +
              (i + 1) +
              "</td>" +
              "<td>" +
              responseJSON[i].studentName +
              "</td>" +
              "<td>" +
              responseJSON[i].rollNo +
              "</td>" +
              "<td>" +
              responseJSON[i].className +
              "</td>" +
              "<td><a href='javascript:;' id='" +
              responseJSON[i].id +
              "' class='edit'> Edit</a> <a href='javascript:;' id='" +
              responseJSON[i].id +
              "' class='delete'> Delete</a></td>" +
              "</tr>"
          );
        }
      }

      $("#tableid tbody tr").on("click", ".edit", function () {
        localStorage.setItem("url", window.location.href);
        var updateId = $(this).attr("id");
        editRecord(updateId);
      });

      $("#tableid tbody tr").on("click", ".delete", function () {
        localStorage.setItem("url", window.location.href);
        var deleteId = $(this).attr("id");
        deleteRecord(deleteId);
      });
    },
  });
}

function editRecord(updateId) {
  console.log("updateId : ", updateId);

  let formdata = {
    studentName: "Gowtham Sankar G",
    rollNo: "17EE506",
    className: "EEE",
  };

  $.ajax({
    type: "PUT",
    url: baseURL + "/student/" + updateId,
    data: JSON.stringify(formdata),
    contentType: "application/json",
    success: function (response) {
      $("#message").html("Updating student details... "+response.studentName);
      setTimeout(function () {
        window.location.reload();
      }, 3000);
    }
  });
}

function deleteRecord(deleteId) {
  $.ajax({
    type: "DELETE",
    url: baseURL + "/student/delete/" + deleteId,
    contentType: "application/json",
    success: function (response) {
      $("#message").html(response);
      setTimeout(function () {
        window.location.reload();
      }, 3000);
    }
  });
}
