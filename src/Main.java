import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        String notRight;
        Scanner scanner = new Scanner(System.in);

        Integer[] numeric = new Integer[10];
        for (int i = 0; i < 10; i++) {
            numeric[i] = i;
        }

        System.out.println("Array elements:");
        for (Integer number : numeric) {
            System.out.print(number + " ");
        }

        String[] alphabetic = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.println("\nAlphabetic array:");
        for (String word : alphabetic) {
            System.out.print(word + " ");
        }

        while (play) {
            System.out.println("\nType 'x' to stop");
            System.out.println("Type 'v' to translate");
            String input = scanner.nextLine();

            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type a number from 0 to 9:");
                Integer number = scanner.nextInt();
                scanner.nextLine(); // Consumes newline character after number input

                if (number < 10) {
                    Translator translator = new Translator(alphabetic, numeric);
                    String result = translator.translate(number);
                    System.out.println("The translation of " + number + " is " + result);
                } else {
                    System.out.println("Invalid number. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}





