package src;

public class StringtoDec {
    public static String toDec(String input) {
        StringBuilder decimal = new StringBuilder();

        // Go through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int ascii = (int) c; // Convert character to ASCII value

            // Append the ASCII value as a decimal number
            decimal.append(ascii).append(' ');
        }

        return decimal.toString();
    }
}