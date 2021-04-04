import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num;
        System.out.println("nhập số cần đọc :");
        Num = scanner.nextInt();

        if (Num < 10) {
            switch (Num) {
                case 0:
                    System.out.println("khong");
                    break;
                case 1:
                    System.out.println("Mot");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bon");
                    break;
                case 5:
                    System.out.println("Nam");
                    break;
                case 6:
                    System.out.println("Sau");
                    break;
                case 7:
                    System.out.println("bay");
                    break;
                case 8:
                    System.out.println("tam");
                    break;
                case 9:
                    System.out.println("chin");
                    break;
            }

        } else if (Num < 20) {
            switch (Num % 10) {
                case 0:
                    System.out.println("muoi");
                    break;
                case 1:
                    System.out.println("Muoi mot");
                    break;
                case 2:
                    System.out.println("Muoi hai");
                    break;
                case 3:
                    System.out.println("Muoi  ba");
                    break;
                case 4:
                    System.out.println("Muoi  bon");
                    break;
                case 5:
                    System.out.println("Muoi Nam");
                    break;
                case 6:
                    System.out.println("Muoi Sau");
                    break;
                case 7:
                    System.out.println("Muoi bay");
                    break;
                case 8:
                    System.out.println("Muoi tam");
                    break;
                case 9:
                    System.out.println("Muoi chin");
                    break;
            }
        } else if (Num >= 20 && Num < 100) {
            String unit = "";
            String dozens = "";
            switch (Num % 10) {
                case 0:
                    unit = "";
                    break;
                case 1:
                    unit = "mot";
                    break;
                case 2:
                    unit = "hai";
                    break;
                case 3:
                    unit = "ba";
                    break;
                case 4:
                    unit = "bon";
                    break;
                case 5:
                    unit = "nam";
                    break;
                case 6:
                    unit = "sau";
                    break;
                case 7:
                    unit = "bay";
                    break;
                case 8:
                    unit = "tam";
                    break;
                case 9:
                    unit = "chin";
                    break;
            }
            switch (Num / 10) {
                case 2:
                    dozens = "hai muoi";
                    break;
                case 3:
                    dozens = "ba muoi";
                    break;
                case 4:
                    dozens = "bon muoi";
                    break;
                case 5:
                    dozens = "nam muoi";
                    break;
                case 6:
                    dozens = "sau muoi";
                    break;
                case 7:
                    dozens = "bay muoi";
                    break;
                case 8:
                    dozens = "tam muoi";
                    break;
                case 9:
                    dozens = "chin muoi";
                    break;
            }
            System.out.println(dozens + unit);
        } else if (Num >= 100) {
            String unit = "";
            String dozens = "";
            String hundreds = "";

            switch ((Num % 100) % 10) {
                case 0:
                    unit = "";
                    break;
                case 1:
                    unit = "mot";
                    break;
                case 2:
                    unit = "hai";
                    break;
                case 3:
                    unit = "ba";
                    break;
                case 4:
                    unit = "bon";
                    break;
                case 5:
                    unit = "nam";
                    break;
                case 6:
                    unit = "sau";
                    break;
                case 7:
                    unit = "bay";
                    break;
                case 8:
                    unit = "tam";
                    break;
                case 9:
                    unit = "chin";
                    break;
            }
            switch ((Num % 100)/10){
                case 0:
                    dozens ="linh ";
                    break;
                case 1:
                    dozens ="Muoi ";
                    break;
                case 2:
                    dozens = "hai muoi ";
                    break;
                case 3:
                    dozens = "ba muoi ";
                    break;
                case 4:
                    dozens = "bon muoi ";
                    break;
                case 5:
                    dozens = "nam muoi ";
                    break;
                case 6:
                    dozens = "sau muoi ";
                    break;
                case 7:
                    dozens = "bay muoi ";
                    break;
                case 8:
                    dozens = "tam muoi ";
                    break;
                case 9:
                    dozens = "chin muoi ";
                    break;
            }
            switch (Num /100) {
                case 1:
                    hundreds = "Mot tram ";
                    break;
                case 2:
                    hundreds = "hai tram ";
                    break;
                case 3:
                    hundreds = "ba tram ";
                    break;
                case 4:
                    hundreds = "bon tram ";
                    break;
                case 5:
                    hundreds = "nam tram ";
                    break;
                case 6:
                    hundreds = "sau tram ";
                    break;
                case 7:
                    hundreds = "bay tram ";
                    break;
                case 8:
                    hundreds = "tam tram ";
                    break;
                case 9:
                    hundreds = "chin tram ";
                    break;
            }

            System.out.println(hundreds + dozens + unit);
        }
    }
}
