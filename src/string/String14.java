package string;

import java.util.Scanner;

public class String14 {

    public static void main(String[] args) {
/*
https://www.acmicpc.net/problem/2444
input
5

output
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

각 줄의 마지막 * 다음에는 " " 빈 칸을 채우지 않아요. 다시 말해, 각 줄은 * \n 로 끝나야합니다.
 */
/*

5

1 -> 5
2 -> 4, 5, 6
3 -> 3, 4, 5, 6, 7
4 -> 2, 3, 4, 5, 6, 7, 8
5 -> 1, 2, 3, 4, 5, 6, 7, 8, 9

6(=4) -> 2, 3, 4, 5, 6, 7, 8
7(=3)-> 3, 4, 5, 6, 7
8(=2) -> 4, 5, 6
9(=1)-> 5
 */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); sc.nextLine();

        for(int row = 1; row<=input * 2 - 1;row++){ //총 input * 2 - 1줄
            int col = 1;
            while(col <= input * 2 - 1){ //한줄에 input * 2 - 1개 들어가야함
                if(row <= input) {
                    if (col > input - row && col < input + row) {
                        System.out.printf("%c", '*');
                    } else if(col <= input - row) {
                        System.out.printf("%c", ' ');
                    }
                }else {
                    int newRow = input *2 - row; // row = input *2 - rowにしたら、row=6, row=4の無限ループになるからダメ
                    if (col > input - newRow && col < input + newRow) {
                        System.out.printf("%c", '*');
                    } else if(col <= input - newRow){
                        System.out.printf("%c", ' ');
                    }
                }
                col++;
            }
            System.out.printf("\n");


        }



    }
}
