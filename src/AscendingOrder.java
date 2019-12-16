import java.awt.*;
import java.util.*;

public class AscendingOrder {
    public static void sortArrayInAscendingOrder(int arrayOfIntegers[], int maxLengthOfTheArray) {

        int index;

        // make a collection to store positive integers
        Vector<Integer> storePositiveNumbers = new Vector<>();

        for (index = 0; index < maxLengthOfTheArray; index++) {
            if (arrayOfIntegers[index] >= 0)
                storePositiveNumbers.add(arrayOfIntegers[index]);
        }

        // sort the stored integers in ascending order(positive numbers)
        Collections.sort(storePositiveNumbers);

        // if current element is positive, replace it with the sorted element from the stored numbers
        int storedInteger = 0;
        for (index = 0; index < maxLengthOfTheArray; index++) {

            if (arrayOfIntegers[index] >= 0)
            {
                arrayOfIntegers[index] = storePositiveNumbers.get(storedInteger);
                storedInteger++;
            }
        }

        // print the new sorted array
        for (index = 0; index < maxLengthOfTheArray; index++)
            System.out.print(arrayOfIntegers[index] + ", ");
    }

    public static void main(String[] args){

        int arrayOfIntegers[] = {7, 2, 8, -1, 4, 5, -3, -6};
        int maxLengthOfTheArray = arrayOfIntegers.length;

        System.out.println("----Problem 3. Ascending Order without changing the position of the negative integers--- ");
        System.out.print("Sorted Array: ");
        sortArrayInAscendingOrder(arrayOfIntegers, maxLengthOfTheArray);
    }

}
