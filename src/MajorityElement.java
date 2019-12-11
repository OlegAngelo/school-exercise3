public class MajorityElement {

    //find candidate for majority
   public static int findCandidate(int arrayOfIntegers[], int maxLength) {

       int maj_index = 0, count = 1;
       int index;

       for (index = 1; index < maxLength; index++) {
           if (arrayOfIntegers[maj_index] == arrayOfIntegers[index]) {
               count++;
           } else {
               count--;
               if (count == 0) {
                   maj_index = index;
                   count = 1;
               }
           }
       }
       return arrayOfIntegers[maj_index];
   }

     //check candidate if it occurs more than n/2 times
    public static boolean isMajority(int[] arrayOfIntegers, int maxLength, int candidate){
       int index, count = 0;

       for(index = 0; index < maxLength; index++){
           if(arrayOfIntegers[index] == candidate) {
               count++;
           }
       }
       if(count > maxLength / 2){
           return true;
       }else{
           return false;
       }
    }

    public static void printMajority(){

        int arrayOfIntegers[] = {5,5,5};
        int maxLength = arrayOfIntegers.length / arrayOfIntegers[0];

        int candidate = findCandidate(arrayOfIntegers, maxLength);

        if(isMajority(arrayOfIntegers, maxLength, candidate)){
            System.out.println("The majority element is " + candidate);
        }else{
            System.out.println("There is no majority element");
        }
    }

     public static void main(String[] args) {

       printMajority();

    }
}
