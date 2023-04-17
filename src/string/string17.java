package string;

import java.util.*;

public class string17 {
    public static void main(String[] args) {
        /*https://www.acmicpc.net/problem/1157
        문제
    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

    입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

    출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char letter : input.toCharArray()){
            if(map.containsKey(letter) == false){
                map.put(letter, 1);
            } else { //既にmapに入ってるkeyだったらそのvalueに1を足す
                map.put(letter, map.get(letter)+1);
            }
        }


        int maxValue = 0;


        //valueの最大値を探す
        for(Integer value : map.values()) {
            if(value > maxValue) {
                maxValue = value;
            }
        }

        ArrayList<Character> results = new ArrayList<>();

        //最大値のvalueに当てはまるkeyを探す
        for (char key : map.keySet()) {
            if (maxValue == map.get(key)) {
                results.add(key);
            }
        }

        if(results.size() == 1){
            System.out.println(results.get(0));
        }else {
            System.out.println("?");
        }


        //System.out.println(map);

    }
}
