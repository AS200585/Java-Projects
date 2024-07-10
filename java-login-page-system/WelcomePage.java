
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("HELLO USER");

    // Constructor for the WelcomePage class that takes a userID as a parameter
    public WelcomePage(String userID) {
        welcomeLabel.setText("Hello " + userID + "!");
        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new java.awt.Font(null, java.awt.Font.ROMAN_BASELINE, 25));

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);  // Sets the layout manager of the frame to null, allowing for absolute positioning of components
        frame.setVisible(true);
    }
}
