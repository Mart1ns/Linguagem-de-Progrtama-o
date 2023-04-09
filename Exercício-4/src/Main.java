import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ExcecaoContemNumero {
        ManipulaListas manipulaListas = new ManipulaListas();
        Lista listas = new Lista();
        InputDoUsuario input = new InputDoUsuario();


        input.adicionaNaListaNome();
        input.adicionaNaListaNomeDoMeio();
        input.adicionaNaListaUltimoNome();

        // Adicione todos os elementos da lista 2 e 3 para a lista 1.
        manipulaListas.juntarListas(listas.listaNome, listas.listaNomeDoMeio, listas.listaUltimoNome);

        // Verifique se um elemento da lista 2 contém na lista 1.
        manipulaListas.contemUmNaLista(listas.listaNome, listas.listaNomeDoMeio);

        // Verifique se todos os elementos da lista 3 estão na lista 1.
        manipulaListas.contemTodosNaLista(listas.listaNome, listas.listaUltimoNome);

        // Verifique se a lista 1 é igual a lista 2.
        manipulaListas.comparaListas(listas.listaNome,listas.listaNomeDoMeio);


        // Mostre o elemento 2 de cada lista
        manipulaListas.exibeUmElementoDaLista(listas.listaNome, 1);
        manipulaListas.exibeUmElementoDaLista(listas.listaNomeDoMeio, 1);
        manipulaListas.exibeUmElementoDaLista(listas.listaUltimoNome, 1);

        // Remova um elemento da lista 3.
        manipulaListas.removeItemUnico(listas.listaUltimoNome, 0);

        // Remova os elementos da lista 3 da lista 1.
        manipulaListas.removeUmaListaDaOutra(listas.listaNome, listas.listaUltimoNome);
        // Verifique o tamanho da lista 1.
        manipulaListas.verificaTamanhoDaLista(listas.listaNome);
        // Limpe a lista 3.
        manipulaListas.removeItensDaLista(listas.listaUltimoNome);

        // Verifique se a lista 3 está vazia.
        System.out.println(manipulaListas.verificaListaVazia(listas.listaUltimoNome));

        // Mostre cada elemento da lista 1.
        manipulaListas.exibeElementosDaLista(listas.listaNome);

    }


}