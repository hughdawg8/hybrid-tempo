import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.*;

public class email extends JFrame {
    private static final int newWIDTH = 300;
    private static final int newHEIGHT = 150;
    private JLabel emailName, username, displayUsername;
    private JButton ok;

    public email(String st, String user, String email, String pass)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(newWIDTH, newHEIGHT);
        JPanel emailPanel = new JPanel();
        JFrame emailFrame = new JFrame();
        setTitle(email + " - Mail"); //displays users email domain in title bar
        setContentPane(emailPanel);
        setLocationRelativeTo(null);
        emailPanel.setLayout(null);
        emailPanel.setBackground(Color.decode("#dbd7cd"));

        emailName = new JLabel("Hi, " + st + "!"); //greets user with first name
        emailName.setBounds(100, 20, 150, 25);
        emailName.setForeground(Color.decode("#343457"));
        emailName.setFont(emailName.getFont().deriveFont(18.0f));
        add(emailName);

        username = new JLabel("You'll need this username: ");
        username.setForeground(Color.decode("#343457"));
        username.setBounds(20, 50, 200, 25);
        emailPanel.add(username);

        displayUsername = new JLabel(user); //displays username
        displayUsername.setBounds(190, 50, 200, 25);
        displayUsername.setForeground(Color.red);
        emailPanel.add(displayUsername);

        JButton ok = new JButton("Ok");
        ok.setForeground(Color.decode("#343457"));
        ok.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                String sendUsername, sendPassword;
                sendUsername = user;
                sendPassword = pass;
                Login log = new Login(sendUsername, sendPassword);
                log.setVisible(true);
            }

        });
        ok.setBounds(105, 90, 80, 25);
        emailPanel.add(ok);
    }
}
