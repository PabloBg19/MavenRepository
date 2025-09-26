# 🖥️ Interfaces de Login - Java Swing

**Autor:** Pablo Belascoain  
**Tecnologías:** Java Swing, Maven, IntelliJ IDEA GUI Designer

## 📋 Descripción del Proyecto

Este proyecto presenta el desarrollo de tres interfaces de login diferentes utilizando Java Swing y Maven, explorando desde diseños clásicos hasta interfaces creativas con múltiples funcionalidades. Cada interfaz demuestra diferentes aspectos del diseño de UI y la experiencia de usuario.

## 🎯 Objetivos de Aprendizaje

- **Dominio de IntelliJ GUI Designer:** Creación de interfaces con componentes Swing
- **Personalización avanzada:** Modificación de propiedades visuales y funcionales
- **Diseño variado:** Desarrollo de versiones clásica, extendida y creativa
- **Resolución de problemas:** Solución de desafíos técnicos en UI
- **Creatividad:** Combinación de funcionalidad y estética

## 🚀 Interfaces Desarrolladas

### 1. 🏎️ Login Williams F1
Una interfaz elegante inspirada en la Fórmula 1 con:
- **Fondo personalizado:** `fondo_cielo.jpg`
- **Layout:** GridLayoutManager (7x3)
- **Componentes:**
  - JLabel para "User" y "Password"
  - JTextField y JPasswordField (ancho 150px)
  - JRadioButton para términos y condiciones
  - JButton "Access" (Franklin Gothic Medium, 16pt negrita)
- **Dimensiones:** 1000x700px
- **Estilo:** Paneles transparentes con colores oscuros

### 2. 🎮 Login Twitch
Interfaz inspirada en la plataforma de streaming:
- **Componentes principales:**
  - JTextField para usuario
  - JPasswordField para contraseña
  - JRadioButton para "Terms and condition" y "Recording user"
  - JComboBox para selección de idioma
  - JButton "Login" con fondo púrpura
- **Dimensiones:** 800x600px
- **Estilo:** Fondo oscuro con logo de Twitch

### 3. 🚗 Login y Registro Opel
La interfaz más compleja con sistema de login/registro y catálogo:
- **Fondo:** `fondoOpel.jpg`
- **Layout:** GridLayoutManager (2x3)
- **Pestañas principales:**
  - **LOGIN:** Usuario, contraseña, opciones de grabación
  - **REGISTER:** Email, contraseña, selector de edad (JSlider)
  - **Catálogo de autos:** Corsa, Crossland, Adam, Astra, Insignia
- **Funcionalidades especiales:**
  - JSpinner para configuración de tiempo de pago
  - Precios de modelos ($7,000 - $16,000)
  - Paneles transparentes para mostrar fondo

## 🛠️ Tecnologías Utilizadas

- **Java Swing** - Framework de UI
- **Maven** - Gestión de dependencias
- **IntelliJ IDEA** - IDE con GUI Designer
- **Java AWT** - Manejo de imágenes y gráficos

## 📁 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── interfaces/
│   │       ├── WilliamsF1Login.java
│   │       ├── TwitchLogin.java
│   │       ├── OpelLogin.java
│   │       └── FondoPanel.java
│   └── resources/
│       └── image/
│           ├── fondo_cielo.jpg
│           ├── fondoOpel.jpg
│           └── [otros recursos gráficos]
```

## 🎨 Implementación de Fondos Personalizados

### Clase FondoPanel

```java
public class FondoPanel extends JPanel {
    private Image imagen;
    
    public FondoPanel() {
        imagen = new ImageIcon(getClass().getResource("/image/fondo_cielo.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}
```

### Configuración
1. Crear FondoPanel con BorderLayout
2. Configurar paneles como transparentes: `setOpaque(false)`
3. Agregar panel original: `fondo.add(Panel, BorderLayout.CENTER)`
4. Asignar al JFrame: `frame.setContentPane(new Ventana1().Panel)`

## 🚀 Cómo Ejecutar

1. **Clonar el repositorio:**
   ```bash
   git clone [URL-del-repositorio]
   ```

2. **Abrir en IntelliJ IDEA:**
   - File → Open → Seleccionar carpeta del proyecto

3. **Ejecutar interfaces:**
   - Navegar a la clase deseada
   - Ejecutar el método main

## 📸 Capturas de Pantalla

[Agregar capturas de pantalla de cada interfaz]

## 🎯 Características Destacadas

- **Responsive Design:** Interfaces adaptables a diferentes tamaños
- **Fondos Personalizados:** Implementación de imágenes de fondo escalables
- **Componentes Variados:** Uso extensivo de la biblioteca Swing
- **Estética Profesional:** Diseños inspirados en marcas reconocidas
- **Funcionalidad Completa:** Desde login básico hasta sistemas complejos

## 📚 Aprendizajes Clave

- Dominio del **IntelliJ GUI Designer** para desarrollo rápido de interfaces
- Implementación de **fondos personalizados** con manejo de transparencias
- Uso avanzado de **layouts** (GridLayoutManager, BorderLayout)
- **Personalización** de componentes (fuentes, colores, iconos)
- **Resolución de problemas** técnicos en diseño UI
- Balance entre **funcionalidad y estética**

## 🔮 Posibles Mejoras Futuras

- **Integración con bases de datos** para autenticación real
- **Animaciones** y transiciones entre estados
- **Validación de formularios** en tiempo real
- **Internacionalización** (i18n) para múltiples idiomas
- **Temas personalizables** por el usuario
- **Persistencia de configuración** del usuario

## 👨‍💻 Autor

**Pablo Belascoain**  
Estudiante de Desarrollo de Software

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos.

---

*"El diseño de UI es un equilibrio entre técnica y arte que enriquece el desarrollo."*
