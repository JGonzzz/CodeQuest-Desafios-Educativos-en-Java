import javax.swing.JOptionPane;

public class Adivinanzas2 {

    public static void main(String[] args) {
        boolean jugarDeNuevo;

        do {
            jugar();
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?", "Menú Principal", JOptionPane.YES_NO_OPTION);
            jugarDeNuevo = (opcion == JOptionPane.YES_OPTION);
        } while (jugarDeNuevo);

        JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
    }

    public static void jugar() {
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(
                    null,
                    "¡Adivina la respuesta correcta!",
                    "Adivinanza 1",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"El violín", "El Acordeón", "La Guitarra"},
                    "El violín"
            );

            // Si se cierra el cuadro de diálogo (opcion == JOptionPane.CLOSED_OPTION), salir del juego
            if (opcion == JOptionPane.CLOSED_OPTION) {
                return;
            }

            if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "¡Correcto! Pasas a la siguiente.");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Inténtalo de nuevo.");
                continue;
            }

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "Aunque corren más que los minutos, nunca logran llegar los primeros. ¿Qué son?",
                    "Adivinanza 2",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"Los Minutos", "Los Segundos", "Las Horas"},
                    "Los Minutos"
            );

            if (opcion == JOptionPane.CLOSED_OPTION) {
                return;
            }

            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "¡Correcto! Pasas a la siguiente.");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Volvamos a la primera adivinanza.");
                continue;
            }

            opcion = JOptionPane.showOptionDialog(
                    null,
                    "¿Qué cosa corre más que un zorro?",
                    "Adivinanza 3",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"El tiempo", "El rayo", "El agua"},
                    "El tiempo"
            );

            if (opcion == JOptionPane.CLOSED_OPTION) {
                return;
            }

            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has acertado todas las adivinanzas.");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Volvamos a la primera adivinanza.");
            }

            break; // Salir del bucle una vez que se hayan respondido todas las adivinanzas correctamente

        } while (true);
    }
}
