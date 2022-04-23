package com.excript.palavrachave;

class Janela{
	
	int largura, altura;
	
	
	//o nome do construtor deve ser sempre o mesmo nome da classe
	//por padrão do java, a variavel que esta sendo usada dentro do metodo e/ou construtor
	//tem a preferencia em relação a variavel que foi definida na classe.
	public Janela(int largura, int altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	public Janela() {
		this(100, 100);
		System.out.println("int = " + largura);
	}
	
	void imprimir() {
		System.out.println("Altura = " + altura + ", Largura = " + largura);
	}
	
}

public class PalavraChaveThis {

	public static void main(String[] args) {

		Janela j = new Janela();
		
		j.imprimir();
			
	}

}
