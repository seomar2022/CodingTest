import java.util.*;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
                int sum = 0;

                TreeSet<Integer> finds = new TreeSet<>();
                for(String letter : croatianAlphabet){


                    if(input.indexOf(letter)>=0){
                        for(int i = 0; i<input.length(); i++){
                            if(input.indexOf(letter, i)>=0){
                                finds.add(input.indexOf(letter, i));
                                if(letter.equals("z=") && i>0 && input.charAt(i-1) == 'd'){
                                    finds.remove(i);
                                }
                            }

                        }
                    }
                }


                sum = finds.size();


                StringBuilder newString = new StringBuilder(input);


                for(int find :finds){
                    newString.setCharAt(find, '0');
                    newString.setCharAt(find+1, '0');
                }

                input = newString.toString();
                input = input.replace("=", "");

                input = input.replaceAll("0", "");
                sum += input.length();

                System.out.println(sum);


    }
}