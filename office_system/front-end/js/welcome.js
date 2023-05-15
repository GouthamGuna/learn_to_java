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

function allStudentList() {

  $.ajax({
		type: 'GET', 
		url: 'http://192.168.0.104:8080/studentList',
    contentType: "application/json", 
		success: function (responseJSON) {
      if(responseJSON.length > 0){
				for(let i = 0; i < responseJSON.length; i++){
					$("#tableid tbody").append("<tr>" +
							"<td>"+(i+1)+"</td>" +
							"<td>"+responseJSON[i].studentName+"</td>" +
              "<td>"+responseJSON[i].rollNo+"</td>" +
              "<td>"+responseJSON[i].className+"</td>" +
              "<td><a href='javascript:;' id='"+responseJSON[i].id+"'> Edit</a> <a href='javascript:;' id='"+responseJSON[i].id+"'> Delete</a></td>"+
					"</tr>");
				}
			}
    }
	});
}

