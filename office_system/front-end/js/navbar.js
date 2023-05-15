window.onload = function()
{
    const path = window.location.pathname.split("/");

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
            
            if(path == "welcome")
            {
                window.history.pushState("", "", "/");

                return;
            }

            window.history.pushState("", "", path);
        });
    });

    function loadPage($path)
    {
        if($path == "") return;
        const container = document.getElementById("container");

        const request = new XMLHttpRequest();
        request.open("GET", + $path + ".html");
       
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