package string;

import java.util.Scanner;

public class string11 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/11718
        문제
        입력 받은 대로 출력하는 프로그램을 작성하시오.

        입력
        입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

        출력
        입력받은 그대로 출력한다.

        모든 입력이 종료되면 더이상 출력을 시도하지 않고 바로 종료해야 합니다. 그리고, 개행 문자도 정확하게 출력할 수 있어야 합니다.
        https://www.acmicpc.net/board/view/21771
         */
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(count < 100){
            String input = sc.nextLine();
            System.out.println(input);
            count++;
        }

    }
}
