package memory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class DirectMemoryOOM {

    /**
     * 1MB = 1024 * 1024 (Byte)
     *
     * 1KB = 1024 (Byte)
     *
     * 1MB = 1000 (KB)
     *
     * 1GB = 1000 (MB)
     *
     * 1TB = 1000 (GB)
     *
     * One_PetaByte = 1000 (TB)
     */

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {

        Field unsafeField = Unsafe.class.getDeclaredFields()[0];

        unsafeField.setAccessible(true);
        Unsafe unsafe = null;
        try {
            unsafe = (Unsafe) unsafeField.get(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
