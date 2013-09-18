/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caso03;

/**
 *
 * @author isaias
 */
public class Vehiculo {

    private int capacidad = 5;
    public String nombre;
    private String conductor;
    private String guia;
    public Turista[] turista;

    public Vehiculo(String nombre, String conductor, String guia, Turista[] turista) {
        this.nombre = nombre;
        this.turista = turista;
        this.conductor = conductor;
        this.guia = guia;
    }
}
