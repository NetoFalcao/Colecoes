package Questao4;

public class Senha {

	private String nome;
	private int idade;
	private int cpf;
	
	
	public Senha(String nome, int idade, int cpf){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
				
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int compareTo(Senha senha){
		if (senha.getIdade() == this.idade){ return 0; }
		else if (senha.getIdade() < this.idade) { return -1; }
		else { return 1; }
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj == null){
			return false;
		} else if (obj instanceof Senha){
			Senha s = (Senha) obj;
			if (this.cpf == s.getCpf()){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		return this.nome + " " + this.idade + " " + this.cpf;
	}
	
}
