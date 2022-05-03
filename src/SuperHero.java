import java.util.Scanner;

public class SuperHero {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String name = scanner.nextLine();

        System.out.println("What is their power?");
        String power = scanner.nextLine();

        System.out.println("Here is the story:!");
        System.out.println("There once was a superhero named " + (name) + ", who had the power of " + (power) + ".");

        System.out.println("As they grew older, " + (name) + " saw that the world needed them." + (name) + " used their ability to" + (power) +  " to save the world.");
    }


}    
