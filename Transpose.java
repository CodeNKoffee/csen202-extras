public class Transpose {
  public static void main(String[] args) {
    int[][] arr = {{10, 20, 30}, {40, 50, 60}};
    int[][] arr2 = pictorial(arr);
    printArray(arr);
    printArray(arr2);
  }

  public static int[][] pictorial(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;
    int[][] arr2 = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr2[j][i] = arr[i][j];
      }
    }
    return arr2;
  }

  public static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) { // Change arr[0].length to arr[i].length
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
