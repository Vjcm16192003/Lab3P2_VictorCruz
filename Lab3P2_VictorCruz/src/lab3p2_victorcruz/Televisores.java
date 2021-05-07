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
public class Televisores extends Articulos {
    /*estos también tienen tamaño de pantalla (en pulgadas), Smart (si o
no), marca, cantidad de conexiones y grosor*/
    private String smart,marca;
    private int tam_pan,cant_conex,grosor;

    public Televisores(String smart, String marca, int tam_pan, int cant_conex, int grosor, int num_serie, int precio, String color, String info_garan) {
        super(num_serie, precio, color, info_garan);
        this.smart = smart;
        this.marca = marca;
        this.tam_pan = tam_pan;
        this.cant_conex = cant_conex;
        this.grosor = grosor;
    }

    public Televisores() {
    super();
    }
    

    public String getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTam_pan() {
        return tam_pan;
    }

    public void setTam_pan(int tam_pan) {
        this.tam_pan = tam_pan;
    }

    public int getCant_conex() {
        return cant_conex;
    }

    public void setCant_conex(int cant_conex) {
        this.cant_conex = cant_conex;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTelevisores\n" 
                + "\nSmart TV: " + smart 
                + "\nMarca: " + marca 
                + "\nTamaño de Pantalla" + tam_pan 
                + "\nCantidad de conexiones: " + cant_conex 
                + "\nGrosor: " + grosor;
    }

    
    
    
}
