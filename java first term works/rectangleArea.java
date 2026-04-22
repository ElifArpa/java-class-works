import java.util.Scanner;
public class rectangleArea {
    public static void main(String[] args) {
        Scanner getsides = new Scanner(System.in);
        System.out.println("please enter the width: ");
        int width = getsides.nextInt();
        System.out.println("please enter the length: ");
        int length = getsides.nextInt();
        int area = width*length;
        getsides.close();
        System.out.println("the area of the rectangle is: "+ area);
    }
}
