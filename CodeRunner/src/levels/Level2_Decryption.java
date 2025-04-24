//
package levels;
import coderunner.LevelBase;
import java.util.Scanner;

public class Level2_Decryption extends LevelBase {

    private String secretMessage = "khoor"; // Encrypted with Caesar cipher (shift 3)
    private int shift = 3;

    public Level2_Decryption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public boolean startLevel() {
        System.out.println("Level 2: Caesar Cipher Decryption");
        System.out.println("\nEncrypted message: " + secretMessage);
        System.out.print("Enter the decrypted message: ");

        String userAnswer = scanner.nextLine().toLowerCase();

        String correct = decrypt(secretMessage, shift);

        if (userAnswer.equals(correct)) {
            System.out.println("[✔] Access granted. Moving to next terminal...");
            return true;
        } else {
            System.out.println("[X] Incorrect decryption. Access denied.");
            return false;
        }
    }

    private String decrypt(String message, int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) (c - shift);
                if (decryptedChar < 'a') {
                    decryptedChar += 26;
                }
                decrypted.append(decryptedChar);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
