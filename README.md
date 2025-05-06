# Number Guessing Game

A simple console-based number guessing game implemented in Java.

## Description

This project is a fun, interactive game where the player attempts to guess a randomly generated number. The program provides feedback after each guess, telling the player if their guess was too high or too low, until they correctly guess the correct number.

## Features

- Random number generation between 1-100
- User input validation
- Guess tracking with attempt counter
- Helpful feedback on each guess
- Game completion detection
- Option to play again

## How to Play

1. Run the program
2. The game will generate a random number between 1 and 100
3. Enter your guess when prompted
4. The game will tell you if your guess is too high or too low
5. Keep guessing until you find the correct number
6. The game will display the number of attempts it took you to win
7. Choose whether you want to play again

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

## Installation

1. Clone the repository:
   ```
   git clone https://github.com/VVSVASANTH/Number-Guessing-Game.git
   ```
2. Navigate to the project directory:
   ```
   cd Number-Guessing-Game
   ```

## Usage

To compile the program:
```
javac NumberGuessingGame.java
```

To run the game:
```
java NumberGuessingGame
```

## Code Structure

The main components of the application include:
- Random number generation using `java.util.Random`
- User input handling with `java.util.Scanner`
- Game logic for comparing guesses and providing feedback
- Loop for continuing the game until the correct number is guessed
- Play again functionality

## Future Improvements

- Add difficulty levels (adjusting the range of possible numbers)
- Implement a scoring system based on number of attempts
- Add a graphical user interface (GUI)
- Include a timer feature
- Add option for multiple rounds with cumulative scoring

## Contributing

Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.
