package src;
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.textInput();
        String base = menu.choiceBase();
        String textbase = menu.input.toLowerCase();

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


        } else if (base.equals("t")) {
            textbase = menu.choiceTextBase();
            if (menu.input.matches(".*[a-zA-Z].*")) {
                System.out.println("Erreur : votre message contient déjà du texte. Veuillez choisir une autre base.");
            }
            if (textbase.equals("h")) {
                output = Tostring.HexToString(menu.input);
                System.out.println("Texte: " + output);
            } else if (textbase.equals("o")) {
                output = Tostring.OctToString(menu.input);
                System.out.println("Texte: " + output);
            } else if (textbase.equals("d")) {
                output = Tostring.DecToString(menu.input);
                System.out.println("Texte: " + output);
            } else if (textbase.equals("b")) {
                output = Tostring.BintoString(menu.input);
                System.out.println("Texte: " + output);
            }
            output = Tostring.DecToString(menu.input);

        } else {
            System.out.println("Base non reconnue. Veuillez choisir une base valide.");
            return;
        }
        menu.closeScanner();
        }
    }

