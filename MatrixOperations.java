import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows and columns for matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter Matrix 1 elements:");
        inputMatrix(scanner, matrix1, rows, cols);

        System.out.println("Enter Matrix 2 elements:");
        inputMatrix(scanner, matrix2, rows, cols);

        System.out.println("\nAddition:");
        printMatrix(addMatrices(matrix1, matrix2, rows, cols));

        System.out.println("\nSubtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2, rows, cols));

        System.out.println("\nMultiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2, rows, cols));

        scanner.close();
    }

    public static void inputMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = mat1[i][j] + mat2[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = mat1[i][j] - mat2[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < cols; k++)
                    result[i][j] += mat1[i][k] * mat2[k][j];
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
