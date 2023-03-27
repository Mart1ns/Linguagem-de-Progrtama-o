import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lista {
   private Produtos produto;

    ArrayList<Produtos> lista = new ArrayList<>();
    public void adicionar(Produtos produto){
        lista.add(produto);
     }

     public void vender(Produtos produto, double preco){
        lista.remove(produto);
        try {
            if (!lista.contains(produto)){
                JOptionPane.showMessageDialog(null, "O produto não está na lista");
            }
        }

        catch (Exception a){
            JOptionPane.showMessageDialog(null,"Deu erro");
            if (produto.getPreco() < preco){
                JOptionPane.showMessageDialog(null, "Valor muito baixo");
            }
        }
     }

     public void exibir_lista(){
        for (int i  = 0; i < lista.size(); i++){
            JOptionPane.showMessageDialog(null, "Nome: " + lista.get(i).getNome() + ", Preço: " + lista.get(i).getPreco());
         }
        if (lista.size() == 0){
            JOptionPane.showMessageDialog(null,"Lista vazia");
        }
     }
}
