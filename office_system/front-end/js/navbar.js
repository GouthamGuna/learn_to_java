window.onload = function()
{
    const path = window.location.pathname.split("/");

    alert("path : "+path)

    switch(path[2])
    {
        case "welcome":
        {
            loadPage("welcome");
            break;
        }
        case "addStudent":
        {
            loadPage("addStudent");
            break;
        }
        default:
        {
            loadPage("welcome");
            break;
        }
    }

    document.querySelectorAll(".menu__item").forEach((item) =>
    {
        item.addEventListener("click", function()
        {
           
            const path = item.getAttribute("value");
            loadPage(path);
            alert("33 : "+path)
            if(path == "welcome")
            {
                alert("37 : "+path )
                window.history.pushState("", "", "/");

                return;
            }

            window.history.pushState("", "", path);
        });
    });

    function loadPage($path)
    {
        if($path == "") return;
        alert("50 : "+path)
        const container = document.getElementById("container");
        alert("51 : "+container)
        console.log(container)
        const request = new XMLHttpRequest();
        request.open("GET", + $path + ".html");
        alert("54 : "+request.open("GET", + $path + ".html"))
        request.send();
        request.onload = function()
        {
            if(request.status == 200)
            {
                container.innerHTML = request.responseText;
                document.title = $path;
            }
        }
    }
}