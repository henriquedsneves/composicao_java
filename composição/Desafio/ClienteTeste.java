 package oo.composição.Desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		CompraDesafio compra1 = new CompraDesafio();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem("notbook",4000, 1);
		
		CompraDesafio compra2 = new CompraDesafio();
		compra2.adicionarItem("notbook",5000, 3);
		
		Cliente cliente = new Cliente("Hernique Neves");
		cliente.compras.add(compra1);
		
		System.out.println(cliente.obterValorTotal());
		
		
	}

}
