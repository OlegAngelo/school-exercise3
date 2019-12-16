import java.util.Arrays;

public class Median {

    // Function for calculating median
    public static int findMedian(int arrayOfIntegers[], int maxLengthOfTheArray)
    {
        // Sorting of array
        Arrays.sort(arrayOfIntegers);

        // check if even or odd
        if (maxLengthOfTheArray % 2 != 0)
            return arrayOfIntegers[maxLengthOfTheArray / 2];

        return (arrayOfIntegers[(maxLengthOfTheArray - 1) / 2] + arrayOfIntegers[maxLengthOfTheArray / 2]) / 2;
    }

    public static void main(String args[])
    {
        int arrayOfIntegers[]= {1, 7, 9 , 4, 7, 6, 12, 15, 13};
        int maxLengthOfTheArray = arrayOfIntegers.length;

        System.out.println("----Problem 2. Median----");
        System.out.println("The median of arrayOfIntegers" + Arrays.toString(arrayOfIntegers) + " is: " + findMedian(arrayOfIntegers, maxLengthOfTheArray));
    }
}