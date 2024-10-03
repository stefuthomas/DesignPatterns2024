package Assignment9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate big and small numbers-arrays
        int[] numbersBig = new int[100000];
        int[] numbersSmall = new int[1000];

        // Fill the arrays with random numbers
        for (int i = 0; i < numbersBig.length; i++) {
            numbersBig[i] = random.nextInt(Integer.MAX_VALUE);
        }
        for (int i = 0; i < numbersSmall.length; i++) {
            numbersSmall[i] = random.nextInt(Integer.MAX_VALUE);
        }

        System.out.println("Sorting a big array...");
        // Sorting the big array with all the sorting algorithms
        SortingContext sortingContext = new SortingContext(new RadixSort(Arrays.copyOf(numbersBig, numbersBig.length)));
        sortingContext.sort();
        sortingContext.setSortingStrategy(new GnomeSort(Arrays.copyOf(numbersBig, numbersBig.length)));
        sortingContext.sort();
        sortingContext.setSortingStrategy(new CocktailSort(Arrays.copyOf(numbersBig, numbersBig.length)));
        sortingContext.sort();

        System.out.println("Sorting a small array...");
        // Sorting the small array with all the sorting algorithms
        sortingContext.setSortingStrategy(new RadixSort(Arrays.copyOf(numbersSmall, numbersSmall.length)));
        sortingContext.sort();
        sortingContext.setSortingStrategy(new GnomeSort(Arrays.copyOf(numbersSmall, numbersSmall.length)));
        sortingContext.sort();
        sortingContext.setSortingStrategy(new CocktailSort(Arrays.copyOf(numbersSmall, numbersSmall.length)));
        sortingContext.sort();

    }
}
