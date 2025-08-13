 Emoji Mood Responder – React to Emotions with Java

📌 Project Overview
The **Emoji Mood Responder** is a simple Java console application that takes mood-related input from the user and responds with an appropriate message and emoji.  
It is designed to help beginners practice **Java fundamentals** such as input handling, conditional logic, string processing, loops, and methods.

---

🎯 Objective
- Prompt the user to describe how they feel (e.g., "happy", "angry", "tired").
- Match the input with predefined mood keywords.
- Display a **relevant emoji** and message.
- Allow continuous interaction until the user types **`exit`**.


🛠 Features
- **Case-insensitive mood detection** (e.g., "HAPPY", "happy", "Happy" all match).
- Handles multiple moods:
  - `"happy"` → `You seem cheerful! 😊`
  - `"sad"` → `Cheer up! Here’s a virtual hug 🤗`
  - `"angry"` → `Take a deep breath 😤`
  - `"tired"` → `Rest well 😴`
  - `"excited"` → `Let’s celebrate! 🥳`
- **Looping interaction** – keeps asking until `exit` is entered.
- Uses **Unicode** to display emojis (or can integrate third-party libraries for more emojis).


🧩 Functional Requirements
1. Prompt the user for their mood.
2. Match against predefined keywords.
3. Display the correct emoji + message.
4. Repeat until the user enters `"exit"`.


🚀 How to Run
1. Clone the repository
```bash
git clone https://github.com/yourusername/emoji-mood-responder.git
cd emoji-mood-responder
2. Compile the Java file
bash
Copy
Edit
javac EmojiMoodResponder.java
3. Run the program (UTF-8 enabled for emojis)
bash
Copy
Edit
java -Dfile.encoding=UTF-8 EmojiMoodResponder
💡 Windows Users:
If emojis don’t display properly, run this before executing:

bash
Copy
Edit
chcp 65001
📂 Project Structure
bash
Copy
Edit
emoji-mood-responder/
│
├── EmojiMoodResponder.java   # Main Java source file
└── README.md                 # Project documentation
💻 Tools Used
Language: Java SE 8+

IDE: IntelliJ IDEA / Eclipse / BlueJ / VS Code

Optional: Unicode emoji reference, third-party emoji library

📚 Java Concepts Practiced
Scanner for user input

if-else / switch-case for decision making

String methods (toLowerCase(), contains())

Loops (while) for continuous input

Methods for modular code

Unicode output in console

✨ Bonus Features (Optional)
Recognize multiple moods in one input (e.g., "I feel happy and excited").

Integrate a third-party emoji library (emoji-java) for more emoji options.

GUI version using JOptionPane.

📜 License
This project is open-source and available under the MIT License.

👨‍💻 Author
Aayush Kumar
