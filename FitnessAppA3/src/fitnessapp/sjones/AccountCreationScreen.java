package fitnessapp.sjones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountCreationScreen extends ScreenMain {

   public AccountCreationScreen(JFrame frame){
        super(new GridBagLayout());
        this.setBackground(Color.DARK_GRAY);
        JPanel nameForm = new JPanel(new GridBagLayout());
        JPanel submissionForm = new JPanel(new GridBagLayout());


       FLabel greeting = new FLabel("Welcome to your Fitness APP, Time you create your account!");
       addComponent(nameForm, greeting, 0, 0, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE,new Insets(0,0,30,0));


// line 1 end y 0
       FLabel firstName = new FLabel("First Name:");
       addComponent(nameForm, firstName, 0, 2, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
       JTextField firstNameInput = new JTextField(20);
       addComponent(nameForm, firstNameInput, 3, 2, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 2 end y 1
       FLabel lastName = new FLabel("Last Name:");
       addComponent(nameForm, lastName, 0, 3, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
       JTextField lastNameInput = new JTextField(20);
       addComponent(nameForm, lastNameInput, 3, 3, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 3 end y 2
       FLabel weight = new FLabel("Weight:     ");
       addComponent(nameForm, weight, 0, 4, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
       JTextField weightInput = new JTextField(20);
       addComponent(nameForm, weightInput, 3, 4, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 4 end y 3
       FLabel height = new FLabel("Height:     ");
       addComponent(nameForm, height, 0, 5, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
       JTextField heightInput = new JTextField(20);
       addComponent(nameForm, heightInput, 3, 5, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 5 end y 4
       FLabel age = new FLabel("Age:     ");
       addComponent(nameForm, age, 0, 6, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
       JTextField ageInput = new JTextField(20);
       addComponent(nameForm, ageInput, 3, 6, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);

       FButton submit = new FButton("Submit for Account Creation",200,30);
       submit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
  // *****             // need a fucking slew of validation methods and error handling here. Maybe add error logic using exceptions or prevalidation?
               String firstName = firstNameInput.getText();
               String lastName = lastNameInput.getText();
               double weight = Double.parseDouble(weightInput.getText());
               double height = Double.parseDouble(heightInput.getText());
               int age = Integer.parseInt(ageInput.getText());
               FitnessApp.accountOwners.add(new AccountOwner(firstName,lastName,weight,height,age));

               JOptionPane.showMessageDialog(nameForm,"User account Created! Returning to Menu.");
               LoginScreen loginScreen = new LoginScreen(frame);
               frame.validate();
               frame.repaint();


           }
       });
       addComponent(nameForm, submit, 0, 7, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE,new Insets(20,0,0,0));

       nameForm.setBackground(Color.darkGray);
       addComponent(this, nameForm, 0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
       addComponent(this,submissionForm,0,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE);

   }

}

