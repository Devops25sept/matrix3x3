package java_practice;

public class Matrix3x3 {
	public static void main(String[] args) {
		System.out.println("Hello world----------");
		// Declare and initialize a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
	}
}
