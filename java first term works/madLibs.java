import java.util.Scanner;
public class madLibs {
    public static void main(String[] args) {
        Scanner getwords = new Scanner(System.in);
        System.out.println(".....(a person's name) it's time to dinner!");
        System.out.println("please fill the blank : ");
        String word = getwords.nextLine();
        System.out.println(word + " it's time to dinner!");
        getwords.close();
        
    }
}
