import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        int opcion;

        while (true) {
            String[] opciones = {
                "Adivinanzas",
                "Preguntas de Programación",
                "Adivina el Número",
                "Adivinanzas Matemáticas",
                "Salir"
            };

            // Crear un JPanel personalizado
            JPanel panel = new JPanel();
            panel.setBackground(new Color(60, 63, 65)); // Fondo oscuro
            panel.setLayout(new BorderLayout());

            JLabel etiqueta = new JLabel("<html><b>¡Bienvenido al Juego de Preguntas!</b></html>", SwingConstants.CENTER);
            etiqueta.setForeground(new Color(187, 187, 187)); // Texto claro
            etiqueta.setFont(new Font("Times new roman", Font.BOLD, 20));
            panel.add(etiqueta, BorderLayout.CENTER);

            // Añadir un margen
            panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 60, 60));

            // Usar el panel en el JOptionPane
            opcion = JOptionPane.showOptionDialog(
                null,
                panel,
                "Menú Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            if (opcion == JOptionPane.CLOSED_OPTION || opcion == 4) {
                JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
                return;
            }

            switch (opcion) {
                case 0:
                    Adivinanzas2.jugar();
                    break;
                case 1:
                    PreguntasProgramacion.jugar();
                    break;
                case 2:
                    AdivinanzaNumero.jugar();
                    break;
                case 3:
                    AdivinanzaMatematica.jugar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}




