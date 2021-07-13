package testing1;

public class Cliente extends Pessoa{

	private String cpf;
	
	public Cliente(String nome, String telefone, String endereco, String cpf) {
		super(nome, telefone, endereco);
		this.cpf = cpf;
	}

	@Override
	public void imprime() {
		System.out.println("Cliente: " + this.nome + "\nTelefone: " + this.telefone
				+ "\nEndereco: " + this.endereco + "\nCPF: " + this.cpf + "\n");				
	}

	@Override
	public String getTipo() {
		return "Cliente";
	}

	@Override
	public int compareTo(Pessoa p) {
		return nome.compareTo(p.getNome());
	}
	
}


