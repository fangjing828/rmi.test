package pers.fangjing.rmi.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by fang_j on 2018/6/11.
 */
public class EchoServiceServer {
    public static void main(String[] args) throws RemoteException, NamingException {
        LocateRegistry.createRegistry(1099);
        EchoService echoService = new EchoServiceImpl();
        Context context = new InitialContext();
        context.rebind("rmi://localhost:1099/echoService", echoService);
        System.out.println("Echo Service RMI server started");
    }
}
