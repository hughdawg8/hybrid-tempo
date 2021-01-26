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

public class Shoulders extends JFrame {
    private static final int newWIDTH = 350;
    private static final int newHEIGHT = 350;
    private JLabel lineLabel, lineLabel2, shouldersLabel, username, displayUsername, shoulders2Label, shoulders3Label, shoulders4Label, shoulders5Label, shoulders6Label, oP, lR, aP, fP, uR;
    private JButton ok;

    public Shoulders() throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileReader("Workout.txt")); //scanner to read file
        //String chest1 = inFile.nextLine();
        String shoulders1 = "", shoulders2 = "", shoulders3 = "", shoulders4 = "", shoulders5 = "", shoulders6 = "";
        int lineNum = 0;
        while (!inFile.nextLine().equals("Shoulders")) { //while loop to search for shoulder workout
            shoulders1 = inFile.nextLine();
    }
            shoulders2 = inFile.nextLine();
            shoulders3 = inFile.nextLine();
            shoulders4 = inFile.nextLine();
            shoulders5 = inFile.nextLine();
            shoulders6 = inFile.nextLine();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //window close operation
        setSize(newWIDTH, newHEIGHT); //window height
        JPanel shouldersPanel = new JPanel(); //create panel
        JFrame shouldersFrame = new JFrame(); //create frame
        setTitle("The Fuse Method - Shoulders"); //window title
        setContentPane(shouldersPanel); //add content
        shouldersPanel.setBackground(Color.decode("#dbd7cd")); //background color
        setLocationRelativeTo(null); //center window
        shouldersPanel.setLayout(null); //clear layout
        
        shouldersLabel = new JLabel("SHOULDER WORKOUT");
        shouldersLabel.setFont(new Font("Impact", Font.BOLD, Font.ITALIC));
        shouldersLabel.setBounds(90, 20, 250, 25);
        shouldersLabel.setForeground(Color.decode("#343457"));
        shouldersLabel.setFont(shouldersLabel.getFont().deriveFont(20.0f));
        add(shouldersLabel);

        lineLabel = new JLabel("_____________");
        lineLabel.setBounds(0, 13, 400, 25);
        lineLabel.setForeground(Color.decode("#343457"));
        add(lineLabel);

        lineLabel2 = new JLabel("________________");
        lineLabel2.setBounds(250, 13, 400, 25);
        lineLabel2.setForeground(Color.decode("#343457"));
        add(lineLabel2);

        shoulders2Label = new JLabel(shoulders2);
        shoulders2Label.setForeground(Color.decode("#343457"));
        shoulders2Label.setBounds(30, 65, 250, 25);
        add(shoulders2Label);

        shoulders3Label = new JLabel(shoulders3);
        shoulders3Label.setForeground(Color.decode("#343457"));
        shoulders3Label.setBounds(30, 105, 250, 25);
        add(shoulders3Label);

        shoulders4Label = new JLabel(shoulders4);
        shoulders4Label.setBounds(30, 145, 250, 25);
        shoulders4Label.setForeground(Color.decode("#343457"));
        add(shoulders4Label);

        shoulders5Label = new JLabel(shoulders5);
        shoulders5Label.setBounds(30, 185, 250, 25);
        shoulders5Label.setForeground(Color.decode("#343457"));
        add(shoulders5Label);

        shoulders6Label = new JLabel(shoulders6);
        shoulders6Label.setForeground(Color.decode("#343457"));
        shoulders6Label.setBounds(30, 225, 250, 25);
        add(shoulders6Label);

        JButton viewLift1 = new JButton("View Lift"); //button to open window with gif of workout
        viewLift1.setForeground(Color.blue);
        viewLift1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {    
                setBounds(100, 100, 480, 335);
                JPanel contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Overhead Press");
                setLocationRelativeTo(null);
                setContentPane(contentPane);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                ImageIcon overheadPress = new ImageIcon("overheadpress.gif"); //creates image

                oP = new JLabel("", overheadPress, JLabel.CENTER);
                oP.setBounds(0, 0, 1200, 1200);
                add(oP);

                JButton ok = new JButton("OK"); //closes window
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{ //try catch block for exception
                    Shoulders shoulders = new Shoulders();
                    shoulders.setVisible(true);
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
                setBounds(100, 100, 390, 335);
                JPanel contentPane1 = new JPanel();
                contentPane1.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Lateral Raises");
                setLocationRelativeTo(null);
                setContentPane(contentPane1);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon lateralRaises = new ImageIcon("lateralraises.gif");

                lR = new JLabel("", lateralRaises, JLabel.CENTER);
                lR.setBounds(0, 0, 700, 700);
                add(lR);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Shoulders shoulders = new Shoulders();
                    shoulders.setVisible(true);
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
                setBounds(100, 100, 250, 425);
                JPanel contentPane2 = new JPanel();
                contentPane2.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Arnold Press");
                setLocationRelativeTo(null);
                setContentPane(contentPane2);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon arnoldPress = new ImageIcon("arnoldpress.gif");

                aP = new JLabel("", arnoldPress, JLabel.CENTER);
                aP.setBounds(0, 0, 1200, 1200);
                add(aP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Shoulders shoulders = new Shoulders();
                    shoulders.setVisible(true);
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
                setBounds(100, 100, 600, 405);
                JPanel contentPane3 = new JPanel();
                contentPane3.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Face-Pulls");
                setLocationRelativeTo(null);
                setContentPane(contentPane3);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon facePulls = new ImageIcon("facepulls.gif");

                fP = new JLabel("", facePulls, JLabel.CENTER);
                fP.setBounds(0, 0, 1200, 700);
                add(fP);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Shoulders shoulders = new Shoulders();
                    shoulders.setVisible(true);
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
                setBounds(100, 100, 480, 425);
                JPanel contentPane4 = new JPanel();
                contentPane4.setBorder(new EmptyBorder(-5, 5, 5, 5));
                setTitle("Upright Rows");
                setLocationRelativeTo(null);
                setContentPane(contentPane4);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon uprightRows = new ImageIcon("uprightrows.gif");

                uR = new JLabel("", uprightRows, JLabel.CENTER);
                uR.setBounds(0, 0, 1200, 700);
                add(uR);

                JButton ok = new JButton("OK");
                ok.setForeground(Color.blue);
                //ok.setFont(ok.getFont().deriveFont(7.0f));
                ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                    try{
                    Shoulders shoulders = new Shoulders();
                    shoulders.setVisible(true);
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
    }
}
