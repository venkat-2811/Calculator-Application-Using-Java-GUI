import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {

    // Creating a frame
    private JFrame frame;

    // Creating a textfield
    private JTextField textField;

    // Store operator and operands
    private String operator;
    private double num1, num2, result;

    // Constructor
    public SimpleCalculator() {
        // Frame settings
        frame = new JFrame("Simple Calculator");
        textField = new JTextField();

        // Panel to hold buttons
        JPanel panel = new JPanel();

        // Set layout of panel
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Buttons
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);
        }

        // Adding components to the frame
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel);

        // Frame properties
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
            }

            textField.setText(String.valueOf(result));
            operator = null;
        } else {
            if (operator == null) {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
