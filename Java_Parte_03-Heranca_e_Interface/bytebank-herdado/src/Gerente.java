
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha)
			return true;
		return false;
	}
	
	// Sobrescrita do getBonificacao da classe Funcionario
	// Sobrescrita: Mesma assinatura
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
}
