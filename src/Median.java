import java.util.Arrays;

public class Median {

    // Function for calculating median
    public static double findMedian(int arrayOfIntegers[], int maxLength)
    {
        // Sorting of array
        Arrays.sort(arrayOfIntegers);

        // check if even or odd
        if (maxLength % 2 != 0)
            return (double)arrayOfIntegers[maxLength / 2];

        return (double)(arrayOfIntegers[(maxLength - 1) / 2] + arrayOfIntegers[maxLength / 2]) / 2;
    }

    public static void main(String args[])
    {
        int arrayOfIntegers[]= {1, 7, 9 , 4, 7, 6, 12, 15, 13};
        int maxLength = arrayOfIntegers.length;

        System.out.println("The median of arrayOfIntegers" + Arrays.toString(arrayOfIntegers) + " is: " + findMedian(arrayOfIntegers, maxLength));
    }
}

//1, 4,6,7,7,9,12,13,15
//1/4/5/5/5/6/6/7/7/8/9/12/13/15