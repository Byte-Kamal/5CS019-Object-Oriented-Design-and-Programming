package swing;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton submitButton;
    private JButton resetButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginForm loginForm = new LoginForm();
                    loginForm.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
