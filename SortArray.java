import java.util.*;

public class SortArray {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] numArr = new int[10];
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = rand.nextInt(1000000);
    }
    System.out.println("Before: ");
    printArray(numArr);

    String[] stringArr = {"Nolan", "Bishop", "Chen", "West", "Bradford", "Lopez", "Grey"};
    System.out.println("Before: ");
    printArray(stringArr);

    bubbleSort(numArr);
    System.out.println("Sorted number array: "+ Arrays.toString(numArr));
    bubbleSort(stringArr);
    System.out.println("Sorted String array: "+ Arrays.toString(stringArr));
  }

  public static void bubbleSort(int[] numArr) {
    boolean swapped;
    do {
      swapped = false;
      for (int i = 0; i < numArr.length - 1; i++) {
        if (numArr[i] > numArr[i + 1]) {
          int temp = numArr[i];
          numArr[i] = numArr[i + 1];
          numArr[i + 1] = temp;
          swapped = true;
        }
      }
    } while (swapped);
  }

  public static void bubbleSort(String[] stringArr) {
    boolean swapped;
    do {
      swapped = false;
      for (int i = 0; i < stringArr.length - 1; i++) {
        if (stringArr[i].compareToIgnoreCase(stringArr[i + 1]) > 0) {
          String temp = stringArr[i];
          stringArr[i] = stringArr[i + 1];
          stringArr[i + 1] = temp;
          swapped = true;
        }
      }
    } while (swapped);
  }

  public static void printArray(int[] numArr) {
    for (int i = 0; i < numArr.length; i++) {
      System.out.println(numArr[i]);
    }
  }

  public static void printArray(String[] stringArr) {
    for (int i = 0; i < stringArr.length; i++) {
      System.out.println(stringArr[i]);
    }
  }
}