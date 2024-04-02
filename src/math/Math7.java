package math;

import java.util.Scanner;

public class Math7 {
    public static void main(String[] args) {

    /*
    https://www.acmicpc.net/problem/2869
    There is a snail on the ground. It wants to climb to the top of a wooden pole with the height of V meters, measuring from the ground level. In one day it can climb A meters upwards, however during each night it sleeps, sliding B meters back down. Determine the number of days it needs to climb to the top.
    The first and only line of input contains three integers separated by a single space: A, B, and V (1 ≤ B < A ≤ V ≤ 1 000 000 000), with meanings described above.
     */
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //In one day it can climb A meters upwards
        int B = sc.nextInt(); //during each night it sleeps, sliding B meters back down
        int V = sc.nextInt(); //climb to the top of a wooden pole with the height of V meters

        /*
        시도1
        시간초과
        int distance = 0;
        int number_of_days=1;
        while(distance < V){
            distance += A;
            if(distance < V){
                distance -= B;
            }
            number_of_days++;
        }

         */
        
        /*
        시도2
        시간초과
        int distance = 0;
        int number_of_days=1;
        while(V-distance > A){
            distance += A;
            distance -= B;
            number_of_days++;
        }
        System.out.println(number_of_days);
         */

        //시도3
        //V-(A-B)(n-1) <= A를 만족하는 가장 작은 자연수 n
        //마지막날의 전날 남은 높이가 A와 같거나 낮아야함.
        System.out.println((int)Math.ceil((double)(V-A)/(A-B))+1);

    }
}
