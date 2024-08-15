/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionreserva;

/**
 *
 * @author PinkyBlast
 */
public class RegistroHabitaciones {

    private Habitacion listaHabitaciones[] = new Habitacion[25];
    private int cantHabitaciones = 0;

    public RegistroHabitaciones() {
        this.listaHabitaciones[0] = new Habitacion("Suite", "Ocupada", 1, 1, 98000);
        this.listaHabitaciones[1] = new Habitacion("Individual", "Libre", 1, 2, 45000);
        this.listaHabitaciones[2] = new Habitacion("Doble", "Sucia", 1, 3, 60000);
        this.listaHabitaciones[3] = new Habitacion("Doble", "Libre", 1, 4, 60000);
        this.listaHabitaciones[4] = new Habitacion("Individual", "Ocupada", 1, 5, 45000);
        this.listaHabitaciones[5] = new Habitacion("Doble", "Sucia", 2, 6, 60000);
        this.cantHabitaciones = 6;

    }

    public boolean agregar(Habitacion habitacion) {
        if (cantHabitaciones < this.listaHabitaciones.length) { //para que el bucle siga ejecutándose.
            for (int i = 0; i < this.listaHabitaciones.length; i++) {
                if (this.listaHabitaciones[i] == null) {

                    //para almacenar
                    this.listaHabitaciones[i] = habitacion;
                    this.cantHabitaciones = cantHabitaciones + 1;
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public int modificarEstado(int numero, String estado) {
        if (cantHabitaciones > 0) {
            for (int i = 0; i < this.listaHabitaciones.length; i++) {
                if (this.listaHabitaciones[i] != null && this.listaHabitaciones[i].getEstado() == estado) {

                    //se almacena y se crea el objeto
                    this.listaHabitaciones[i].setEstado(estado);
                    return 1;
                }
            }

            //no se pueden convertir los valores string entonces para evadir error se pone el -1/-2. 
            //todo sacado de stackoverflow por si acaso, se uso para el codigo del proyecto final tambien
            return -2;
        } else {
            return -1;
        }
    }

//copy del anterior
    public int modificarTipo(int numero, String tipo) {
        if (cantHabitaciones > 0) {
            for (int i = 0; i < this.listaHabitaciones.length; i++) {
                if (this.listaHabitaciones[i] != null && this.listaHabitaciones[i].getTipo() == tipo) {

                    //se almacena y se crea el objeto
                    this.listaHabitaciones[i].setTipo(tipo);
                    return 1;
                }
            }
            return -2;
        } else {
            return -1;
        }
    }

    public int modificaPrecio(int numero, int precio) {
        if (cantHabitaciones > 0) {
            for (int i = 0; i < this.listaHabitaciones.length; i++) {
                if (this.listaHabitaciones[i] != null && this.listaHabitaciones[i].getPrecio() == precio) {

                    this.listaHabitaciones[i].setPrecio(precio);
                    return 1;
                }
            }
            return 1;
        } else {
            return 1;
        }
    }
}
