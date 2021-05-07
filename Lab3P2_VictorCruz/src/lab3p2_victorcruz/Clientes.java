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
public class Clientes {
    private String nom, ape,nacio,direcion;
    private double sal,cant_cred;
    private int cant_comp;
    private String comp_cliente;
    private String classs ="no tiene";

    public Clientes(String nom, String ape, String nacio, String direcion, double sal, double cant_cred, int cant_comp, String comp_cliente, String classs) {
        this.nom = nom;
        this.ape = ape;
        this.nacio = nacio;
        this.direcion = direcion;
        this.sal = sal;
        this.cant_cred = cant_cred;
        this.cant_comp = cant_comp;
        this.comp_cliente = comp_cliente;
        this.classs = classs;
    }

    public Clientes(String nom, String ape, String nacio, String direcion, double sal, double cant_cred, int cant_comp, String comp_cliente) {
        this.nom = nom;
        this.ape = ape;
        this.nacio = nacio;
        this.direcion = direcion;
        this.sal = sal;
        this.cant_cred = cant_cred;
        this.cant_comp = cant_comp;
        this.comp_cliente = comp_cliente;
    }
    
    

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
 

    public Clientes() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getCant_cred() {
        return cant_cred;
    }

    public void setCant_cred(double cant_cred) {
        this.cant_cred = cant_cred;
    }

    public int getCant_comp() {
        return cant_comp;
    }

    public void setCant_comp(int cant_comp) {
        this.cant_comp = cant_comp;
    }

    public String getComp_cliente() {
        return comp_cliente;
    }

    public void setComp_cliente(String comp_cliente) {
        this.comp_cliente = comp_cliente;
    }

    

    @Override
    public String toString() {
        return "Clientes\n" 
                + "\nNombre: " + nom 
                + "\nApellido: " + ape 
                + "\nNacionalidad: " + nacio 
                + "\nDirecion: " + direcion 
                + "\nSalario:  " + sal 
                + "\nCantidad de credito: " + cant_cred 
                + "\nCantidad comprado: " + cant_comp 
                + "\nCompra Cliente" + comp_cliente;
    }
    
    
}
