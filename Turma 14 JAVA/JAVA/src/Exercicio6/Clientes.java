package Exercicio6;

public class Clientes 
{

	private String nomeCliente;
	private String genCliente;
	private int nasciCliente;
	private String cidadeCliente;

	public Clientes(String nome, String gen, int nasci, String cidade) {
		nomeCliente = nome;
		genCliente = gen;
		nasciCliente = nasci;
		cidadeCliente = cidade;
	}

	public String getdadosClientes() {
		String dadosClientes = nomeCliente + " - " + genCliente + " - " + nasciCliente+ " - " + cidadeCliente;
		return dadosClientes;
	}

}
