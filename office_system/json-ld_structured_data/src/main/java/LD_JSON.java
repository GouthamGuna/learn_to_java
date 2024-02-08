import lombok.Getter;
import lombok.Setter;

import java.util.List;

/*public String datePublished;
   public String dateModified;*/

@Setter
@Getter
public class LD_JSON {

    public final String context = "https://schema.org";
    public String type;
    public String headline;
    public Author author;
    public Publisher publisher;
}

@Setter
@Getter
class Author {
    public final String type = "Person";
    public String name;
    public String jobTitle;
    public String url;
    public String image;
}

@Setter
@Getter
class Publisher {
    public final String type = "Organization";
    public String name;
    public String url;
    public List<String> logo;
}
