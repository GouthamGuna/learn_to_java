package in.dev.gmsk.configuration;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * @author gowtham_sankar gunasekaran
 * @links https://gouthamguna.github.io/in/
 * @since 1.0
 */

public class HttpResponseWrapper extends HttpServletResponseWrapper {

    /**
     * Constructs a response adaptor wrapping the given response.
     *
     * @param response the {@link HttpServletResponse} to be wrapped.
     * @throws IllegalArgumentException if the response is null
     */

    public HttpResponseWrapper(HttpServletResponse response) {
        super(response);
    }
}
