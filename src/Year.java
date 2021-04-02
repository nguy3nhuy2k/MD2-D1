
import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int year;
        System.out.println("nhập năm :  ");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if( year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + "%d is a leap year");
                }else {
                    System.out.println(year + "%d is not a leap year");
                }
            } else {
                System.out.println(year + "%d is a leap year");
            }
        } else {
            System.out.println(year + "%d is not a leap year");
        }
    }
}
