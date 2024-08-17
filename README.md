# Calculator-Application-Using-Java-GUI

## Overview

The Simple Calculator is a basic GUI-based calculator built using Java's Swing framework. This application allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The user interacts with the calculator through a graphical interface that mimics a standard calculator layout.

## Features

- **Graphical User Interface (GUI):** The application provides a simple and intuitive interface using buttons for digits, operators, and other functionalities.
- **Basic Arithmetic Operations:** Supports addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).
- **Responsive Layout:** The calculator layout automatically adjusts to different window sizes while maintaining a user-friendly design.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- An IDE or text editor that supports Java development (e.g., IntelliJ IDEA, Eclipse, NetBeans).

### Running the Application

1. **Clone or Download the Repository:**
   - You can clone the repository using the following command:
     ```bash
     git clone https://github.com/your-username/simple-calculator.git
     ```
   - Or download the ZIP file and extract it to your desired location.

2. **Compile and Run the Application:**
   - Open the project in your preferred Java IDE.
   - Compile the `SimpleCalculator.java` file.
   - Run the `SimpleCalculator` class to launch the calculator.

   Alternatively, you can compile and run the program using the command line:
   ```bash
   javac SimpleCalculator.java
   java SimpleCalculator
   ```

## Code Structure

- **`SimpleCalculator.java`**: The main class that handles the creation of the calculator GUI, event handling, and the core logic for performing arithmetic operations.

### Key Components

- **JFrame**: The main window of the application.
- **JTextField**: The display area where user inputs and results are shown.
- **JPanel**: Used to organize and layout buttons in a grid structure.
- **JButton**: Represents each button on the calculator (digits, operators, etc.).
- **ActionListener**: Handles button click events and implements the calculator's logic.

## How It Works

- **Input Handling**: The calculator accepts numeric inputs and operations through the buttons. The input is displayed on the text field at the top of the calculator.
- **Operations**: When an operator button is pressed (`+`, `-`, `*`, `/`), the first number is stored, and the display is cleared for the second input. After pressing the `=` button, the calculation is performed, and the result is displayed.
- **Clear and Reset**: The calculator resets the display after each calculation to allow for new operations.

## Future Improvements

- Adding more complex operations like square roots, exponentiation, and percentage.
- Implementing a history feature to track past calculations.
- Enhancing the UI/UX with additional styling and themes.
