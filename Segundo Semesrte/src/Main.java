import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import  javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            ServerSocket server = new ServerSocket(12345);
            JOptionPane.showMessageDialog(null,"Conexão estabelecida na porta 12345");

            Socket clienteSocket = server.accept();
            JOptionPane.showMessageDialog(null,"Conectado a porta 12345");

            clienteThread clienteThread = new clienteThread(clienteSocket);
            clienteThread.start();
            PrintStream saida = new PrintStream(clienteSocket.getOutputStream());

            String a;

            while (true){
                System.out.println("Mensagem: ");
                String mensagem = scanner.nextLine();
                saida.println(mensagem);
            }







        } catch (IOException e) {
            System.out.println("Ai, calica");
            throw new RuntimeException(e);
        }


    }
}