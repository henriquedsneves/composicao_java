package oo.composição.Desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<CompraDesafio> compras = new ArrayList<>(); 
	Cliente(String nome){
		this.nome = nome;
	}
	double obterValorTotal() {
		double total= 0;
		for(CompraDesafio compra: compras) {
			total += compra.obterValorTotal();
		}
	
	return total;
	
	}
}
	
