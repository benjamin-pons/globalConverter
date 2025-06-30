public class StringtoHex {
    public static String toHex(String input) {
        // Hexadecimal is represented by two characters for each ASCII character
        char hexChar1;
        char hexChar2;

        StringBuilder hex = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int ascii = (int) c;

            // Convert ASCII value to hexadecimal
            int quotient = ascii / 16;
            int remainder = ascii % 16;

            // Find the hexadecimal character corresponding to the quotient : First hexadecimal character
            if (quotient < 10) {
                hexChar1 = (char) ('0' + quotient);
            } else {
                hexChar1 = (char) ('A' + (quotient - 10));
            }

            // Find the hexadecimal character corresponding to the remainder : Second hexadecimal character
            if (remainder < 10) {
                hexChar2 = (char) ('0' + remainder);
            } else {
                hexChar2 = (char) ('A' + (remainder - 10));
            }

            // Append the two hexadecimal characters to the result
            hex.append(hexChar1);
            hex.append(hexChar2);
            hex.append(' ');
        }
        return hex.toString();
    }
}
