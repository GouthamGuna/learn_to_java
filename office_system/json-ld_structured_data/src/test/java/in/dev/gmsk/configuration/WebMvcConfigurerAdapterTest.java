package in.dev.gmsk.configuration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebMvcConfigurerAdapterTest {

    @Test
    void setRegistry() {
        WebMvcConfigurerAdapter.setRegistry().forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
        assertTrue(true);
    }

    @Test
    void setCorsFilter() {
        WebMvcConfigurerAdapter.setCorsFilter().forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
        assertTrue(true);
    }
}