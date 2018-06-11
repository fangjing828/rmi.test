package pers.fangjing.rmi.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Created by fang_j on 2018/6/11.
 */
public class EchoServiceClient {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();
        EchoService echoService = (EchoService) context.lookup("rmi://localhost:1099/echoService");
        System.out.println("Echo Service RMI client started");
        String read = "";
        while (!read.equalsIgnoreCase("exit")) {
            Scanner scanner = new Scanner(System.in);
            read = scanner.nextLine();
            System.out.println("Message from EchoService RMI server:" + echoService.echo(read));
        }
    }
}
