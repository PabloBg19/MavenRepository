package VentanaMaven;

import javax.swing.*;

public class Ventana3 {
    private JPanel Panel3;
    private JLabel logo;
    private JTabbedPane loginregister;
    private JTabbedPane tabbedPane1;
    private JLabel userLogin;
    private JTextField textLOGINUSER;
    private JLabel contraseña;
    private JButton ACCEDERButton;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana3");
        frame.setContentPane(new Ventana3().Panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
