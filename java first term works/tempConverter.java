import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args){
        Scanner getİnputs = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp = getİnputs.nextDouble();
        System.out.print("convert to celcius or fahrenheit(C=1 or F=2): ");
        int choice = getİnputs.nextInt();
        double result = (choice==1) ? (temp-32)*5/9 : (temp*5/9)+32;
        System.out.print("Converted temperature: " + result);
        getİnputs.close();
    }
    
}
