package exercicios_linx;

public class Douctor implements Personagem{

	@Override
	public void direita() {
		System.out.println("Moveu um para a direita!");
		
	}

	@Override
	public void esquerda() {
		// TODO Auto-generated method stub
		System.out.println("Moveu um para a esquerda!");
	}

	@Override
	public void cima() {
		// TODO Auto-generated method stub
		System.out.println("Moveu um para cima!");
		
	}

	@Override
	public void baixo() {
		// TODO Auto-generated method stub
		System.out.println("Moveu um para baixo!");
		
	}
	String diz;
	@Override
	public void falar(String palavra) {
		// TODO Auto-generated method stub
		diz = palavra ;
		System.out.println(diz);
		
	}

	@Override
	public void pensar() {
		// TODO Auto-generated method stub
		System.out.println("o que estou fazendo?");
		
	}

}
