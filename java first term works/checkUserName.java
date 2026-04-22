import java.util.Scanner;
public class checkUserName {
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);
        System.out.print("Please enter your user name(it must be between 4-12 characters\n it must not contain spaces or underscores): ");
        String UserName = getName.nextLine();
        if(UserName.length()<4 || UserName.length()>12){
            System.out.print("user name are not invalid please try again");
        }
        else if(UserName.contains(" ") || UserName.contains("_")){
            System.out.print("User name are not invalid please try again");
        }
        else{
            System.out.print(" congrulations user name are invalid ");
        }

        getName.close();
    }
    
}
