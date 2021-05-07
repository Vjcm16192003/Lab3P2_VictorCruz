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
public class Consolas extends Articulos {
    /*estas tienen marca, cantidad de almacenamiento (en GB), cantidad de
controles, número de accesorios e información de la tarjeta de video*/
    private int cant_almace,cant_contr,num_acc;
    private String marca,info_VC;

    public Consolas(int cant_almace, int cant_contr, int num_acc, String marca, String info_VC, int num_serie, int precio, String color, String info_garan) {
        super(num_serie, precio, color, info_garan);
        this.cant_almace = cant_almace;
        this.cant_contr = cant_contr;
        this.num_acc = num_acc;
        this.marca = marca;
        this.info_VC = info_VC;
    }

    public Consolas() {
    super();
    }

    public int getCant_almace() {
        return cant_almace;
    }

    public void setCant_almace(int cant_almace) {
        this.cant_almace = cant_almace;
    }

    public int getCant_contr() {
        return cant_contr;
    }

    public void setCant_contr(int cant_contr) {
        this.cant_contr = cant_contr;
    }

    public int getNum_acc() {
        return num_acc;
    }

    public void setNum_acc(int num_acc) {
        this.num_acc = num_acc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getInfo_VC() {
        return info_VC;
    }

    public void setInfo_VC(String info_VC) {
        this.info_VC = info_VC;
    }

    @Override
    public String toString() {
        return "Consolas\n" 
                + "\nCantidad Almacenamiento: " + cant_almace 
                + "\nCantidad Controles: " + cant_contr 
                + "\nNumero accesorios: " + num_acc 
                + "\nMarca: " + marca 
                + "\ninformacion Tarjeta de Video: " + info_VC;
    }
    
    
    
    
}
