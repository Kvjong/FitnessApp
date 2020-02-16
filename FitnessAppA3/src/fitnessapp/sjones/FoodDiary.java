package fitnessapp.sjones;

import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FoodDiary extends ScreenMain{

    public FoodDiary(JFrame frame){
        super(new GridBagLayout());
        this.setBackground(Color.darkGray);




        ScreenMain goalPanel = new ScreenMain(new GridBagLayout());
        goalPanel.setBorder(new LineBorder(Color.white,4));
        FLabel goalMessage = new FLabel("Remaining Calories:");
        FLabel goalTarget = new FLabel(""+(AccountOwner.calorieGoal-1228));
        goalPanel.setPreferredSize(new Dimension(300,30));
        FButton addFood = new FButton("+ADD",40,20);



        addComponent(goalPanel,goalMessage,1,0,3,1,.7,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,20));
        addComponent(goalPanel,goalTarget,4,0,1,1,.3,1,GridBagConstraints.WEST,GridBagConstraints.NONE);

    // Breakfast Panel
        ScreenMain breakfastPanel = new ScreenMain(new GridBagLayout());
        breakfastPanel.setBorder(new LineBorder(Color.white,4));
        breakfastPanel.setPreferredSize(new Dimension(300,90));
        FLabel breakfastLabel = new FLabel("<u>BREAKFAST</u>");
        FButton addFood2 = new FButton("+ADD",40,20);
        FLabel calTotal1 = new FLabel("Cals: 0 ","Red");
        calTotal1.setFont(new Font("Calibri",Font.BOLD,10));

        addComponent(breakfastPanel,breakfastLabel,0,0,5,1,1,1,GridBagConstraints.PAGE_START,GridBagConstraints.NONE);
        addComponent(breakfastPanel,calTotal1,0,7,1,1,.8,1,GridBagConstraints.WEST,GridBagConstraints.NONE);
        addComponent(breakfastPanel,addFood2,1,7,1,1,.2,1,GridBagConstraints.CENTER,GridBagConstraints.NONE);



    // Lunch Panel
        ScreenMain lunchPanel = new ScreenMain(new GridBagLayout());
        lunchPanel.setBorder(new LineBorder(Color.white,4));
        lunchPanel.setPreferredSize(new Dimension(300,90));
        FLabel lunchLabel= new FLabel("<u>LUNCH</u>");

        FLabel demoFood = new FLabel("Quarter Pounder Meal (Large) x 1");

        demoFood.setFont(new Font("Calibri", Font.PLAIN, 12));
        FButton addFood3 = new FButton("+ADD",40,20);
        FLabel calTotal2 = new FLabel("Cals:1228 ","Red");
        calTotal2.setFont(new Font("Calibri",Font.BOLD,10));



        addComponent(lunchPanel,lunchLabel,0,0,5,1,1,1,GridBagConstraints.PAGE_START,GridBagConstraints.NONE,new Insets(0,10,0,10));
        addComponent(lunchPanel,demoFood,0,1,3,1,1,.1,GridBagConstraints.WEST,GridBagConstraints.NONE);
        addComponent(lunchPanel,calTotal2,0,7,1,1,.8,1,GridBagConstraints.WEST,GridBagConstraints.NONE);
        addComponent(lunchPanel,addFood3,1,7,1,1,.2,1,GridBagConstraints.CENTER,GridBagConstraints.NONE);

    // Dinner Panel
        ScreenMain dinnerPanel = new ScreenMain(new GridBagLayout());
        dinnerPanel.setBorder(new LineBorder(Color.white,4));
        dinnerPanel.setPreferredSize(new Dimension(300,90));
        FLabel dinnerLabel = new FLabel("<u>DINNER</u>");
        FLabel calTotal3 = new FLabel("Cals: 0 ","Red");
        calTotal3.setFont(new Font("Calibri",Font.BOLD,10));


        addComponent(dinnerPanel,dinnerLabel,0,0,5,1,1,1,GridBagConstraints.PAGE_START,GridBagConstraints.NONE);
        addComponent(dinnerPanel,calTotal3,0,7,1,1,.8,1,GridBagConstraints.WEST,GridBagConstraints.NONE);
        addComponent(dinnerPanel,addFood,2,7,1,1,.2,1,GridBagConstraints.CENTER,GridBagConstraints.NONE);

        addComponent(this,goalPanel,0,0,1,1,1,.1,GridBagConstraints.NORTH,GridBagConstraints.VERTICAL,new Insets(20,10,10,10));
        addComponent(this,breakfastPanel,0,1,1,1,1,.3,GridBagConstraints.NORTH,GridBagConstraints.VERTICAL,new Insets(0,10,10,10));
        addComponent(this,lunchPanel,0,2,1,1,1,.3,GridBagConstraints.NORTH,GridBagConstraints.VERTICAL,new Insets(0,10,10,10));
        addComponent(this,dinnerPanel,0,3,1,1,1,.3,GridBagConstraints.NORTH,GridBagConstraints.VERTICAL,new Insets(0,10,10,10));
    }
}
