package academico;
	public class Pessoa { //Classe super
		public String nomesocial;
		private String nome;
		private String email;
		private double idade;
		private String sobrenome;
		private String sexo;
		
		public Pessoa(double idade) { //Construtor com argumento
			System.out.println("Bem vindo ao Sistema Academico");
			this.idade = idade;
			if(idade < 18) {
				System.out.println("Essa pessoa não pode responder por si mesma.");
			}
			else {
				System.out.println("Essa pessoa pode responder por si mesma.");
			}
		}
		public Pessoa() { // Construtor sem argumento
			System.out.println("Bem vindo ao Sistema Academico");
		}
		// Getters and Setters
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
		public double getIdade() {
			return idade;
		}
		public void setIdade(double idade) {
			this.idade = idade;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
	}
