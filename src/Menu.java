package src;
import java.util.Scanner;

public class Menu {
    public Scanner scanner;
    public String input;


    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void textInput() {
        System.out.println("Veuillez saisir un texte :");
        input = scanner.nextLine();
        while (input.matches(".*[!@#$%^&*()_+=<>?/;:'\"\\\\|\\[\\]{}~-].*")) {
            System.out.println("Caractères spéciaux détectés !");
            System.out.println("Veuillez saisir un texte :");
            input = scanner.nextLine();
        }
        System.out.println("Correct");
    }

    public String choiceBase() {
        String base;
        while (true) {
            System.out.println("\nChoisissez la base de destination :");
            System.out.println("h : hexadecimal");
            System.out.println("o : octal");
            System.out.println("d : decimal");
            System.out.println("b : binary");
            System.out.println("t : text");
            base = scanner.nextLine().trim().toLowerCase();
            if (base.equals("h") || base.equals("o") || base.equals("d") || base.equals("b") || base.equals("t")){
                return base;
            } else {
                System.out.println("Base non reconnue. Veuillez choisir une base valide.");
            }
        }
    }


    public String choiceTextBase() {
        String textBase;
        while (true) {
            System.out.println("\nChoisissez la base de destination :");
            System.out.println("h : hexadecimal");
            System.out.println("o : octal");
            System.out.println("d : decimal");
            System.out.println("b : binary");
            textBase = scanner.nextLine().trim().toLowerCase();
            if (textBase.equals("h") || textBase.equals("o") || textBase.equals("d") || textBase.equals("b")) {
                return textBase;
            } else {
                System.out.println("Base non reconnue. Veuillez choisir une base valide.");
            }
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
