/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conection;

/**
 *
 * @author USER
 */
class Personas {
    private String Nombre;
    private String Dni;

    public Personas(String Nombre, String Dni) {
        this.Nombre = Nombre;
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    void setNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


