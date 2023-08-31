/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Alumno
 */
public class Habitación {
    private int numero;
    private String tipo_habitación;
    private String capacidad;
    private String numero_habitaciones;
    private String numero_baños;
    private String descripción;
    private String disponibilidad;
    private String precio_habitación;
    private String precio_día;

    public String getPrecio_habitación() {
        return precio_habitación;
    }

    public void setPrecio_habitación(String precio_habitación) {
        this.precio_habitación = precio_habitación;
    }

    public String getPrecio_día() {
        return precio_día;
    }

    public void setPrecio_día(String precio_día) {
        this.precio_día = precio_día;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo_habitación() {
        return tipo_habitación;
    }

    public void setTipo_habitación(String tipo_habitación) {
        this.tipo_habitación = tipo_habitación;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(String numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getNumero_baños() {
        return numero_baños;
    }

    public void setNumero_baños(String numero_baños) {
        this.numero_baños = numero_baños;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
