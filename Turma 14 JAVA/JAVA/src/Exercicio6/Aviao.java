package Exercicio6;

public class Aviao 
{
	
	private String marcaAviao;
	private String corAviao;
	private String tamanhoAviao;

	public Aviao(String modelo, String cor, String tamanho) {
		marcaAviao = modelo;
		corAviao = cor;
		tamanhoAviao = tamanho;
	}

	public String getdadosAviao() {
		String dadosAviao = marcaAviao + " - " + corAviao + " - " + tamanhoAviao;
		return dadosAviao;
	}

}
