package academico;

public class Servidor extends Pessoa 		
{
	
	private String serviço;
	private double salario;
	public String nomesocial;
		
	public Servidor(double idade, double salario) { //Construtor com argumento
		super(idade);
		System.out.println("Esse CLT recebe " + salario + " reais.");
		}
	public Servidor() { // Construtor sem argumento
		super();
		System.out.println("Esse servidor está trabalhando no campus!");
		}
		// Getters and Setters
	public String getServiço() {
		return serviço;
		}
	public void setServiço(String serviço) {
		this.serviço = serviço;
		}
	public double getSalario() {
		return salario;
		}
	public void setSalario(double salario) {
		this.salario = salario;
		}
		//Metodos
	public String nomeSocial(String nomesocial) {
		super.nomesocial = nomesocial;
		return "Seu nome: " + nomesocial + " Seu nome social: " + this.nomesocial;
		}
	public String trabalho() {
		return "Essa pessoa trabalha como " + getServiço() + " e recebe " + getSalario() + " reais.";
		}
	public String restoDoSalario(double agua, double luz) {
		return "O que sobrou do seu salario descontando água e luz foi: " + (getSalario() - (agua + luz));
		}
	}
