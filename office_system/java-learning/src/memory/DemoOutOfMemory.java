package memory;

public class DemoOutOfMemory {

    // change JVM option -Xmx512M
    public static void generateOutOfMemory() {
        Long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(maxMemory);
        int[] matrix = new int[(int) (maxMemory + 1)];
        for (int i = 0; i < matrix.length; ++i) {
            matrix[i] = i + 1;
        }
    }
}
