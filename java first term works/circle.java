import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner getSides = new Scanner(System.in);
        System.out.print("please write radius of the circle:  ");
        double radius = getSides.nextDouble();
        double Circumference = 2*Math.PI*radius;
        System.out.println("Circumference: "+ Circumference);

        double Area = Math.PI * radius * radius;
        System.out.println("Area: " + Area);
        
        double Volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("Volume: " + Volume);
        getSides.close();
    }
    
}
