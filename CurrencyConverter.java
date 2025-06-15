import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        JLabel label = new JLabel("Enter Amount (USD):");
        label.setBounds(50, 30, 200, 25);
        panel.add(label);

        JTextField amountField = new JTextField(20);
        amountField.setBounds(180, 30, 150, 25);
        panel.add(amountField);

        JButton convertButton = new JButton("Convert to INR");
        convertButton.setBounds(120, 80, 150, 30);
        panel.add(convertButton);

        JLabel resultLabel = new JLabel("Converted Amount:");
        resultLabel.setBounds(50, 130, 300, 25);
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double usd = Double.parseDouble(amountField.getText());
                    double rate = 83.12; // Example rate 1 USD = 83.12 INR
                    double inr = usd * rate;
                    resultLabel.setText("Converted Amount: ₹" + String.format("%.2f", inr));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
            }
        });

        frame.setVisible(true);
    }
}
