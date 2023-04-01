package update_test;

import java.util.HashSet;
import java.util.Set;

public class OutOfMemory {
    public static void main(String[] args) {

        Set<Integer> addSet = new HashSet<>();

        for(int i=0; i < Integer.MAX_VALUE; i++){
            addSet.add(i);
            System.out.println("i value  = " +i);
        }
    }
}
