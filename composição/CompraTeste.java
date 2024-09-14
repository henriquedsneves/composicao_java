package oo.composição;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Henrique";
		c1.itens.add(new Item("Caneta", 20, 5.10));
		c1.itens.add(new Item("borracha", 10, 1.70));
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}

}
