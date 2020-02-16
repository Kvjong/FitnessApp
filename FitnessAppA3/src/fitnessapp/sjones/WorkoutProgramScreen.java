package fitnessapp.sjones;
import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutProgramScreen extends ScreenMain {

        public WorkoutProgramScreen(JFrame frame){
            super(new GridBagLayout());
            this.setBackground(Color.darkGray);




            ScreenMain workoutSelection = new ScreenMain(new GridBagLayout());
            ScreenMain strengthScreen = new ScreenMain(new GridBagLayout());
            strengthScreen.setBorder(new LineBorder(Color.white,4));
            strengthScreen.setVisible(false);

            ScreenMain strengthPane1 = new ScreenMain(new GridBagLayout());
            strengthPane1.setBorder(new LineBorder(Color.white,2));
            FLabel sp1main = new FLabel("WARMUP");
            FLabel sp1Line1 = new FLabel("<u>CARDIO</u>","red");
            FLabel sp1Line2 = new FLabel("2 KM Run @ 10 KM/H","red");
            addComponent(strengthPane1,sp1main,0,0,5,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(strengthPane1,sp1Line1,0,1,3,1,1,1,GridBagConstraints.SOUTH,GridBagConstraints.NONE);
            addComponent(strengthPane1,sp1Line2,0,2,3,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);


            ScreenMain strengthPane2 = new ScreenMain(new GridBagLayout());
            strengthPane2.setBorder(new LineBorder(Color.white,2));
            FLabel sp2main = new FLabel("EXERCISE 1");
            FLabel sp2Line1 = new FLabel("<u>DEADLIFT</u>","red");
            FLabel sp2Line2 = new FLabel("5 x 5 @ 60kg","red");
            addComponent(strengthPane2,sp2main,0,0,5,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(strengthPane2,sp2Line1,0,1,3,1,1,1,GridBagConstraints.SOUTH,GridBagConstraints.NONE);
            addComponent(strengthPane2,sp2Line2,0,2,3,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);

            ScreenMain strengthPane3 = new ScreenMain(new GridBagLayout());
            strengthPane3.setBorder(new LineBorder(Color.white,2));
            FLabel sp3main = new FLabel("EXERCISE 2");
            FLabel sp3Line1 = new FLabel("<u>BARBELL ROW</u>","red");
            FLabel sp3Line2 = new FLabel("5 x 5 @ 40kg","red");
            addComponent(strengthPane3,sp3main,0,0,5,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(strengthPane3,sp3Line1,0,1,3,1,1,1,GridBagConstraints.SOUTH,GridBagConstraints.NONE);
            addComponent(strengthPane3,sp3Line2,0,2,3,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);

            ScreenMain strengthPane4 = new ScreenMain(new GridBagLayout());
            strengthPane4.setBorder(new LineBorder(Color.white,2));
            FLabel sp4main = new FLabel("EXERCISE 3");
            FLabel sp4Line1 = new FLabel("<u>BENCH PRESS</u>","red");
            FLabel sp4Line2 = new FLabel("5 x 5 @ 50kg","red");
            addComponent(strengthPane4,sp4main,0,0,5,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(strengthPane4,sp4Line1,0,1,3,1,1,1,GridBagConstraints.SOUTH,GridBagConstraints.NONE);
            addComponent(strengthPane4,sp4Line2,0,2,3,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);

            ScreenMain strengthPane5 = new ScreenMain(new GridBagLayout());
            strengthPane5.setBorder(new LineBorder(Color.white,2));
            FLabel sp5main = new FLabel("EXERCISE 4");
            FLabel sp5Line1 = new FLabel("<u>FLY KICKS</u>","red");
            FLabel sp5Line2 = new FLabel("60 x 3, 45s Break","red");
            addComponent(strengthPane5,sp5main,0,0,5,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(strengthPane5,sp5Line1,0,1,3,1,1,1,GridBagConstraints.SOUTH,GridBagConstraints.NONE);
            addComponent(strengthPane5,sp5Line2,0,2,3,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);

            ScreenMain strengthPane6 = new ScreenMain(new GridBagLayout());
            strengthPane6.setBorder(new LineBorder(Color.white,2));
            FLabel sp6main = new FLabel("EXERCISE 5");
            FLabel sp6Line1 = new FLabel("<u>HANGING TUCK</u>","red");
            FLabel sp6Line2 = new FLabel("10 x 3 @ 10kg add","red");
            addComponent(strengthPane6,sp6main,0,0,5,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(strengthPane6,sp6Line1,0,1,3,1,1,1,GridBagConstraints.SOUTH,GridBagConstraints.NONE);
            addComponent(strengthPane6,sp6Line2,0,2,3,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);

            addComponent(strengthScreen,strengthPane1,0,0,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
            addComponent(strengthScreen,strengthPane2,1,0,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
            addComponent(strengthScreen,strengthPane3,0,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
            addComponent(strengthScreen,strengthPane4,1,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
            addComponent(strengthScreen,strengthPane5,0,2,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
            addComponent(strengthScreen,strengthPane6,1,2,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH);







            workoutSelection.setBorder(new LineBorder(Color.white,4));
            FLabel goalMessage = new FLabel("Please Select Workout");
            FButton cardio = new FButton("Cardio",70,30);
            FButton strength = new FButton("Strength",70,30);
            strength.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    strengthScreen.setVisible(true);
                    frame.validate();
                    frame.repaint();

                }
            });
            FButton mixed = new FButton("Mixed",70,30);



            addComponent(workoutSelection,goalMessage,0,0,3,3,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(5,10,20,10));
            addComponent(workoutSelection,cardio,0,4,1,1,.30,.3,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,10,5,0));
            addComponent(workoutSelection,strength,1,4,1,1,.30,.3,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,10,5,0));
            addComponent(workoutSelection,mixed,2,4,1,1,.30,.3,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,10,5,0));


            addComponent(this,workoutSelection,0,0,1,1,1,0.1,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(5,5,10,5));
            addComponent(this,strengthScreen,0,1,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH, new Insets(0,5,5,5));
        }


    }



