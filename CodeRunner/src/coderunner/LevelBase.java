//
package coderunner;
import java.util.Scanner;

public abstract class LevelBase {
    protected Scanner scanner;

    public LevelBase(Scanner scanner) {
        this.scanner = scanner;
    }

    public abstract boolean startLevel();
}

