package in.dev.gmsk.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Publisher {
    public final String type = "Organization";
    public String name;
    public String url;
    public List<String> logo;
}
