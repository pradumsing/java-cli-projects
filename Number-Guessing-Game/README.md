# Number Guessing Game (Java CLI)

A simple command-line Number Guessing Game built using Core Java. The computer randomly selects a number between **1 and 100**, and the player has **10 attempts** to guess it.

## Features

*  Random number generation (1–100)
*  User input using `Scanner`
*  Loop-based gameplay
*  Attempt counter
*  Hints after each guess ("Too High!" / "Too Low!")
*  Win message with the number of attempts
*  Game Over message after 10 unsuccessful attempts

## Technologies Used

* Java
* IntelliJ IDEA (or any Java IDE)

## How to Run

1. Clone the repository:

   ```bash
git clone https://github.com/pradumsing/java-cli-projects.git
   ```

2. Open the project in your preferred Java IDE.

3. Compile and run `NumberGuessingGame.java`.

## Sample Output

```text
=== Number Guessing Game ===
Guess a number between 1 and 100

Enter your guess: 50
TOO LOW!

Enter your guess: 75
TOO HIGH!

Enter your guess: 63
Congratulations!
You guessed the number in 3 attempts.
```

## Concepts Practiced

* Variables and Data Types
* Conditional Statements (`if-else`)
* Loops (`while`)
* User Input (`Scanner`)
* Random Number Generation (`Random`)
* Program Flow Control

## Future Improvements

* Add difficulty levels (Easy, Medium, Hard)
* Allow the player to play multiple rounds
* Validate invalid or non-numeric input
* Display remaining attempts after each guess
* Track the best score during a session

## Author

**Pradum Singh**

---

