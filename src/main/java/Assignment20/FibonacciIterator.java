package Assignment20;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private FibonacciSequence sequence;
    private int count = 0;
    private final int limit;

    public FibonacciIterator(FibonacciSequence sequence, int limit) {
        this.sequence = sequence;
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

    @Override
    public Integer next() {
        count++;
        return sequence.nextFibonacci();
    }
}