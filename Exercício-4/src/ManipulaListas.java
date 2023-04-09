import java.util.*;
import javax.swing.*;

public class ManipulaListas {

    public void adicionaNaLista(List lista, String item){
        lista.add(item);
    }

    public void verificaTamanhoDaLista(List lista){
        System.out.println(lista.size());
    }

    public void exibeElementosDaLista(List lista){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public void exibeUmElementoDaLista(List lista, int indice){
        System.out.println(lista.get(indice));
    }

    public void removeItemUnico(List lista, int indice){
        try{
            lista.remove(indice);
        }
        catch (Exception e){
            if(lista.size() < indice){
                System.out.println("A lista é menor que o índice indicado.");
            }
        }
    }

    public void removeItensDaLista(List lista){
        if(!lista.isEmpty()){
            lista.clear();
        }
    }


    public boolean verificaListaVazia(List lista){
        if(lista.isEmpty())
            return true;
        else
            return false;
    }

    public void removeUmItem(List lista, String item) {
        try {
            lista.remove(item);
        } catch (Exception e) {
            if(!lista.contains(item)){
                System.out.println("A lista não contém " + item);
            }
        }
    }


    public void comparaListas(List lista1, List lista2){
        if(lista1.equals(lista2))
            System.out.println("A lista é igual!");
        else
            System.out.println("A lista é diferente!");
    }

    public void juntarListas(List lista1, List lista2, List lista3){

        for (int i = 0; i < lista2.size(); i++){
            lista1.add(lista2.get(i));
        }

        for (int i = 0; i < lista3.size(); i++){
            lista1.add(lista3.get(i));
        }

    }

    public void contemUmNaLista(List lista1, List lista2){
        for (Object item2 : lista2){
            if(lista1.contains(item2)){
                System.out.println("Contém pelo menos um elemento.");
                break;
            }
            else{
                System.out.println("A primeira lista não contém nenhum elemento da segunda.");
            }
        }

    }

    public void contemTodosNaLista(List lista1, List lista2){
        for (Object item2 : lista2){
            if(!(lista1.contains(item2))){
                System.out.println("Não contém todos.");
                break;
            }
            else{
                System.out.println("Contém todos os elementos.");
                break;
            }
        }

    }

    public void removeUmaListaDaOutra(List lista1, List lista2){
        for (Object item2 : lista2){
            if(lista1.contains(item2)){
                removeUmItem(lista1, item2.toString());
            }
        }
    }

}


