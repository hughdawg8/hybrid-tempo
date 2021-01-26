import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.lang.model.util.ElementScanner6;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Login extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int newWIDTH = 300;
    private static final int newHEIGHT = 150;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameText, newPassword;
    private JPasswordField passwordText;

    public Login(String userN,String passW)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(newWIDTH, newHEIGHT);
        JPanel loginPanel = new JPanel();
        JFrame loginFrame = new JFrame();
        setTitle("The Fuse Method - Login");
        loginPanel.setBackground(Color.decode("#dbd7cd"));
        setContentPane(loginPanel);
        setLocationRelativeTo(null);
        loginPanel.setLayout(null);

        usernameText = new JTextField(20);
        usernameText.setBounds(75, 20, 165, 25);
        usernameText.setBackground(Color.decode("#676767"));
        usernameText.setForeground(Color.decode("#FFFFFF"));
        usernameText.setText("Username");
        usernameText.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            usernameText.selectAll();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });       
        loginPanel.add(usernameText);

        newPassword = new JTextField(20);
        newPassword.setBounds(75, 50, 165, 25);
        newPassword.setBackground(Color.decode("#676767"));
        newPassword.setForeground(Color.decode("#FFFFFF"));
        newPassword.setText("Password");
        newPassword.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e){
            newPassword.setVisible(false);
            passwordText.requestFocus();
            }
            @Override
            public void focusLost(FocusEvent e){

            }
        });
        loginPanel.add(newPassword);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(75, 50, 165, 25);
        passwordText.setBackground(Color.decode("#676767"));
        passwordText.setForeground(Color.decode("#FFFFFF"));
        loginPanel.add(passwordText);
        
        JButton login = new JButton("Start Training!");
        login.setForeground(Color.decode("#343457"));
        login.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e)
            {
                String userName1 = usernameText.getText();
                String password2 = passwordText.getText();

                if (userName1.equals(userN) && password2.equals(passW))//if statement to see if username and password match                       
                    {
                        setVisible(false);
                        welcome newWelcome = new welcome();
                        newWelcome.setVisible(true);
                        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();

                        WorkoutList list = new WorkoutList(); //delay WorkoutList from opening for 8 seconds
                        s.schedule(new Runnable(){
                        public void run() {
                        list.setVisible(true);
                        }
                        }, 8, TimeUnit.SECONDS);
                    }
                else if (!userName1.equals(userN) || !password2.equals(passW)){ //display error message if username or password do not match
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "OOPS!", JOptionPane.ERROR_MESSAGE);
                }
            }   
        });
        login.setBounds(50, 90, 120, 25);
        loginPanel.add(login);

        JButton exit = new JButton("Exit");
        exit.setForeground(Color.decode("#343457"));
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }

        });
        exit.setBounds(180, 90, 80, 25);
        loginPanel.add(exit);
        
        loginFrame.setVisible(true);
    }
}




