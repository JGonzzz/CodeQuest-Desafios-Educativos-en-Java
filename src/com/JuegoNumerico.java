import javax.swing.JOptionPane;

public class JuegoNumerico {
    public static void jugar() {
        boolean jugarDeNuevo;

        do {
            // Definir las preguntas y respuestas correctas
            String pregunta1 = "¿Cuál es el valor de π (pi)?";
            String opcion1A = "A. 3.12";
            String opcion1B = "B. 3.14";
            String opcion1C = "C. 3.16";
            String opcion1D = "D. 3.18";
            char respuesta1Correcta = 'B';

            String pregunta2 = "¿Cuál es el resultado de 5 + 3 X 2?";
            String opcion2A = "A. 16";
            String opcion2B = "B. 11";
            String opcion2C = "C. 13";
            String opcion2D = "D. 10";
            char respuesta2Correcta = 'B';

            String pregunta3 = "¿Cuántos lados tiene un hexágono?";
            String opcion3A = "A. 5";
            String opcion3B = "B. 6";
            String opcion3C = "C. 7";
            String opcion3D = "D. 8";
            char respuesta3Correcta = 'B';

            String pregunta4 = "¿Cuál es la raíz cuadrada de 64?";
            String opcion4A = "A. 6";
            String opcion4B = "B. 7";
            String opcion4C = "C. 8";
            String opcion4D = "D. 9";
            char respuesta4Correcta = 'C';

            // Contador de puntos
            int puntuacion = 0;

            // Mostrar y procesar la primera pregunta
            String respuesta = JOptionPane.showInputDialog(null,
                    pregunta1 + "\n" +
                    opcion1A + "\n" +
                    opcion1B + "\n" +
                    opcion1C + "\n" +
                    opcion1D + "\n" +
                    "Introduce tu respuesta (A, B, C, D)");

            if (respuesta == null) {
                return; // Salir si el usuario cancela
            } else if (!respuesta.isEmpty()) {
                char respuesta1 = Character.toUpperCase(respuesta.charAt(0));
                if (respuesta1 == respuesta1Correcta) {
                    JOptionPane.showMessageDialog(null, "¡Correcto!");
                    puntuacion++;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrecto. La respuesta correcta es " + respuesta1Correcta);
                }
            }

            // Mostrar y procesar la segunda pregunta
            respuesta = JOptionPane.showInputDialog(null,
                    pregunta2 + "\n" +
                    opcion2A + "\n" +
                    opcion2B + "\n" +
                    opcion2C + "\n" +
                    opcion2D + "\n" +
                    "Introduce tu respuesta (A, B, C, D)");

            if (respuesta == null) {
                return; // Salir si el usuario cancela
            } else if (!respuesta.isEmpty()) {
                char respuesta2 = Character.toUpperCase(respuesta.charAt(0));
                if (respuesta2 == respuesta2Correcta) {
                    JOptionPane.showMessageDialog(null, "¡Correcto!");
                    puntuacion++;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrecto. La respuesta correcta es " + respuesta2Correcta);
                }
            }

            // Mostrar y procesar la tercera pregunta
            respuesta = JOptionPane.showInputDialog(null,
                    pregunta3 + "\n" +
                    opcion3A + "\n" +
                    opcion3B + "\n" +
                    opcion3C + "\n" +
                    opcion3D + "\n" +
                    "Introduce tu respuesta (A, B, C, D)");

            if (respuesta == null) {
                return; // Salir si el usuario cancela
            } else if (!respuesta.isEmpty()) {
                char respuesta3 = Character.toUpperCase(respuesta.charAt(0));
                if (respuesta3 == respuesta3Correcta) {
                    JOptionPane.showMessageDialog(null, "¡Correcto!");
                    puntuacion++;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrecto. La respuesta correcta es " + respuesta3Correcta);
                }
            }

            // Mostrar y procesar la cuarta pregunta
            respuesta = JOptionPane.showInputDialog(null,
                    pregunta4 + "\n" +
                    opcion4A + "\n" +
                    opcion4B + "\n" +
                    opcion4C + "\n" +
                    opcion4D + "\n" +
                    "Introduce tu respuesta (A, B, C, D)");

            if (respuesta == null) {
                return; // Salir si el usuario cancela
            } else if (!respuesta.isEmpty()) {
                char respuesta4 = Character.toUpperCase(respuesta.charAt(0));
                if (respuesta4 == respuesta4Correcta) {
                    JOptionPane.showMessageDialog(null, "¡Correcto!");
                    puntuacion++;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrecto. La respuesta correcta es " + respuesta4Correcta);
                }
            }

            // Mostrar la puntuación final
            JOptionPane.showMessageDialog(null, "Tu puntuación final es: " + puntuacion + "/4");

            // Preguntar si desea jugar de nuevo
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?", "Menú Principal", JOptionPane.YES_NO_OPTION);
            jugarDeNuevo = (opcion == JOptionPane.YES_OPTION);

        } while (jugarDeNuevo);

        JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
    }
}

