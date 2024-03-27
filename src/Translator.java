import java.util.HashMap;

public class Translator {
    private HashMap<Integer, String> numericAlpha;

    public Translator(String[] alphabetic, Integer[] numeric) {
        this.numericAlpha = new HashMap<>();

        for (int i = 0; i < alphabetic.length && i < numeric.length; i++) {
            String alphaWord = alphabetic[i];
            Integer num = numeric[i];
            numericAlpha.put(num, alphaWord);
        }

        System.out.println("HashMap Entries:");
        for (Integer key : numericAlpha.keySet()) {
            String value = numericAlpha.get(key);
            System.out.println(key + " - " + value);
        }
    }

    public String translate(Integer number) {
        return numericAlpha.getOrDefault(number, "Number not found");
    }

    public static void main(String[] args) {
        String[] alphabetic = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Integer[] numeric = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Translator translator = new Translator(alphabetic, numeric);

        // Test the translate method
        int testNumber = 5;
        System.out.println("Number " + testNumber + " in words is: " + translator.translate(testNumber));
    }
}



