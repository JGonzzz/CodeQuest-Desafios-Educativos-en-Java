import javax.swing.JOptionPane;

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

            opcion = JOptionPane.showOptionDialog(
                null,
                "¡Bienvenido al Juego de Preguntas!",
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



