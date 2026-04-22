import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner getnums = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = getnums.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = getnums.nextInt();
        System.out.print("Enter the symbol or a character: ");
        char symbol = getnums.next().charAt(0);

        for(int i = 0;i<=rows;i++){
            for(int j = 0; j<=columns;j++){
                System.out.print(symbol);
            }
            System.out.println();

        }
        getnums.close();
    }
    
}
