package br.com.caelum.estoque.services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.caelum.estoque.entidades.Livro;


public interface LivroService extends Remote {

	String cadastrar(Livro livro) throws RemoteException;
	
}
