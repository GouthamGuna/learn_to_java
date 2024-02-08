package in.dev.gmsk.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Author {
    public final String type = "Person";
    public String name;
    public String jobTitle;
    public String url;
    public String image;
}
