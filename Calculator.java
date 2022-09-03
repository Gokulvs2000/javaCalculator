import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //For action listener

/**
 * Calculator
 */
public class Calculator implements ActionListener {

    int clickedOperator;
    JFrame jf;
    JLabel displayLabel, operatorscreen;
    String oldValue;
    JButton sevenButton, eightButton, nineButton;
    JButton fourButton, fiveButton, sixButton;
    JButton oneButton, twoButton, threeButton;
    JButton zeroButton, dotButton;
    JButton addButton, subButton, mulButton, divButton;
    JButton equalButton, clearButton, deleteButton;

    public Calculator() {

        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setBounds(470, 130, 450, 575);
        jf.getContentPane().setBackground(Color.cyan);

        displayLabel = new JLabel();
        displayLabel.setBounds(135, 35, 270, 55);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setBackground(Color.white);
        displayLabel.setForeground(Color.black);
        Border colorBorder = BorderFactory.createLineBorder(Color.white, 1);
        displayLabel.setBorder(colorBorder);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setFont(new Font("Serif", Font.PLAIN, 40));
        jf.add(displayLabel);

        operatorscreen = new JLabel();
        operatorscreen.setBounds(30, 35, 105, 55);
        operatorscreen.setOpaque(true);
        operatorscreen.setBackground(Color.white);
        operatorscreen.setForeground(Color.black);
        Border colorBorder2 = BorderFactory.createLineBorder(Color.black, 0);
        operatorscreen.setBorder(colorBorder2);
        operatorscreen.setHorizontalAlignment(SwingConstants.CENTER);
        operatorscreen.setVerticalAlignment(SwingConstants.CENTER);
        operatorscreen.setFont(new Font("Serif", Font.PLAIN, 35));
        jf.add(operatorscreen);

        clearButton = new JButton("AC");
        clearButton.setBounds(48, 120, 70, 60);
        clearButton.setFont(new Font(" Arial", Font.PLAIN, 20));
        clearButton.setBackground(Color.black);
        clearButton.setForeground(Color.white);
        jf.add(clearButton);
        clearButton.addActionListener(this);

        divButton = new JButton("/");
        divButton.setBounds(138, 120, 70, 60);
        divButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        divButton.setBackground(Color.black);
        divButton.setForeground(Color.white);
        jf.add(divButton);
        divButton.addActionListener(this);

        mulButton = new JButton("x");
        mulButton.setBounds(228, 120, 70, 60);
        mulButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        mulButton.setBackground(Color.black);
        mulButton.setForeground(Color.white);
        jf.add(mulButton);
        mulButton.addActionListener(this);

        subButton = new JButton("-");
        subButton.setBounds(318, 120, 70, 60);
        subButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        subButton.setBackground(Color.black);
        subButton.setForeground(Color.white);
        jf.add(subButton);
        subButton.addActionListener(this);

        sevenButton = new JButton("7");
        sevenButton.setBounds(48, 200, 70, 60);
        sevenButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        sevenButton.setBackground(Color.black);
        sevenButton.setForeground(Color.white);
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setBounds(138, 200, 70, 60);
        eightButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        eightButton.setBackground(Color.black);
        eightButton.setForeground(Color.white);
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setBounds(228, 200, 70, 60);
        nineButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        nineButton.setBackground(Color.black);
        nineButton.setForeground(Color.white);
        jf.add(nineButton);
        nineButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setBounds(48, 280, 70, 60);
        fourButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        fourButton.setBackground(Color.black);
        fourButton.setForeground(Color.white);
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setBounds(138, 280, 70, 60);
        fiveButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        fiveButton.setBackground(Color.black);
        fiveButton.setForeground(Color.white);
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(228, 280, 70, 60);
        sixButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        sixButton.setBackground(Color.black);
        sixButton.setForeground(Color.white);
        jf.add(sixButton);
        sixButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setBounds(48, 360, 70, 60);
        oneButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        oneButton.setBackground(Color.black);
        oneButton.setForeground(Color.white);
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setBounds(138, 360, 70, 60);
        twoButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        twoButton.setBackground(Color.black);
        twoButton.setForeground(Color.white);
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(228, 360, 70, 60);
        threeButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        threeButton.setBackground(Color.black);
        threeButton.setForeground(Color.white);
        jf.add(threeButton);
        threeButton.addActionListener(this);

        deleteButton = new JButton("DEL");
        deleteButton.setBounds(48, 440, 70, 60);
        deleteButton.setFont(new Font("Arial", Font.PLAIN, 18));
        deleteButton.setForeground(Color.white);
        deleteButton.setBackground(Color.red);
        jf.add(deleteButton);
        deleteButton.addActionListener(this);

        zeroButton = new JButton("0");
        zeroButton.setBounds(138, 440, 70, 60);
        zeroButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        zeroButton.setBackground(Color.black);
        zeroButton.setForeground(Color.white);
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        dotButton = new JButton(".");
        dotButton.setBounds(228, 440, 70, 60);
        dotButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        dotButton.setBackground(Color.black);
        dotButton.setForeground(Color.white);
        jf.add(dotButton);
        dotButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setBounds(318, 360, 70, 120);
        equalButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        equalButton.setBackground(Color.black);
        equalButton.setForeground(Color.white);
        jf.add(equalButton);
        equalButton.addActionListener(this);

        addButton = new JButton("+");
        addButton.setBounds(318, 200, 70, 120);
        addButton.setFont(new Font(" Arial", Font.PLAIN, 40));
        addButton.setBackground(Color.black);
        addButton.setForeground(Color.white);
        jf.add(addButton);
        addButton.addActionListener(this);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == deleteButton) {

            int length = displayLabel.getText().length();
            int number = length - 1;

            if (length > 0) {

                StringBuilder Back = new StringBuilder(displayLabel.getText());
                Back.deleteCharAt(number);
                displayLabel.setText(Back + "");
            }
        }

