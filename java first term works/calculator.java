import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner getNumbers = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = getNumbers.nextInt();
        System.out.print("Enter an opretor(+,-,*,/,^)"); 
        String op = getNumbers.next();
        System.out.print("Enter the second number: ");
        int num2 = getNumbers.nextInt();

        double result;
        switch(num2){       
            case 0:
                System.out.print("cannot divide by zero!");
                
                
            
        switch(op){
            case "+":
                result = num1 + num2;
                System.out.println("Result: "+ result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: "+ result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: "+ result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("Result: "+ result);
                break;
            case "^":
                result = num1 ^ num2;
                System.out.println("Result: "+ result);
                break;

            default:
                System.out.print("you didn't enter any operator please enter a valid operator!");
               
        

        }
        }
        
        getNumbers.close();

    }
    
}
