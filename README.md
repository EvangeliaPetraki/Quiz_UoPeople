# Quiz Application (Java)

This Java quiz application offers an interactive multiple-choice and true/false quiz experience, using GUI components for user interaction. It demonstrates the use of object-oriented programming principles, including inheritance, encapsulation, and polymorphism, to create a modular and extendable quiz system.

## Project Structure

The application consists of five main Java files, organized to handle multiple-choice and true/false questions, track scores, and manage user input through GUI elements.

* quiz_adv.java: The main driver class that creates and manages instances of quiz questions.
* MultipleChoiceQuestion.java: Handles multiple-choice questions with up to five possible answers. This class extends the abstract Question class, inheriting its core structure and adding specific behavior for multiple-choice interactions.
* TrueFalseQuestion.java: Manages true/false questions. It also extends Question, specializing in handling questions with two possible answers.
* Question.java: An abstract superclass that defines the shared behavior for quiz questions, including GUI components, tracking total questions, and correct answer counts. This class provides methods for displaying questions, capturing user input, and displaying results.
* QuestionDialog.java: A dialog-based class for capturing user input using GUI buttons and ActionListeners. It provides a reusable interface for the Question classes to manage user input.


## How It Works

### Inheritance and Object-Oriented Design
The project’s classes use inheritance to share common behaviors and properties:

* Question **(abstract)**: Defines common properties (correctAnswer, question dialog) and methods (ask(), check(), showResults()), which are inherited by both MultipleChoiceQuestion and TrueFalseQuestion.
* MultipleChoiceQuestion and TrueFalseQuestion extend Question: By inheriting from Question, they gain core functionalities (e.g., result checking) and override the ask() method to customize question format and user interaction.
This design encapsulates shared logic in the Question superclass, while allowing each subclass to define specific interactions, making it easy to add new question types.

### GUI Integration
The quiz application uses Java Swing components to create an interactive GUI:

* JPanel and JButton: Each question is presented through buttons within a dialog, making the application more engaging. Users select answers by clicking buttons.
* JOptionPane: Used to display feedback messages (e.g., correct/incorrect answers and final results).
* QuestionDialog class: A custom dialog box that listens for button clicks, captures the selected answer, and disposes of the dialog to proceed with the quiz.
This GUI-based interaction allows the program to visually present questions and collect user responses without relying on the console.

### Program Flow
1. Initialize Questions: In quiz_adv.java, instances of MultipleChoiceQuestion and TrueFalseQuestion are created with specific questions and answer choices.

2. Display Question: Each question instance calls check() to initiate user interaction.
   1. MultipleChoiceQuestion displays a question with five possible answers (A, B, C, D, E).
   2. TrueFalseQuestion displays a question with two buttons: TRUE and FALSE.
3. User Interaction: The ask() method in each subclass displays the GUI dialog to the user. The program waits until an answer is selected, which is captured by QuestionDialog and returned.
4. Feedback and Scoring: Based on the user’s response, the program displays feedback (correct or incorrect) and updates the score.
5. Results Summary: After all questions have been checked, calling showResults() provides a summary of the user’s performance.
