package Assignment9;

public class GnomeSort extends SortingStrategy {

    public GnomeSort(int[] numbers) {
        super(numbers);
    }

    @Override
    public void sort() {
        // start timer
        startTime = System.currentTimeMillis();
        int n = numbers.length;

        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (numbers[index] >= numbers[index - 1])
                index++;
            else {
                int temp = 0;
                temp = numbers[index];
                numbers[index] = numbers[index - 1];
                numbers[index - 1] = temp;
                index--;
            }
        }
        // end timer
        endTime = System.currentTimeMillis();
        super.print();
    }
}
