package quiz.application;

import javax.swing.*;
import java.awt.*;

public class RoundButton extends JButton {

    public RoundButton(String label) {
        super(label);
        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray); 
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 20, 20); 
        super.paintComponent(g);
    }

    // Paint border
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 20, 20); 
    }
}
