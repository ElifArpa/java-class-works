import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner getInputs = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String ComputerChoice;
        

        System.out.print("Enter your move(rock,paper,scissors): ");
        playerChoice = getInputs.nextLine().toLowerCase();

        if(!playerChoice.equals("rock")&& 
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")){
                    System.out.println("Invalid choice");
        }
        ComputerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: "+ ComputerChoice);

        if(playerChoice.equals(ComputerChoice)){
            System.out.println("its a tie");
        }
        else if(playerChoice.equals("rock")&& ComputerChoice.equals("scissors")){
            System.out.println("you win!");
        }
        else if(playerChoice.equals("paper")&&ComputerChoice.equals("rock")){
            System.out.println("You win!");

        }
        else if(playerChoice.equals("scissors")&&ComputerChoice.equals("paper")){
            System.out.println("you win!");

        }
        else{
            System.out.println("you lose!");
        }


                getInputs.close();
            }
   
    
}
