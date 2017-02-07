package br.com.caelum.estoque.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import br.com.caelum.estoque.entidades.ItemEstoque;

public class EstoqueService extends UnicastRemoteObject implements EstoqueRmi {

	private static Map<String, ItemEstoque> repo = new HashMap<String, ItemEstoque>();
	
	public EstoqueService() throws RemoteException {
		super();
		repo.put("ARQ", new ItemEstoque("tdd",2));
		repo.put("SOA", new ItemEstoque("res",5));
		repo.put("TDD", new ItemEstoque("log",256));
		repo.put("RES", new ItemEstoque("log",256));
		repo.put("LOG", new ItemEstoque("log",256));
		repo.put("WEB", new ItemEstoque("log",256));
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ItemEstoque getItemEstoque(String codigo) throws RemoteException {
		System.out.println(" Obtendo item do estoque...."+codigo);
		ItemEstoque itemEstoque = repo.get(codigo);
		System.out.println("Retornando item de estoque "+ itemEstoque);
		return itemEstoque;
	}

}
