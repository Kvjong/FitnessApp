package fitnessapp.sjones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends ScreenMain {


        public MainPage(JFrame frame){
            super(new GridBagLayout());
            setBackground(Color.DARK_GRAY);
            JLabel welcome = new JLabel("<html> <style>body{color: white;}</style><body><center> Welcome to your Fitness Home Page</center>Your core components are as below</body></html>");
            welcome.setFont(new Font("Calibri", Font.BOLD,16));
            AccountCreationScreen.addComponent(this,welcome,1,0,5,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.VERTICAL);

            FButton foodDiary = new FButton("FOOD DIARY",140,40,"white");
            foodDiary.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    FoodDiary foodDiary = new FoodDiary(frame);
                    frame.setContentPane(foodDiary);
                    frame.validate();
                    frame.repaint();
                }
            });

            FButton workoutProgram= new FButton("WORKOUT PROGRAM",140,40,"white");
            workoutProgram.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    WorkoutProgramScreen workoutProgramScreen = new WorkoutProgramScreen(frame);

                    frame.setContentPane(workoutProgramScreen);
                    frame.validate();
                    frame.repaint();
                }
            });

            FButton progressTracker = new FButton("PROGRESS TRACKER",140,40,"white");
            progressTracker.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ProgressTrackerScreen progressTrackerScreen = new ProgressTrackerScreen();
                    frame.setContentPane(progressTrackerScreen);
                    frame.validate();
                    frame.repaint();

                }
            });

            FButton educationalContent = new FButton("EDU MODULES",140,40,"white");
            educationalContent.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                EducationModulesScreen educationModulesScreen = new EducationModulesScreen();
                frame.setContentPane(educationModulesScreen);
                frame.validate();
                frame.repaint();
                }
            });

            addComponent(this,foodDiary,0,1,2,1,.5,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(this,workoutProgram,2,1,2,1,.5,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(this,progressTracker,0,3,2,1,.5,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
            addComponent(this,educationalContent,2,3,2,1,.5,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);

        }



    }


