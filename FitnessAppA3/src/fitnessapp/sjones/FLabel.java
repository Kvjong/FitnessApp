package fitnessapp.sjones;

import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;

public class FLabel extends JLabel {
   Font formFont;
    public FLabel(String labelText){
        super(labelText);
        this.formFont = new Font("Calibri", Font.BOLD,14);
        formatFLabelText(labelText,"white");

    }

    public FLabel(String labelText,String color){
        super(labelText);
        this.formFont = new Font("Calibri", Font.BOLD,14);
        formatFLabelText(labelText,color);

    }


    public void formatFLabelText(String labelText,String color){
        this.setFont(this.formFont);
        String formattedString = "<html><style>body{color:"+color+";}</style><body>"+labelText+"</body></html>";
        this.setText(formattedString);


    }
}


