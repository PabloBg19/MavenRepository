package VentanaMaven;

import javax.swing.*;

public class Ventana2 {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JRadioButton REMEMBERUSERRadioButton;
    private JRadioButton ACCEPTTERMSANDCONDITIONSRadioButton;
    private JButton ACCESSButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana2");
        frame.setContentPane(new Ventana2().PANEL);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,450);
        frame.setVisible(true);
    }

    private JPanel PANEL;
}
