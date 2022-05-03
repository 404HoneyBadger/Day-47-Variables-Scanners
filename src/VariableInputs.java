import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();

        System.out.println("Enter an interger:");
        int intE = scanner.nextInt();

        System.out.println("Enter a double:");
        double doubleE = scanner.nextDouble();

        System.out.println("Enter a boolean value::");
        boolean boo = scanner.nextBoolean();

       
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + intE);
        System.out.println("Your double is " + doubleE);
        System.out.println("Your boolean is " + boo);



    }


}    
