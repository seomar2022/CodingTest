import java.util.Scanner;

public class string14 {

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
 */
/*

5

1 -> 5
2 -> 4, 5, 6
3 -> 3, 4, 5, 6, 7
4 -> 2, 3, 4, 5, 6, 7, 8
5 -> 1, 2, 3, 4, 5, 6, 7, 8, 9

6 -> 2, 3, 4, 5, 6, 7, 8
7 -> 3, 4, 5, 6, 7
8 -> 4, 5, 6
9 -> 5

 */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); sc.nextLine();
       // System.out.println("*" * input);
        //int count = input * 2 - 1;
        for(int i = 1; i<=input * 2 - 1;i++){
            System.out.println(i);

            int count = 1;
            System.out.printf("|");
            while(count <= input * 2 - 1){
                if(count > input-i && count < input+i){
                    System.out.printf("%c", '*');
                }else {
                    System.out.printf("%c", ' ');
                }
                count++;
            }
            System.out.printf("|");
            System.out.printf("\n");
            while (count > input * 2 - 1){

            }


            //1 2 3
            //1 3 5
            //
//            while(i >0){
//                System.out.printf("%c", '*');
//            }
//            i--;

            /*
            if(i <= input){
                for(int j = i; j<i * 2 - 1;j++){
                    System.out.println("i ->" + i);
                    System.out.println("j ->" + j);
                    System.out.printf("%c", '*');
                }
            }else {
                //6 7 8 9
                //1 2 3 4
                //7 5 3 1
                for(int j = i-input; j<(i-input) * 2 - 1;j++){
                    System.out.printf("%c", '*');
                }
            }

             */


        }



    }
}
