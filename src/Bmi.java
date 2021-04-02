import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("weight :");
        weight = scanner.nextDouble();

        System.out.print("height :");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);

        System.out.printf("%-20s%s",bmi,"Interpretation\n");

        if(bmi <18){
            System.out.printf("%-20s%s",bmi,"underweight");
            System.out.println(bmi + "                 underweight");
        } else if( bmi < 25.0){
            System.out.printf("%-20s%s",bmi,"normal");
            System.out.println(bmi + "                 normal");

        } else if(bmi < 30.0){
            System.out.printf("%-20s%s",bmi,"overweight");
            System.out.println(bmi + "                 overweight");

        } else {
            System.out.printf("%-20s%s",bmi,"obese");
            System.out.println(bmi + "                 obese");

        }

    }
}
