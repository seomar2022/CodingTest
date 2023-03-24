import java.util.Scanner;

public class string7 {
    public static void main(String[] args) {
        /*https://www.acmicpc.net/problem/2675
        문제
    문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

    QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

    입력
    첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

    출력
    각 테스트 케이스에 대해 P를 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
       // System.out.printf("T: %d\n", T);

        int tCount = 0;
        while (tCount < T){
            String input = sc.nextLine();
            int R = Integer.parseInt(input.split(" ")[0]);
         //   System.out.printf("R: %d\n", R);

            String S = input.split(" ")[1];
            for (char s: S.toCharArray()) {
                int rCount = 0;
                while (rCount < R){
                    System.out.printf("%s", s);
                    rCount++;
                }

            }
            tCount++;
            System.out.printf("\n");
        }


    }
}
//예제 입력에 3 ABC라고 써있으니까, 입력은 두개들어오는게 아니고 한개 들어오는거임
// 두개로 처리하면 런타임 에러 (NoSuchElement)
