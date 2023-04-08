import java.util.Scanner;

public class string18 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/4344
        문제
        대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

        입력
        첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

        둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

        출력
        각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); sc.nextLine();
        System.out.println(count);
        while(count >0){
            String input = sc.nextLine();
            int numberOfStudents = Integer.parseInt(input.split(" ")[0]);

            int sum = 0;
            while (numberOfStudents >0){
                sum += Integer.parseInt(input.split(" ")[numberOfStudents]);
                numberOfStudents--;
            }
            System.out.println(sum/numberOfStudents);

            count--;
        }
    }
}
