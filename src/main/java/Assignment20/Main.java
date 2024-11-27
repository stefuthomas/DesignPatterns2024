package Assignment20;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence sequence = new FibonacciSequence();
        FibonacciIterator iterator = sequence.iterator();
        for (int i = 0; i < 10; i++) {
            System.out.println(iterator.next());
        }
    }
}
