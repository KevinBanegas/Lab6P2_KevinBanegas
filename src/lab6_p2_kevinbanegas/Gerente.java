package lab6_p2_kevinbanegas;

public class Gerente extends Persona{
    private String usuario;
    private String contra;
    private String cargo;

    public Gerente(String usuario, String contra, String cargo) {
        super();
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public Gerente() {
        super();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "usuario=" + usuario + ", contra=" + contra + ", cargo=" + cargo + '}';
    }
    
    
}
