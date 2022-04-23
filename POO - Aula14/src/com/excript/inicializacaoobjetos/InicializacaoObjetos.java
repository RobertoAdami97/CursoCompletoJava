package com.excript.inicializacaoobjetos;

//import com.excript.construtores.Janela;

class Janela{
	
	int largura, altura;
	boolean b;
	float f;
	double d;
	
	//o nome do construtor deve ser sempre o mesmo nome da classe
	public Janela(int l, int a){
		largura = l;
		altura = a;
	}
	
	void imprimir() {
		System.out.println("Altura = " + altura + ", Largura = " + largura);
	}
	
	public Janela() {
//		aqui da erro de variavel sem valor atribuido
//		int largura, altura;
//		boolean b;
//		float f;
//		double d;
		System.out.println("int = " + largura);
		System.out.println("bool = " + b);
		System.out.println("float = " + f);
		System.out.println("double = " + d);
	}
	
}

public class InicializacaoObjetos {

	public static void main(String[] args) {

		//Janela j = new Janela(250, 300);
		Janela j = new Janela();
		j.imprimir();
		
		
	}

}
