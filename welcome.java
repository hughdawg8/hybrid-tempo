import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class welcome extends JFrame
{
    private static final long serialVersionUID = 1L;
    private JLabel background;
    public welcome()
{
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 600, 360);
    JPanel contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(-5, 5, 5, 5));
    setTitle("The Fuse Method - Welcome");
    setLocationRelativeTo(null);
    setContentPane(contentPane);

    ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();

    s.schedule(new Runnable(){ //open window for only 8 seconds
        public void run() {
            setVisible(false);
            dispose(); //dispose window after finishing the video
        }
    }, 8, TimeUnit.SECONDS);

    ImageIcon img = new ImageIcon("ncb.gif");

    background = new JLabel("", img, JLabel.CENTER);
    background.setBounds(0, 0, 1200, 700);
    add(background);
}
}