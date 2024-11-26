package exercicios_linx;

public class Douctor implements Personagem{

	@Override
	public void direita() {
		System.out.print("Moveu um para a direita!");
		
	}

	@Override
	public void esquerda() {
		// TODO Auto-generated method stub
		System.out.print("Moveu um para a esquerda!");
	}

	@Override
	public void cima() {
		// TODO Auto-generated method stub
		System.out.print("Moveu um para cima!");
		
	}

	@Override
	public void baixo() {
		// TODO Auto-generated method stub
		System.out.print("Moveu um para baixo!");
		
	}

	@Override
	public void falar(String palavra) {
		// TODO Auto-generated method stub
		String diz = null;
		System.out.print(diz);
		
	}

	@Override
	public void pensar() {
		// TODO Auto-generated method stub
		System.out.print("o que estou fazendo?");
		
	}

}
