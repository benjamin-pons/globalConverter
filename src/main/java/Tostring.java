public class Tostring {
    public static String BintoString(String input) {
        StringBuilder result = new StringBuilder();
        String[] binaryValues = input.split(" ");

        for (String bin : binaryValues) {
            int ascii = 0;
            int j = 0;
            for (int i = 7; i >= 0; i--) {
                ascii += (bin.charAt(j) - '0') * (Math.pow(2, i));
                j++;
            }

            char c = (char) ascii;
            result.append(c);
        }

        return result.toString();
    }

    public static String HexToString(String input) {
        StringBuilder result = new StringBuilder();
        String[] hexValues = input.split(" ");

        for (String hex : hexValues) {
            int ascii = 0;
            
            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                if (c >= 'A' && c <= 'F') {
                    ascii = ascii * 16 + (c - 'A' + 10); // Convert A-F to 10-15
                } else if (c >= '0' && c <= '9') {
                    ascii = ascii * 16 + (c - '0');
                } else {
                    System.out.println("Erreur: Invalid hex character '" + c + "'");
                }
            }

            char character = (char) ascii;
            result.append(character);
        }

        return result.toString();
    }

    public static String OctToString(String input) {
        StringBuilder result = new StringBuilder();
        String[] octalValues = input.split(" ");

        for (String oct : octalValues) {
            int ascii = 0;
            for (int i = 0; i < oct.length(); i++) {
                char c = oct.charAt(i);
                if (c >= '0' && c <= '7') {
                    ascii = ascii * 8 + (c - '0');
                } else {
                    System.out.println("Erreur: Invalid octal character '" + c + "'");
                }
            }

            char character = (char) ascii;
            result.append(character);
        }

        return result.toString();
    }

    public static String DecToString(String input) {
        StringBuilder result = new StringBuilder();
        String[] decimalValues = input.split(" ");

        for (String dec : decimalValues) {
            int ascii = 0;
            for (int i = 0; i < dec.length(); i++) {
                char c = dec.charAt(i);
                if (c >= '0' && c <= '9') {
                    ascii = ascii * 10 + (c - '0');
                } else {
                    System.out.println("Erreur: Invalid decimal character '" + c + "'");
                }
            }
            

            char character = (char) ascii;
            result.append(character);
        }

        return result.toString();
    }

}
