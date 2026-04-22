import java.util.Scanner;
public class OuizGame {
    public static void main(String[] args) {
        Scanner getInputs = new Scanner(System.in);

        int answer1 = 3 ;
        int answer2 = 1;
        int answer3 = 4;
        int guess1;
        int guess2;
        int guess3;
        int score = 0;
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.print("What is the main function of a router?\n1. Storing files\n2. Encrypting data\n3.Directing internet traffic\n4. Managing passwords\n ");
        System.out.print("Your guess: ");
        guess1 = getInputs.nextInt();
        if(guess1 == answer1){
            score += 1;
            System.out.println("CORRECT!");
        }
        else{
            System.out.println("FALSE!");
        }
        System.out.print("Which part of the computer is considered the brain?\n1. CPU\n2. Hard Drive\n3. RAM\n4. GPU\n");
        System.out.print("Your Guess: ");
        guess2 = getInputs.nextInt();
        if(guess2 == answer2){
            score+=1;
            System.out.println("CORRECT!");
        }
        else{
            System.out.println("FALSE!");
        }
        System.out.println("What year was facebook launched?\n1. 2005\n2. 1986\n3. 2006\n4. 2009");
        System.out.print("Your Guess:");
        guess3 = getInputs.nextInt();
        if(guess3 == answer3){
            score+=1;
            System.out.println("CORRECT!");
        }
        else{
            System.out.println("FALSE!");
        }
        System.out.println("Your final score is: " + score);
        getInputs.close();
        

        
    }
    
}
