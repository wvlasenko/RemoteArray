package rmiInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyArray extends Remote {
    public void Add(Integer v) throws RemoteException;
    public int Sum() throws RemoteException;
}
