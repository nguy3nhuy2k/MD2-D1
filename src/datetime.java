import java.util.Arrays;
import java.util.Scanner;

public class datetime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng cần kiểm tra  :  ");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("tháng có 31 ngày  ");
                break;
            case 2:
                System.out.println("tháng có 28 hoặc 29 ngày");
                break;
            case 3:
                System.out.println("tháng có 31 ngày");
                break;
            case 4:
                System.out.println("tháng có 30 ngày");
                break;
            case 5:
                System.out.println("tháng có 31 ngày");
                break;
            case 6:
                System.out.println("tháng có 30 ngày");
                break;
            case 7:
                System.out.println("tháng có 31 ngày");
                break;
            case 8:
                System.out.println("tháng có 31 ngày");
                break;
            case 9:
                System.out.println("tháng có 30 ngày");
                break;
            case 10:
                System.out.println("tháng có 31 ngày");
                break;
            case 11:
                System.out.println("tháng có 30 ngày");
                break;
            case 12:
                System.out.println("tháng có 31 ngày");
                break;
            default:
                System.out.println("không hợp lệ");
        }
    }
}
