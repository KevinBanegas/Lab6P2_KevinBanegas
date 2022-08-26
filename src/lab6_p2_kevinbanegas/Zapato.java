/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6_p2_kevinbanegas;


public class Zapato extends Objeto{
    private String talla;
    private String descSuela;
    private int comodidad;

    public Zapato() {
        super();
    }

    public Zapato(String talla, String descSuela, int comodidad) {
        super();
        this.talla = talla;
        this.descSuela = descSuela;
        this.comodidad = comodidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDescSuela() {
        return descSuela;
    }

    public void setDescSuela(String descSuela) {
        this.descSuela = descSuela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapato{" + "talla=" + talla + ", descSuela=" + descSuela + ", comodidad=" + comodidad + '}';
    }
    
    
}
