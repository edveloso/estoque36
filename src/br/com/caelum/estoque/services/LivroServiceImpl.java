package br.com.caelum.estoque.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.caelum.estoque.entidades.Livro;

public class LivroServiceImpl extends UnicastRemoteObject  implements LivroService  {

	private static final long serialVersionUID = 1L;

	public LivroServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String cadastrar(Livro livro) {
		System.out.println("Livro enviado ao servidor...");
		return "Livro salvo com sucesso...";
	}

	
	
}
