package lab6_p2_kevinbanegas;

public class General extends Persona{
    private String ocupacion;
    private String horario;
    private int semanas;
    private double sueldo;

    public General() {
        super();
    }

    public General(String ocupacion, String horario, int semanas, double sueldo) {
        super();
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanas = semanas;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"General{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", semanas=" + semanas + ", sueldo=" + sueldo + '}';
    }
    
    
}
