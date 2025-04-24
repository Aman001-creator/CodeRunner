//
package coderunner;

import java.util.Scanner;
import levels.Level1_GatePuzzle;
import levels.Level2_Decryption;

public class GameEngine {
    private final Scanner scanner = new Scanner(System.in);
    private String playerName;

    public void startGame() {
        System.out.println("=== CodeRunner: Hacker Escape Simulator ===");
        System.out.print(">> Identify yourself, runner: ");
        playerName = scanner.nextLine();

        System.out.println("\nWelcome, " + playerName + ". Your mission begins now...\n");

        LevelBase level1 = new Level1_GatePuzzle(scanner);
        if (!level1.startLevel()) {
            System.out.println("\n[X] Mission failed at Level 1. Try again.");
            return;
        }

        System.out.println("\n[✔] Level 1 completed. Preparing Level 2...\n");

        LevelBase level2 = new Level2_Decryption(scanner);
        if (!level2.startLevel()) {
            System.out.println("\n[X] Mission failed at Level 2. Try again.");
            return;
        }

        System.out.println("\n🎉 Congratulations, " + playerName + "! You've successfully completed Level 2.");
    }
}
