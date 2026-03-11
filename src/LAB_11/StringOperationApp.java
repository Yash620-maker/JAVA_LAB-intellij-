package LAB_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringOperationApp {

    public static void main(String[] args) {
        new StringFrame();
    }
}

class StringFrame extends JFrame implements ActionListener {

    JTextField input, output;

    JButton caps, small, convert, words, letters;
    JButton reverse, vowels, freq, beginCaps, reset;

    StringFrame(){

        setTitle("My Frame");
        setSize(700,400);
        setLayout(new FlowLayout());
        getContentPane().setBackground(new Color(230,150,150));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Enter the string:"));
        input = new JTextField(30);
        add(input);

        add(new JLabel("String in upper case:"));
        output = new JTextField(30);
        add(output);

        caps = new JButton("IN CAPS");
        small = new JButton("IN SMALL");
        convert = new JButton("CONVERT CASE");
        words = new JButton("WORDS");
        letters = new JButton("LETTERS");
        reverse = new JButton("REVERSE");
        vowels = new JButton("VOWELS");
        freq = new JButton("FREQUENCY");
        beginCaps = new JButton("BEGIN CAPS");
        reset = new JButton("RESET");

        add(caps);
        add(small);
        add(convert);
        add(words);
        add(letters);
        add(reverse);
        add(vowels);
        add(freq);
        add(beginCaps);
        add(reset);

        JButton buttons[] = {caps,small,convert,words,letters,reverse,vowels,freq,beginCaps,reset};

        for(JButton b:buttons)
            b.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String text = input.getText();
        String result = "";

        if(e.getSource()==caps){
            result = text.toUpperCase();
        }

        else if(e.getSource()==small){
            result = text.toLowerCase();
        }

        else if(e.getSource()==convert){
            for(char c:text.toCharArray()){
                if(Character.isUpperCase(c))
                    result += Character.toLowerCase(c);
                else
                    result += Character.toUpperCase(c);
            }
        }

        else if(e.getSource()==words){
            String arr[] = text.trim().split("\\s+");
            result = "Words: "+arr.length;
        }

        else if(e.getSource()==letters){
            result = "Letters: "+text.replace(" ","").length();
        }

        else if(e.getSource()==reverse){
            result = new StringBuilder(text).reverse().toString();
        }

        else if(e.getSource()==vowels){
            int count=0;
            for(char c:text.toLowerCase().toCharArray()){
                if("aeiou".indexOf(c)!=-1)
                    count++;
            }
            result = "Vowels: "+count;
        }

        else if(e.getSource()==freq){
            int count=0;
            for(char c:text.toCharArray()){
                if(c=='a' || c=='A')
                    count++;
            }
            result = "Frequency of A: "+count;
        }

        else if(e.getSource()==beginCaps){
            String arr[] = text.split(" ");
            for(String w:arr){
                result += Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase() + " ";
            }
        }

        else if(e.getSource()==reset){
            input.setText("");
            output.setText("");
            return;
        }

        output.setText(result);
    }
}