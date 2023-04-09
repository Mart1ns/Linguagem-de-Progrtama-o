import java.util.List;
import java.util.Scanner;
public class InputDoUsuario {
    String mensagemInputUsuario = "Insira dois nomes (sem números) para a ";
    Lista listas = new Lista();
    Scanner scan = new Scanner(System.in);
    ManipulaListas manipulaListas = new ManipulaListas();
    String item;

    public void validaInput(String item) throws RuntimeException{
        if (item.matches("(.*)[0-9](.*)")){
            throw new ExcecaoContemNumero();
        }
    }
    public void adicionaNaListaNome(){

        System.out.println(mensagemInputUsuario + listas.getListaNome());

        item = scan.next();
        validaInput(item);
        manipulaListas.adicionaNaLista(listas.listaNome, item);

        item = scan.next();
        validaInput(item);
        manipulaListas.adicionaNaLista(listas.listaNome, item);
    }


    public void adicionaNaListaNomeDoMeio(){

        System.out.println(mensagemInputUsuario + listas.getListaNomeDoMeio());

        item = scan.next();
        validaInput(item);
        manipulaListas.adicionaNaLista(listas.listaNomeDoMeio, item);

        item = scan.next();
        validaInput(item);
        manipulaListas.adicionaNaLista(listas.listaNomeDoMeio, item);

    }

    public void adicionaNaListaUltimoNome(){

        System.out.println(mensagemInputUsuario + listas.getListaUltimoNome());

        item = scan.next();
        validaInput(item);
        manipulaListas.adicionaNaLista(listas.listaUltimoNome, item);

        item = scan.next();
        validaInput(item);
        manipulaListas.adicionaNaLista(listas.listaUltimoNome, item);

    }
}
