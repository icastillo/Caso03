/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caso03;

/**
 *
 * @author isaias
 */
public class Empresa {

    private Vehiculo[] vehiculos;
    public static String nombre = "Empresa de turismo para la tercera edad";
    public static String direccion = "Javier Prado 325 San Isidro";

    public  Empresa(Vehiculo[] vehiculo) {
        this.vehiculos = vehiculo;
    }

    public String listarTuristas(Vehiculo vehiculo) {
        String lista = Empresa.nombre + "\nDirección :" + Empresa.direccion + "\n\nVehículo: " + this.nombre + ", Listado de turistas:\n";
        for (int i = 0; i < vehiculo.turista.length; i++) {
            lista += (i + 1) + ") " + vehiculo.turista[i].nombre + "\n";
        }

        return lista;
    }

    public String buscarTurista(Turista turista) {
        String mensaje = "";

        for (int i = 0; i < vehiculos.length; i++) {

            Turista[] _turista = vehiculos[i].turista;

            for (int x = 0; x < _turista.length; x++) {
                if (_turista[x].nombre.equals(turista.nombre)) {
                    mensaje = "\nSoy "+ _turista[x].nombre +" y estoy en el vehiculo: " + vehiculos[i].nombre + "\n";
                }
            }
        }

        return mensaje;
    }
}
