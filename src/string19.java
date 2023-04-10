import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class string19 {
    public static void main(String[] args) {
        /*
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

입력
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

출력
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int sum = 0;
        //ArrayList<Integer> finds = new ArrayList<>();
        TreeSet<Integer> finds = new TreeSet<>();
        for(String letter : croatianAlphabet){
            System.out.println("letter-> "+ letter);
            if(input.indexOf(letter)>=0){
                for(int i = 0; i<input.length(); i++){

                    if(input.indexOf(letter, i)>=0){
                        finds.add(input.indexOf(letter, i));
                        System.out.println("chk -> "+input.indexOf(letter, i));
                    }


                }

                System.out.println("find");
                sum++;
            }
        }
        System.out.println();

        System.out.println(finds);
        String copiedInput = input;
        for(int find :finds){
            //findからfind+1の位置にあるやつを削除、
            input = input.replace(copiedInput.substring(find, find+2), "");
            System.out.println("input ->" + input);
        }
        //dz=は3文字であるため、=が残っていたら削除
        input = input.replace("=", "");


        System.out.println(finds);
        System.out.println(input);
        //残った物のlengthを数える
        sum += input.length();

        System.out.println(sum);






    }
}
