
public class Pessoa {
	private String nome;
	private String email;
	private float salario;
	
	// Construtor
	public Pessoa(String nome, String email, float salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	//Gets and Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
