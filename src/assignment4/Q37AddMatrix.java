package assignment4;

public class Q37AddMatrix {
	
	public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] firstMatrix =  { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] secondMatrix = { {4, 5, 6}, {2, 7, 8}, {3, 1, 9} };

        // Adding 
        int[][] sum = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying 
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int col : row) {
                System.out.print(col + "      "); //how wide you want your elements to be
            }
            System.out.println();
           
        }
    }
}
