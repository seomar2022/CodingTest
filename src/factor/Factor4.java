package factor;

import java.util.Scanner;

public class Factor4 {
    public static void main(String[] args) {

        /*
        https://www.acmicpc.net/problem/1978
        주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
        첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =0;

        int count =0;
        int chk = 0;

        while(i <N){
            int factor=2;
            int input = sc.nextInt();

            if(factor == 2 || factor ==3){
                count++;
            }else {
                while (factor <= input / 2) {
                    if (input % factor == 0) {
                        break;
                    } else {
                        chk++;
                    }
                    factor++;
                }
                if (chk == 0) {
                    count++;
                }
            }

            i++;
        }

        System.out.println(count);

    }
}
