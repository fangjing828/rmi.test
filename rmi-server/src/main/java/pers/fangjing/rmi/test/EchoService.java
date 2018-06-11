package pers.fangjing.rmi.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by fang_j on 2018/6/11.
 */
public interface EchoService extends Remote{
    String echo(String message) throws RemoteException;
}
