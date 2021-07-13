package testing1;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ("Jose Neto", "(64)92755-2714", "Rua Maria das Dores", "397.753.340-12");
		Cliente cliente2 = new Cliente ("Liliane Freire", "(64)90283-5802 ", "Rua das Araras", "428.662.730-60");
		Cliente cliente3 = new Cliente ("Seu Joao", "(64)95198-7089 ", "Rua Tamoios", "020.368.890-26");
		Cliente cliente4 = new Cliente ("Francisco Fulano", "(64)90896-3265 ", "Rua Uruguai", "397.753.340-12");
		Cliente cliente5 = new Cliente ("Betina Ciclana", "(64)91957-2818", "Rua Portugal Porto Guimaraes", "397.753.340-12");
		Fornecedor fornecedor1 = new Fornecedor("Coca-Cola", "(15) 31357-1238", "Rua Casabranca", "77.774.818/0001-96");
		Fornecedor fornecedor2 = new Fornecedor("Nike", "(63) 60811-8787", "Rua Gurupi", "56.876.320/0001-64");
		Fornecedor fornecedor3 = new Fornecedor("Adidas", "(50) 76576-0088", "Rua das Palmeiras", "48.434.028/0001-63");
		//Fornecedor fornecedor4 = new Fornecedor("Apple", "(55) 29811-4252", "Rua Estados Unidos", "81.812.699/0001-96");
		Cadastro cadastro = new Cadastro();
		cadastro.adicionaPessoa(cliente1);
		cadastro.adicionaPessoa(fornecedor1);
		cadastro.adicionaPessoa(cliente2);
		cadastro.adicionaPessoa(cliente3);
		cadastro.adicionaPessoa(fornecedor2);
		cadastro.adicionaPessoa(cliente4);
		cadastro.adicionaPessoa(cliente5);
		cadastro.adicionaPessoa(fornecedor3);
		//cadastro.adicionaPessoa(fornecedor4);
		System.out.println("\nTotal de pessoas cadastradas: " + cadastro.qtdePessoas());
		System.out.println("\nAbaixo, busca pelo cliente 'Francisco Fulano':\n");
		cadastro.obtemPessoa("Francisco Fulano").imprime();
		System.out.println("Abaixo, busca pelo fornecedor 'Nike':\n");
		cadastro.obtemPessoa("Nike").imprime();
		System.out.println("Imprimindo todas as PESSOAS (CLIENTES E FORNECEDORES) em ordem alfabetica:\n");
		cadastro.imprime(0);
		System.out.println("Imprimindo os CLIENTES em ordem alfabetica:\n");
		cadastro.imprime(1);
		System.out.println("Imprimindo os FORNECEDORES em ordem alfabetica:\n");
		cadastro.imprime(2);
		System.out.println("Porcentagem de clientes: " + cadastro.porcentagemClientes());
		System.out.println("\nPorcentagem de fornecedores: " + cadastro.porcentagemFornecedores());
		System.out.println("\nSerao removidos 'Seu Joao', 'Betina Ciclana', 'Apple' e 'Coca-Cola'\n\nRemocao sera executada...");
		cadastro.removePessoa("Seu Joao");
		cadastro.removePessoa("Betina Ciclana");
		cadastro.removePessoa("Apple");
		cadastro.removePessoa("Coca-Cola");
		System.out.println("\nRemocao finalizada...");
		System.out.println("\nImprimindo todas as PESSOAS (CLIENTES E FORNECEDORES) apos remocao:\n");
		cadastro.imprime(0);
		System.out.println("Total de pessoas cadastradas apos remocoes: " + cadastro.qtdePessoas());
		System.out.println("\nPorcentagem de clientes apos remocao: " + cadastro.porcentagemClientes());
		System.out.println("\nPorcentagem de fornecedores apos remocao: " + cadastro.porcentagemFornecedores());
	}
}
