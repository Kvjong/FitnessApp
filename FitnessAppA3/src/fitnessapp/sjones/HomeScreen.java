package fitnessapp.sjones;

import fitnessapp.sjones.AccountCreationScreen;
import fitnessapp.sjones.FButton;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends ScreenMain {

    public HomeScreen(JFrame frame){
        super(new GridBagLayout());
        setBackground(Color.DARK_GRAY);
        JLabel welcome = new JLabel("<html> <style>body{color: white;}</style><body><center> Welcome to our Fitness Application</center>Please navigate using the menu above.</body></html>");
        welcome.setFont(new Font("Calibri", Font.BOLD,16));
        AccountCreationScreen.addComponent(this,welcome,1,0,5,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.VERTICAL);
        FButton newAccount = new FButton("New Account",120,30);
        newAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccountCreationScreen accountCreationScreen = new AccountCreationScreen(frame);
                frame.setContentPane(accountCreationScreen);
                frame.validate();
                frame.repaint();
            }
        });



        FButton login = new FButton("Login",120,30);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Login Page to be implemented
            }
        });

        addComponent(this,newAccount,0,1,2,1,.5,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);
        addComponent(this,login,2,1,2,1,.5,1,GridBagConstraints.NORTH,GridBagConstraints.NONE);

    }



}
