import javax.swing.JOptionPane;

public class PreguntasProgramacion {
    public static void jugar() {
        boolean jugarDeNuevo;

        do {
            String respuesta;
            boolean respuestaCorrecta;

            // Primera pregunta
            do {
                respuesta = JOptionPane.showInputDialog(null, "¿En qué año fue lanzado Java?");
                if (respuesta == null) {
                    return; // Salir si el usuario cancela
                } else if (respuesta.equals("1995")) {
                    JOptionPane.showMessageDialog(null, "¡Correcto! Pasas a la siguiente pregunta.");
                    respuestaCorrecta = true;
                } else {
                    int intentarDeNuevo = JOptionPane.showConfirmDialog(null,
                            "Respuesta incorrecta. ¿Quieres intentar de nuevo?", "Intentar de nuevo",
                            JOptionPane.YES_NO_OPTION);
                    respuestaCorrecta = (intentarDeNuevo == JOptionPane.NO_OPTION);
                    return;
                }
            } while (!respuestaCorrecta);

            // Segunda pregunta
            do {
                respuesta = JOptionPane.showInputDialog(null, "¿Qué significa 'OOP' en programación?");
                if (respuesta == null) {
                    return; // Salir si el usuario cancela
                } else if (respuesta.equalsIgnoreCase("Programación Orientada a Objetos") ||
                        respuesta.equalsIgnoreCase("Programacion Orientada a Objetos") ||
                        respuesta.equalsIgnoreCase("Object Oriented Programming") ||
                        respuesta.equalsIgnoreCase("programacion orientada a objetos") ||
                        respuesta.equalsIgnoreCase("programación orientada a objetos")) {
                    JOptionPane.showMessageDialog(null, "¡Correcto! Pasas a la siguiente pregunta.");
                    respuestaCorrecta = true;
                } else {
                    int intentarDeNuevo = JOptionPane.showConfirmDialog(null,
                            "Respuesta incorrecta. ¿Quieres intentar de nuevo?", "Intentar de nuevo",
                            JOptionPane.YES_NO_OPTION);
                    respuestaCorrecta = (intentarDeNuevo == JOptionPane.NO_OPTION);
                    return;
                }
            } while (!respuestaCorrecta);

            // Tercera pregunta
            do {
                respuesta = JOptionPane.showInputDialog(null,
                        "¿Cuál es el símbolo utilizado para comentarios en línea en Java?");
                if (respuesta == null) {
                    return; // Salir si el usuario cancela
                } else if (respuesta.equalsIgnoreCase("//") ||
                        respuesta.equalsIgnoreCase("Diagonal") ||
                        respuesta.equalsIgnoreCase("Diagonales") ||
                        respuesta.equalsIgnoreCase("diagonal") ||
                        respuesta.equalsIgnoreCase("diagonales")) {
                    JOptionPane.showMessageDialog(null, "¡Correcto! Has ganado el juego.");
                    respuestaCorrecta = true;
                } else {
                    int intentarDeNuevo = JOptionPane.showConfirmDialog(null,
                            "Respuesta incorrecta. ¿Quieres intentar de nuevo?", "Intentar de nuevo",
                            JOptionPane.YES_NO_OPTION);
                    respuestaCorrecta = (intentarDeNuevo == JOptionPane.NO_OPTION);
                    return;
                }
            } while (!respuestaCorrecta);

            // Preguntar si desea jugar de nuevo
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?", "Menú Principal",
                    JOptionPane.YES_NO_OPTION);
            jugarDeNuevo = (opcion == JOptionPane.YES_OPTION);

        } while (jugarDeNuevo);

        JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
    }
}
