import java.util.Scanner;

public class string21 {
    public static void main(String[] args) {


        int loop = 20;
        int totalCredit = 0;
        float totalGrade = 0.0F;
        float subtotal= 0;

        while (loop >0 ){
            Scanner sc = new Scanner(System.in);
            String gradeInfo = sc.nextLine();


            //最初のスペースの次が単位
            int credit = Character.getNumericValue(gradeInfo.charAt(gradeInfo.indexOf(" ")+1));
//            System.out.println("aaaa"+ gradeInfo.indexOf(" ")+1));

            //最後のスペースの次が成績
            String grade = "";
            if(gradeInfo.charAt(gradeInfo.lastIndexOf(" ")+1) == 'P'){
                credit = 0;
            }else {
                grade = gradeInfo.substring(gradeInfo.lastIndexOf(" ")+1, gradeInfo.lastIndexOf(" ")+3);
            }
            float gradeToFloat = 0;

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
            }else if(grade.equals("F")){
                gradeToFloat = 0.0F;
            }


            subtotal += credit*gradeToFloat;


            totalCredit += credit;


           // System.out.println("subtotal->"+subtotal);
           // System.out.println(totalCredit);

            loop--;
        }

        System.out.println(subtotal/totalCredit);
    }
}
