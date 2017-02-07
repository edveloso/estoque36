package br.com.caelum.estoque.rmi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import br.com.caelum.estoque.entidades.Autor;
import br.com.caelum.estoque.entidades.ItemEstoque;

public class TestaEscritaObjetos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	  try(ObjectOutputStream oos= 
			  new ObjectOutputStream(new FileOutputStream("itens.bin"))
			  ){
//		  ItemEstoque item1 = new ItemEstoque("ARQ",2, new Autor("jose"));
//		  ItemEstoque item2 = new ItemEstoque("SOA",3);
//		  List<ItemEstoque> itens = Arrays.asList(item1,item2);
//		  oos.writeObject(itens);
//		  oos.flush();
	  }
	  
	}
	
	
}
