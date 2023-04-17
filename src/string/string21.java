package string;

import java.util.Scanner;

public class string21 {
    public static void main(String[] args) {


        int loop = 20;
        int totalCredit = 0;
        float totalGrade = 0.0F;
        float subtotal= 0;
        Scanner sc = new Scanner(System.in);


        while (loop >0 ){
            //Scanner sc = new Scanner(System.in);
            //このコードでNoSuchElementランタイムエラーが発生する理由は、Scannerがデータを読み込むことができないためです。whileループが20回実行される間、Scannerオブジェクトを再作成するため、各ループでユーザーからの入力を受け取る必要があります。

            String gradeInfo = sc.nextLine();


            //最初のスペースの次が単位
            int credit = Character.getNumericValue(gradeInfo.charAt(gradeInfo.indexOf(" ")+1));
//            System.out.println("aaaa"+ gradeInfo.indexOf(" ")+1));

            float gradeToFloat = 0;
            //最後のスペースの次が成績
            String grade = "";
            if(gradeInfo.charAt(gradeInfo.lastIndexOf(" ")+1) == 'P'){
                credit = 0;
            }else if(gradeInfo.charAt(gradeInfo.lastIndexOf(" ")+1) == 'F'){
                gradeToFloat = 0;
            }else {
                grade = gradeInfo.substring(gradeInfo.lastIndexOf(" ")+1, gradeInfo.lastIndexOf(" ")+3);
            }


            //float gradeToInt;
            if(grade.equals("A+")){
                gradeToFloat = 4.5F;
            }else if(grade.equals("A0")){
                gradeToFloat = 4.0F;
            }else if(grade.equals("B+")){
                gradeToFloat = 3.5F;
            }else if(grade.equals("B0")){
                gradeToFloat = 3.0F;
            }else if(grade.equals("C+")){
                gradeToFloat = 2.5F;
            }else if(grade.equals("C0")){
                gradeToFloat = 2.0F;
            }else if(grade.equals("D+")){
                gradeToFloat = 1.5F;
            }else if(grade.equals("D0")){
                gradeToFloat = 1.0F;
            }

            subtotal += credit*gradeToFloat;


            totalCredit += credit;


           // System.out.println("subtotal->"+subtotal);
           // System.out.println(totalCredit);

            loop--;
        }

        System.out.printf("%.6f", subtotal/totalCredit);
    }
}
