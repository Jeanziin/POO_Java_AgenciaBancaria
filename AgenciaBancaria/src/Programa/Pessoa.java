package Programa;

public class Pessoa {
	
	private static int contador = 1; // tirar e colocar na agência. Quem tem pessoas é a agência
	
	private String nome;
	private String cpf;
	private String email;
	
	public Pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email; 
		contador += 1;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nCPF: " + this.getCpf() +
				"\nEmail: " + this.getEmail();
	}
	
	
}
