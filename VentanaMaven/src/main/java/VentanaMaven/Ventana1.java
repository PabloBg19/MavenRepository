package VentanaMaven;

import javax.swing.*;
import java.awt.*;

public class Ventana1 {

    private JPanel Panel;
    private JLabel LogoWilliams;
    private JLabel User;
    private JTextField TextUser;
    private JLabel Password;
    private JPasswordField PasswordField1;
    private JRadioButton ACEPTARTERMINOSYCONDICIONESRadioButton;
    private JButton ACCEDERButton;

    public Ventana1() {
        // Crear el panel de fondo
        FondoPanel fondo = new FondoPanel();
        fondo.setLayout(new BorderLayout());

        // Hacer el panel original transparente para que se vea el fondo
        Panel.setOpaque(false);

        // Agregar el panel original (que contiene los componentes) al FondoPanel
        fondo.add(Panel, BorderLayout.CENTER);

        // Asignar el FondoPanel como el panel principal
        Panel = fondo;
    }

    private static class FondoPanel extends JPanel {
        private final Image imagen;

        public FondoPanel() {
            // Cargar la imagen desde los recursos
            imagen = new ImageIcon(getClass().getResource("/image/fondo_cielo.jpg")).getImage();
            // Verificar si la imagen se cargó correctamente
            if (imagen == null) {
                System.err.println("No se pudo cargar la imagen: /image/fondo_cielo.jpg");
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
        frame.setContentPane(new Ventana1().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(575, 567);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}