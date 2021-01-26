import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.Font;
import java.util.*;

public class WorkoutList extends JFrame {
    private static final int newWIDTH = 300;
    private static final int newHEIGHT = 250;
    private JLabel selectWorkout, username, displayUsername, lineLabel, lineLabel2;
    private JButton ok;

    public WorkoutList()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(newWIDTH, newHEIGHT);
        JPanel workoutListPanel = new JPanel();
        JFrame workoutListFrame = new JFrame();
        setTitle("The Fuse Method - Workouts");
        setContentPane(workoutListPanel);
        workoutListPanel.setBackground(Color.decode("#dbd7cd"));
        setLocationRelativeTo(null);
        workoutListPanel.setLayout(null);

        String[] workouts = {"Legs", "Back", "Chest", "Shoulders", "Core"}; //array with workout types
        JComboBox workoutBox = new JComboBox<>(workouts); //creates combo box
        workoutBox.setForeground(Color.decode("#343457"));
        workoutBox.setBackground(Color.decode("#dbd7cd"));
        workoutBox.setBounds(70, 60, 150, 25);
        workoutBox.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JComboBox jc = (JComboBox)e.getSource();
                String workoutName = (String)jc.getSelectedItem(); //reads user's selected workout set
                if (workoutName.equals("Legs")) //if statement to open desired workout set pending selection
                {
                    try{ //try catch block for exception
                    setVisible(false);
                    Legs legWorkout = new Legs();
                    legWorkout.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");  
                    }
                }
                else if (workoutName.equals("Back"))
                {   
                    try{
                    setVisible(false);
                    Back backWorkout = new Back();
                    backWorkout.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");
                    }
                    
                }
                else if (workoutName.equals("Chest"))
                {
                    try{
                        setVisible(false);
                        Chest chestWorkout = new Chest();
                        chestWorkout.setVisible(true);
                        }
                        catch (FileNotFoundException ex)
                        {
                        System.out.println("File Not Found");  
                        }
                }
                else if (workoutName.equals("Shoulders"))
                {
                    try{
                    setVisible(false);
                    Shoulders shoulderWorkout = new Shoulders();
                    shoulderWorkout.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");
                    }
                }
                else if (workoutName.equals("Core"))
                {
                    try{
                    setVisible(false);
                    Core coreWorkout = new Core();
                    coreWorkout.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");  
                    }
                }
            }
        });
        add(workoutBox);
        
        selectWorkout = new JLabel("SELECT WORKOUT");
        selectWorkout.setFont(new Font("Impact", Font.BOLD, Font.ITALIC));
        selectWorkout.setBounds(77, 20, 250, 25);
        selectWorkout.setBackground(Color.decode("#dbd7cd"));
        selectWorkout.setForeground(Color.decode("#343457"));
        selectWorkout.setFont(selectWorkout.getFont().deriveFont(20.0f));
        add(selectWorkout);

        lineLabel = new JLabel("___________");
        lineLabel.setBounds(0, 13, 400, 25);
        lineLabel.setForeground(Color.decode("#343457"));
        add(lineLabel);

        lineLabel2 = new JLabel("____________");
        lineLabel2.setBounds(213, 13, 400, 25);
        lineLabel2.setForeground(Color.decode("#343457"));
        add(lineLabel2);
    }
}