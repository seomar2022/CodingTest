package factor;

import java.util.ArrayList;
import java.util.Scanner;

public class Factor3 {
    public static void main(String[] args) {


    /*
    https://www.acmicpc.net/problem/9506
    En route to Rigel 7, Chief Engineer Geordi Laforge and Data were discussing favorite numbers. Geordi exclaimed he preferred Narcissistic Numbers: those numbers whose value is the same as the sum of the digits of that number, where each digit is raised to the power of the number of digits in the number.

Data agreed that Narcissistic Numbers were interesting, but not as good as his favorite: Perfect Numbers. Geordi had never heard of a Perfect Number, so Data elaborated, “A positive integer is said to be Perfect if it is equal to the sum of its positive divisors less than itself. For example, 6 is Perfect because 6 = 1 + 2 + 3.”

Geordi began thinking about an algorithm to determine if a number was Perfect, but did not have the raw computing ability of Data. He needs a program to determine if a given number is Perfect.
     */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> factors = new ArrayList<>();

        while(true) {
            int n = sc.nextInt();
            if(n == -1){
                break;
            }else {
                //because 1 is always factor of any positive integers
                int sum = 1;
                int factor = 2;

                while (factor <= n / 2) {
                    if (n % factor == 0) {
                        factors.add(factor);
                    }
                    factor++;
                }

                for (int i : factors) {
                    sum += i;
                }

                if (sum != n) {
                    System.out.printf("%d is NOT perfect.", n);
                } else {
                    System.out.printf("%d = 1", n);
                    for (int i : factors) {
                        System.out.printf(" + %d", i);
                    }
                }
            }
        }


    }
}
