import java.util.Scanner;
public class hypotenuse {
    public static void main(String[] args) {
    Scanner sides = new Scanner(System.in);
    System.out.println("please write side 1: ");
    int side1 = sides.nextInt();
    System.out.println("please write side 2: ");
    int side2 = sides.nextInt();
    double Hypotenuse = Math.sqrt(side2*side2 + side1*side1);
    System.out.println(Hypotenuse);
    sides.close();



    }
}
