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
public class Articulos {
    /*Los artículos en general tienen un número de serie, precio, color e información sobre
su garantía. Los artículos se dividen en*/
   private int num_serie,precio;
   private String color,info_garan;

    public Articulos(int num_serie, int precio, String color, String info_garan) {
        this.num_serie = num_serie;
        this.precio = precio;
        this.color = color;
        this.info_garan = info_garan;
    }

    public Articulos() {
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo_garan() {
        return info_garan;
    }

    public void setInfo_garan(String info_garan) {
        this.info_garan = info_garan;
    }

    @Override
    public String toString() {
        return "Articulos\n" 
                + "\nNumero de Serie: " + num_serie 
                + "\nPrecio: " + precio 
                + "\nColor: " + color 
                + "\nInforamacion Garantia: " + info_garan;
    }
   
   
   
}
