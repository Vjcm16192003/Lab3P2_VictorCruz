/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Empleados {

     private String nombre, apellido, salario, nacionalidad;

    public Empleados(String nombre, String apellido, String salario, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
    }
     
    public Empleados() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Empleados\n" 
                + "Nombre: " + nombre 
                + "\nApellido: " + apellido 
                + "\nSalario: " + salario 
                + "\nNacionalidad: " + nacionalidad;
    }
    
    
    
}
