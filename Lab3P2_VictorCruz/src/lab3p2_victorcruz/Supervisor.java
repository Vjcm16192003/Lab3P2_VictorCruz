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
public class Supervisor  extends Empleados{
    /*
    cajeros que supervisa
actualmente, salario promedio de los empleados que supervisa y meta promedio
de cada cajero que supervisa. Tenga en cuenta que debe existir al menos un
supervisor para asignarle cajeros a supervisar.

    */
    private String prom_sal,meta_prom;
    ArrayList <Cajero> sup_caj = new ArrayList();

    public Supervisor(String prom_sal, String meta_prom, String nombre, String apellido, String salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.prom_sal = prom_sal;
        this.meta_prom = meta_prom;
    }

    public Supervisor() {
    super();
    }

    public String getProm_sal() {
        return prom_sal;
    }

    public void setProm_sal(String prom_sal) {
        this.prom_sal = prom_sal;
    }

    public String getMeta_prom() {
        return meta_prom;
    }

    public void setMeta_prom(String meta_prom) {
        this.meta_prom = meta_prom;
    }

    public ArrayList<Cajero> getSup_caj() {
        return sup_caj;
    }

    public void setSup_caj(ArrayList<Cajero> sup_caj) {
        this.sup_caj = sup_caj;
    }

    @Override
    public String toString() {
        return super.toString()+"Supervisor\n" 
                + "\nSalario Promedio: " + prom_sal 
                + "\nMeta Promedio" + meta_prom 
                + "\nLista de Cajeros que Supervisa=" + sup_caj;
    }

    
    
    
    
}
