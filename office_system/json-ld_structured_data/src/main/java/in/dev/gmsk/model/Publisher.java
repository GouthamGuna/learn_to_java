package in.dev.gmsk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author gowtham_sankar gunasekaran
 * @see <a href="https://gouthamguna.github.io/in/">GMSK</a>
 * @since 1.0
 */

@Setter
@Getter
public class Publisher {

    @SerializedName("@type")
    public final String type = "Organization";
    public String name;
    public String url;
    public List<String> logos;
}
