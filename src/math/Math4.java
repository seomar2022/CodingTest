package math;

public class Math4 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/2903
        외계 지형은 중앙 이동 알고리즘을 이용해서 만들려고 한다.

        알고리즘을 시작하면서 상근이는 정사각형을 이루는 점 4개를 고른다. 그 후에는 다음과 같은 과정을 거쳐서 지형을 만든다.

        정사각형의 각 변의 중앙에 점을 하나 추가한다.
        정사각형의 중심에 점을 하나 추가한다.
        초기 상태에서 위와 같은 과정을 한 번 거치면 총 4개의 정사각형이 새로 생긴다. 이와 같은 과정을 상근이가 만족할 때 까지 계속한다.

        아래 그림은 과정을 총 2번 거쳤을 때까지의 모습이다.


        초기 상태 - 점 4개	1번 - 점 9개	2번 - 25개
        상근이는 어떤 점은 한 개 보다 많은 정사각형에 포함될 수 있다는 사실을 알았다. 메모리 소모량을 줄이기 위해서 중복하는 점을 한 번만 저장하려고 한다. 과정을 N번 거친 후 점 몇 개를 저장해야 하는지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 N이 주어진다. (1 ≤ N ≤ 15)

        출력
        첫째 줄에 과정을 N번 거친 후 점의 수를 출력한다.

        Mirko and Slavko are filming a movie adaptation of the popular SF novel "Chicks in space 13". The script requires them to present a lot of different worlds so they decided to film the entire movie in front of a green screen and add CGI backgrounds later. Mirko heard that the best way to generate artificial terrain is to use midpoint displacement algorithm.

To start the algorithm, Mirko selects 4 points forming a perfect square. He then performs the following steps:

On each side of the square, he adds a new point in the exact middle of the side. The height of this new point is the average height of the two points on that side.
In the exact center of the square he adds a new point whose height is the average height of all 4 square vertices, plus a small random value.
After those two steps are performed, he now has 4 new squares. He performs the same steps on the newly created squares again and again until he is pleased with the results. The following diagram illustrates 2 iterations of the algorithm.
     Mirko noticed that some of the points belong to more than one square. In order to decrease memory consumption, he stores calculates and stores such points only once. He now wonders how many points in total will he need to store in memory after N iterations.

input
The first and only line of input contains one integer N (1 ≤ N ≤ 15), number of iterations

output
The first and only line of output should contain one number, the number of points stored after N iterations.

         */
        // 0->4 2^2
        // 1->9 3^3
        // 2->25 5^5
        // 3->81 9^9


        // 1+2^n

    }
}
