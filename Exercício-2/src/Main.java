import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Produtos carro = new Produtos("corsa", 1500.0);
        Produtos moto = new Produtos("suzuki", 8900.0);
        Lista add = new Lista();
        add.adicionar(carro);
        add.adicionar(moto);


        add.exibir_lista();




    }
}
