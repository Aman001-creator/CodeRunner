//
package levels;

import coderunner.LevelBase;
import java.io.*;
import java.util.Scanner;

public class Level3_FileSearch extends LevelBase {
    private final File rootDir;
    private final String secretKeyword = "unlock";

    public Level3_FileSearch(Scanner scanner) {
        super(scanner);
        // You can change this path as needed (for now, we use a "test_files" directory)
        this.rootDir = new File("test_files");
    }

    @Override
    public boolean startLevel() {
        System.out.println("Level 3: File System Hunt");
        System.out.println("Navigate through files to find the secret keyword.");

        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("[X] Root directory not found: " + rootDir.getAbsolutePath());
            return false;
        }

        boolean found = searchFiles(rootDir);

        if (found) {
            System.out.println("[✔] Keyword '" + secretKeyword + "' found! Level complete.");
            return true;
        } else {
            System.out.println("[X] Keyword not found. Try again.");
            return false;
        }
    }

    private boolean searchFiles(File directory) {
        File[] files = directory.listFiles();
        if (files == null) return false;

        for (File file : files) {
            if (file.isDirectory()) {
                if (searchFiles(file)) return true;
            } else {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.toLowerCase().contains(secretKeyword)) {
                            System.out.println("📁 Found in file: " + file.getName());
                            return true;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("⚠️ Error reading file: " + file.getName());
                }
            }
        }
        return false;
    }
}
