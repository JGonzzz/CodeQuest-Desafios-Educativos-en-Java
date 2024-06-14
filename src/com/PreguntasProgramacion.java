import javax.swing.JOptionPane;

public class PreguntasProgramacion {
    public static void jugar() {
        boolean jugarDeNuevo;

        do {
            String respuesta;

            respuesta = JOptionPane.showInputDialog(null, "¿En qué año fue lanzado Java?");
            if (respuesta == null) {
                return; // Salir si el usuario cancela
            } else if (respuesta.equals("1995")) {
                JOptionPane.showMessageDialog(null, "¡Correcto! Pasas a la siguiente pregunta.");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Fin del juego.");
                return;
            }

            respuesta = JOptionPane.showInputDialog(null, "¿Qué significa 'OOP' en programación?");
            if (respuesta == null) {
                return; // Salir si el usuario cancela
            } else if (respuesta.equalsIgnoreCase("Programación Orientada a Objetos") || respuesta.equalsIgnoreCase("Programacion Orientada a Objetos") || respuesta.equalsIgnoreCase("Object Oriented Programming") || respuesta.equalsIgnoreCase("programacion orientada a objetos")|| respuesta.equalsIgnoreCase("Object Oriented Programming") || respuesta.equalsIgnoreCase("programación orientada a objetos")){
                JOptionPane.showMessageDialog(null, "¡Correcto! Pasas a la siguiente pregunta.");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Fin del juego.");
                return;
            }

            respuesta = JOptionPane.showInputDialog(null, "¿Cuál es el símbolo utilizado para comentarios en línea en Java?");
            if (respuesta == null) {
                return; // Salir si el usuario cancela
            } else if (respuesta.equals("//")) {
                JOptionPane.showMessageDialog(null, "¡Correcto! Has ganado el juego.");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Fin del juego.");
            }

            // Preguntar si desea jugar de nuevo
            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?", "Menú Principal", JOptionPane.YES_NO_OPTION);
            jugarDeNuevo = (opcion == JOptionPane.YES_OPTION);

        } while (jugarDeNuevo);

        JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
    }
}
