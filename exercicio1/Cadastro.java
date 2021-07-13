package exercicio1;

import java.util.*;

public class Cadastro {
	
	private ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public Boolean adicionaPessoa(Pessoa p) {
		pessoas.add(p);
		return true;
	}
	
	public Pessoa obtemPessoa(String nome) {
		for (int i=0; i<pessoas.size(); i++) {
			if(pessoas.get(i).nome.equals(nome)) {
				return pessoas.get(i);
			}
		}
		return null;
	}
	
	public Boolean removePessoa(String nome) {
		for (int i=0; i<pessoas.size(); i++) {
			if(pessoas.get(i).nome.equals(nome)) {
				pessoas.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void imprime(int criterio) {
		Collections.sort(pessoas);
		switch (criterio) {
		case 0:
			for (int i=0; i<pessoas.size(); i++) {
				pessoas.get(i).imprime();
			}
			break;
		case 1:
			for (int i=0; i<pessoas.size(); i++) {
				if (pessoas.get(i).getTipo().equals("Cliente")) {
					pessoas.get(i).imprime();
				}				
			}
			break;
		case 2:
			for (int i=0; i<pessoas.size(); i++) {
				if (pessoas.get(i).getTipo().equals("Fornecedor")) {
					pessoas.get(i).imprime();
				}				
			}
			break;
		}
	}
	
	public int qtdePessoas() {
		return pessoas.size();
	}
	
	public double porcentagemClientes() {
		int aux = 0;
		for (int i=0; i<pessoas.size(); i++) {
			if(pessoas.get(i).getTipo().equals("Cliente")) {
				 aux = aux + 1;
			}
		}
		return (double)aux/pessoas.size();
	}
	
	public double porcentagemFornecedores() {
		int aux = 0;
		for (int i=0; i<pessoas.size(); i++) {
			if(pessoas.get(i).getTipo().equals("Fornecedor")) {
				 aux = aux + 1;
			}
		}
		return (double)aux/pessoas.size();
	}

}
