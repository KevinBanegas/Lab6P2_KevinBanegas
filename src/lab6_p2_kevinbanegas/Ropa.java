package lab6_p2_kevinbanegas;

public class Ropa extends Objeto{
    private String talla;
    private String tela;
    private String pais;

    public Ropa() {
        super();
    }

    public Ropa(String talla, String tela, String pais) {
        super();
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tela=" + tela + ", pais=" + pais + '}';
    }
    
    
}
