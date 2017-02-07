package br.com.caelum.estoque.services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.caelum.estoque.entidades.ItemEstoque;

public interface EstoqueRmi extends Remote{

	ItemEstoque getItemEstoque(String codigo) throws RemoteException;
	
}
