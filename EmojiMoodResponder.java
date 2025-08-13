import java.util.Scanner;

public class EmojiMoodResponder {

    // Method to process mood and return response
    public static void respondToMood(String input) {
        String lowerInput = input.toLowerCase();
        boolean matched = false;

        if (lowerInput.contains("happy")) {
            System.out.println("You seem cheerful! " + "\uD83D\uDE0A"); // 😊
            matched = true;
        }
        if (lowerInput.contains("sad")) {
            System.out.println("Cheer up! Here’s a virtual hug " + "\uD83E\uDD17"); // 🤗
            matched = true;
        }
        if (lowerInput.contains("angry")) {
            System.out.println("Take a deep breath " + "\uD83D\uDE24"); // 😤
            matched = true;
        }
        if (lowerInput.contains("tired")) {
            System.out.println("Rest well " + "\uD83D\uDE34"); // 😴
            matched = true;
        }
        if (lowerInput.contains("excited")) {
            System.out.println("Let’s celebrate! " + "\uD83E\uDD73"); // 🥳
            matched = true;
        }

        if (!matched) {
            System.out.println("Hmm, I couldn't recognize that mood. Try again! " + "\uD83E\uDD14"); // 🤔
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to Emoji Mood Responder!");
        System.out.println("Type how you're feeling (e.g., happy, sad, angry, tired, excited) or type 'exit' to quit.");

        // Loop until user types "exit"
        while (true) {
            System.out.print("\nHow are you feeling? ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! Stay positive! " + "\u2728"); // ✨
                break;
            }

            respondToMood(userInput);
        }

        scanner.close();
    }
}
