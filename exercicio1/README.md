# java-polimorfismo
Exercício Java Polimorfismo

## Exercício 1

* A classe abstrata Pessoa, raiz da hierarquia de classes, deverá conter atributos para armazenar os seguintes dados sobre uma pessoa: nome, telefone e endereço (todos tipo string).

> Essa classe define dois métodos abstratos: (a) void imprime() que imprime na saída os atributos do objeto e (b) string getTipo().

> A classe deve ter um construtor capaz de setar todos atributos. Esse constrututor deve ser único.

* A classe Cliente, subclasse da classe Pessoa, deverá conter o seguinte atributo: CPF (tipo string) do cliente. A classe deve ter um construtor único capaz de setar todos atributos. O método string getTipo() deve retornar a string "Cliente".

* A classe Fornecedor, subclasse da classe Pessoa, deverá conter o seguinte atributo: CNPJ (tipo string) do fornecedor. A classe deve ter um construtor único capaz de setar todos atributos. O método string getTipo() deve retornar a string "Fornecedor".

* A classe Cadastro que armazena uma coleção de pessoas e que deve conter pelo menos os seguintes métodos:
- bool adicionaPessoa(Pessoa p). Adiciona uma pessoa (cliente ou fornecedor) ao cadastro.
- Pessoa obtemPessoa(string nome). Retorna a pessoa (cliente ou fornecedor) cujo nome é igual ao parâmetro passado.
- bool removePessoa(string nome). Remove a pessoa (cliente ou fornecedor) cujo nome é igual ao parâmetro passado.
- void imprime(int criterio). Imprime as pessoas do cadastro. Esse método deve obrigatoriamente invocar o método void imprime() definido na classe Pessoa.
	> criterio = 0. Imprime todas as pessoas (ordenadas pelo atributo nome).
	> criterio = 1. Imprime apenas os clientes (ordenadas pelo atributo nome).
	> criterio = 2. Imprime apenas os fornecedores (ordenadas pelo atributo nome).
* int qtdePessoas(). Método que retorna o número de pessoas (clientes ou fornecedores) no cadastro.
* double porcentagemClientes(). Método que retorna a porcentagem 0 <= P <= 1 de clientes no cadastro.
* double porcentagemFornecedores(). Método que retorna a porcentagem 0 <= P <= 1 de fornecedores no cadastro.
