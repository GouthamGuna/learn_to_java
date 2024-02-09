package in.dev.gmsk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LD_JSON {

    @SerializedName("@context")
    public final String context = "https://schema.org";
    @SerializedName("@type")
    public String type;
    public String headline;
    public Author author;
    public Publisher publisher;
}

