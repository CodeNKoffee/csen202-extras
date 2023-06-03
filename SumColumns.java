public class SumColumns {
  public static void main(String[] args) {
    int[][] arr = {{5, 1}, {11, 3}, {4, 6}};
    addCols(arr);
  }

  public static void addCols(int[][] arr) {
    for (int i = 0; i < arr[0].length; i++) { // Change arr[i].length to arr[0].length
      int sum = 0;
      for (int j = 0; j < arr.length; j++) {
        sum += arr[j][i]; // Change arr[i][j] to arr[j][i]
      }
      System.out.print(sum + ", ");
    }
  }
}
