package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9445);
            System.out.println("сервер запущен");
            serverSocket.accept();
            System.out.println("клиент подключился");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            try {
//                int a = scanner.nextInt();
//                int b = scanner.nextInt();
//                System.out.println(a / b);
//            }catch (Exception e){
//                //e.printStackTrace();
//                System.out.println("no");
//            }
//        }
    }
}
