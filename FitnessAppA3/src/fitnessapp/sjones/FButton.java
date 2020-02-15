package fitnessapp.sjones;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FButton extends JButton {


    public FButton(String text, int w, int h) {
        super(text);
        text = "<html><style>body{color:white;}</style><body>" + text + "</body></html>";
        setFont(new Font("Calibri", Font.BOLD, 14));
        setText(text);
        setBackground(Color.darkGray);
        setBorder(new LineBorder(Color.white, 2));
        setPreferredSize(new Dimension(w, h));

    }

    public FButton(String text) {
        this(text, 120, 30);
    }

    public void formatButtonUI(JButton button) {
        button.setBackground(Color.darkGray);
        button.setBorder(new LineBorder(Color.white, 5));

    }
}
