import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide first string of text:");
        String one = scanner.nextLine();
        System.out.println("Provide second string of text:");
        String two = scanner.nextLine();
        System.out.println("Provide third string of text:");
        String three = scanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}