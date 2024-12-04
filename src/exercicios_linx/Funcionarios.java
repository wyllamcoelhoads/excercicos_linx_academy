package exercicios_linx;

public abstract class Funcionarios {
	private float salario = 0;
	public abstract void receberPagamento();
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
