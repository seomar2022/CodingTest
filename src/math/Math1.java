package math;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/2745
        문제
        B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

        10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

        A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

        입력
        첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

        B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

        출력
        첫째 줄에 B진법 수 N을 10진법으로 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String N = input.split(" ")[0];
        int B = Integer.parseInt(input.split(" ")[1]);
        //2진법수 110은
        char[] numbers = N.toCharArray();
        for(char number: numbers){
            System.out.print(number);
            if(!Character.isDigit(number)){//数字でない場合
                System.out.println("letter");
            }


        }

    }
}
