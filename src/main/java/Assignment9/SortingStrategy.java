package Assignment9;

public abstract class SortingStrategy {

    protected int[] numbers;
    protected long startTime, endTime, sortTime;

    public SortingStrategy(int[] numbers) {
        this.numbers = numbers;
    }

    abstract void sort();

    public void print() {
        System.out.println("Sorting with " + this.getClass().getSimpleName());
        calculateSortingTime();
        System.out.println("Sorting time = " + sortTime + " milliseconds");
    }

    public void calculateSortingTime() {
        sortTime = endTime - startTime;
    }
}
