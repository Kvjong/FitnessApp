package fitnessapp.sjones;

/*
Welcome to my first desktop application written in Java, I'm learning a lot as I go through this, my notes for development are as below.
 */

/* PLAN
 Add user data validation
 Add transition screen/buttons for creating new users rather than going back to home page and using JOptionPane which is gross
 Begin investigating data persistence, including add save state functionality, save on exit(prompt user?) (How can I check if someone HASNT saved their work?)
 Make homePage allow a log in option?
 Add logged in status?

 **FEATURE ROAD MAP BY MENU OPTION**


 FILE
 - New User (%50) - Need to implement transition screen, need to add gender and training level information to initial account creation form.
 - SCRAPPED || See Users (%0) - Should return a list of all users? Low priority, and not a feature I will pursue as it doesn't provide any true benefit to the user. ||
 - Login (as food diary, etc will be independent, should home page be the login area? Or through file window?)
 - Close Program - Must implement a way to save on program close, including prompting the user to save when they X out of window.

 DIET
 - Food Diary (%0) -Implement a daily calorie tracker along with a graphical component that allows the user to track their progress via a green/red highlight and also let them view the past 7 days?
 / need to add some sort of day/time feature that grabs information from the system?
 - Meal plans (%0) - Implement a daily meal plan that is computer generated, this needs to come from information that has been provided by the user, potentially provide them with a weekly plan due to
 / having to buy groceries etc? Perhaps a shopping list is appropriate?
 - Diet Learning (%0) - Educational modules based on reputable information regarding diet, calorie intake etc. Module form or daily information?

 WORKOUT

 -



*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class FitnessApp {
    Font welcomeFont;

    protected static ArrayList<AccountOwner> accountOwners = new ArrayList<>();

    public FitnessApp() {

        JFrame mainWindow = new JFrame();
        mainWindow = init();
        mainWindow.setVisible(true);


    }

    public JFrame init() {

        this.welcomeFont = new Font("Calibri", Font.BOLD, 16);
        JFrame frame = new JFrame("Fitness App Prototype");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setSize(400, 500);
        frame.setResizable(false);
        MenuBar mainMenu = buildMenuBar(frame);

        frame.setMenuBar(mainMenu);
        uiConfig();
        setLoginScreen(frame);
        frame.setLocationRelativeTo(null);
        frame.validate();
        frame.repaint();


        return frame;
    }

    public void setLoginScreen(JFrame frame) {

        LoginScreen loginScreen = new LoginScreen(frame);
        frame.setContentPane(loginScreen);
        frame.validate();
        frame.repaint();
    }

    public void setAccountCreationScreen(JFrame frame) {
        AccountCreationScreen accountCreationScreen = new AccountCreationScreen(frame);
        frame.setContentPane(accountCreationScreen);
        frame.validate();
        frame.repaint();
    }


    public void uiConfig() {
        UIManager ui = new UIManager();
        ui.put("OptionPane.background", Color.darkGray);
        ui.put("Panel.background", Color.darkGray);
        ui.put("OptionPane.messageForeground", Color.white);
    }

    public MenuBar buildMenuBar(JFrame frame) {
        MenuBar mainMenu = new MenuBar();

        Menu m1 = new Menu("File");
        MenuItem m11newAccount = new MenuItem("New Account");
        m11newAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAccountCreationScreen(frame);
            }
        });
        MenuItem m12login = new MenuItem("Login");
        MenuItem m13closeProgram = new MenuItem("Close");

        Menu m2 = new Menu("Diet");
        MenuItem m21foodDiary = new MenuItem("Food Diary");
        m21foodDiary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodDiary foodDiary = new FoodDiary(frame);
                frame.setContentPane(foodDiary);
                frame.validate();
                frame.repaint();

            }
        });
        MenuItem m22mealPlans = new MenuItem("Meal Plans");


        Menu m3 = new Menu("Workout");
        MenuItem m31workoutDiary = new MenuItem("Workout Diary");
        m31workoutDiary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //
            }

        });
        MenuItem m32yourProgram = new MenuItem("Your Program");
        m32yourProgram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WorkoutProgramScreen workoutProgramScreen = new WorkoutProgramScreen(frame);

                frame.setContentPane(workoutProgramScreen);
                frame.validate();
                frame.repaint();
            }
        });


        Menu m4 = new Menu("Navigation");
        MenuItem m41Home = new MenuItem("Home Page");
        m41Home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage mainPage = new MainPage(frame);
                frame.setContentPane(mainPage);
                frame.validate();
                frame.repaint();

            }
        });

        Menu m5 =  new Menu("Education");
        MenuItem m51eduHome = new MenuItem("Content Page");
        m51eduHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EducationModulesScreen educationModulesScreen = new EducationModulesScreen();
                frame.setContentPane(educationModulesScreen);
                frame.validate();
                frame.repaint();
            }
        });
        MenuItem m52eduFood = new MenuItem("Food Modules");
        MenuItem m53eduExercise = new MenuItem("Exercise Modules");

        Menu m6 = new Menu("Progress");
        MenuItem m61progressPage = new MenuItem("Progress Page");
        m61progressPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProgressTrackerScreen progressTrackerScreen = new ProgressTrackerScreen();
                frame.setContentPane(progressTrackerScreen);
                frame.validate();
                frame.repaint();
            }
        });


//menu 1 build
        m1.add(m11newAccount);
        m1.add(m12login);
        m1.add(m13closeProgram);

//menu 2 build
        m2.add(m21foodDiary);
        m2.add(m22mealPlans);

//menu 3 build
        m3.add(m31workoutDiary);
        m3.add(m32yourProgram);

//menu 4 build
        m4.add(m41Home);

//menu 5 build
        m5.add(m51eduHome);
        m5.add(m52eduFood);
        m5.add(m53eduExercise);

//menu 6 build
        m6.add(m61progressPage);



//mainMenu build
        mainMenu.add(m1);
        mainMenu.add(m2);
        mainMenu.add(m3);
        mainMenu.add(m5);
        mainMenu.add(m6);
        mainMenu.add(m4);

        return mainMenu;
    }


    public static void main(String[] args) {
       /* try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          }catch (Exception e){

              }
*/
        FitnessApp fitnessApp = new FitnessApp();
    }

}