        else if (e.getSource() == clearButton) {

            operatorscreen.setText("");
            displayLabel.setText("");
        }

        else if (e.getSource() == sevenButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("7");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("7");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("7");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("7");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }
        }

        else if (e.getSource() == eightButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("8");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("8");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("8");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("8");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }

        }

        else if (e.getSource() == nineButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("9");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("9");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("9");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("9");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }

        else if (e.getSource() == fourButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("4");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("4");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("4");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("4");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        }

        else if (e.getSource() == fiveButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("5");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("5");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("5");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("5");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        }

        else if (e.getSource() == sixButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("6");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("6");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("6");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("6");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        }

        else if (e.getSource() == oneButton) {
            if (clickedOperator == 1) {

                displayLabel.setText("1");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("1");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("1");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("1");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        }

        else if (e.getSource() == twoButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("2");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("2");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("2");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("2");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        }

        else if (e.getSource() == threeButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("3");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("3");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("3");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("3");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        }

        else if (e.getSource() == zeroButton) {

            if (clickedOperator == 1) {

                displayLabel.setText("0");
                clickedOperator = 11;

            } else if (clickedOperator == 2) {

                displayLabel.setText("0");
                clickedOperator = 22;

            } else if (clickedOperator == 3) {

                displayLabel.setText("0");
                clickedOperator = 33;

            } else if (clickedOperator == 4) {

                displayLabel.setText("0");
                clickedOperator = 44;

            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        }

        else if (e.getSource() == dotButton) {

            if (!displayLabel.getText().contains(".")) {
                displayLabel.setText(displayLabel.getText() + ".");
            }
        }

        else if (e.getSource() == equalButton) {

            operatorscreen.setText("Ans");

            String newValue = displayLabel.getText();

            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);

            if (clickedOperator == 11) {

                float result = oldValueF / newValueF;

                displayLabel.setText(result + "");

            } else if (clickedOperator == 22) {

                float result = oldValueF * newValueF;

                displayLabel.setText(result + "");
            } else if (clickedOperator == 33) {

                float result = oldValueF + newValueF;

                displayLabel.setText(result + "");
            } else if (clickedOperator == 44) {

                float result = oldValueF - newValueF;

                displayLabel.setText(result + "");
            }
        }

        else if (e.getSource() == divButton) {

            operatorscreen.setText("÷");

            clickedOperator = 1;

            oldValue = displayLabel.getText();

        }

        else if (e.getSource() == mulButton) {

            operatorscreen.setText("*");

            clickedOperator = 2;

            oldValue = displayLabel.getText();

        }

        else if (e.getSource() == addButton) {

            operatorscreen.setText("+");

            clickedOperator = 3;

            oldValue = displayLabel.getText();
        }

        else if (e.getSource() == subButton) {

            operatorscreen.setText("-");

            clickedOperator = 4;

            oldValue = displayLabel.getText();

        }
    }
}