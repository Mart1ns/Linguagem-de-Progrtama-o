import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {

    public String getListaNome() {
        return "listaNome";
    }

    public String getListaUltimoNome() {
        return "listaUltimoNome";
    }

    public String getListaNomeDoMeio() {
        return "listaNomeDoMeio";
    }

    List<String> listaNome = new ArrayList<String>();

    List<String> listaUltimoNome = new ArrayList<String>();

    List<String> listaNomeDoMeio = new LinkedList<String>();

}
