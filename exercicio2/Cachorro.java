package exercicio2;

public class Cachorro extends Animal{
	
	private String raca;
	
	public Cachorro(String nome, double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
	}

	@Override
	public String getEspecie() {
		return "Cachorro";
	}

	@Override
	public void imprime() {
		System.out.println("Nome: " + this.nome + "\nPeso: " + this.peso
				+ "kg\nEspecie: " + getEspecie() + "\nRaca: " + this.raca + "\n");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public int compareTo(Animal p) {
		return nome.compareTo(p.getNome());
	}
	
}
