import java.util.Scanner;

public class RotateMatrix
{

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    // Get matrix dimensions
    System.out.print("Enter the number of rows (m): ");
    int m = scanner.nextInt();
    System.out.print("Enter the number of columns (n): ");
    int n = scanner.nextInt();

    // Create and accept matrix
    int[][] matrix = new int[m][n];
    System.out.println("Enter matrix elements:");
    for (int i = 0; i < m; i++)
    {
      for (int j = 0; j < n; j++)
      {
        matrix[i][j] = scanner.nextInt();
      }
    }

    // Display original matrix
    System.out.println("\nOriginal Matrix:");
    displayMatrix(matrix);

    // Rotate matrix (in-place) - Rotates 180 degrees clockwise
    rotateMatrix(matrix);

    // Display rotated matrix
    System.out.println("\nRotated Matrix (180 degrees clockwise):");
    displayMatrix(matrix);

    scanner.close();
  }

  public static void rotateMatrix(int[][] matrix)
  {
    int m = matrix.length;
    int n = matrix[0].length;

    // Loop through half the matrix (since elements become opposites after 180 degrees)
    for (int i = 0; i < m / 2; i++)
    {
      for (int j = 0; j < n; j++)
      {
        // Swap elements from opposite corners
        int temp = matrix[i][j];
        matrix[i][j] = matrix[m - i - 1][n - j - 1];
        matrix[m - i - 1][n - j - 1] = temp;
      }
    }
  }

  public static void displayMatrix(int[][] matrix)
  {
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[0].length; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}