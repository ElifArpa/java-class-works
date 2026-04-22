import java.util.Scanner;
public class compoundİnterestCalculator {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = inputs.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        double rate = inputs.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year: ");
        int perYear = inputs.nextInt();
        System.out.print("Enter the number of years: ");
        int years = inputs.nextInt();
        

        double amount = principal * Math.pow(1+rate/perYear,perYear*years);
        System.out.printf("The amount after %d year is : $%,.3f",years,amount);
        inputs.close();
        
    }
}
