package src;
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.textInput();
        String base = menu.choiceBase();

        String output;
        
        System.out.println("Vous avez choisi la base : " + base);

        if (base.equals("h")) { // Hexadecimal conversion
            output = StringtoHex.toHex(menu.input);
            System.out.println("Hexadecimal: " + output);

        } else if (base.equals("o")) { // Octal conversion
            output = StringtoOct.toOct(menu.input);
            System.out.println("Octal: " + output);

        } else if (base.equals("d")) { // Decimal conversion

            
        } else if (base.equals("b")) { // Binary conversion


        } else if (base.equals("t")) {


        }

        menu.closeScanner();
    }
}
