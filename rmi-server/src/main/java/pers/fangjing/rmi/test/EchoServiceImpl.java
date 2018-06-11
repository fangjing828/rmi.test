package pers.fangjing.rmi.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by fang_j on 2018/6/11.
 */
public class EchoServiceImpl extends UnicastRemoteObject implements EchoService {
    public EchoServiceImpl() throws RemoteException {
        super();
    }

    public String echo(String message) throws RemoteException {
        return "server " + message;
    }
}
