package src;

public class Tostring {
    public static String BintoString(String input)
    {
        StringBuilder result = new StringBuilder();
        String[] binaryValues = input.split(" ");

        for (String bin : binaryValues) {
            int ascii = 0;
            int j = 0;
            for (int i = 7; i >= 0; i --) {
                ascii += bin.charAt(j).getNu * 2 ^ (i);
                j++;
                System.err.println("Char: " + bin.charAt(j-1));
            }

            char c = (char) ascii;
            result.append(c);
        }

        return result.toString();
    }

}
