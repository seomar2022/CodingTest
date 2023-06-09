package math;

import java.util.Scanner;

public class Math3 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/2720
        거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오. 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다. 예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다. C의 단위는 센트이다. (1달러 = 100센트) (1<=C<=500)

출력
각 테스트케이스에 대해 필요한 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수를 공백으로 구분하여 출력한다.


         */
        Scanner sc = new Scanner(System.in);
      //  int T = sc.nextInt(); sc.nextLine(); //=>java.util.NoSuchElementException
        //改行文字を読み取り、その結果、予想よりも次の入力行がスキップされ、要素がない状態でnextInt()が呼び出され、NoSuchElementExceptionが発生
        //この場合、nextInt()の後に改行文字を読み飛ばすためにnextLine()を追加する必要
        int T = Integer.parseInt(sc.nextLine());

        int[] change = new int[4];

        while (T > 0){
            //int C = sc.nextInt(); sc.nextLine();
            int C = Integer.parseInt(sc.nextLine());
            change[0] = C/25;
            change[1] = C%25/10;
            change[2] = C%25%10/5;
            change[3] = C%25%10%5;
            for(int element:change){
                System.out.print(element + " ");
            }

            T--;
        }



    }
}
