package exercicio2;

public abstract class Animal implements Comparable<Animal>{
	
	protected String nome;
	protected double peso;
	
	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public abstract String getEspecie();
	
	public void imprime() {
		System.out.println("Nome: " + this.nome + "\nPeso: " + this.peso
				+ "\nEspecie: " + getEspecie());
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
