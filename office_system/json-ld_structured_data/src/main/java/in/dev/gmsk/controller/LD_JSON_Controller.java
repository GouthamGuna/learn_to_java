package in.dev.gmsk.controller;

import com.google.gson.Gson;
import in.dev.gmsk.model.Author;
import in.dev.gmsk.model.LD_JSON;
import in.dev.gmsk.model.Publisher;

import java.util.Arrays;
import java.util.List;

/**
 * @author gowtham_sankar gunasekaran
 * @see <a href="https://gouthamguna.github.io/in/">JSON-LD's ability to be embedded in a separate script tag allows it to be easily added or removed without modifying the HTML markup, providing greater flexibility and modularity compared to Microdata.</a>
 * @since 1.0
 */

public class LD_JSON_Controller {

    private static final LD_JSON returnInstance;
    private static final Author author;
    private static final Publisher publisher;
    private static final List<String> OrganizationLogo;
    private static final Gson GSON;

    static {
        author = new Author();
        returnInstance = new LD_JSON();
        publisher = new Publisher();

        OrganizationLogo = Arrays.asList(
                "https://www.cerpsoft.in/wp-content/uploads/2022/01/cropped-CERP-Logo_wkgFile-Ver1.1.png",
                "https://raw.githubusercontent.com/CERPSoftwareSolutions/webimage/main/cerplogo.png"
        );

        GSON = new Gson();
    }

    public static String getLdJsonObject() {

        author.setName("GOWTHAM SANKAR GUNASEKARAN");
        author.setJobTitle("Java Full Stack Developer.");
        author.setUrl("https://gouthamguna.github.io/in/");
        author.setImage("https://gouthamguna.github.io/in/images/profilepic.jpg");

        publisher.setName("CERP Software Solutions");
        publisher.setUrl("https://www.cerpsoft.in/");
        publisher.setLogos(OrganizationLogo);

        returnInstance.setType("WebSite");
        returnInstance.setHeadline("CERP");
        returnInstance.setAuthor(author);
        returnInstance.setPublisher(publisher);

        return GSON.toJson(returnInstance);
    }
}
