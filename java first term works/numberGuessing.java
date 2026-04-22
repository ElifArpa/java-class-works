import java.util.Scanner;
import java.util.Random;

public class numberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner getNumber = new Scanner(System.in);
        int guess ;
        int attemps = 0;
        int min = 1;
        int max = 100;
        int randomnumber = random.nextInt(max);
       
        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess a number between %d-%d\n",min,max);
        

        do{
            System.out.print("Enter a guess: ");
            guess = getNumber.nextInt();
            attemps++;
            if(guess<randomnumber){
                System.out.println("Too low");
            }
            else if(guess>randomnumber){
                System.out.println("Too high");
            }
            else{
                System.out.println("Correct you find the random number after "+attemps+" attemps.");
            }


        }while(guess != randomnumber);
        System.out.println("You have won");
        getNumber.close();


    }

    
}
