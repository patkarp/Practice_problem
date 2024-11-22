/**
 * Find Diagonal in Matrix in matrix..
 * return Diagonal from Right to Left and Left to Right
 * 
 * Matrix
 * [ 2, 4,6]
 * [7, 9, 10]
 * [15, 6, 12]
 * [10, 9, 6]
 * 
 * 
 * Left to Right = > 2, 
 */
class MatrixDiagonal{
    public static void main(String[] args){
        int matrix[][] = {{ 2, 4,6},{7, 9, 10}, {15, 6, 12}, {10, 9, 6}};

        //printing matrix 
        for(int i = 0;i<matrix.length;i++){//navigate over rows
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println("Diagonals:");
        printDiagonals(matrix);

        System.out.println("Anti Diagonals:");
        printAntiDiagonals(matrix);


    }
    private static void printDiagonals(int[][] matrix){
        int n = matrix.length;
        int rowslen = matrix.length;
        int colslens = matrix[0].length;
        // Loop through diagonals starting from top-left to bottom-right
        for (int i = 0; i < rowslen; i++) {
            int row = i, col = 0;
            while (row >= 0 && col < colslens) {  // Ensure row and col are within bounds
                System.out.print(matrix[row--][col++] + " ");
            }
            System.out.println();
        }

        // Continue printing diagonals from the last row
        for (int j = 1; j < colslens; j++) {
            int row = rowslen - 1, col = j;
            while (row >= 0 && col < colslens) {  // Ensure row and col are within bounds
                System.out.print(matrix[row--][col++] + " ");
            }
            System.out.println();
        }
    }
    private static void printAntiDiagonals(int[][] matrix){
        int rowlens=matrix.length;
        int colslens=matrix[0].length;

        for(int i=0;i<colslens;i++){
            int row=0, col=i;
            while(row<rowlens && col>=0){
                System.out.print(matrix[row++][col--]+ " ");
            }
            System.out.println();

        }
        //Continue Printing Last Row
        for(int j = 1;j<rowlens;j++){
            int row = j, col=colslens-1;
            while(row<rowlens && col<colslens){
                System.out.print(matrix[row++][col--] +" ");
            }
            System.out.println();
        }
        
    }
}