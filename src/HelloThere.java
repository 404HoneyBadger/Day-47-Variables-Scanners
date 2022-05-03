import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you today?");
        String answer = scanner.nextLine();
        System.out.println("Wow - Interesting. Tell me more about yourself!");
        String more = scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
        
    }


}    
