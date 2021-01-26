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

public class Core extends JFrame {
    private static final int newWIDTH = 350;
    private static final int newHEIGHT = 350;
    private JLabel lineLabel, lineLabel2, coreLabel, username, displayUsername, core2Label, core3Label, core4Label, core5Label, core6Label, pP, rT, rP, lP, eP;
    private JButton ok;

    public Core() throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileReader("Workout.txt"));
        //String chest1 = inFile.nextLine();
        String core1 = "", core2 = "", core3 = "", core4 = "", core5 = "", core6 = "";
        int lineNum = 0;
        while (!inFile.nextLine().equals("Core")) {
            core1 = inFile.nextLine();
    }
            core2 = inFile.nextLine();
            core3 = inFile.nextLine();
            core4 = inFile.nextLine();
            core5 = inFile.nextLine();
            core6 = inFile.nextLine();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(newWIDTH, newHEIGHT);
        JPanel corePanel = new JPanel();
        JFrame coreFrame = new JFrame();
        setTitle("The Fuse Method - Core");
        setContentPane(corePanel);
        corePanel.setBackground(Color.decode("#dbd7cd"));
        setLocationRelativeTo(null);
        corePanel.setLayout(null);
        
        coreLabel = new JLabel("CORE WORKOUT");
        coreLabel.setFont(new Font("Impact", Font.BOLD, Font.ITALIC));
        coreLabel.setBounds(110, 20, 250, 25);
        coreLabel.setForeground(Color.decode("#343457"));
        coreLabel.setFont(coreLabel.getFont().deriveFont(20.0f));
        add(coreLabel);

        lineLabel = new JLabel("________________");
        lineLabel.setBounds(0, 13, 400, 25);
        lineLabel.setForeground(Color.decode("#343457"));
        add(lineLabel);

        lineLabel2 = new JLabel("________________");
        lineLabel2.setBounds(230, 13, 400, 25);
        lineLabel2.setForeground(Color.decode("#343457"));
        add(lineLabel2);

        core2Label = new JLabel(core2);
        core2Label.setBounds(30, 60, 190, 25);
        core2Label.setForeground(Color.decode("#343457"));
        add(core2Label);

        core3Label = new JLabel(core3);
        core3Label.setBounds(30, 100, 190, 25);
        core3Label.setForeground(Color.decode("#343457"));
        add(core3Label);

        core4Label = new JLabel(core4);
        core4Label.setBounds(30, 140, 190, 25);
        core4Label.setForeground(Color.decode("#343457"));
        add(core4Label);

        core5Label = new JLabel(core5);
        core5Label.setBounds(30, 180, 190, 25);
        core5Label.setForeground(Color.decode("#343457"));
        add(core5Label);

        core6Label = new JLabel(core6);
        core6Label.setBounds(30, 220, 190, 25);
        core6Label.setForeground(Color.decode("#343457"));
        add(core6Label);

        JButton viewLift1 = new JButton("View Lift");
        viewLift1.setForeground(Color.blue);
        viewLift1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {    
                setBounds(100, 100, 520, 390);
                JPanel contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Pallof Press");
                setLocationRelativeTo(null);
                setContentPane(contentPane);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                ImageIcon pallofPress = new ImageIcon("pallofpress.gif");

                pP = new JLabel("", pallofPress, JLabel.CENTER);
                pP.setBounds(0, 0, 1200, 1200);
                add(pP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Core core = new Core();
                    core.setVisible(true);
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
                setBounds(100, 100, 390, 470);
                JPanel contentPane1 = new JPanel();
                contentPane1.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Russian Twist");
                setLocationRelativeTo(null);
                setContentPane(contentPane1);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon russianTwist = new ImageIcon("russiantwist.gif");

                rT = new JLabel("", russianTwist, JLabel.CENTER);
                rT.setBounds(0, 0, 700, 700);
                add(rT);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Core core = new Core();
                    core.setVisible(true);
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
                setBounds(100, 100, 550, 670);
                JPanel contentPane2 = new JPanel();
                contentPane2.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Right Plank");
                setLocationRelativeTo(null);
                setContentPane(contentPane2);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon rightPlank = new ImageIcon("rightplank.jpg");

                rP = new JLabel("", rightPlank, JLabel.CENTER);
                rP.setBounds(0, 0, 1200, 1200);
                add(rP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Core core = new Core();
                    core.setVisible(true);
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
                setBounds(100, 100, 400, 280);
                JPanel contentPane3 = new JPanel();
                contentPane3.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Left Plank");
                setLocationRelativeTo(null);
                setContentPane(contentPane3);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon leftPlank = new ImageIcon("leftplank.jpg");

                lP = new JLabel("", leftPlank, JLabel.CENTER);
                lP.setBounds(0, 0, 1200, 700);
                add(lP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Core core = new Core();
                    core.setVisible(true);
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
                setBounds(100, 100, 590, 420);
                JPanel contentPane4 = new JPanel();
                contentPane4.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Elbow Plank");
                setLocationRelativeTo(null);
                setContentPane(contentPane4);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon elbowPlank = new ImageIcon("elbowplank.gif");

                eP = new JLabel("", elbowPlank, JLabel.CENTER);
                eP.setBounds(0, 0, 1200, 700);
                add(eP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Core core = new Core();
                    core.setVisible(true);
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
        }
    }