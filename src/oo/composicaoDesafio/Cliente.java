package oo.composicaoDesafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	List<Compra> compras = new ArrayList<Compra>();
}
