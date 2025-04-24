
# CodeRunner: Hacker Escape Simulator 🎮

## 🚀 About
**CodeRunner** is a thrilling text-based hacker simulation game built using **Core Java**. Players must use their coding and problem-solving skills to pass through various security levels. Each level is designed to test your knowledge of algorithms, string manipulation, file handling, recursion, and more.

### 🏆 Objective
The player's goal is to progress through different levels of the game, each representing a specific challenge a hacker might face in a real-world situation. Success in each level unlocks the next challenge.

---

## 📂 Project Structure

- **GameEngine.java**: Core game engine handling the flow and interaction with levels.
- **LevelBase.java**: Base class for defining levels.
- **Level1_GatePuzzle.java**: Logic Gate Puzzle Level.
- **Level2_Decryption.java**: Decryption Puzzle Level.
- **Level3_FileSearch.java**: File System Hunt Level.
- **Utils**: Helper classes for file operations, cipher utilities, and timer functionalities.
- **Leaderboard.txt**: Stores the top players of the game.

---

## 🎮 Levels Overview

### 🔐 **Level 1: Logic Gate Puzzle**
- **Objective**: Solve logic gate puzzles using simple boolean logic (AND, OR, NOT).
- **Skills Tested**: Conditionals, Boolean operations, Basic problem-solving.

### 🕵️‍♂️ **Level 2: Decryption Puzzle**
- **Objective**: Decrypt a message encrypted using a Caesar cipher.
- **Skills Tested**: String manipulation, Cryptography basics, Algorithm design.

### 📁 **Level 3: File System Hunt**
- **Objective**: Search through files and folders for a hidden keyword ("unlock").
- **Skills Tested**: File I/O, Recursion, String searching, Exception handling.

---

## 🛠️ Technologies Used

- **Core Java** (JDK 8+)
- **Java File I/O**: For reading and searching through files.
- **Recursion**: For navigating through directories and files.
- **String Manipulation**: For encoding and decoding messages.

---

## ⚙️ How to Run the Game

### Prerequisites
- Install [JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html) (Java Development Kit).

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/coderunner.git
   ```
2. Navigate to the project directory:
   ```bash
   cd coderunner
   ```
3. Compile the Java files:
   ```bash
   javac src/coderunner/*.java src/levels/*.java src/utils/*.java
   ```
4. Run the game:
   ```bash
   java coderunner.Main
   ```

---

## 📌 Future Enhancements

- **Level 4: Bomb Timer Escape**: A multi-threaded challenge where players must disarm a bomb within a time limit.
- **Player Profiles**: Save game progress with player-specific data.
- **Multiplayer Mode**: Compete against other hackers in a timed challenge.

---

## 💬 Contribute
Feel free to fork, contribute, and create pull requests. Suggestions and improvements are always welcome!

---

## 📜 License
This project is licensed under the MIT License – see the [LICENSE.md](LICENSE.md) file for details.

---

## 🤝 Contact

- **Aman Kumar** (Creator)  
  - [LinkedIn](https://www.linkedin.com/in/yourprofile)
  - [GitHub](https://github.com/yourusername)
