package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JTextField fn;
    private final JTextField sc;
    private final JTextField output;

    public Calculator(JTextField fn, JTextField sc, JTextField output) {
        this.fn = fn;
        this.sc = sc;
        this.output = output;
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 694, 412);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("First Num");
        lblNewLabel.setBounds(25, 63, 46, 14);
        contentPane.add(lblNewLabel);

        fn = new JTextField();
        fn.setBounds(124, 60, 86, 20);
        contentPane.add(fn);
        fn.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Second Num");
        lblNewLabel_1.setBounds(25, 118, 71, 14);
        contentPane.add(lblNewLabel_1);

        sc = new JTextField();
        sc.setBounds(124, 115, 86, 20);
        contentPane.add(sc);
        sc.setColumns(10);

        JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(fn.getText());
                int b = Integer.parseInt(sc.getText());
                int sum = a+b;
                output.setText(""+sum);
            }

        });
        btnNewButton.setBounds(66, 195, 89, 23);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_2 = new JLabel("Output");
        lblNewLabel_2.setBounds(25, 244, 46, 14);
        contentPane.add(lblNewLabel_2);

        output = new JTextField();
        output.setBounds(124, 241, 86, 20);
        contentPane.add(output);
        output.setColumns(10);
    }
}
