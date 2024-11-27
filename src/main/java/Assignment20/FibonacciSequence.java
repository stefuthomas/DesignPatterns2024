package Assignment20;

public class FibonacciSequence implements Sequence {
    private int prev1 = 0;
    private int prev2 = 1;

    @Override
    public FibonacciIterator iterator() {
        return new FibonacciIterator(this, Integer.MAX_VALUE);
    }

    public int nextFibonacci() {
        int next = prev1 + prev2;
        prev1 = prev2;
        prev2 = next;
        return next;
    }
}