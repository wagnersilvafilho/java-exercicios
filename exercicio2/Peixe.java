package exercicio2;

public class Peixe extends Animal{
	
	private String tipoHabitat;
	
	public Peixe(String nome, double peso, String tipoHabitat) {
		super(nome, peso);
		this.tipoHabitat = tipoHabitat;
	}

	@Override
	public String getEspecie() {
		return "Peixe";
	}

	@Override
	public void imprime() {
		System.out.println("Nome: " + this.nome + "\nPeso: " + this.peso
				+ "kg\nEspecie: " + getEspecie() + "\nTipo de Habitat: " + this.tipoHabitat + "\n");
	}

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
	
	@Override
	public int compareTo(Animal p) {
		return nome.compareTo(p.getNome());
	}
	
}
