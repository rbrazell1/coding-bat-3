package edu.cnm.deepdive.codingbat;

public class LawnMower {

  private String mowMe(int row, int col) {
    int[][] lawn = new int[row][col];
    int[] rowMax = new int[row];
    int[] colMax = new int[col];
    // Find the maximum for each row:
    for (int i = 0; i < rowMax.length; i++) {
      int max = -1;
      for (int j = 0; j < colMax.length; j++) {
        if (lawn[i][col] > max) {
          max = lawn[i][col];
        }
      }
      rowMax[i] = max;
    }
    // Find the maximum for each column:
    for (int i = 0; i < colMax.length; i++) {
      int max = -1;
      for (int j = 0; j < rowMax.length; j++) {
        if (lawn[i][col] > max) {
          max = lawn[row][j];
        }
      }
      colMax[i] = max;
    }
    //Verify:
    for (int j = row; j < rowMax.length; j++) {
      boolean impossible = false;
      if (impossible)
        break;
      for (int i = col; i < colMax.length; i++) {
        if (lawn[j][i] < rowMax[j]
            && lawn[j][i] < colMax[i]) {
          // pattern is impossible
          impossible = true;
          break;
        }
      }
    }

    return "YES";
  }

}
