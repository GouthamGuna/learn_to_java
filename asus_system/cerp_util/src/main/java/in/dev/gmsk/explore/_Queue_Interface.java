package in.dev.gmsk.explore;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class _Queue_Interface {
    private static final Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        example_1();
        example_2(List.of("team1", "team2").toString());
    }

    public static void example_1() {

        // Queue is an interface. & add(element)
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        System.out.println("queue = " + queue);

        // offer(element) & Adds an element to the rear of the queue.
        boolean added = queue.offer("Grapes");
        System.out.println("added = " + added);
        System.out.println("After queue = " + queue);

        // remove() & Removes and returns the element at the front of the queue.
        String removedElement = queue.remove();
        System.out.println("removedElement = " + removedElement);
        System.out.println("After remove the ele in the queue = " + queue);

        // poll() & Removes and returns the element at the front of the queue.
        String polledElement = queue.poll();
        System.out.println("polledElement = " + polledElement);
        System.out.println("After polled ele in the queue = " + queue);

        // element() & Returns (but does not remove) the head of the queue.
        String headElement = queue.element();
        System.out.println("headElement = " + headElement);

        // peek() & Returns (but does not remove) the head of the queue.
        String peekedElement = queue.peek();
        System.out.println("peekedElement = " + peekedElement);

        int size = queue.size();
        System.out.println("size = " + size);
    }

    /**
     * <pre>{@code
     *         int r;
     *         try {
     *             CompletableFuture<Integer> integerCompletableFuture =
     *                     CompletableFuture.supplyAsync(_Queue_Interface::responseFromServer, Executors.newCachedThreadPool());
     *
     *             r = integerCompletableFuture.get();
     *
     *             Stack<Integer> stack = new Stack<>();
     *             stack.push(r);
     *             System.out.println("stack = " + stack);
     *
     *             if (list.size() == stack.size()) {
     *                 System.out.printf("inputRequestSize = %d , responseFromServer = %d, stackSize = %d, stack values = %s, stack last element %s%n", list.size(), r, stack.size(), stack, stack.pop());
     *             } else {
     *                 example_2(input); // Recursive call
     *             }
     *
     *         } catch (InterruptedException | ExecutionException e) {
     *             throw new RuntimeException(e);
     *         }
     * }</pre>
     * <p>
     * <p>
     * Stack Behavior:
     * <p/>
     * The stack in your code snippet appears to behave as expected.
     * However, note that each recursive call to example_2 creates a new stack frame,
     * so the stack is not shared across recursive calls.
     * Therefore, each stack will contain only one element (the value of r) at any given time.
     */

    public static void example_2(String input) {
        if (input != null && input.isEmpty()) {
            return;
        }

        assert input != null;
        List<String> list = Stream.of(input.split(",")).toList();
        System.out.printf("list.size() := %d, current thread := %s%n", list.size(), Thread.currentThread().getName());

        int r;
        try {
            CompletableFuture<Integer> integerCompletableFuture =
                    CompletableFuture.supplyAsync(_Queue_Interface::responseFromServer, Executors.newCachedThreadPool());

            r = integerCompletableFuture.get();

            stack.push(r);
            System.out.println("stack = " + stack);

            if (list.size() == stack.size()) {
                System.out.printf("Input Request Size = %d , Response From Server = %d, Stack Size := %d, stack Last Inserting Element := %s%n", list.size(), r, stack.size(), stack.pop());
            } else {
                example_2(input); // Recursive call
            }

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static int responseFromServer() {

        try {
            System.out.printf("Sleeping thread = %s%n", Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Random().nextInt(100) + 1;
    }
}
