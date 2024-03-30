package math;

import java.util.Scanner;

public class Math6 {
    public static void main(String[] args) {
    /*
    https://www.acmicpc.net/problem/1193
    분수찾기
    무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
    1/1	1/2	1/3	1/4	1/5	…
    2/1	2/2	2/3	2/4	…	…
    3/1	3/2	3/3	…	…	…
    4/1	4/2	…	…	…	…
    5/1	…	…	…	…	…
    …	…	…	…	…	…
    이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
    X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

    a=1
    1 -> 1/1

    a=2 짝
    2 -> 1/2
    3 -> 2/1

    a=3 홀
    4 -> 3/1
    5 -> 2/2
    6 -> 1/3

    a=4 짝
    7 -> 1/4
    8 -> 2/3
    9 -> 3/2
    10 -> 4/1

    a=5 홀
    11 -> 5/1
    12 -> 4/2
    13 -> 3/3
    14 -> 2/4
    15 -> 1/5



     */
        //특정 수 이하까지 1+2+3+4+...

    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    int group = 0;
    int end_of_group = 0;
    while (end_of_group<=input){
        group++;
        end_of_group +=group;
        System.out.printf("group: %d, end_of_group: %d\n", group, end_of_group);
    }
    System.out.println(group);


    int numerator; //분자
    int denominator; //분모
    int distance = end_of_group-input;
    if(group%2==0){//짝수면


    }else{//홀수면
        denominator = group -distance;
        numerator = group + 1 - distance;
    }

    System.out.printf("%d, ");

    }
}
