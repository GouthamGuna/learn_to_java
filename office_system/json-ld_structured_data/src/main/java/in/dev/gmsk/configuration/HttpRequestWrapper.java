package in.dev.gmsk.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * @author gowtham_sankar gunasekaran
 * links https://gouthamguna.github.io/in/
 * @since 1.0
 */

public class HttpRequestWrapper extends HttpServletRequestWrapper {

    public HttpRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    private Hashtable<Object, Object> localParams = null;

    public void setParameter(String name, String[] values) {

        if (localParams == null) {

            localParams = new Hashtable<>();

            Map<String, String[]> wrappedParams = getRequest().getParameterMap();
            Set<String> keySet = wrappedParams.keySet();

            for (Object key : keySet) {
                Object value = wrappedParams.get(key);
                localParams.put(key, value);
            }
        }
        localParams.put(name, values);
    }

    @Override
    public String getParameter(String name) {

        if (localParams == null) {
            return getRequest().getParameter(name);
        }

        Object val = localParams.get(name);
        if (val instanceof String) {
            return (String) val;
        }

        if (val instanceof String[]) {
            String[] values = (String[]) val;
            return values[0];
        }

        return (val == null ? null : val.toString());
    }

    @Override
    public String[] getParameterValues(String name) {

        if (localParams == null) {
            return getRequest().getParameterValues(name);
        }

        return (String[]) localParams.get(name);
    }
}
