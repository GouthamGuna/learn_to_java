package in.dev.gmsk.model;

import in.dev.gmsk.model.Author;
import in.dev.gmsk.model.Publisher;
import lombok.Getter;
import lombok.Setter;

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

