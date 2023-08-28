import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) throws IOException {
        Socket cliente = new Socket("localhost", 12345);
        Scanner scanner = new Scanner(System.in);

        clienteThread clienteThread = new clienteThread(cliente);
        clienteThread.start();

        PrintStream saida = new PrintStream(cliente.getOutputStream());


        String mensagem;
         do {
             System.out.println("Mensagem: ");
             mensagem = scanner.nextLine();
             saida.println(mensagem);
         } while (mensagem.equals("") || mensagem != null);
    }

}
