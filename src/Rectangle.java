import java.util.Scanner;


public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("width :   ");
        width = scanner.nextFloat();
        System.out.println("height :  ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("area : " + area);


    }
}
