package br.com.maratona.devs.resource;

import java.util.ArrayList;
import java.util.List;

public class InscricaoHelper {

	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void init() {
		pessoas.add(new Pessoa("Kleber",1));
		pessoas.add(new Pessoa("Carlos",2));
		pessoas.add(new Pessoa("Stag", 3));
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public Pessoa findPessoa(Integer id) {
		init();
		for (Pessoa indice : pessoas) {
			if(indice.getMatricula().equals(id)) {
				return indice;
			}
		}
		return null;
	}
}
