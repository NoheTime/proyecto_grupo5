/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.banco;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
/**
 * Clase para administrar los tiquetes del banco
 * @author Jeffry Canales
 */
public class TicketManager {
    private static final int FILAS_PRIORIDAD = 3;

    private Ticket[] filaPrioridadP;
    private Ticket[] filaPrioridadA;
    private Ticket[] filaPrioridadB;

    public TicketManager() {
        filaPrioridadP = new Ticket[FILAS_PRIORIDAD];
        filaPrioridadA = new Ticket[FILAS_PRIORIDAD];
        filaPrioridadB = new Ticket[FILAS_PRIORIDAD];
    }

    public void crearTiquete() {
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su identificación (ID)"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        
        // Mostrar ejemplos de tipos de trámite
        JOptionPane.showMessageDialog(null, "Ejemplos de tipos de trámite: \n" +
            "- Depósito\n" +
            "- Retiro\n" +
            "- Cambio de Divisas");

        String tramite = JOptionPane.showInputDialog("Ingrese el tipo de trámite");

        // Mostrar ejemplos de tipos de tiquete
        JOptionPane.showMessageDialog(null, "Ejemplos de tipos de tiquete: \n" +
            "- P: Preferencial\n" +
            "- A: Atención especial\n" +
            "- B: Tiquete normal");

        char tipo = JOptionPane.showInputDialog("Ingrese el tipo de tiquete (P, A o B)").charAt(0);

        Ticket nuevoTiquete = new Ticket(nombre, id, edad, tramite, tipo);
        nuevoTiquete.setHoraAtencion(LocalDateTime.now());

        // Asignar el tiquete a la fila correspondiente según su tipo y tamaño de fila
        if (nuevoTiquete.getTipo() == 'P') {
            agregarTiqueteFilaPrioridad(nuevoTiquete, filaPrioridadP);
        } else if (nuevoTiquete.getTipo() == 'A') {
            agregarTiqueteFilaPrioridad(nuevoTiquete, filaPrioridadA);
        } else if (nuevoTiquete.getTipo() == 'B') {
            agregarTiqueteFilaPrioridad(nuevoTiquete, filaPrioridadB);
        }

        
        // Imprimir informacion del tiquete (SOLO PRUEBA)
        System.out.println("Tiquete creado");
        System.out.println("nombre: " + nuevoTiquete.getNombre());
        System.out.println("ID: " + nuevoTiquete.getId());
        System.out.println("Tramite: " + nuevoTiquete.getTramite());
        System.out.println("Tipo: " + nuevoTiquete.getTipo());
        System.out.println("Hora de creacion: " + nuevoTiquete.getHoraCreacion());
        
        
        
        

    }

    

    private void agregarTiqueteFilaPrioridad(Ticket tiquete, Ticket[] fila) {
        // Buscar la primera posición vacía en la fila y asignar el tiquete
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] == null) {
                fila[i] = tiquete;
                break;
            }
        }
    }
    
    // ...
}