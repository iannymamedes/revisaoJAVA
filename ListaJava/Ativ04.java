package ListaJava;

public class Ativ04 {

    private double IPI;
    private int peca01;
    private double unitario01;
    private int quantidade01;
    private int peca02;
    private double unitario02;
    private int quantidade02;

    public Ativ04(double IPI, int peca01, double unitario01, int quantidade01, int peca02, double unitario02, int quantidade02) {
        this.IPI = IPI;
        this.peca01 = peca01;
        this.unitario01 = unitario01;
        this.quantidade01 = quantidade01;
        this.peca02 = peca02;
        this.unitario02 = unitario02;
        this.quantidade02 = quantidade02;
    }

    public double calcValorTotal(){
        double valorTotal = (unitario01*quantidade01 + unitario02*quantidade02)*(IPI/100 + 1);
        return valorTotal;
    }

    public double getIPI() {
        return IPI;
    }

    public void setIPI(double IPI) {
        this.IPI = IPI;
    }

    public int getPeca01() {
        return peca01;
    }

    public void setPeca01(int peca01) {
        this.peca01 = peca01;
    }

    public double getUnitario01() {
        return unitario01;
    }

    public void setUnitario01(double unitario01) {
        this.unitario01 = unitario01;
    }

    public int getQuantidade01() {
        return quantidade01;
    }

    public void setQuantidade01(int quantidade01) {
        this.quantidade01 = quantidade01;
    }

    public int getPeca02() {
        return peca02;
    }

    public void setPeca02(int peca02) {
        this.peca02 = peca02;
    }

    public double getUnitario02() {
        return unitario02;
    }

    public void setUnitario02(double unitario02) {
        this.unitario02 = unitario02;
    }

    public int getQuantidade02() {
        return quantidade02;
    }

    public void setQuantidade02(int quantidade02) {
        this.quantidade02 = quantidade02;
    }
}
