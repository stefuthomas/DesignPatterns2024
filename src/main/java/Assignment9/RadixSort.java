package Assignment9;

import java.util.Arrays;

public class RadixSort extends SortingStrategy{

    public RadixSort(int[] numbers) {
        super(numbers);
    }

    @Override
    public void sort() {
        // start timer
        startTime = System.currentTimeMillis();
        // Find the maximum number to know number of digits
        int m = getMax(numbers, numbers.length);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(numbers, numbers.length, exp);
        // end timer
        endTime = System.currentTimeMillis();
        super.print();
    }

    public int getMax(int[] numbers, int n) {
        {
            int mx = numbers[0];
            for (int i = 1; i < n; i++)
                if (numbers[i] > mx)
                    mx = numbers[i];
            return mx;
        }
    }

    public void countSort(int[] numbers, int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(numbers[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(numbers[i] / exp) % 10] - 1] = numbers[i];
            count[(numbers[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            numbers[i] = output[i];
    }

}
