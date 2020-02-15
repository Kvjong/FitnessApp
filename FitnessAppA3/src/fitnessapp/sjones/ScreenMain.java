package fitnessapp.sjones;

import javax.swing.*;
import java.awt.*;

public class ScreenMain extends JPanel {
    public ScreenMain(GridBagLayout layout){
        super(layout);
    }
    public static void addComponent(JPanel panel, JComponent component, int gx, int gy, int gw, int gh, double weightx, double weighty, int orientation, int fill, Insets insets) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = fill;
        gbc.anchor = orientation;
        gbc.gridx = gx;
        gbc.gridy = gy;
        gbc.gridwidth = gw;
        gbc.gridheight = gh;
        gbc.weightx = weightx;
        gbc.weighty = weighty;
        gbc.insets = insets;
        panel.add(component, gbc);

    }

    public static void addComponent(JPanel panel, JComponent component, int gx, int gy, int gw, int gh, double weightx, double weighty, int orientation, int fill) {
       addComponent(panel,component,gx,gy,gw,gh,weightx,weighty,orientation,fill,new Insets(0,0,0,0));

    }

    public static void addComponent(JPanel panel, JComponent component, int gx, int gy, int gw, int gh) {
        addComponent(panel, component, gx, gy, gw, gh, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE,new Insets(0,0,0,0));
    }
}
