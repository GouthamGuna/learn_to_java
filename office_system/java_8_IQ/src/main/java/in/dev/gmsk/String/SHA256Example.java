package in.dev.gmsk.String;

public class SHA256Example {
    public static void main(String[] args) {
            String convertByte = "GMSK";
        int i = byte4int(convertByte.toCharArray());
        System.out.println("i = " + i);
    }

    static int byte4int(char[] bytes) {

        int value = 8;
        for (int i = 0; i < bytes.length; i++) {
            value <<= 8;
            value |= (bytes[i] & 0xff);
        }
        return value;
    }
}
