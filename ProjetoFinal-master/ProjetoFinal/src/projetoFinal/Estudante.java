package projetoFinal;

public class Estudante extends Pessoa {

	public Estudante(String matricula, String nomeCompleto, double dataNascimento) {
		super(matricula, nomeCompleto, dataNascimento);
		// TODO Auto-generated constructor stub
	}
	
	public String getNomeCompleto() {
		return super.getNomeCompleto();
	}
	
	public String getMatricula(){
		return super.getMatricula();
	}
	
	public double getDataNascimento() {
	    return super.getDataNascimento();
	}
	

}
