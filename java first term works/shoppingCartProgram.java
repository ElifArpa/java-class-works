import java.util.Scanner;
public class shoppingCartProgram {
    public static void main(String[] args){
        Scanner item = new Scanner(System.in);
        System.out.println("which item would you like to buy? : ");
        String items = item.nextLine();
        System.out.println("What is the price for each? : ");
        double price = item.nextDouble();
        System.out.println("How many would you like? : ");
        int count = item.nextInt();

        double totalPrice = price * count;

        System.out.println("You have bought " + count +" "+ items +"s");
        System.out.println("Your total is $" + totalPrice);
        item.close();

    }
}
