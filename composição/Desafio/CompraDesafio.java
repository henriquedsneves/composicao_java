package oo.composição.Desafio;

import java.util.ArrayList;
import java.util.List;

public class CompraDesafio {

	List<ItemDesafio> itens = new ArrayList<>();
	void adicionarItem(Produto p, int qtde) {
		
		
	}
void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome,preco);
		this.itens.add(new ItemDesafio(produto, qtde));
		
	}
	double obterValorTotal() {
		double total = 0;
		for(ItemDesafio item: itens) {
			total += item.quantidade * item.produto.preco;
					
		}
		return total;
	}
	
	
}
