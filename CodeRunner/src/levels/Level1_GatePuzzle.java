//
package levels;
import coderunner.LevelBase;
import java.util.*;

public class Level1_GatePuzzle extends LevelBase {

    public Level1_GatePuzzle(Scanner scanner) {
        super(scanner);
    }

    @Override
    public boolean startLevel() {
        System.out.println("Level 1: Logic Gate Puzzle\n");

        Random rand = new Random();
        int a = rand.nextInt(2);
        int b = rand.nextInt(2);

        int correctAnswer = (a & b) | 1;  // (AND result) OR 1

        System.out.println("What is the output of: (" + a + " AND " + b + ") OR 1 ?");
        System.out.print("Enter your answer (0 or 1): ");

        int userAnswer;
        try {
            userAnswer = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("[X] Invalid input. Expected 0 or 1.");
            return false;
        }

        if (userAnswer == correctAnswer) {
            System.out.println("[✔] Correct. Gate unlocked.");
            return true;
        } else {
            System.out.println("[X] Incorrect. Security breach.");
            return false;
        }
    }
}
