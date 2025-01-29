package academico;
public class Aluno extends Pessoa{ //Subclasse Aluno
   private String curso;
	private int periodo;
	public String nomesocial;
	public Aluno(double idade, int periodo) { //Construtor da subclasse chamando o da super(com argumentos)
		super(idade);
		System.out.println("Esse aluno ta no P" + periodo + " e é um botzin");
	}
	public Aluno() { //Construtor da subclase chamando o da super(sem argumento)
		super();
		System.out.println("Esse aluno ta matriculado formalmente no campus.");
	}
	//Getters and Setters
	public String getCurso()
	{
		return curso;
	}
	public void setCurso(String curso)
	{
		this.curso = curso;
	}
	public int getPeriodo()
	{
		return periodo;
	}
	public void setPeriodo(int periodo)
	{
		this.periodo = periodo;
	}
	//Metodos
	public String nomeSocial(String nomesocial) {
		super.nomesocial = nomesocial;
		return "Seu nome: " + nomesocial + " Seu nome social: " + this.nomesocial;
	}
	public String infDoCurso(String infDoCurso) {
		return "Esse aluno cursa " + curso + ": " + infDoCurso;
	}
	public String periodosleft() {
		return "Falta " + (6-periodo) + " periodos para esse aluno finalizar seu curso.";
	}
}
