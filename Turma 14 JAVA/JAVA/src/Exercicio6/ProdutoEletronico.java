package Exercicio6;

public class ProdutoEletronico 
{
	private String nomeProduto;
	private String marcaProduto;
	private String lojaProduto;

	public ProdutoEletronico(String nome, String marca, String loja) {
		nomeProduto = nome;
		marcaProduto = marca;
		lojaProduto = loja;
	}

	public String getdadosProduto() {
		String dadosProduto = nomeProduto + " - " + marcaProduto + " - " + lojaProduto;
		return dadosProduto;
	}
	
	
}
