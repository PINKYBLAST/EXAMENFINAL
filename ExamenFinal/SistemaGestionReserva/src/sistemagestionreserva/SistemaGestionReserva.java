/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionreserva;

import javax.swing.JOptionPane;

/**
 *
 * @author PinkyBlast
 */
public class SistemaGestionReserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int index = 0;
        do {
            index = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE GESTION HOTEL\n"
                    + "1)REGISTRO HABITACIONES\n" + "2)ESTADO DEL HOTEL\n" + "3)CONTABILIDAD\n" + "Ingrese el numero de la opcion\n"));

            switch (index) {
                case 1:
                    while (index != 0) {
                        index = Integer.parseInt(JOptionPane.showInputDialog("MENU REGISTRO HABITACIONES\n"
                                + "1)AGREGAR HABITACION\n" + "2)MODIFICAR ESTADO\n" + "3)MODIFICAR TIPO\n"
                                + "4)MODIFICAR PRECIO\n" + "5)LISTA TOTAL HABITACIONES\n" + "0)REGRESAR AL MENU PRINCIPAL\n"
                                + "Ingrese el numero de la opcion\n"));
                        switch (index) {
                            case 1:
                                RegistroHabitaciones.agregar(new habitacion(
                                        JOptionPane.showInputDialog("Ingrese el tipo"),
                                        JOptionPane.showInputDialog("Ingrese el estado"),
                                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el piso"))));
                                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitacion"))));
                                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio")))));
                                break;
            
    }

                        
}
