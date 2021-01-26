import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Font;

public class Legs extends JFrame {
    private static final int newWIDTH = 350;
    private static final int newHEIGHT = 350;
    private JLabel lineLabel, lineLabel2, legsLabel, username, displayUsername, legs2Label, legs3Label, legs4Label, legs5Label, legs6Label, bS, rDL, bSS, hC, cR;
    private JButton ok;

    public Legs() throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileReader("Workout.txt"));
        //String chest1 = inFile.nextLine();
        String legs1 = "", legs2 = "", legs3 = "", legs4 = "", legs5 = "", legs6 = "";
        int lineNum = 0;
        while (!inFile.nextLine().equals("Legs")) {
            legs1 = inFile.nextLine();
    }
            legs2 = inFile.nextLine();
            legs3 = inFile.nextLine();
            legs4 = inFile.nextLine();
            legs5 = inFile.nextLine();
            legs6 = inFile.nextLine();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(newWIDTH, newHEIGHT);
        JPanel legsPanel = new JPanel();
        JFrame legsFrame = new JFrame();
        setTitle("The Fuse Method - Legs");
        setContentPane(legsPanel);
        legsPanel.setBackground(Color.decode("#dbd7cd"));
        setLocationRelativeTo(null);
        legsPanel.setLayout(null);
        
        legsLabel = new JLabel("LEG WORKOUT");
        legsLabel.setFont(new Font("Impact", Font.BOLD, Font.ITALIC));
        legsLabel.setBounds(120, 20, 250, 25);
        legsLabel.setForeground(Color.decode("#343457"));
        legsLabel.setFont(legsLabel.getFont().deriveFont(20.0f));
        add(legsLabel);

        lineLabel = new JLabel("_________________");
        lineLabel.setBounds(0, 13, 400, 25);
        lineLabel.setForeground(Color.decode("#343457"));
        add(lineLabel);

        lineLabel2 = new JLabel("________________");
        lineLabel2.setBounds(230, 13, 400, 25);
        lineLabel2.setForeground(Color.decode("#343457"));
        add(lineLabel2);

        legs2Label = new JLabel(legs2);
        legs2Label.setBounds(30, 60, 200, 40);
        legs2Label.setForeground(Color.decode("#343457"));
        add(legs2Label);

        legs3Label = new JLabel(legs3);
        legs3Label.setBounds(30, 100, 200, 40);
        legs3Label.setForeground(Color.decode("#343457"));
        add(legs3Label);

        legs4Label = new JLabel(legs4);
        legs4Label.setBounds(30, 140, 200, 40);
        legs4Label.setForeground(Color.decode("#343457"));
        add(legs4Label);

        legs5Label = new JLabel(legs5);
        legs5Label.setBounds(30, 180, 200, 40);
        legs5Label.setForeground(Color.decode("#343457"));
        add(legs5Label);

        legs6Label = new JLabel(legs6);
        legs6Label.setBounds(30, 220, 200, 40);
        legs6Label.setForeground(Color.decode("#343457"));
        add(legs6Label);

        JButton viewLift1 = new JButton("View Lift");
        viewLift1.setForeground(Color.blue);
        viewLift1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {    
                setBounds(100, 100, 520, 420);
                JPanel contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Barbell Back Squat");
                setLocationRelativeTo(null);
                setContentPane(contentPane);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                ImageIcon backSquat = new ImageIcon("backsquat.gif");

                bS = new JLabel("", backSquat, JLabel.CENTER);
                bS.setBounds(0, 0, 1200, 1200);
                add(bS);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Legs legs = new Legs();
                    legs.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");
                    } 
                    setVisible(false);
                    dispose();
                    }
                    
                });
                ok.setBounds(400, 1100, 60, 15);
                add(ok);                    
            }

        });
        viewLift1.setBounds(250, 65, 80, 20);
        add(viewLift1);

        JButton viewLift2 = new JButton("View Lift");
        viewLift2.setForeground(Color.blue);
        viewLift2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 390, 565);
                JPanel contentPane1 = new JPanel();
                contentPane1.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Dumbbell RDL");
                setLocationRelativeTo(null);
                setContentPane(contentPane1);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon romanDeadLift = new ImageIcon("romandeadlift.gif");

                rDL = new JLabel("", romanDeadLift, JLabel.CENTER);
                rDL.setBounds(0, 0, 700, 700);
                add(rDL);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Legs legs = new Legs();
                    legs.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");  
                    } 
                    setVisible(false);
                    dispose();
                    }
                    
                });
                ok.setBounds(0, 0, 60, 15);
                add(ok);                    
            }

        });
        viewLift2.setBounds(250, 105, 80, 20);
        add(viewLift2);

        JButton viewLift3 = new JButton("View Lift");
        viewLift3.setForeground(Color.blue);
        viewLift3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 550, 645);
                JPanel contentPane2 = new JPanel();
                contentPane2.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Bulgarian Split Squat");
                setLocationRelativeTo(null);
                setContentPane(contentPane2);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon splitSquat = new ImageIcon("splitsquat.gif");

                bSS = new JLabel("", splitSquat, JLabel.CENTER);
                bSS.setBounds(0, 0, 1200, 1200);
                add(bSS);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Legs legs = new Legs();
                    legs.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");
                    } 
                    setVisible(false);
                    dispose();
                    }
                    
                });
                ok.setBounds(200, 600, 60, 15);
                add(ok);
            }

        });
        viewLift3.setBounds(250, 145, 80, 20);
        add(viewLift3);

        JButton viewLift4 = new JButton("View Lift");
        viewLift4.setForeground(Color.blue);
        viewLift4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 510, 465);
                JPanel contentPane3 = new JPanel();
                contentPane3.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Hamstring Curl");
                setLocationRelativeTo(null);
                setContentPane(contentPane3);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon hamstringCurl = new ImageIcon("hamstringcurl.gif");

                hC = new JLabel("", hamstringCurl, JLabel.CENTER);
                hC.setBounds(0, 0, 1200, 700);
                add(hC);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Legs legs = new Legs();
                    legs.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");
                    } 
                    setVisible(false);
                    dispose();
                    }
                    
                });
                ok.setBounds(0, 0, 60, 15);
                add(ok); 
            }

        });
        viewLift4.setBounds(250, 185, 80, 20);
        add(viewLift4);

        JButton viewLift5 = new JButton("View Lift");
        viewLift5.setForeground(Color.blue);
        viewLift5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 530, 370);
                JPanel contentPane4 = new JPanel();
                contentPane4.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Calf Raises");
                setLocationRelativeTo(null);
                setContentPane(contentPane4);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon calfRaises = new ImageIcon("calfraises.gif");

                cR = new JLabel("", calfRaises, JLabel.CENTER);
                cR.setBounds(0, 0, 1200, 700);
                add(cR);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Legs legs = new Legs();
                    legs.setVisible(true);
                    }
                    catch (FileNotFoundException ex)
                    {
                    System.out.println("File Not Found");  
                    } 
                    setVisible(false);
                    dispose();
                    }
                    
                });
                ok.setBounds(0, 0, 60, 15);
                add(ok); 
            }

        });
        viewLift5.setBounds(250, 225, 80, 20);
        add(viewLift5);

        JButton save = new JButton("Save & Exit");
        save.setForeground(Color.decode("#343457"));
        save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }

        });
        save.setBounds(175, 275, 120, 25);
        add(save);
        
        JButton back = new JButton("Back");
        back.setForeground(Color.decode("#343457"));
        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                WorkoutList work = new WorkoutList();
                work.setVisible(true);
                
            }
        });

        back.setBounds(50, 275, 90, 25);
        add(back);

        //String choice = (String)workoutBox.getSelectedItem();
        /*username = new JLabel("Your username is: ");
        username.setBounds(40, 50, 150, 25);
        emailPanel.add(username);

        displayUsername = new JLabel(user);
        displayUsername.setBounds(160, 50, 200, 25);
        displayUsername.setForeground(Color.red);
        emailPanel.add(displayUsername);*/
        /*JButton ok = new JButton("Ok");
        ok.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
                System.out.println("You've selected: " + choice);
                //Login log = new Login(sendUsername, sendPassword);
                //log.setVisible(true);
            }

        });

        ok.setBounds(110, 150, 80, 25);
        add(ok);

        //emailFrame.setVisible(true);*/
    }
}