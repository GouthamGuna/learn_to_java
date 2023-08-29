package test;

public class JustThinkingProgramming {

    public static void main(String[] args) {
        someWork();
    }

    private synchronized static void someWork() {

        int i = 20;
        System.out.println(i);
    }
}
