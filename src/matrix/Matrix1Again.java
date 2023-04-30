package matrix;

import java.util.Scanner;

public class Matrix1Again {//同じsizeのmatrix２つを足す
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int sizeOfRow = Integer.parseInt(input.split(" ")[0]);
    int sizeOfCol = Integer.parseInt(input.split(" ")[1]);

    int[][] matrix1 = makeMatrix(sizeOfRow, sizeOfCol);
    int[][] matrix2 = makeMatrix(sizeOfRow, sizeOfCol);

    int[][] resultMatrix = new int[sizeOfRow][sizeOfCol];

    for (int row = 0; row < sizeOfRow; row++) {
        for (int col = 0; col < sizeOfCol; col++) {
            resultMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
        }
    }

    //結果出力
    for (int row = 0; row < sizeOfRow; row++) {
        for (int col = 0; col < sizeOfCol; col++) {
            System.out.print(resultMatrix[row][col] + " ");
        }
        System.out.println();
    }

    //    sc.close();

}


    public static int[][] makeMatrix(int sizeOfRow, int sizeOfCol){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[sizeOfRow][sizeOfCol];

        int row = 0;
        while (row < sizeOfRow){
            String elements = sc.nextLine();
            String[] element = elements.split(" ");

            for (int col = 0; col < sizeOfCol; col++){
                // System.out.println("elements -> " +elements);
                // System.out.println("element -> "+ Integer.parseInt(element[col]));

                matrix[row][col] = Integer.parseInt(element[col]);
            }
            row++;
        }

        return matrix;
    }//end makeMatrix
}