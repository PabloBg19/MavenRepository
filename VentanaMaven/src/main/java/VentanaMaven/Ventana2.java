package VentanaMaven;

import javax.swing.*;
import java.awt.*;

public class Ventana2 {
    private JPanel Panel;
    private JTextField UsertField1;
    private JPasswordField passwordField1;
    private JPanel Panel2;
    private JPanel Panel3;
    private JRadioButton termsAndCondictionsRadioButton;
    private JRadioButton recordingUserRadioButton;
    private JComboBox comboBox1;
    private JButton ACCESSButton;
    private JPanel Panel4;
    private JLabel fotos;
    private JLabel LogoWilliams;
    private JLabel User;
    private JTextField TextUser;
    private JLabel Password;
    private JPasswordField PasswordField1;
    private JRadioButton ACEPTARTERMINOSYCONDICIONESRadioButton;
    private JButton ACCEDERButton;

    public Ventana2() {
        // Crear el panel de fondo
        FondoPanel fondo = new FondoPanel();
        fondo.setLayout(new BorderLayout());

        // Hacer el panel original transparente para que se vea el fondo
        Panel.setOpaque(false);
        Panel2.setOpaque(false);
        Panel4.setOpaque(false);
        termsAndCondictionsRadioButton.setOpaque(false);
        recordingUserRadioButton.setOpaque(false);
        UsertField1.setOpaque(false);
        passwordField1.setOpaque(false);


        // Agregar el panel original (que contiene los componentes) al FondoPanel
        fondo.add(Panel, BorderLayout.CENTER);

        // Asignar el FondoPanel como el panel principal
        Panel = fondo;

    }

    private static class FondoPanel extends JPanel {
        private final Image imagen;

        public FondoPanel() {
            // Cargar la imagen desde los recursos
            imagen = new ImageIcon(getClass().getResource("/image/tlou.gif")).getImage();
            // Verificar si la imagen se cargó correctamente
            if (imagen == null) {
                System.err.println("No se pudo cargar la imagen: /image/tlou.gif");
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Dibujar la imagen escalada al tamaño del panel
            if (imagen != null) {
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana1");
        frame.setContentPane(new Ventana2().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(575, 567);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
