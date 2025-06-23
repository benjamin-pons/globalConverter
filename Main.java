public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.textInput();
        String base = menu.choiceBase();

        System.out.println("Vous avez choisi la base : " + base);

        menu.closeScanner();
    }
}
