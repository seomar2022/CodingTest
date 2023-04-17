package string;

import java.util.HashSet;
import java.util.Scanner;

public class string20 {
    public static void main(String[] args) {
        /*

        https://www.acmicpc.net/problem/1316
        문제
        그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

        단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

        입력
        첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

        출력
        첫째 줄에 그룹 단어의 개수를 출력한다.


        問題
        グループ単語とは、単語に存在するすべての文字に対して、各文字が連続して現れる場合のみをいう。 例えば、ccazzzbbはc, a, z, bがすべて連続して現れ、kinもk, i, nが連続して現れるためグループ単語であるが、aabbccbはbが離れて現れるためグループ単語ではない。

        N個の単語を入力として受け取り、グループ単語の数を出力するプログラムを作成しなさい。

        入力
        1行目に単語の個数Nが入る。 Nは100より小さいか、同じ自然数である。 2行目からN行目に単語が入ってくる。 単語はアルファベット小文字だけでできて重複せず、長さは最大100だ。

        出力
        1行目にグループ単語の個数を出力する。

        3
        happy
        new
        year
         */

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); sc.nextLine();
        int numberOfGroupWords = 0;
        int loop = 0;

        //指定された個数分繰り返す
        while(loop < count){
            String sentence = sc.nextLine();

            //重複を無くすため、HashSet使う
            HashSet<Character> letters = new HashSet<>(sentence.length());

            //sentenceの各文字を格納
            for(int i = 0; i < sentence.length(); i++){
                letters.add(sentence.charAt(i));
            }

            String group = "";
            int groupWordChk = 0;
            for(char letter : letters){

                int startIndex = sentence.indexOf(letter);
             //  System.out.println(sentence.indexOf(letter));

                int endIndex = sentence.lastIndexOf(letter);
             //   System.out.println(sentence.lastIndexOf(letter));
                group = sentence.substring(startIndex, endIndex+1);


               // System.out.println(group);

              //  System.out.println("chk ->"+String.valueOf(letter).repeat(endIndex - startIndex + 1));
                if(group.equals(String.valueOf(letter).repeat(endIndex - startIndex + 1))){
                    groupWordChk++;
                }
            }


            if(groupWordChk == letters.size()){//その単語が全ての基準を満たしたら
                numberOfGroupWords++;
            }




           // System.out.println(letters);
            // System.out.println(numberOfGroupWords);

            loop++;
        }

        System.out.println(numberOfGroupWords);
    }
}
