
public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	
	// Assinatura: metodo publico, retorna um double, nome getBonificacao, sem nenhum parametro.
	public double getBonificacao() {
		return this.getSalario() * .1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
