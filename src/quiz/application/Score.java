package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score4.jpg"));
        Image originalImage = i1.getImage();
     	double aspectRatio = (double) originalImage.getHeight(null) / originalImage.getWidth(null);
     	int newWidth = 300; 
     	int newHeight = (int) (newWidth * aspectRatio); 
     	Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
     	ImageIcon scaledIcon = new ImageIcon(scaledImage);
     	JLabel image = new JLabel(scaledIcon);
     	image.setBounds(30, 200, newWidth, newHeight); 
     	add(image);
        
        JLabel heading = new JLabel("Thank you " + name + " for trying Quiz App");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Calibri", Font.PLAIN, 26));
        heading.setForeground(new Color(0, 102, 204));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(400, 200, 300, 30);
        lblscore.setFont(new Font("Calibri", Font.PLAIN, 26));
        lblscore.setForeground(new Color(0, 102, 204));
        add(lblscore);
        
        RoundButton submit = new RoundButton("Try Again");
        submit.setBounds(420, 270, 120, 30);
        submit.setBackground(new Color(0, 200, 100));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login(null, null);
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
