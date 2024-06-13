import java.util.Random;
import javax.swing.JOptionPane;

public class AdivinanzaNumero {
    public static void jugar() {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 0;

        while (true) {
            String adivinanzaStr = JOptionPane.showInputDialog(null, 
                "He pensado en un número entre 1 y 100. ¿Puedes adivinar cuál es?\n" +
                "Introduce un Número: ");
            
            // Si el usuario cierra el cuadro de diálogo, salir del juego
            if (adivinanzaStr == null) {
                return;
            }

            int adivinanza;
            try {
                adivinanza = Integer.parseInt(adivinanzaStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Inténtalo de nuevo.");
                continue;
            }

            intentos++;

            if (adivinanza < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Más alto.");
            } else if (adivinanza > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Más bajo.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Correcto! Has adivinado el número en " + intentos + " intentos.");
                break;
            }
        }
    }
}


