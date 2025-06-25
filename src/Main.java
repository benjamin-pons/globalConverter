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
            output = StringtoDec.toDec(menu.input);
            System.out.println("Decimal: " + output);
            
        } else if (base.equals("b")) { // Binary conversion
            output= StringtoBin.toBin(menu.input);
            System.out.println("Binaire: " + output);

        } else if (base.equals("t")) { // Text conversion
            output = Tostring.DecToString(menu.input);
            System.out.println("Texte: " + output);

        } else if (base.equals("c")) { // Caesar Cipher
            output = CaesarCipher.CCipher(menu.input);
            System.out.println("Chiffrement César: " + output);

            

        } else {
            System.out.println("Base non reconnue. Veuillez choisir une base valide.");
            return;


        }

        menu.closeScanner();
    }
}
