import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to Encode: ");

        String encoded = encode(scanner.next());
        System.out.println("Encoded: " + encoded);

        System.out.println("Decode: " + decode(encoded));
    }

    public static String encode(String input){
        byte[] signsToEncode = input.getBytes();
        byte[] toBase64 = Base64.getEncoder().encode(signsToEncode);
        return new String(toBase64);
    }

    public static String decode(String encoded){
        byte[] toDecode = Base64.getDecoder().decode(encoded);
        return new String(toDecode);
    }
}
