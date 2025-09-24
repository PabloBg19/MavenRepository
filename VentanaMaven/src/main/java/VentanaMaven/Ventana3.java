package VentanaMaven;

import javax.swing.*;

public class Ventana3 {
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton accessButton;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField2;
    private JSlider slider1;
    private JProgressBar progressBar1;
    private JRadioButton recordingUserRadioButton;
    private JCheckBox acceptTermsAndCondictionCheckBox;
    private JButton accessButton1;
    private JPanel panelfoto;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana3");
        frame.setContentPane(new Ventana3().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    private JPanel panel;
}
