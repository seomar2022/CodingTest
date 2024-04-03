package factor;

import java.util.Scanner;

public class Factor1 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/5086
        As I am sure you are aware, 4 x 3 = 12.

        This means that 3 is a factor of 12 and that 12 is a multiple of 3.

        This also means that 4 is a factor of 12 and that 12 is a multiple of 4.

        In this problem you will be given sets of two numbers and have to decide which of three relationships applies:

        1. The first number is a factor of the second number
        2. The first number is a multiple of the second number
        3. The first number is neither a factor nor a multiple of the second number.


        Input consists of a series of lines, each line containing two positive integers, both less than 10,000, separated by a space. Input is finished when the numbers are 0 0; do not process this line.

        Output consists of one line for each line of input. The line will consist of the word factor if the first number is a factor of the second number, the word multiple if the first number is a multiple of the second number or the word neither if the first number is neither a factor nor a multiple of the second number.
         */


        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        while(first != 0 && second != 0){
            if(second%first==0){
                System.out.println("factor");
            }else if(first%second==0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }

            first = sc.nextInt();
            second = sc.nextInt();

        }

    }
}
