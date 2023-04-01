package ListaJava;

public class Ativ01 {

    private int anos;
    private int meses;
    private int dias;

    public Ativ01(){

    }

    public Ativ01(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int calculcarTotalDias(){
        int idadeDias = (anos * 365) + (meses * 30) + dias;
        return idadeDias;
    }
}

