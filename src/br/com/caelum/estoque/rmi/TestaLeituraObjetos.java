package br.com.caelum.estoque.rmi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.estoque.entidades.ItemEstoque;

public class TestaLeituraObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		  try(
				  ObjectInputStream ois = 
				  new ObjectInputStream(new FileInputStream("itens.bin"))
				  ){
			  List<ItemEstoque> itens = (List<ItemEstoque>) ois.readObject();
			  System.out.println("\n\n Relatório de Serialização");
			  System.out.println("+---------------+");
			  for (ItemEstoque itemEstoque : itens) {
				System.out.print("| "+itemEstoque.getQuantidade());
				System.out.println("    |  " + itemEstoque.getQuantidade()+ "   |");
				System.out.println("+---------------+   ");
			  }
			  
		  }
	}
}
