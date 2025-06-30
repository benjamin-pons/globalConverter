import java.util.Scanner;

public class CaesarCipher {
    public static String CCipher(String input) {

        System.out.println("Veuillez entrer le décalage pour le chiffrement César :");
        Scanner scanner = new Scanner(System.in);
        int shift = scanner.nextInt();
        scanner.close();

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c + shift > 'Z') {
                    c = (char) (c + shift - 26); // Wrap around if it goes past 'Z'
                } else if (c + shift < 'A') {
                    c = (char) (c + shift + 26); // Wrap around if it goes before 'A'
                }
                else {
                    c = (char) (c + shift);
                }
            }
            else if (c >= 'a' && c <= 'z') {
                if (c + shift > 'z') {
                    c = (char) (c + shift - 26); // Wrap around if it goes past 'z'
                } else if (c + shift < 'a') {
                    c = (char) (c + shift + 26); // Wrap around if it goes before 'a'
                } else {
                    c = (char) (c + shift);
                }
            } else {
                // Non-letters characters remain unchanged
                encrypted.append(c);
                continue;
            }
            
            encrypted.append(c);
        }


        return encrypted.toString();
    }
}