import javax.swing.*;
import java.awt.*;

public class Ventana3 {
    private JPanel Panel;
    private JTabbedPane tabbedLogin;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JRadioButton recordingUserRadioButton;
    private JButton accessButton;
    private JPanel panelAvion;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField2;
    private JComboBox comboBox1;
    private JPasswordField passwordField3;
    private JCheckBox acceptTermsAndConditionsCheckBox;
    private JPanel panelLogin;
    private JPanel panelboton;


    public Ventana3() {
        // Crear el panel de fondo
        FondoPanel fondo = new FondoPanel();
        fondo.setLayout(new BorderLayout());

        // Hacer el panel original transparente para que se vea el fondo
        Panel.setOpaque(false);



        panelboton.setOpaque(false);

        // Agregar el panel original (que contiene los componentes) al FondoPanel
        fondo.add(Panel, BorderLayout.CENTER);

        // Asignar el FondoPanel como el panel principal
        Panel = fondo;

    }

    private static class FondoPanel extends JPanel {
        private final Image imagen;

        public FondoPanel() {
            // Cargar la imagen desde los recursos
            imagen = new ImageIcon(getClass().getResource("/image/ryanairfondo.jpg")).getImage();
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
        frame.setContentPane(new Ventana3().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
