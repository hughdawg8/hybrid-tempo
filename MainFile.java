/**************************************************************************************************************************************************************
 **   Title: The Fuse Method Training App                                                                                                                    **
 **   Programmer: Michael Hughey                                                                                                                             **
 **   Class: CS470 Capstone                                                                                                                                  **
 **   Date: 11/28/20                                                                                                                                         **
 **   Purpose: This is a workout app that prompts a user to create an account and log in. The user will recieve an "email" giving them their username. Once  **
 **            logged in a short video of the trainer (My wife) plays, followed by a drop box of workouts. You can select back workouts, chest, core, etc.   **
 **            There will be 5 workouts in each category which are pulled from a txt file. There are view lift buttons that will show a short video (gif) of **
 **            how to properly execute the workout.                                                                                                          **
 **   Comments: NewAccount.java, Shoulders.java, Login.java, email.java, welcome.java, WorkoutList.java                                                                      **
 *************************************************************************************************************************************************************/

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.lang.*;
import java.awt.Font;

public class MainFile extends JFrame 
{   //declare variables
    private static final int WIDTH = 320;
    private static final int HEIGHT = 200;
    private JLabel title, title2; 
    private JButton enter;

    public MainFile()
    {
        InitiateTheFuseMethod();
    }

    public void InitiateTheFuseMethod()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application if x is clicked
        setSize(WIDTH, HEIGHT); //set window size
        JPanel homePanel = new JPanel(); //creates panel
        JFrame homeFrame = new JFrame(); //creates frame
        setTitle("The Fuse Method - Home Page"); //title at top of window
        setContentPane(homePanel); //sets panel to contain labels, buttons etc.
        homePanel.setBackground(Color.decode("#dbd7cd")); //set background color
        setLocationRelativeTo(null); //set window center screen
        homePanel.setLayout(null); //no set layout

        title = new JLabel("The Fuse Method"); //creates label
        title.setFont(new Font("Impact", Font.BOLD, Font.ITALIC)); //set label's font
        title.setBounds(90, 20, 250, 25); //location in window of label
        title.setForeground(Color.decode("#343457")); //font color
        title.setFont(title.getFont().deriveFont(20.0f)); //font size
        add(title); //adds label to panel

        title2 = new JLabel("Training App");
        title2.setFont(new Font("Impact", Font.BOLD, Font.ITALIC));
        title2.setBounds(110, 50, 250, 25);
        title2.setForeground(Color.decode("#343457"));
        title2.setFont(title2.getFont().deriveFont(20.0f));
        add(title2);

        JButton enter = new JButton("Let's Go!"); //creates button
        enter.setForeground(Color.decode("#343457")); 
        enter.addActionListener(new ActionListener() //add action for when button is clicked
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false); //hides current window when opening next window
                NewAccount account = new NewAccount(); //opens new account window
                account.setVisible(true); //makes new account window visible
            }
        });
        enter.setBounds(100, 115, 120, 25); 
        add(enter);

        
    }

    public static void main(String[] args) //main function to run app
    {
        MainFile runApp = new MainFile(); //opens intial window
        runApp.setVisible(true); //makes window visible
    }
}

