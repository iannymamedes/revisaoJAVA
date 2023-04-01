package MainJava;
import ListaJava.Ativ02;


public class Main02 {

    public static void main(String[] args) {
        Ativ02 media01 = new Ativ02(8, 9, 7);
        Ativ02 media02 = new Ativ02(4, 5, 6);

        System.out.println(media01.media());
        System.out.println(media02.media());
        System.out.println((media01.media()+media02.media())/2);
    }
}

