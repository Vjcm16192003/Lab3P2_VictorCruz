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
public class Cajero extends Empleados {

    /*
    : tienen nombre, apellido, salario, nacionalidad, cantidad de años
laborando en Diunsa, horario de trabajo, hora de almuerzo, meta a vender por
cada mes y cantidad de empleados atendidos. 
     */
    private String horario, meta;
    private int cant_a, hora_alm, cant_emplea;

    public Cajero(String horario, String meta, int cant_a, int hora_alm, int cant_emplea, String nombre, String apellido, String salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.horario = horario;
        this.meta = meta;
        this.cant_a = cant_a;
        this.hora_alm = hora_alm;
        this.cant_emplea = cant_emplea;
    }

    public Cajero() {
    super();
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public int getCant_a() {
        return cant_a;
    }

    public void setCant_a(int cant_a) {
        this.cant_a = cant_a;
    }

    public int getHora_alm() {
        return hora_alm;
    }

    public void setHora_alm(int hora_alm) {
        this.hora_alm = hora_alm;
    }

    public int getCant_emplea() {
        return cant_emplea;
    }

    public void setCant_emplea(int cant_emplea) {
        this.cant_emplea = cant_emplea;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cajero\n" 
                + "Horario: " + horario 
                + "\nMeta: " + meta 
                + "\nCantidad de años: " + cant_a 
                + "\nhora de almuerzo: " + hora_alm 
                + "\nCantidad de empleados: " + cant_emplea;
    }
    
    

}
