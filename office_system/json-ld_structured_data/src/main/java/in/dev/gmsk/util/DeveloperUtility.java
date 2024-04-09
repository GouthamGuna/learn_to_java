package in.dev.gmsk.util;

import in.dev.gmsk.configuration.HttpResponseWrapper;

import javax.servlet.http.HttpSession;
import java.util.function.BiConsumer;

import static java.lang.System.*;

public class DeveloperUtility {

    public static BiConsumer<HttpResponseWrapper, HttpSession> consoleLoggerPrinter = (response, session) -> {
        session.setAttribute("author", "@author gowtham_sankar gunasekaran");
        out.println(
                "----------------------------------------------------------------------------------------------------------");
        out.println(" Filter :: doFilter: [REQUEST] Start >>> (" + Thread.currentThread() + ")");
        out.println(" Filter :: doFilter: [REQUEST] Response <<< (" + Thread.currentThread() + "), status = "
                + response.getStatus());
        out.println(" Filter :: doFilter: [REQUEST] End <<< ( " + Thread.currentThread() + " )");
        out.println(
                "----------------------------------------------------------------------------------------------------------");
    };
}
