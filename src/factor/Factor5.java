package factor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Factor5 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/2581
        자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

        예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

         */
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        HashSet<Integer> prime_numbers = new HashSet<>();
        for(int i = M; i<=N; i++){
            prime_numbers.add(i);
        }
        System.out.println("chk1");


        ArrayList<Integer> non_prime_numbers = new ArrayList<>();

        for (int number:prime_numbers) {

            int factor=2;

            if(number == 1){
                non_prime_numbers.add(number);
            }
            System.out.println("chk2");
            while (factor <= number/2) {
                if (number % factor == 0) { //나누어 떨어진다면 -> 소수가 아니라면
                    non_prime_numbers.add(number);
                    break;
                }
            }
            factor++;

        }
        System.out.println("chk3");

        for(int non_prime_number: non_prime_numbers){
            prime_numbers.remove(non_prime_number);
        }
        System.out.println(prime_numbers);





    }

}
