package in.dev.gmsk.codec;

import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.*;

class Base64CodecTest {

    @Test
    void getAlphabet() {
        char input = 'a';
        byte[] alphabet = Base64Codec.getAlphabet(input);

        System.out.println("alphabet = " + alphabet);
    }
}