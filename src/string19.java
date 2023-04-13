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

ljes=njakはクロアチアアルファベット6つ(lj, e, ̌, nj, a, k)からなる。 単語が与えられた時、いくつのクロアチアアルファベットで構成されているかを出力する。

ďは無条件に一つのアルファベットとして使われ、dと̌が分離されたとは考えない。 lj と nj も同様である。 上のリストにないアルファベットは一文字ずつ数える。

入力
1行目に最大100文字の単語が与えられる。 アルファベットの小文字と「-」、「=」だけで構成されている。

単語はクロアチアのアルファベットで構成されている。 問題説明の表に出ているアルファベットは変更された形で入力される。

出力
入力として与えられた単語がいくつのクロアチアアルファベットで構成されているかを出力する。
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int sum = 0;

        TreeSet<Integer> finds = new TreeSet<>();
        for(String letter : croatianAlphabet){


            if(input.indexOf(letter)>=0){
                for(int i = 0; i<input.length(); i++){

                    if(input.indexOf(letter, i)>=0){//同じクロアチアアルファベットが重複される場合もあるため。
                        finds.add(input.indexOf(letter, i));
                        //if(letter.equals("z=") && i>0 && input.charAt(i-1) == 'd'){  <-このコードはddz=z=を入力する際に、間違う
                        if(input.charAt(i) == 'z' && input.charAt(i+1) == '=' && i>0 && input.charAt(i-1) == 'd'){
                            finds.remove(i);
                        }

                    //    System.out.println("chk -> "+input.indexOf(letter, i));
                    }

                }

                //System.out.println("find");
            }
        }

        sum = finds.size(); //クロアチアアルファベットの数を数える。

        //.setCharAtを使うため、StringBuilder使う
        StringBuilder inputToStringBuilder = new StringBuilder(input);

       // System.out.println(finds);
        for(int find :finds){
            //findからfind+1の位置にあるやつを0に入れ替える。削除したら、lljjなどを入力する時に間違える。
            inputToStringBuilder.setCharAt(find, '0');
            inputToStringBuilder.setCharAt(find+1, '0');


       //    System.out.println("find ->"+find);
         //  System.out.println("input1 ->" + input);
        }

        //dz=は3文字であるため、=が残っていたら削除
        input = inputToStringBuilder.toString();
        input = input.replace("=", "");


        //System.out.println("input2 ->" + input);


        //0を削除する
        input = input.replaceAll("0", "");
     //   System.out.println("input3 ->" + input);

        //残った物のlengthを数えて、sumにたす。(一般のアルファベットを数える)
        sum += input.length();


        System.out.println(sum);

    }
}
