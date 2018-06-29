public class Loops {
  public static void main(String args[]) {
    //Arrays
    int[] fixedLengthofIntegers = new int[8];
    Scanner keyboard = new Scanner(System.in);


    int counter = 0;
    while(counter < 8) {
      System.out.println("Please enter a number: ");
      fixedLengthofIntegers = Scanner.nextInt();
      counter++;
    }//while

    counter = 0;
    while(counter < 8) {
      System.out.println("Here's your "+counter+" number: " + fixedLengthofIntegers[counter]);
      counter++;
    }//while


    //Why for loops
    for(int i = 0; i < 8; i++) {
      System.out.println("Please enter a number: ");
      fixedLengthofIntegers = Scanner.nextInt();
    }//while
    for(int i = 0; i < 8; i++) {
      System.out.println("Here's your "+counter+" number: " + fixedLengthofIntegers[counter]);
    }//while


    //Just for ideas, we will not be doing sorts today, but we will think about them, because they are some of the most basic algorithms
    //BubbleSort
    for(int i = 0; i < 8; i++) {
      for(int j = i+1; j < 8; j++) {
        if(fixedLengthofIntegers[i] > fixedLengthofIntegers[j]) {
          int temporary = fixedLengthofIntegers[i];
          fixedLengthofIntegers[i] = fixedLengthofIntegers[j];
          fixedLengthofIntegers[j] = fixedLengthofIntegers[i];
        }//if
      }//for
    }//for

    //InsertionSort
    int[] newArray = new int[8];
    for(int i = 0; i < 8; i++) {
      int min = fixedLengthofIntegers[0];
      int minindex = 0;
      for(int j = 0; j < 8; j++) {
        if(fixedLengthofIntegers[j] < min) {
          min = fixedLengthofIntegers[j];
          minindex = j;
        }//if
      }//for
      newArray[j] = fixedLengthofIntegers[j];
      fixedLengthofIntegers[j] = Integer.MAX_VALUE;
    }
    fixedLengthofIntegers = newArray;

  }//main

  //This is the best sort we know of
  public int QuickSort(int[] array, int left, int right) {
    int i = left;
    int j = right;
    int pivot = array[(left+right)/2];
    if(left > right) return 1;//I deviated from the algorithms online
    //I like this halt better

    while(i <= j) {
      while(array[i] < pivot) {//Push I to the first value greater than the pivot
        i++;
      }
      while(array[j] > pivot) {//Push J to the fitst value lesser than the pivot
        j--;
      }
      if(i <= j) {//I and J have flipped
        Swap(array, i, j);
        i++;
        j--;
      }//if
    }//while i<=j
    return QuickSort(array, left, j)+QuickSort(array, i, right);
  }//QuickSort
}//loops
