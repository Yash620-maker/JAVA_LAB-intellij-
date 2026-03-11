package LAB_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageCalculatorApp {

    public static void main(String[] args) {
        new CalcFrame();
    }
}

class CalcFrame extends JFrame implements ActionListener {

    JTextField display;

    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton add,sub,mul,div,eq,dec,off,clear;

    double num1,num2,result;
    String operator;

    CalcFrame(){

        setTitle("CALCULATOR");
        setSize(260,320);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setFont(new Font("Arial",Font.BOLD,18));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,4,5,5));

        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        div=new JButton("/");

        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        mul=new JButton("*");

        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        sub=new JButton("-");

        b0=new JButton("0");
        dec=new JButton(".");
        eq=new JButton("=");
        add=new JButton("+");

        clear=new JButton("C");
        off=new JButton("OFF");

        panel.add(clear);
        panel.add(off);
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(div);

        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(mul);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(sub);

        panel.add(b0);
        panel.add(dec);
        panel.add(eq);
        panel.add(add);

        add(panel,BorderLayout.CENTER);

        JButton buttons[]={
                b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,
                add,sub,mul,div,eq,dec,off,clear
        };

        for(JButton b:buttons)
            b.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String cmd=e.getActionCommand();

        if(cmd.matches("[0-9]") || cmd.equals(".")){
            display.setText(display.getText()+cmd);
        }

        else if(cmd.equals("+")||cmd.equals("-")||cmd.equals("*")||cmd.equals("/")){
            num1=Double.parseDouble(display.getText());
            operator=cmd;
            display.setText("");
        }

        else if(cmd.equals("=")){
            num2=Double.parseDouble(display.getText());

            if(operator.equals("+")) result=num1+num2;
            if(operator.equals("-")) result=num1-num2;
            if(operator.equals("*")) result=num1*num2;
            if(operator.equals("/")) result=num1/num2;

            display.setText(String.valueOf(result));
        }

        else if(cmd.equals("C")){
            display.setText("");
        }

        else if(cmd.equals("OFF")){
            System.exit(0);
        }
    }
}