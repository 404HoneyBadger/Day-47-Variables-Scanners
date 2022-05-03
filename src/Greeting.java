import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + (name));
    }


}    
