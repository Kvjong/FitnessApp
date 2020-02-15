package fitnessapp.sjones;

import javax.swing.*;
import java.awt.*;

public class FLabel extends JLabel {
   Font formFont;
    public FLabel(String labelText){
        super(labelText);
        this.formFont = new Font("Calibri", Font.BOLD,14);
        formatFLabelText(labelText);

    }


    public void formatFLabelText(String labelText){
        this.setFont(this.formFont);
        String formattedString = "<html><style>body{color:white;}</style><body>"+labelText+"</body></html>";
        this.setText(formattedString);


    }
}


