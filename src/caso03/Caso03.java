/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caso03;

/**
 *
 * @author isaias
 */
public class Caso03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Turista[] grupo1 = new Turista[]{new Turista("Jhon Smith"), new Turista("Martin Smith"), new Turista("Noah Smith"), new Turista("Ana Smith")};
        Turista[] grupo2 = new Turista[]{new Turista("Jhon Thatcher"), new Turista("Martin Thatcher"), new Turista("Noah Thatcher"), new Turista("Ana Thatcher")};

        Vehiculo vehiculo1 = new Vehiculo("Unidad 1", "Pepe", "Juan", grupo1);
        Vehiculo vehiculo2 = new Vehiculo("Unidad 2", "José", "Jhon", grupo2);
        Vehiculo[] _vehiculos = new Vehiculo[]{vehiculo1, vehiculo2};

        Empresa _empresa = new Empresa(_vehiculos);

        System.out.print(_empresa.listarTuristas(vehiculo1));

        System.out.print(_empresa.listarTuristas(vehiculo2));


        //Busqueda por turista
        System.out.print(_empresa.buscarTurista(grupo1[1]));


    }
}
