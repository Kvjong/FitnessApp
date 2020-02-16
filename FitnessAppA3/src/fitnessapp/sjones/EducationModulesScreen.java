package fitnessapp.sjones;

import javax.swing.border.LineBorder;
import java.awt.*;

public class EducationModulesScreen extends ScreenMain{

    public EducationModulesScreen(){
        super(new GridBagLayout());
        ScreenMain description = new ScreenMain(new GridBagLayout());
        description.setBorder(new LineBorder(Color.white,4));
        FLabel header = new FLabel("<u>Education Modules</u>");
        FLabel module = new FLabel("In Development","red");
        FLabel body = new FLabel("<center>Our education modules will be designed to educate and<br> equip our users with tools that " +
                "allow them to manage<br> their food and their fitness, and help them understand<br> these new principles they are adding" +
                "into their lifestyle.<br>These modules will be separated into the following;</center><br><br><center>1. Food/Calorie Control Modules</center><center>2. Workouts/Exercises Education Modules</center>");
        addComponent(description,header,0,0,1,1,1,.1,GridBagConstraints.CENTER,GridBagConstraints.NONE);
        addComponent(description,module,0,1,1,1,1,.1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
        addComponent(description,body,0,2,1,1,1,.8,GridBagConstraints.NORTH,GridBagConstraints.NONE);
        addComponent(this,description,0,0,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);

    }
}
