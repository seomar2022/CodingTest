import java.util.*;

public class one {

    public static void main(String[] args){

        /*
        https://www.acmicpc.net/problem/27866
        문제
        단어S와 정수i가 주어졌을 때,S의i번째 글자를 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 영어 소문자와 대문자로만 이루어진 단어S가 주어진다. 단어의 길이는 최대1000
        둘째 줄에 정수i가 주어진다. (1 <= i <= |S|)

        출력
        S의i번째 글자를 출력한다.
        */
        /*
        問題
        単語Sと整数iが与えられた時、Sのi文字目を出力するプログラムを作成しなさい。

        入力
        最初の行に英語の小文字と大文字だけで構成された単語Sが与えられる。 単語の長さは最大1000
        2行目に整数iが与えられる。 (1 <= i <= |S|)

        出力
        S の i 番目の文字を出力する。
        */

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(S.charAt(i - 1));

        /*
        入力：
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            int i = sc.nextInt();
        n番目の文字を抜き出す：
            .charAt(n)

         */


    }

}
