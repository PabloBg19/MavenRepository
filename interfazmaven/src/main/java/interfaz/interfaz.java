package interfaz;

import javax.swing.*;

public class interfaz {
    public static void main(String[] args) {
        JFrame frame = new JFrame("interfaz");
        frame.setContentPane(new interfaz().PANEL1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel PANEL1;
    private JPanel PANELnaV;
    private JPanel panellogo;
    private JButton dashboardButton;
    private JButton usuariosButton;
    private JButton informesButton;
    private JButton ajustesButton;
    private JButton ayudaButton;
    private JPanel panelbutton;
    private JPanel panellogin;
    private JPanel paneluser;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;
    private JTextArea textArea1;
    private JTabbedPane tabbedPane1;
    private JTextArea textArea2;
    private JList list1;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton cancelarButton;


    public interfaz() {
        dashboardButton.addActionListener(e -> {
            // Acción para el botón Dashboard
            JOptionPane.showMessageDialog(null, "Has hecho clic en Dashboard");
        });
        usuariosButton.addActionListener(e -> {
            // Acción para el botón Usuarios
            JOptionPane.showMessageDialog(null, "Has hecho clic en Usuarios");
        });
        informesButton.addActionListener(e -> {
            // Acción para el botón Informes
            JOptionPane.showMessageDialog(null, "Has hecho clic en Informes");
        });
        ajustesButton.addActionListener(e -> {
            // Acción para el botón Ajustes
            JOptionPane.showMessageDialog(null, "Has hecho clic en Ajustes");
        });
        ayudaButton.addActionListener(e -> {
            // Acción para el botón Ayuda
            JOptionPane.showMessageDialog(null, "Has hecho clic en Ayuda");
        });
        guardarButton.addActionListener(e -> {
            // Acción para el botón Guardar
            String texto = textArea1.getText();
            JOptionPane.showMessageDialog(null, "Texto guardado: " + texto);
        });
        limpiarButton.addActionListener(e -> {
            // Acción para el botón Limpiar
            textArea1.setText("");
        });
        cancelarButton.addActionListener(e -> {
            // Acción para el botón Cancelar
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres cancelar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }
}
