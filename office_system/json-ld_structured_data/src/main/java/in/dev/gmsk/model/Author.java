package in.dev.gmsk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Author {

    @SerializedName("@type")
    public final String type = "Person";
    public String name;
    public String jobTitle;
    public String url;
    public String image;
}
