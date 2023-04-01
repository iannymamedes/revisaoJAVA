package ListaJava;

public class Ativ05 {

    private double salarioMinimo;
    private double salarioUsuario;

    public Ativ05(double salarioMinimo, double salarioUsuario) {
        this.salarioMinimo = salarioMinimo;
        this.salarioUsuario = salarioUsuario;
    }

    public double calcQuantiSalMin(){
        double quantiSalMin = salarioUsuario / salarioMinimo;
        return quantiSalMin;
    }
}
