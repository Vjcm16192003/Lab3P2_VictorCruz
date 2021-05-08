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
public class Asesor extends Empleados{
    /*
    clientes a los
que ha atendido, cantidad de productos que han comprado sus clientes y
número total de créditos concedidos
    */
    private int cred_con,cant_prod;
    private String cli_aten;

    public Asesor(int cred_con, int cant_prod, String cli_aten) {
        this.cred_con = cred_con;
        this.cant_prod = cant_prod;
        this.cli_aten = cli_aten;
    }

    public Asesor(int cred_con, int cant_prod, String cli_aten, String nombre, String apellido, String salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.cred_con = cred_con;
        this.cant_prod = cant_prod;
        this.cli_aten = cli_aten;
    }

    

    public int getCred_con() {
        return cred_con;
    }

    public void setCred_con(int cred_con) {
        this.cred_con = cred_con;
    }

    public int getCant_prod() {
        return cant_prod;
    }

    public void setCant_prod(int cant_prod) {
        this.cant_prod = cant_prod;
    }

    public String getCli_aten() {
        return cli_aten;
    }

    public void setCli_aten(String cli_aten) {
        this.cli_aten = cli_aten;
    }

   

    @Override
    public String toString() {
        return super.toString()+"\nAsesor\n" 
                + "\nCredito Concedido: " + cred_con 
                + "\nCantidad de productos: " + cant_prod 
                + "\ncli_aten: " + cli_aten;
    }
    
    
    
}
