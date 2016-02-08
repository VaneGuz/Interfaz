/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Vanesa
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

    protected int id;

    protected String nombre;

    protected String apellidos;

    protected int edad;

    // Constructor
    public SeleccionFutbol() {
    }

    //Constructor
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse (Clase Padre)");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar (Clase Padre)");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar (Clase Padre)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
