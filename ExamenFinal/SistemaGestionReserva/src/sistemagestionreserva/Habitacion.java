/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionreserva;

/**
 *
 * @author PinkyBlast
 */
public class Habitacion {
    //Tipo, estado y ubicacion de la habitacion
    
    private String tipo,estado;
    private int piso, numero, precio;

    public Habitacion(String tipo, String estado, int piso, int numero, int precio) {
        this.tipo = tipo;
        this.estado = estado;
        this.piso = piso;
        this.numero = numero;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString(){
        return "Habitacion:" + "\nTipo: " + tipo + "\nEstado" + estado +"\nPiso" + piso + "\nNumero" + numero + "\nPrecio" + precio + "||"; 
    }    
}
