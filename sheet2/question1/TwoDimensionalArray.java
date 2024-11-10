public class TwoDimensionalArray {
  private int[][] matrix;
  private int currentRow = 0;
  private int currentCol = 0;

  TwoDimensionalArray() {
    this.matrix = new int[3][2];
  }

  public void insertRow(int[] row) {
    matrix[currentRow] = row;
    currentRow += 1;
  }

  public void insertColumn(int[] col) {
    for (int data : col) {
      matrix[currentRow][currentCol] = data;
      currentRow += 1;
    }
  }

  public void deleteRow(int index) {
    for (int i = 0; i < matrix[index].length; i++) {
      matrix[index][i] = 0;
    }
  }

  public void display() {
    for (int[] row : matrix) {
      for (int data : row) {
        System.out.print(data + " ");
      }
      System.out.println();
    }
  }

  public void traverse() {
    for (int[] row : matrix) {
      for (int data : row) {
        if (data != 0) {
          System.out.print(data + " ");
        }
      }
    }
  }

  public static void main(String[] args) {
    TwoDimensionalArray matrix = new TwoDimensionalArray();
    int[] row1 = { 1, 2 };
    matrix.insertRow(row1);
    int[] col1 = { 3, 4 };
    matrix.insertColumn(col1);
    matrix.deleteRow(0);
    matrix.traverse();
  }
}