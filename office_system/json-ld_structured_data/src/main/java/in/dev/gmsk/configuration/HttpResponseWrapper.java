package in.dev.gmsk.configuration;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

/**
 * @author gowtham_sankar gunasekaran
 * @links https://gouthamguna.github.io/in/
 * @since 1.0
 */

public class HttpResponseWrapper extends HttpServletResponseWrapper {

    /**
     * Constructs a response adaptor wrapping the given response.
     *
     * @param response the {@link jakarta.servlet.http.HttpServletResponse} to be wrapped.
     * @throws IllegalArgumentException if the response is null
     */

    public HttpResponseWrapper(HttpServletResponse response) {
        super(response);
    }
}
