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

        while(count >0){
            String input = sc.nextLine();
            int numberOfStudents = Integer.parseInt(input.split(" ")[0]);

            int sum = 0;
            int numberOfStudents2 = numberOfStudents;
            String[] scores = input.split(" ");
            int[] scores2 = new int[numberOfStudents];

            while (numberOfStudents2 >0){
                scores2[numberOfStudents2 -1]= Integer.parseInt(scores[numberOfStudents2]);
                numberOfStudents2--;
            }

            while (numberOfStudents2 < numberOfStudents){
                sum += scores2[numberOfStudents2];
                numberOfStudents2++;
            }

            int aboveAverage =0;
            for(int score: scores2){
                if(score> sum/numberOfStudents){
                    aboveAverage++;
                }
            }
            System.out.printf("%.3f%%\n", (float)aboveAverage/numberOfStudents * 100);

            count--;
        }
    }
}
