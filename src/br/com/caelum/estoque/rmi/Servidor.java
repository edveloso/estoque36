package br.com.caelum.estoque.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import br.com.caelum.estoque.services.EstoqueService;

public class Servidor {
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		LocateRegistry .createRegistry(1099);
		Naming.bind("estoque", new EstoqueService() );
		System.out.println("Servidor no ar");
	}

}
