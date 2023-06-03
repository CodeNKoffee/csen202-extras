import java.util.*;

public class Trace {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the name of your matrix: ");
    String matrixName = input.nextLine();
    input.close();
    int[][] arr = {{1, 2}, {1, 2}};
    tr(arr, matrixName);
  }

  public static void tr(int[][] arr, String matrixName) {
    int n = arr.length;
    int m = arr[0].length;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        sum += (i == j) ? arr[i][j] : 0;
      }
    }
    System.out.println("tr("+ matrixName+") = "+ sum);
  }
}
