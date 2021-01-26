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

public class Chest extends JFrame {
    
    private static final int newWIDTH = 320;
    private static final int newHEIGHT = 350;
    private JLabel lineLabel, lineLabel2, chestLabel, username, displayUsername, chest2Label, chest3Label, chest4Label, chest5Label, chest6Label, bP, pU, hP, bD, sC;
    private JButton ok;

    public Chest() throws FileNotFoundException
    {
        //try{
        Scanner inFile = new Scanner(new FileReader("Workout.txt"));
        //String chest1 = inFile.nextLine();
        String chest1 = "", chest2 = "", chest3 = "", chest4 = "", chest5 = "", chest6 = "";
        int lineNum = 0;
        while (!inFile.nextLine().equals("Chest")) {
            chest1 = inFile.nextLine();
    }
            chest2 = inFile.nextLine();
            chest3 = inFile.nextLine();
            chest4 = inFile.nextLine();
            chest5 = inFile.nextLine();
            chest6 = inFile.nextLine();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(newWIDTH, newHEIGHT);
        JPanel chestPanel = new JPanel();
        JFrame chestFrame = new JFrame();
        setTitle("The Fuse Method - Chest");
        setContentPane(chestPanel);
        chestPanel.setBackground(Color.decode("#dbd7cd"));
        setLocationRelativeTo(null);
        chestPanel.setLayout(null);
        
        chestLabel = new JLabel("CHEST WORKOUT");
        chestLabel.setFont(new Font("Impact", Font.BOLD, Font.ITALIC));
        chestLabel.setBounds(90, 20, 250, 25);
        chestLabel.setForeground(Color.decode("#343457"));
        chestLabel.setFont(chestLabel.getFont().deriveFont(20.0f));
        add(chestLabel);

        lineLabel = new JLabel("_____________");
        lineLabel.setBounds(0, 13, 400, 25);
        lineLabel.setForeground(Color.decode("#343457"));
        add(lineLabel);

        lineLabel2 = new JLabel("_________________");
        lineLabel2.setBounds(220, 13, 400, 25);
        lineLabel2.setForeground(Color.decode("#343457"));
        add(lineLabel2);

        chest2Label = new JLabel(chest2);
        chest2Label.setBounds(30, 60, 190, 25);
        chest2Label.setForeground(Color.decode("#343457"));
        add(chest2Label);

        chest3Label = new JLabel(chest3);
        chest3Label.setBounds(30, 100, 190, 25);
        chest3Label.setForeground(Color.decode("#343457"));
        add(chest3Label);

        chest4Label = new JLabel(chest4);
        chest4Label.setBounds(30, 140, 190, 25);
        chest4Label.setForeground(Color.decode("#343457"));
        add(chest4Label);

        chest5Label = new JLabel(chest5);
        chest5Label.setBounds(30, 180, 190, 25);
        chest5Label.setForeground(Color.decode("#343457"));
        add(chest5Label);

        chest6Label = new JLabel(chest6);
        chest6Label.setBounds(30, 220, 190, 25);
        chest6Label.setForeground(Color.decode("#343457"));
        add(chest6Label);

        JButton viewLift1 = new JButton("View Lift");
        viewLift1.setForeground(Color.blue);
        viewLift1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {    
                setBounds(100, 100, 440, 320);
                JPanel contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Bench Press");
                setLocationRelativeTo(null);
                setContentPane(contentPane);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                ImageIcon benchPress = new ImageIcon("benchpress.gif");

                bP = new JLabel("", benchPress, JLabel.CENTER);
                bP.setBounds(0, 0, 1200, 1200);
                add(bP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Chest chest = new Chest();
                    chest.setVisible(true);
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
        viewLift1.setBounds(210, 65, 80, 20);
        add(viewLift1);

        JButton viewLift2 = new JButton("View Lift");
        viewLift2.setForeground(Color.blue);
        viewLift2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 480, 340);
                JPanel contentPane1 = new JPanel();
                contentPane1.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Push-Up");
                setLocationRelativeTo(null);
                setContentPane(contentPane1);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon pushUp = new ImageIcon("pushup.gif");

                pU = new JLabel("", pushUp, JLabel.CENTER);
                pU.setBounds(0, 0, 700, 700);
                add(pU);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Chest chest = new Chest();
                    chest.setVisible(true);
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
        viewLift2.setBounds(210, 105, 80, 20);
        add(viewLift2);

        JButton viewLift3 = new JButton("View Lift");
        viewLift3.setForeground(Color.blue);
        viewLift3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 310, 390);
                JPanel contentPane2 = new JPanel();
                contentPane2.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Hex Press");
                setLocationRelativeTo(null);
                setContentPane(contentPane2);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon hexPress = new ImageIcon("hexpress.gif");

                hP = new JLabel("", hexPress, JLabel.CENTER);
                hP.setBounds(0, 0, 1200, 1200);
                add(hP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Chest chest = new Chest();
                    chest.setVisible(true);
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
        viewLift3.setBounds(210, 145, 80, 20);
        add(viewLift3);

        JButton viewLift4 = new JButton("View Lift");
        viewLift4.setForeground(Color.blue);
        viewLift4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 400, 510);
                JPanel contentPane3 = new JPanel();
                contentPane3.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Bench Dip");
                setLocationRelativeTo(null);
                setContentPane(contentPane3);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon benchDip = new ImageIcon("benchdip.gif");

                bD = new JLabel("", benchDip, JLabel.CENTER);
                bD.setBounds(0, 0, 1200, 700);
                add(bD);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Chest chest = new Chest();
                    chest.setVisible(true);
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
        viewLift4.setBounds(210, 185, 80, 20);
        add(viewLift4);

        JButton viewLift5 = new JButton("View Lift");
        viewLift5.setForeground(Color.blue);
        viewLift5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setBounds(100, 100, 320, 320);
                JPanel contentPane4 = new JPanel();
                contentPane4.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Skull Crusher");
                setLocationRelativeTo(null);
                setContentPane(contentPane4);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon skullCrusher = new ImageIcon("skullcrusher.gif");

                sC = new JLabel("", skullCrusher, JLabel.CENTER);
                sC.setBounds(0, 0, 1200, 700);
                add(sC);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Chest chest = new Chest();
                    chest.setVisible(true);
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
        viewLift5.setBounds(210, 225, 80, 20);
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
    }
    /*catch (FileNotFoundException fnfe)
    {
        System.out.println("File Not Found");
    }*/

    //}
}
