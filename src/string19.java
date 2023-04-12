import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class string19 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/2941
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
n lj j nj

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
           // System.out.println("letter-> "+ letter);

            if(input.indexOf(letter)>=0){
                for(int i = 0; i<input.length(); i++){

                    if(input.indexOf(letter, i)>=0){
                        finds.add(input.indexOf(letter, i));
                        if(letter.equals("z=") && i>0 && input.charAt(i-1) == 'd'){
                            finds.remove(i);
                        }

                     //   System.out.println("chk -> "+input.indexOf(letter, i));
                    }

                }

                //System.out.println("find");
            }
        }


       // System.out.println(finds);
        String copiedInput = input;
        sum = finds.size();


//        ArrayList<Character> input2 = new ArrayList<>(input.length());
//        for(char a : input.toCharArray()){
//            input2.add(a);
//        }

        StringBuilder newString = new StringBuilder(input);

     //   System.out.println(finds);
        for(int find :finds){
            //findからfind+1の位置にあるやつを削除、
           // input = input.replace(copiedInput.substring(find, find+2), "0");
            //input = input.replace(copiedInput.substring(find, find+2), "0");


            newString.setCharAt(find, '0');
            newString.setCharAt(find+1, '0');

           // System.out.println(newString);
           // ordinaryAlphabet = copiedInput.substring()

//            input2.remove(find);
//            input2.remove(find+1);


         //  System.out.println("find ->"+find);
          // System.out.println("input1 ->" + input);
        }
        //dz=は3文字であるため、=が残っていたら削除
        input = newString.toString();
        input = input.replace("=", "");
       // input2.remove('=');

     //   System.out.println(finds);
      //  System.out.println(input);
       // System.out.println("input2 ->" + input);
        //残った物のlengthを数える

        input = input.replaceAll("0", "");
        //System.out.println("input3 ->" + input);
        sum += input.length();

       // sum += input2.size();

        System.out.println(sum);






    }
}
