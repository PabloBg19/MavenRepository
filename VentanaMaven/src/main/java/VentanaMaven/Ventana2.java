package VentanaMaven;

import javax.swing.*;

public class Ventana2 {
    private JTextField userTextField;
    private JPasswordField passwordPasswordField;
    private JRadioButton termsAndCondictionRadioButton;
    private JRadioButton recordingUserRadioButton;
    private JComboBox comboBox1;
    private JButton loginButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana2");
        frame.setContentPane(new Ventana2().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520,410);
        frame.setVisible(true);
    }

    private JPanel panel;
}
