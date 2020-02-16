package fitnessapp.sjones;

import javax.swing.border.LineBorder;
        import java.awt.*;

public class ProgressTrackerScreen extends ScreenMain {


    public ProgressTrackerScreen() {
        super(new GridBagLayout());
        ScreenMain description = new ScreenMain(new GridBagLayout());
        description.setBorder(new LineBorder(Color.white, 4));
        FLabel header = new FLabel("<u>Progression Software</u>");
        FLabel module = new FLabel("In Development", "red");
        FLabel body = new FLabel("<center>Our progression software will be based on a proprietary<br> algorithm " +
                "which utilises photo comparison to evaluate<br> personal progress in terms of weight loss.<br><br> It will also be able to" +
                " assess changes in muscle mass.<br> This software is in it's infancy, and should not be assumed<br>part of the core offering.</center>");
        addComponent(description, header, 0, 0, 1, 1, 1, .1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(description, module, 0, 1, 1, 1, 1, .1, GridBagConstraints.NORTH, GridBagConstraints.NONE);
        addComponent(description, body, 0, 2, 1, 1, 1, .8, GridBagConstraints.NORTH, GridBagConstraints.NONE);
        addComponent(this, description, 0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);

    }
}


