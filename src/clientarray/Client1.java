package clientarray;

import rmiInterface.MyArray;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client1 {
    public static void main(String[] args) throws NotBoundException, RemoteException,MalformedURLException {
        String url = "//localhost:1099/Array";
        MyArray Q = (MyArray) Naming.lookup(url);
        System.out.println("RMI object found");
        while (true)
            System.out.println(Q.Sum());
    }



}
