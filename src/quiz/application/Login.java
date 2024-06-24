package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Login extends JFrame implements ActionListener {
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    RoundButton guidelines, back;
    JTextField tfname;

    public Login(ObjectOutputStream outputStream, ObjectInputStream inputStream) {
        this.outputStream = outputStream;
        this.inputStream = inputStream;

        initializeUI();
    }

   /* public Login() {
        initializeUI();
    }*/

    private void initializeUI() {
        getContentPane().setBackground(new Color(230, 230, 255));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz2.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(40, -20, 600, 500);
        add(image);

        JLabel heading = new JLabel("Quiz App");
        heading.setBounds(780, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(0, 200, 100));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(0, 200, 100));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        guidelines = new RoundButton("Guidelines");
        guidelines.setBounds(735, 270, 120, 35);
        guidelines.setBackground(new Color(0, 200, 100));
        guidelines.setForeground(Color.WHITE);
        guidelines.addActionListener(this);
        add(guidelines);

        back = new RoundButton("Back");
        back.setBounds(915, 270, 120, 35);
        back.setBackground(new Color(0, 200, 100));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == guidelines) {
            String name = tfname.getText();
            setVisible(false);
            new GuideLines(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> {
            new Login(null, null);
        });
    }
}

