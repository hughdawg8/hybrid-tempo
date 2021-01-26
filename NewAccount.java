import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewAccount extends JFrame
{   //declare private variables
    private static final int WIDTH = 320;
    private static final int HEIGHT = 320;
    private JLabel lineLabel, lineLabel2, newPasswordLabel, confirmPassword, firstNameLabel, lastNameLabel, emailLabel, createAccountLabel, memberSignIn, emailAlert, asterisk, birthDate;
    private JTextField emailText, firstNameText, lastNameText, birthDateText, passwordText, confirmText;
    private JPasswordField newPasswordText, confirmPasswordText;
    private JButton exit1;
    private ExitButtonHandler ebHandler1;

    public NewAccount()
    {   
        NewInitialize();
    }

    private void NewInitialize()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation
        setSize(WIDTH, HEIGHT); //window size
        JPanel newPanel = new JPanel(); //creates panel
        JFrame newFrame = new JFrame(); //creates frame
        setTitle("The Fuse Method - Create Account"); //sets title
        setContentPane(newPanel); //sets panel to contain labels, buttons etc.
        newPanel.setBackground(Color.decode("#dbd7cd")); //sets background color
        setLocationRelativeTo(null); //sets window in center of screen
        newPanel.setLayout(null); //clears layout

        createAccountLabel = new JLabel("Create New Account"); //creates label
        createAccountLabel.setFont(new Font("Impact", Font.BOLD, Font.ITALIC)); //sets font
        createAccountLabel.setBounds(85, 15, 190, 25); //sets label location
        createAccountLabel.setFont(createAccountLabel.getFont().deriveFont(18.0f)); //sets font size
        createAccountLabel.setForeground(Color.decode("#343457")); //sets font color
        newPanel.add(createAccountLabel); //adds label to panel

        lineLabel = new JLabel("____________"); //adds lines beside title
        lineLabel.setBounds(0, 10, 400, 25);
        lineLabel.setForeground(Color.decode("#343457"));
        add(lineLabel);

        lineLabel2 = new JLabel("________________");
        lineLabel2.setBounds(230, 10, 400, 25);
        lineLabel2.setForeground(Color.decode("#343457"));
        add(lineLabel2);

        emailAlert = new JLabel("  You will recieve an *email with your username.");
        emailAlert.setBounds(80, 157, 180, 25);
        emailAlert.setFont(emailAlert.getFont().deriveFont(7.0f));
        emailAlert.setForeground(Color.decode("#343457"));
        newPanel.add(emailAlert);

        asterisk = new JLabel("*You won't actually recieve an email.");
        asterisk.setBounds(40, 270, 165, 25);
        asterisk.setFont(asterisk.getFont().deriveFont(7.0f));
        asterisk.setForeground(Color.decode("#343457"));
        newPanel.add(asterisk);

        firstNameText = new JTextField(20); //creates text field
        firstNameText.setBounds(75, 50, 165, 25);
        firstNameText.setBackground(Color.decode("#676767"));
        firstNameText.setForeground(Color.decode("#FFFFFF"));
        firstNameText.setText("First Name"); //adds text to textbox
        newPanel.add(firstNameText);
 
        firstNameText.addMouseListener(new MouseAdapter() //action to select all text when mouse clicks textbox
        {
            @Override
            public void mouseClicked(MouseEvent e) {
              firstNameText.selectAll();
            }
          });

        firstNameText.addFocusListener(new FocusListener() //action to select all text if textbox receives focus
        {
            @Override
            public void focusGained(FocusEvent e){
            lastNameText.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });

        lastNameText = new JTextField(20);
        lastNameText.setBounds(75, 80, 165, 25);
        lastNameText.setBackground(Color.decode("#676767"));
        lastNameText.setForeground(Color.decode("#FFFFFF"));
        lastNameText.setText("Last Name");
        newPanel.add(lastNameText);
        lastNameText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              lastNameText.selectAll();
            }
          });
          lastNameText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            lastNameText.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });

        birthDateText = new JTextField(8);
        birthDateText.setBounds(75, 110, 165, 25);
        birthDateText.setBackground(Color.decode("#676767"));
        birthDateText.setForeground(Color.decode("#FFFFFF"));
        birthDateText.setText("DOB: MM/DD/YYYY");
        birthDateText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            birthDateText.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });
        newPanel.add(birthDateText);

        emailText = new JTextField(50);
        emailText.setBounds(75, 140, 165, 25);
        emailText.setBackground(Color.decode("#676767"));
        emailText.setForeground(Color.decode("#FFFFFF"));
        emailText.setText("Email");
        emailText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            emailText.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });
        newPanel.add(emailText);

        passwordText = new JTextField(20); //text field to display "password" in field. Hidden when focus is gained
        passwordText.setBounds(75, 175, 165, 25);
        passwordText.setBackground(Color.decode("#676767"));
        passwordText.setForeground(Color.decode("#FFFFFF"));
        passwordText.setText("Password");
        passwordText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            passwordText.setVisible(false);
            newPasswordText.requestFocus();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });
        newPanel.add(passwordText);

        newPasswordText = new JPasswordField(20);
        newPasswordText.setBounds(75, 175, 165, 25);
        newPasswordText.setBackground(Color.decode("#676767"));
        newPasswordText.setForeground(Color.decode("#FFFFFF"));
        newPasswordText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            newPasswordText.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });
        newPanel.add(newPasswordText);

        confirmText = new JTextField(20); //text field to display "confirm password". Hidden when focus is gained
        confirmText.setBounds(75, 205, 165, 25);
        confirmText.setBackground(Color.decode("#676767"));
        confirmText.setForeground(Color.decode("#FFFFFF"));
        confirmText.setText("Confirm Password");
        confirmText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            confirmText.setVisible(false);
            confirmPasswordText.requestFocus();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });
        newPanel.add(confirmText);
        
        confirmPasswordText = new JPasswordField(20);
        confirmPasswordText.setBounds(75, 205, 165, 25);
        confirmPasswordText.setBackground(Color.decode("#676767"));
        confirmPasswordText.setForeground(Color.decode("#FFFFFF"));
        confirmPasswordText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            confirmPasswordText.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });
        newPanel.add(confirmPasswordText);

        JButton signUp = new JButton("Create");
        signUp.setForeground(Color.decode("#343457"));
        signUp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {   //declare variables
                String password5 = newPasswordText.getText();
                String matchPassword = confirmPasswordText.getText();
                String theUserIs = firstNameText.getText();
                String inValue, dOB1, dOB2, dOB, firstIn, lastName, username, inValue1, emailAddress, emailAddress1, emailAddress2, password1, textBox1, textBox2,
                textBox3, textBox4, textBox6;
                int at, dot;
                password1 = newPasswordText.getText();
                textBox1 = firstNameText.getText();
                textBox2 = lastNameText.getText();
                textBox3 = birthDateText.getText();
                textBox4 = emailText.getText();
                textBox6 = confirmPasswordText.getText();
                //if statement to make sure user fills out all fields, and that their passwords match
                if ((textBox1.equals("First Name")) || (textBox2.equals("Last Name")) ||(textBox3.equals("Birthdate: mm/dd/yyyy")) || (textBox4.equals("Email")) ||(password1.equals("Password")) || (textBox6.equals("Confirm Password")) ||
                (textBox1.equals("")) || (textBox2.equals("")) ||(textBox3.equals("")) || (textBox4.equals("")) ||(password1.equals("")) || (textBox6.equals("")))
                {
                    JOptionPane.showMessageDialog(null, "All Fields Must Be Complete", "OOPS!", JOptionPane.ERROR_MESSAGE); //pops error message if text fields are empty or unchanged
                }
                else if (!password5.equals(matchPassword))
                {
                    JOptionPane.showMessageDialog(null, "Passwords Must Match", "OOPS!", JOptionPane.ERROR_MESSAGE); //pops error message when passwords dont match
                }
                else{
                setVisible(false);
                emailAddress = emailText.getText();
                dot = emailAddress.indexOf("."); //locates index of "." in email
                at = emailAddress.indexOf("@"); //locates index of "@" in email
                emailAddress1 = emailAddress.substring((at + 1), dot); //creates substring to find email domain
                emailAddress2 = emailAddress1.substring(0, 1).toUpperCase() + emailAddress1.substring(1); //capitalizes email domain
                username = "";
                inValue = birthDateText.getText();
                dOB1 = inValue.substring(0,2); //creates substring for birthdate
                dOB2 = inValue.substring(3, 5);
                dOB = dOB1 + dOB2; 
                inValue1 = firstNameText.getText();
                firstIn = inValue1.substring(0, 1).toLowerCase();
                lastName = lastNameText.getText().toLowerCase();
                username = firstIn + lastName + dOB; //creates username by adding first initial, last name, birth month and day
                
                email newEmail = new email(theUserIs, username, emailAddress2, password1); //opens email message
                newEmail.setVisible(true);
                }            
            }
        });

        signUp.setBounds(75, 240, 80, 25);
        signUp.setBackground(Color.WHITE);
        newPanel.add(signUp);

        ebHandler1 = new ExitButtonHandler();
        exit1 = new JButton("Exit");
        exit1.setForeground(Color.decode("#343457"));
        exit1.setBounds(160, 240, 80, 25);
        exit1.addActionListener(ebHandler1);
        newPanel.add(exit1);

        newFrame.setVisible(true);
    }
    private class ExitButtonHandler implements ActionListener //exits on click
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        }

        public String getLastName() //method to get last name
        {
            return lastNameText.getText();
        }
        public String getUser()
        {
            return firstNameText.getText(); //method to get first name
        }
        public String getBirthDate() //method to get birthdate
        {
            String inValue, dOB;
            inValue = birthDateText.getText();
            dOB = inValue.substring(6, 7);
            return dOB;
        }
}
