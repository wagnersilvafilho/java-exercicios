package exercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class Pessoa {
	
	private ArrayList<Animal> animais = new ArrayList<>();
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void adicionaAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public void removeAnimal(String nome) {
		for (int i=0; i<animais.size(); i++) {
			if(animais.get(i).nome.equals(nome)) {
				animais.remove(i);
			}
		}
	}
	
	public Animal obtemAnimal(String nome) {
		for (int i=0; i<animais.size(); i++) {
			if(animais.get(i).nome.equals(nome)) {
				return animais.get(i);
			}
		}
		return null;
	}
	
	public int qtdeAnimais() {
		return animais.size();
	}
	
	public int qtdePeixes() {
		int aux = 0;
		for (int i=0; i<animais.size(); i++) {
			if(animais.get(i).getEspecie().equals("Peixe")) {
				 aux = aux + 1;
			}
		}
		return aux;
	}
	
	public int qtdeCachorros() {
		int aux = 0;
		for (int i=0; i<animais.size(); i++) {
			if(animais.get(i).getEspecie().equals("Cachorro")) {
				 aux = aux + 1;
			}
		}
		return aux;
	}

	public void imprime(int criterio) {
		Collections.sort(animais);
		switch (criterio) {
		case 0:
			for (int i=0; i<animais.size(); i++) {
				animais.get(i).imprime();
			}
			break;
		case 1:
			for (int i=0; i<animais.size(); i++) {
				if (animais.get(i).getEspecie().equals("Peixe")) {
					animais.get(i).imprime();
				}				
			}
			break;
		case 2:
			for (int i=0; i<animais.size(); i++) {
				if (animais.get(i).getEspecie().equals("Cachorro")) {
					animais.get(i).imprime();
				}				
			}
			break;
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIndade(int idade) {
		this.idade = idade;
	}
	
}
