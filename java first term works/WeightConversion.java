import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args) {
        Scanner getİnputs = new Scanner(System.in);
        System.out.println("Welcome To Weight Conversion Program");
        System.out.println("option1 is convert lbs to kgs");
        System.out.println("option2 is convertkgs to lbs");
        
        System.out.print("please choose an option(1: lbs to kgs,2: kgs to lbs): ");
        int choice = getİnputs.nextInt();
        if(choice==1){
            System.out.print("please enter your weight in lbs: ");
            double weight1 = getİnputs.nextDouble();
            double newWeight = weight1/2.204623;
            System.out.print("Your weight as kgs is: "+Math.round(newWeight));

        }
        else if(choice==2){
            System.out.print("please enter your weight in kgs: ");
            double weight1kg = getİnputs.nextDouble();
            double newlbsWeight = weight1kg*2.204623;
            System.out.print("your weight as lbs is: "+(newlbsWeight));

        }
        else{
            System.out.print("you didn't enter a valid number please enter 1 or 2 and try again");
        }
        getİnputs.close();
        
    }
}
