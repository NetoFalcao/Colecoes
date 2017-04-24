package Questao4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GerenciadorDeSenhas {

	private int senhaEmitida;
	private Queue<Senha> senhas;
	private boolean prioridadePorIdade;
	
	
	public void emitirSenha(String nome, int idade, int cpf){
		Senha senha = new Senha(nome, idade, cpf);
		senhas.offer(senha); 
	}
	
	public GerenciadorDeSenhas(boolean prioridadePorIdade){
		if (prioridadePorIdade){
			 senhas = new PriorityQueue<Senha>();
		} else {
			senhas = new LinkedList<Senha>();
		}
	}
	
	public Senha proximaSenha(){
		return senhas.poll();
	}

	public int getSenhaEmitida() {
		return senhaEmitida;
	}

	public void setSenhaEmitida(int senhaEmitida) {
		this.senhaEmitida = senhaEmitida;
	}

	public boolean getPrioridadePorIdade(){
		return prioridadePorIdade;
	}
	
	public Queue<Senha> getSenhas(){
		return this.senhas;
	}
	
}
