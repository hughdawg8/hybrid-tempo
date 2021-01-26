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

public class Back extends JFrame {
    
    private static final int newWIDTH = 300;
    private static final int newHEIGHT = 350;
    private JLabel lineLabel, lineLabel2, backLabel, username, displayUsername, lift1Label, lift2Label, lift3Label, lift4Label, lift5Label, bOR, lP, rF, dL, pU;
    private JTextField backText1, backText2, backText3, backText4, backText5;
    private JButton ok;
    
    public Back() throws FileNotFoundException
    {
        String back1 = "", back2 = "", back3 = "", back4 = "", back5 = "";
       
        Scanner inFile = new Scanner(new FileReader("Workout.txt"));
       
        String lift1 = inFile.nextLine();

        if (lift1.equals("Back"))
        {
            back1 = inFile.nextLine();
            back2 = inFile.nextLine();
            back3 = inFile.nextLine();
            back4 = inFile.nextLine();
            back5 = inFile.nextLine();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(newWIDTH, newHEIGHT);
        JPanel backPanel = new JPanel();
        JFrame backFrame = new JFrame();
        setTitle("The Fuse Method - Back");
        setContentPane(backPanel);
        setLocationRelativeTo(null);
        backPanel.setLayout(null);
        backPanel.setBackground(Color.decode("#dbd7cd"));
        setVisible(true);
        
        backLabel = new JLabel("BACK WORKOUT");
        backLabel.setFont(new Font("Impact", Font.BOLD, Font.ITALIC));
        backLabel.setBounds(85, 20, 250, 25);
        backLabel.setFont(backLabel.getFont().deriveFont(20.0f));
        backLabel.setForeground(Color.decode("#343457"));
        add(backLabel);

        lineLabel = new JLabel("_____________");
        lineLabel.setBounds(0, 13, 400, 25);
        lineLabel.setForeground(Color.decode("#343457"));
        add(lineLabel);

        lineLabel2 = new JLabel("_____________");
        lineLabel2.setBounds(210, 13, 400, 25);
        lineLabel2.setForeground(Color.decode("#343457"));
        add(lineLabel2);

        lift1Label = new JLabel(back1);
        lift1Label.setBounds(30, 60, 190, 25);
        lift1Label.setForeground(Color.decode("#343457"));
        add(lift1Label);

        lift2Label = new JLabel(back2);
        lift2Label.setBounds(30, 100, 190, 25);
        lift2Label.setForeground(Color.decode("#343457"));
        add(lift2Label);

        lift3Label = new JLabel(back3);
        lift3Label.setBounds(30, 140, 190, 25);
        lift3Label.setForeground(Color.decode("#343457"));
        add(lift3Label);

        lift4Label = new JLabel(back4);
        lift4Label.setBounds(30, 180, 190, 25);
        lift4Label.setForeground(Color.decode("#343457"));
        add(lift4Label);
        
        lift5Label = new JLabel(back5);
        lift5Label.setBounds(30, 220, 190, 25);
        lift5Label.setForeground(Color.decode("#343457"));
        add(lift5Label);

        /*backText1 = new JTextField(10);
        backText1.setBounds(200, 60, 40, 25);
        add(backText1);

        backText2 = new JTextField(10);
        backText2.setBounds(200, 80, 40, 25);
        add(backText2);

        backText3 = new JTextField(10);
        backText3.setBounds(200, 100, 40, 25);
        add(backText3);

        backText4 = new JTextField(10);
        backText4.setBounds(200, 120, 40, 25);
        add(backText4);

        backText5 = new JTextField(10);
        backText5.setBounds(200, 140, 40, 25);
        add(backText5);*/

        JButton viewLift1 = new JButton("View Lift");
        viewLift1.setForeground(Color.blue);
        viewLift1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {    
                setBounds(100, 100, 600, 700);
                JPanel contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Bentover Row");
                setLocationRelativeTo(null);
                setContentPane(contentPane);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                ImageIcon bentOverRow = new ImageIcon("bentoverow.gif");

                bOR = new JLabel("", bentOverRow, JLabel.CENTER);
                bOR.setBounds(0, 0, 1200, 1200);
                add(bOR);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Back back = new Back();
                    back.setVisible(true);
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
        viewLift1.setBounds(180, 65, 80, 20);
        add(viewLift1);

        JButton viewLift2 = new JButton("View Lift");
        viewLift2.setForeground(Color.blue);
        viewLift2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 500, 520);
                JPanel contentPane1 = new JPanel();
                contentPane1.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Reverse Fly");
                setLocationRelativeTo(null);
                setContentPane(contentPane1);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon reverseFly = new ImageIcon("reversefly.gif");

                rF = new JLabel("", reverseFly, JLabel.CENTER);
                rF.setBounds(0, 0, 1200, 1200);
                add(rF);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Back back = new Back();
                    back.setVisible(true);
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
        viewLift2.setBounds(180, 105, 80, 20);
        add(viewLift2);

        JButton viewLift3 = new JButton("View Lift");
        viewLift3.setForeground(Color.blue);
        viewLift3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 260, 550);
                JPanel contentPane2 = new JPanel();
                contentPane2.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Lat Pulldown");
                setLocationRelativeTo(null);
                setContentPane(contentPane2);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon latPull = new ImageIcon("latpulldown.gif");

                lP = new JLabel("", latPull, JLabel.CENTER);
                lP.setBounds(0, 0, 1200, 1200);
                add(lP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Back back = new Back();
                    back.setVisible(true);
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
        viewLift3.setBounds(180, 145, 80, 20);
        add(viewLift3);

        JButton viewLift4 = new JButton("View Lift");
        viewLift4.setForeground(Color.blue);
        viewLift4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 480, 340);
                JPanel contentPane3 = new JPanel();
                contentPane3.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Pull-Up");
                setLocationRelativeTo(null);
                setContentPane(contentPane3);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon pull= new ImageIcon("pullup.gif");

                pU = new JLabel("", pull, JLabel.CENTER);
                pU.setBounds(0, 0, 1200, 700);
                add(pU);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Back back = new Back();
                    back.setVisible(true);
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
        viewLift4.setBounds(180, 185, 80, 20);
        add(viewLift4);

        JButton viewLift5 = new JButton("View Lift");
        viewLift5.setForeground(Color.blue);
        viewLift5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 600, 760);
                JPanel contentPane4 = new JPanel();
                contentPane4.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Deadlift");
                setLocationRelativeTo(null);
                setContentPane(contentPane4);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon deadLift = new ImageIcon("dl.gif");

                dL = new JLabel("", deadLift, JLabel.CENTER);
                dL.setBounds(0, 0, 1200, 700);
                add(dL);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Back back = new Back();
                    back.setVisible(true);
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
        viewLift5.setBounds(180, 225, 80, 20);
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
        save.setBounds(150, 275, 120, 25);
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
}}