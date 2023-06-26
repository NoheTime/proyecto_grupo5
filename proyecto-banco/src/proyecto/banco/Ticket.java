/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.banco;
import java.time.LocalDateTime;

/**
 *
 * @author quitar
 */
public class Ticket {
    private String nombre;
    private int id;
    private int edad;
    private LocalDateTime horaCreacion;
    private String tramite;
    private char tipo;
    private LocalDateTime horaAtencion;

    public Ticket(String nombre, int id, int edad, String tramite, char tipo) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.tramite = tramite;
        this.tipo = tipo;
        this.horaCreacion = LocalDateTime.now();
        this.horaAtencion = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public String getTramite() {
        return tramite;
    }

    public char getTipo() {
        return tipo;
    }

    public LocalDateTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDateTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }
}
