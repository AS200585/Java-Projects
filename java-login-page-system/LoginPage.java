import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// Declaration of the LoginPage class which implements the ActionListener interface
public class LoginPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("ID: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel("This is a test");

    HashMap<String, String> loginInfo = new HashMap<>();

    // Constructor for LoginPage class that takes a HashMap with login information
    LoginPage(HashMap<String, String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        // Sets the location of the userIDLabel and passwordLabel on the frame
        userIDLabel.setBounds(50, 100, 75, 25);
        passwordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ROMAN_BASELINE, 25));

        userIDField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false); // Disables focus traversal for the loginButton, making it not focusable
        // Adds an ActionListener to the loginButton, specifying that the current instance (this) will handle the action events
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false); // Disables focus traversal for the resetButton, making it not focusable
        // Adds an ActionListener to the resetButton, specifying that the current instance (this) will handle the action events
        resetButton.addActionListener(this);

        // Adds userIDLabel and passwordLabel component to the frame
        frame.add(userIDLabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);
        // Sets the default close operation of the frame to exit the application when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Sets the size of the frame to 450 pixels wide and 450 pixels high
        frame.setSize(450, 450);
        // Sets the layout manager of the frame to null, allowing for absolute positioning of components
        frame.setLayout(null);
        frame.setVisible(true); // if we want our frame visible or not
    }

    @SuppressWarnings("unused")
    @Override
    //  actionPerformed method from the ActionListener interface
    public void actionPerformed(ActionEvent e) {
        // Checks if the source of the event is the resetButton
       if(e.getSource() == resetButton){
            userIDField.setText("");
            passwordField.setText("");
       }
        // Checks if the source of the event is the loginButton
       if(e.getSource() == loginButton){
            
            String userID = userIDField.getText();
            String password = String.valueOf(passwordField.getPassword());

            // Checks if the loginInfo HashMap contains the entered userID
            if(loginInfo.containsKey(userID)){
                 // Checks if the password associated with the userID matches the entered password
                if(loginInfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found");
            }
       }
    }
}
