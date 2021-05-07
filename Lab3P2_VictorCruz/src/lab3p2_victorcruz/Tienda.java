/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_victorcruz;

import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
/*
n identificador
único (ingresado por el usuario), ubicación, cantidad máxima de empleados, cantidad
de cajas de pago, producto más vendido y cantidad máxima de artículos que puede
haber en la tienda
*/
public class Tienda {

    private String ubicacion, producto_ven;
    private int ID_unico, max_empleado, cant_cajas, max_art;
    ArrayList<Empleados> empleados = new ArrayList();
    ArrayList<Articulos> articulos = new ArrayList();
    ArrayList<Clientes> clientes = new ArrayList();

    public Tienda(String ubicacion, String producto_ven, int ID_unico, int max_empleado, int cant_cajas, int max_art) {
        this.ubicacion = ubicacion;
        this.producto_ven = producto_ven;
        this.ID_unico = ID_unico;
        this.max_empleado = max_empleado;
        this.cant_cajas = cant_cajas;
        this.max_art = max_art;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getProducto_ven() {
        return producto_ven;
    }

    public void setProducto_ven(String producto_ven) {
        this.producto_ven = producto_ven;
    }

    public int getID_unico() {
        return ID_unico;
    }

    public void setID_unico(int ID_unico) {
        this.ID_unico = ID_unico;
    }

    public int getMax_empleado() {
        return max_empleado;
    }

    public void setMax_empleado(int max_empleado) {
        this.max_empleado = max_empleado;
    }

    public int getCant_cajas() {
        return cant_cajas;
    }

    public void setCant_cajas(int cant_cajas) {
        this.cant_cajas = cant_cajas;
    }

    public int getMax_art() {
        return max_art;
    }

    public void setMax_art(int max_art) {
        this.max_art = max_art;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Articulos> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulos> articulos) {
        this.articulos = articulos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Tienda\n" 
                + "\nUbicacion: " + ubicacion 
                + "\nproducto vendido: " + producto_ven 
                + "\nIdentificador Unico: " + ID_unico 
                + "\nCantidad maxima de empleado: " + max_empleado 
                + "\nCantidad de cajeros" + cant_cajas 
                + ", max_art=" + max_art 
                + ", empleados=" + empleados 
                + ", articulos=" + articulos 
                + ", clientes=" + clientes;
    }
 
    
 
}
