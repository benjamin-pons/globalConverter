public class StringtoBin {
    public static String toBin(String input) {
        // Binary is represented by eight bits for each ASCII character
        StringBuilder binary = new StringBuilder();
        
        // Go through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int ascii = (int) c; // Convert character to ASCII value
            
            int bit1 = (ascii / 128) % 2;
            int bit2 = (ascii / 64) % 2;
            int bit3 = (ascii / 32) % 2;
            int bit4 = (ascii / 16) % 2;
            int bit5 = (ascii / 8) % 2;
            int bit6 = (ascii / 4) % 2;
            int bit7 = (ascii / 2) % 2;
            int bit8 = ascii % 2; 

            // Append the bits to the binary string
            binary.append(bit1);
            binary.append(bit2);
            binary.append(bit3);
            binary.append(bit4);
            binary.append(bit5);
            binary.append(bit6);
            binary.append(bit7);
            binary.append(bit8);
            binary.append(' '); 
        }
        

        return binary.toString();
    }
}
