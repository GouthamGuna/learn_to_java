package in.dev.gmsk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author gowtham_sankar gunasekaran
 * @see <a href="https://gouthamguna.github.io/in/">GMSK</a>
 * @since 1.0
 */

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

