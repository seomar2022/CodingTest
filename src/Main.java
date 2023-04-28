import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sizeOfMatrix1 = Integer.parseInt(input.split(" ")[0]);
        int sizeOfMatrix2 = Integer.parseInt(input.split(" ")[1]);

       // int[][] matrix1 = makeMatrix(sizeOfMatrix1);
       // int[][] matrix2 = makeMatrix(sizeOfMatrix2);

        int[][] matrix1 = new int[sizeOfMatrix1][sizeOfMatrix1];
        int[][] matrix2 = new int[sizeOfMatrix2][sizeOfMatrix2];

        int row = 0;
        while (row < sizeOfMatrix1){
            String elements = sc.nextLine();
            String[] element = elements.split(" ");

            for (int col = 0; col < sizeOfMatrix1; col++){
                // System.out.println("elements -> " +elements);
                // System.out.println("element -> "+ Integer.parseInt(element[col]));

                matrix1[row][col] = Integer.parseInt(element[col]);
            }
            row++;
        }

        row = 0;
        while (row < sizeOfMatrix2){
            String elements = sc.nextLine();
            String[] element = elements.split(" ");

            for (int col = 0; col < sizeOfMatrix2; col++){
                // System.out.println("elements -> " +elements);
                // System.out.println("element -> "+ Integer.parseInt(element[col]));

                matrix1[row][col] = Integer.parseInt(element[col]);
            }
            row++;
        }



        int resultSize = (sizeOfMatrix1>sizeOfMatrix2)? sizeOfMatrix1:sizeOfMatrix2;
        int smallSize = (sizeOfMatrix1<sizeOfMatrix2)? sizeOfMatrix1:sizeOfMatrix2;

        int[][] resultMatrix = new int[resultSize][resultSize];

        for (int row2 = 0; row2 < smallSize; row2++) {
            for (int col = 0; col < smallSize; col++) {
                resultMatrix[row2][col] = matrix1[row2][col] + matrix2[row2][col];
            }
        }
        for (int row3 = smallSize; row3 < resultSize; row3++) {

            for (int col = smallSize; col < resultSize; col++) {
                if(matrix1.length==resultSize){
                    int count = row3;
                    while(count >0){
                        resultMatrix[count][col] = matrix1[count][col];
                        count--;
                    }
                    while (count <resultSize-1){
                        resultMatrix[row3][count] = matrix1[row3][count];
                        //System.out.println("here?"+ matrix2[row3][col]);
                        count++;
                    }
                }else {
                    int count = row3;
                    while(count >0){
                        resultMatrix[count][col] = matrix2[count][col];
                        count--;
                    }
                    while (count <resultSize-1){
                        resultMatrix[row3][count] = matrix2[row3][count];
                        //System.out.println("here?"+ matrix2[row][col]);
                        count++;
                    }
                }

            }
        }



        //結果出力
        for (int row4 = 0; row4 < resultSize; row4++) {
            for (int col = 0; col < resultSize; col++) {
                System.out.print(resultMatrix[row4][col] + " ");
            }
            System.out.println();



    }
}
    }