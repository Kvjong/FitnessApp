import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;



public class FitnessApp {
Font welcomeFont;
Font formFont;
ArrayList<AccountOwner> accountOwners = new ArrayList<>();
    public FitnessApp() {

        JFrame mainWindow = new JFrame();

        mainWindow = init();

        mainWindow.setVisible(true);


    }

    public JFrame init() {

        this.welcomeFont = new Font("Calibri", Font.BOLD,16);

        JFrame frame = new JFrame("Fitness App Prototype");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setSize(400, 500);
        frame.setResizable(false);
        MenuBar mainMenu = buildMenuBar(frame);

        frame.setMenuBar(mainMenu);
        uiConfig();
        homeMenuFrame(frame);
        frame.setLocationRelativeTo(null);
        frame.validate();
        frame.repaint();


        return frame;
    }

    public void homeMenuFrame(JFrame frame){

            JPanel homePageScreen = new JPanel(new GridBagLayout());
            homePageScreen.setBackground(Color.DARK_GRAY);
            JLabel welcome = new JLabel("<html> <style>body{color: white;}</style><body><center> Welcome to our Fitness Application</center>Please navigate using the menu above.</body></html>");
            welcome.setFont(new Font("Calibri", Font.BOLD,16));
            addComponent(homePageScreen,welcome,1,0,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.VERTICAL);


            frame.setContentPane(homePageScreen);
            frame.validate();
            frame.repaint();
    }

    public void uiConfig(){
    UIManager ui = new UIManager();
    ui.put("OptionPane.background",Color.darkGray);
    ui.put("Panel.background",Color.darkGray);
    ui.put("OptionPane.messageForeground",Color.white);
}

    public MenuBar buildMenuBar(JFrame frame){
        MenuBar mainMenu = new MenuBar();
        Menu m1 = new Menu("File");
        MenuItem m11newAccount = new MenuItem("New User");
        m11newAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountOwnerCreationFrame(frame);
            }
        });
        MenuItem m12showAccountOwners = new MenuItem("See Users");
       // Menu m2 = new Menu("Help");
        Menu m3 = new Menu("Applications");
        Menu m4 = new Menu("Navigation");
        MenuItem m41Home = new MenuItem("Home Page");
        m41Home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeMenuFrame(frame);

            }
        });


        m1.add(m11newAccount);
        m1.add(m12showAccountOwners);
        m4.add(m41Home);
        mainMenu.add(m1);
        // mainMenu.add(m2); need to implement methods before adding
        mainMenu.add(m3);
        mainMenu.add(m4);

        return mainMenu;
    }

    public void accountOwnerCreationFrame(JFrame frame) {
        JPanel accountCreationPage = new JPanel(new GridBagLayout());
                accountCreationPage.setBackground(Color.DARK_GRAY);
        JPanel nameForm = new JPanel(new GridBagLayout());
        JPanel submissionForm = new JPanel(new GridBagLayout());
        this.formFont = new Font("Calibri", Font.BOLD,14);

        JLabel greeting = formatJLabelText("Welcome to your Fitness APP, Time you create your account!",this.formFont);
        addComponent(nameForm, greeting, 0, 0, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);


// line 1 end y 0
        JLabel firstName = formatJLabelText("First Name:",this.formFont);
        addComponent(nameForm, firstName, 0, 2, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        JTextField firstNameInput = new JTextField(20);
        addComponent(nameForm, firstNameInput, 3, 2, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 2 end y 1
        JLabel lastName = formatJLabelText("Last Name:",this.formFont);
        addComponent(nameForm, lastName, 0, 3, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        JTextField lastNameInput = new JTextField(20);
        addComponent(nameForm, lastNameInput, 3, 3, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 3 end y 2
        JLabel weight = formatJLabelText("Weight:     ",this.formFont);
        addComponent(nameForm, weight, 0, 4, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        JTextField weightInput = new JTextField(20);
        addComponent(nameForm, weightInput, 3, 4, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 4 end y 3
        JLabel height = formatJLabelText("Height:     ",this.formFont);

        addComponent(nameForm, height, 0, 5, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        JTextField heightInput = new JTextField(20);
        addComponent(nameForm, heightInput, 3, 5, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
// line 5 end y 4
        JLabel age = formatJLabelText("Age:     ",this.formFont);

        addComponent(nameForm, age, 0, 6, 2, 1, .9, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        JTextField ageInput = new JTextField(20);
        addComponent(nameForm, ageInput, 3, 6, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);

        JButton submit = new JButton("Submit for account Creation");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // need a fucking slew of validation methods and error handling here. Maybe add error logic using exceptions.
                String firstName = firstNameInput.getText();
                String lastName = lastNameInput.getText();
                double weight = Double.parseDouble(weightInput.getText());
                double height = Double.parseDouble(heightInput.getText());
                int age = Integer.parseInt(ageInput.getText());
                accountOwners.add(new AccountOwner(firstName,lastName,weight,height,age));

                JOptionPane.showMessageDialog(nameForm,"User account Created! Returning to Menu.");
                homeMenuFrame(frame);

            }
        });
        addComponent(nameForm, submit, 0, 7, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

        nameForm.setBackground(Color.darkGray);
        addComponent(accountCreationPage, nameForm, 0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(accountCreationPage,submissionForm,0,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE);

        frame.setContentPane(accountCreationPage);
        frame.repaint();
        frame.revalidate();
    }

    public JLabel formatJLabelText(String labelText, Font font){
        JLabel label = new JLabel();
        label.setFont(this.formFont);
        String formattedString = "<html><style>body{color:white;}</style><body>"+labelText+"</body></html>";
        label.setText(formattedString);

        return label;
    }

    public void addComponent(JPanel panel, JComponent component, int gx, int gy, int gw, int gh) {
        addComponent(panel, component, gx, gy, gw, gh, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    }

    public void addComponent(JPanel panel, JComponent component, int gx, int gy, int gw, int gh, double weightx, double weighty, int orientation, int fill) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = fill;
        gbc.anchor = orientation;
        gbc.gridx = gx;
        gbc.gridy = gy;
        gbc.gridwidth = gw;
        gbc.gridheight = gh;
        gbc.weightx = weightx;
        gbc.weighty = weighty;
        panel.add(component, gbc);
    }

    public static void main(String[] args) {
        FitnessApp testPane = new FitnessApp();
    }
}
