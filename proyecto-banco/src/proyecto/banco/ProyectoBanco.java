/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.banco;

/**
 *
 * @author Jeffry Canales
 */
public class ProyectoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Config configObj = new Config();
        configObj.createFile();
        configObj.setUpConfig();

        // Ticket
        TicketManager ticketManager = new TicketManager();
        ticketManager.crearTiquete();
    }

    
    
}
