public class MajorityElement {

    //find element that is majority in the array
    public static void findMajorityElement(int[] arrayOfIntegers) {

        int maxLengthOfTheArray = arrayOfIntegers.length;                                               // maxLengthOfTheArray is 20
        int maj_element = arrayOfIntegers[0];                                                           // maj_element is 5 which is the current index(0)
        int count = 1;                                                                                  // set count of major element candidate to 1 since its starting as one element already

       for (int index = 1; index < maxLengthOfTheArray; index++) {                                      // instantiate the first element/index(0) as the candidate for majority then >

           if (maj_element == arrayOfIntegers[index]) {                                                 // compares if the next element/index(1) is the same then >
               count++;                                                                                 // add the count to 2 since it is equal and it was instantiated to 1

           } else if (count == 0) {                                                                     // if count gets to 0 after checking the whole array then >
               maj_element = arrayOfIntegers[index];                                                    // the current index will be the next candidate as the maj_element
               count = 1;                                                                               // sets the count back to 0 then re runs the loop to check again

           } else {                                                                                     // BUT if the candidate != current index(1) then >
               count--;                                                                                 // decrease the count to 0 since it was 1 before then >
           }                                                                                            // re-runs the loop
       }

       //check if it occurs more than n/2 times
       count = 0;                                                                                       // set count to 0 since we are counting how much the current index occurs

       for (int index = 0; index < maxLengthOfTheArray; index++) {
           if (maj_element == arrayOfIntegers[index]) {                                                 // checks if the major candidate is equal to the current index then >
               count++;                                                                                 // adds 1 to the  count
           }
       }

       if (count > maxLengthOfTheArray / 2) {                                                           // if the count is greater than the half of the length of the array, then >
           System.out.println("The majority element is " + maj_element);                                // prints the maj_element
       }else if(maxLengthOfTheArray == 0){                                                              // BUT if theres only one element, it prints the element
           return;
       } else {                                                                                         // otherwise, if count is equal or lesser than the half of the length of the array, then >
           System.out.println("Majority element does not exist");                                       // prints no majority element
       }
    }


    public static void main(String[] args) {
        int[] arrayOfIntegers = {5, 2, 4, 3, 5, 5, 2, 5, 1, 5, 5, 5, 4, 5, 2, 3, 5, 5, 3, 1};           // set the array
        findMajorityElement(arrayOfIntegers);                                                           // call the method with a parameter of arrayOfIntegers
    }
}
