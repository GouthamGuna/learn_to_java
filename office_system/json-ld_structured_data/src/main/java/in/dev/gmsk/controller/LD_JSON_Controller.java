package in.dev.gmsk.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.dev.gmsk.model.Author;
import in.dev.gmsk.model.LD_JSON;
import in.dev.gmsk.model.Publisher;

import java.util.Arrays;
import java.util.List;

public class LD_JSON_Controller {

    private static final LD_JSON instance;
    private static final Author author;
    private static final Publisher publisher;
    private static final List<String> OrganizationLogo;

    static {
        author = new Author();
        instance = new LD_JSON();
        publisher = new Publisher();

        OrganizationLogo = Arrays.asList(
                "https://www.cerpsoft.in/wp-content/uploads/2022/01/cropped-CERP-Logo_wkgFile-Ver1.1.png",
                "https://github.com/CERPSoftwareSolutions/webimage/blob/main/cerplogo.png"
        );
    }

    public static String getLdJsonObject() throws Exception {

        String returnString = "";

        author.setName("GOWTHAM SANKAR GUNASEKARAN");
        author.setJobTitle("Java Full Stack Developer.");
        author.setUrl("https://gouthamguna.github.io/in/");
        author.setImage("https://gouthamguna.github.io/in/images/profilepic.jpg");

        publisher.setName("CERP Software Solutions");
        publisher.setUrl("https://www.cerpsoft.in/");
        publisher.setLogo(OrganizationLogo);

        instance.setType("WebSite");
        instance.setHeadline("CERPSOFT");
        instance.setAuthor(author);
        instance.setPublisher(publisher);

        ObjectMapper objectMapper = new ObjectMapper();
        returnString = objectMapper.writeValueAsString(instance);

        return returnString;
    }
}
