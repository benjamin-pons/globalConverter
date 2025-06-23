package src;

public class StringtoOct {
    public static String toOct(String input) {
        StringBuilder oct = new StringBuilder();

        // Go through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);

            // Convert ASCII value to octal
            int digit1 = ascii / 64; // First octal caracter
            int digit2 = (ascii % 64) / 8; // Second octal caracter
            int digit3 = ascii % 8; // Third octal caracter

            // Find the octal character corresponding to the ASCII value and append it
            oct.append((char) ('0' + digit1));
            oct.append((char) ('0' + digit2));
            oct.append((char) ('0' + digit3));
            oct.append(' ');
        }
        return oct.toString();
    }
}