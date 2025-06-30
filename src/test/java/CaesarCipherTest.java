import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CaesarCipherTest {

    @Test
    public void testEncryptionHex() {
        String output = StringtoHex.toHex("Hello World");
        assertEquals("48 65 6C 6C 6F 20 57 6F 72 6C 64 ", output);
    }

    @Test
    public void testDecryptionHex() {
        String output = Tostring.HexToString("42 6F 6E 6A 6F 75 72");
        assertEquals("Bonjour", output);
    }

    @Test
    public void testEncryptionBin() {
        String output = Tostring.BintoString("01000010 01101111 01101110 01101010 01101111 01110101 01110010");
        assertEquals("Bonjour", output);
    }
}