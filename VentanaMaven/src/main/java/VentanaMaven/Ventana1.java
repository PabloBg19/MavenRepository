package VentanaMaven;

import javax.swing.*;

public class Ventana1 {

    private JPanel Panel;
    private JLabel logoWilliams;
    private JLabel User;
    private JTextField textUser;
    private JLabel Password;
    private JPasswordField passwordField1;
    private JRadioButton ACEPTARTERMINOSYCONDICIONESRadioButton;
    private JButton ACCEDERButton;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana1");
        frame.setContentPane(new Ventana1().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(575, 567);
        frame.setVisible(true);
    }


}
