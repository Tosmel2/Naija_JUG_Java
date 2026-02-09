# Java Student Utility App

A simple, console-based Java application that demonstrates core Java concepts and a basic Git/GitHub workflow. The app provides a menu to:
- Add two integers
- Check if a number is EVEN or ODD (using a ternary operator)
- Print numbers from 1 to N (using a for loop)
- Display the day of the week from a number (1–7) using a switch statement

## How to Run
From a terminal (PowerShell or Command Prompt):

```bash
cd Java-week1-student-utility-app/src
javac JavaStudentUtilityApp.java
java JavaStudentUtilityApp
```
This code includes:
- `Scanner` for input
- `while` main loop, `for` loop, `if/else`, and `switch`
- Ternary operator for even/odd
- Multiple helper methods: `showMenu`, `getIntInput`, `addTwoNumbers`, `checkEvenOrOdd`, `printOneToN`, `displayDayOfWeek`
- Comments and camelCase naming

---

### Step 2 — Compile and run locally
In PowerShell or Command Prompt, from the project root:

```powershell
cd "C:\Users\Admin\Desktop\NAIJA_JUG_JAVA\Java-week1-student-utility-app\src"
javac JavaStudentUtilityApp.java
java JavaStudentUtilityApp
```

If `java`/`javac` aren’t recognized, install a JDK (e.g., Temurin or Oracle JDK) and ensure `JAVA_HOME` and PATH are set.

---

### Step 3 — Initialize Git and push to GitHub
GitHub repo name required: `java-week1-student-utility-app`.

1) Create the GitHub repository first (on github.com) with that exact name, empty (no README, no .gitignore). Copy its remote URL.

2) In your local project root:

```powershell
cd "C:\Users\Admin\Desktop\NAIJA_JUG_JAVA"
git init
```

3) Create a `.gitignore` (optional but recommended) to ignore compiled classes:

```
# .gitignore
/out/
*.class
```

4) Make the required commits:
- Commit 1 — Initial project setup

```powershell
git add Java-week1-student-utility-app/src/JavaStudentUtilityApp.java
# If you created .gitignore:
git add .gitignore

git commit -m "Initial project setup"
```

- Commit 2 — Menu implementation

Make sure `showMenu()` and the loop exist; then:

```powershell
git add Java-week1-student-utility-app/src/JavaStudentUtilityApp.java
git commit -m "Add menu loop and input handling"
```

- Commit 3 — Final logic & cleanup

After you’ve added all options and comments:

```powershell
git add Java-week1-student-utility-app/src/JavaStudentUtilityApp.java
git commit -m "Implement options 1-4, validation, and comments; finalize app"
```

5) Connect to GitHub and push `main` (or `master`):

```powershell
git branch -M main
# Replace with your repo URL
git remote add origin https://github.com/<your-username>/java-week1-student-utility-app.git
git push -u origin main
```

---

### Step 4 — Create README.md
Use this template; save it as `README.md` in the project root and commit/push.

```markdown
# Java Student Utility App

A simple console-based Java application demonstrating basic Java constructs and Git workflow. The app offers a menu to add two numbers, check even/odd, print 1..N, and display the day of the week.

## How to Run
```bash
cd Java-week1-student-utility-app/src
javac JavaStudentUtilityApp.java
java JavaStudentUtilityApp
```

## Sample Output
```
================ Java Student Utility App ================
1. Add Two Numbers
2. Check EVEN or ODD
3. Print Numbers from 1 to N
4. Display Day of the Week
5. Exit
==========================================================
Enter your choice (1-5): 1
Enter the first integer: 12
Enter the second integer: 30
Result: 12 + 30 = 42

Enter your choice (1-5): 2
Enter an integer: 7
The number 7 is ODD

Enter your choice (1-5): 5
Thank you for using the app
```

Commit it:

```powershell
git add README.md
git commit -m "Add README with run instructions and sample output"
git push
```

## Author
Tosin Adewale
