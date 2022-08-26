package lab6_p2_kevinbanegas;

import java.awt.Color;

public class Objeto {
    private Color color;
    private String descripcion;
    private String marca;
    private int tamaño;
    private String calidad;
    private Persona persona;

    public Objeto() {
    }

    public Objeto(Color color, String descripcion, String marca, int tamaño, String calidad, Persona persona) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamaño = tamaño;
        this.calidad = calidad;
        this.persona = persona;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", calidad=" + calidad + ", persona=" + persona + '}';
    }
    
    
}
