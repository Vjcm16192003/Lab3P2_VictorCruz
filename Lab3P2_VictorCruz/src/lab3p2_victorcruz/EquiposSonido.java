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
public class EquiposSonido extends Articulos {
    private int cant_a,pot_m,cant_p,cant_dsic,cant_pU;

    public EquiposSonido(int cant_a, int pot_m, int cant_p, int cant_dsic, int cant_pU, int num_serie, int precio, String color, String info_garan) {
        super(num_serie, precio, color, info_garan);
        this.cant_a = cant_a;
        this.pot_m = pot_m;
        this.cant_p = cant_p;
        this.cant_dsic = cant_dsic;
        this.cant_pU = cant_pU;
    }

    public EquiposSonido() {
    super();
    }

    public int getCant_a() {
        return cant_a;
    }

    public void setCant_a(int cant_a) {
        this.cant_a = cant_a;
    }

    public int getPot_m() {
        return pot_m;
    }

    public void setPot_m(int pot_m) {
        this.pot_m = pot_m;
    }

    public int getCant_p() {
        return cant_p;
    }

    public void setCant_p(int cant_p) {
        this.cant_p = cant_p;
    }

    public int getCant_dsic() {
        return cant_dsic;
    }

    public void setCant_dsic(int cant_dsic) {
        this.cant_dsic = cant_dsic;
    }

    public int getCant_pU() {
        return cant_pU;
    }

    public void setCant_pU(int cant_pU) {
        this.cant_pU = cant_pU;
    }

    @Override
    public String toString() {
        return "EquiposSonido\n" 
                + "Cantidad Altavoces: " + cant_a 
                + "\nPotencia Maxima: " + pot_m 
                + "\nCantidad Puertos AUX: " + cant_p 
                + "\nCantidad de Discos: " + cant_dsic 
                + "\nCantidas de Puertos USB: " + cant_pU;
    }
    
    
}
