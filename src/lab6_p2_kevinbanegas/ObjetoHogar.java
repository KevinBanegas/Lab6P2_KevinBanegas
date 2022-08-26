package lab6_p2_kevinbanegas;

public class ObjetoHogar extends Objeto{
    private String desc;
    private String instr;
    private int garantia;

    public ObjetoHogar() {
        super();
    }

    public ObjetoHogar(String desc, String instr, int garantia) {
        super();
        this.desc = desc;
        this.instr = instr;
        this.garantia = garantia;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getInstr() {
        return instr;
    }

    public void setInstr(String instr) {
        this.instr = instr;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "ObjetoHogar{" + "desc=" + desc + ", instr=" + instr + ", garantia=" + garantia + '}';
    }
    
    
}
