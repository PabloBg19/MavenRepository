package VentanaMaven;

import javax.swing.*;

public class Ventana2 {
    private JPanel Panel2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JRadioButton ACEPTARTERMINOSYCONDICIONESRadioButton;
    private JComboBox comboBox1;
    private JLabel labelUsuario;
    private JLabel labelContraseña;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana2");
        frame.setContentPane(new Ventana2().Panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(575, 567);
        frame.setVisible(true);
    }
}
