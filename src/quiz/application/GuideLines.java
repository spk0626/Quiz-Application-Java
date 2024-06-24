package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuideLines extends JFrame implements ActionListener{

	String name;
	RoundButton start, back;
    
    public GuideLines(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to the Quiz App");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(0, 200, 100));
        add(heading);
        
        JLabel guideLines = new JLabel();
        guideLines.setBounds(50, 90, 700, 350);
        guideLines.setFont(new Font("Tahoma", Font.PLAIN, 16));
        guideLines.setForeground(new Color(0, 102, 204));
        guideLines.setText(
            "<html>"+ 
                " The questionnaire consist of total 10 multiple choice questions." + "<br><br>" +
                " Total marks will be displayed at the end of the questionnaire." + "<br><br>" +
                " Each question carries 10 makrs, which is total 100 makrs." + "<br><br>" +
                " There is Help option which can be used once during a single session." + "<br><br>" +
                " Each question gives 15 seconds to answer, after the time runs out, next questions automatically displayed." + "<br><br>" +
                " Timer for a question starts the moment the user enters the relevant question page" + "<br><br>" +
                " Good Luck!" + "<br><br>" +
            "<html>"
        );
        add(guideLines);
        
        back = new RoundButton("Back");
        back.setBounds(250, 500, 100, 35);
        back.setBackground(new Color(0, 200, 100));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new RoundButton("Start");
        start.setBounds(400, 500, 100, 35);
        start.setBackground(new Color(0, 200, 100));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login(null, null);
        }
    }
    
    public static void main(String[] args) {
        new GuideLines("User");
    }
}
