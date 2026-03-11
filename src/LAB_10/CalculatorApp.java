package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp {

    public static void main(String[] args) {
        new CalcFrame();
    }
}

class CalcFrame extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton add, sub, mul, reset;

    CalcFrame() {

        setTitle("My Calc");
        setSize(450,250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Enter the First Number"));
        num1 = new JTextField(10);
        add(num1);

        add(new JLabel("Enter the Second Number"));
        num2 = new JTextField(10);
        add(num2);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        reset = new JButton("Reset");

        add(add);
        add(sub);
        add(mul);
        add(reset);

        add(new JLabel("Result"));
        result = new JTextField(10);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==reset){
            num1.setText("");
            num2.setText("");
            result.setText("");
            return;
        }

        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double r = 0;

        if(e.getSource()==add) r = a+b;
        if(e.getSource()==sub) r = a-b;
        if(e.getSource()==mul) r = a*b;

        result.setText(String.valueOf(r));
    }
}