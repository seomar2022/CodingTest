import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];  // 3x3のmatrixを作成
        matrix[0][0] = 1;  // 1行1列に要素を入れる
        matrix[0][1] = 2;  // 1行2列に要素を入れる
        matrix[0][2] = 3;  // 1行3列に要素を入れる
        matrix[1][0] = 4;  // 2行1列に要素を入れる
        matrix[1][1] = 5;  // 2行2列に要素を入れる
        matrix[1][2] = 6;  // 2行3列に要素を入れる
        matrix[2][0] = 7;  // 3行1列に要素を入れる
        matrix[2][1] = 8;  // 3行2列に要素を入れる
        matrix[2][2] = 9;  // 3行3列に要素を入れる

        System.out.println(matrix.length);

    }
}