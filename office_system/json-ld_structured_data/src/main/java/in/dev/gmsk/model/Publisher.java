package in.dev.gmsk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Publisher {

    @SerializedName("@type")
    public final String type = "Organization";
    public String name;
    public String url;
    public List<String> logos;
}
