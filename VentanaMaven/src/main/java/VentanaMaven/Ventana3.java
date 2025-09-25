package VentanaMaven;

import javax.swing.*;
import java.awt.*;

public class Ventana3 {
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton accessButton;
    private JTextField textField2;
    private JPasswordField passwordField2;
    private JSlider slider1;
    private JPanel panelfoto;
    private JPanel panel;
    private JTabbedPane tabbedPane2;
    private JRadioButton recordingUserRadioButton;
    private JCheckBox acceptTermsCheckBox;
    private JSpinner spinner1;

    public Ventana3() {
        FondoPanel fondo = new FondoPanel();
        fondo.setLayout(new BorderLayout());

        // Hacer el panel original transparente para que se vea el fondo
        panelfoto.setOpaque(false);
        panel.setOpaque(false);



        // Agregar el panel original (que contiene los componentes) al FondoPanel
        fondo.add(panel, BorderLayout.CENTER);

        // Asignar el FondoPanel como el panel principal
        panel = fondo;
    }



    private static class FondoPanel extends JPanel {
        private final Image imagen;


        public FondoPanel() {
            // Cargar la imagen desde los recursos
            imagen = new ImageIcon(getClass().getResource("/image/fondoOpel.jpg")).getImage();
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
        JFrame frame = new JFrame("Ventana3");
        frame.setContentPane(new Ventana3().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
    }






