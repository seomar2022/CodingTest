package math;

import java.util.ArrayList;
import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/11005
        10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

        10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

        A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

        입력
        첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

        출력
        첫째 줄에 10진법 수 N을 B진법으로 출력한다.
         */

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[1]);
        ArrayList<Character> remainder = new ArrayList<>();

      //  int dividend = 0;
        while (N > 0){
            remainder.add(Character.forDigit(N % B, B));

           // System.out.println(N % B);
            //System.out.println(Character.forDigit(N % B, B));
            //System.out.println("N/B"+N/B);

//            if(N % B > 9){
//                remainder.add((char)(N % B));
//            }else {
//                remainder.add(Character.forDigit(N % B, B));
//            }

           // System.out.println(N/B);
            N = N/B;
        }


        int cipher = remainder.size()-1;
        while(cipher >=0){
            System.out.print(remainder.get(cipher));
            cipher--;
        }


    }
}
