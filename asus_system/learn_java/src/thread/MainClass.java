package thread;

public class MainClass {
    public static void main(String[] args) {

        ChildThread childThread = new ChildThread();
        childThread.run();
    }
}
