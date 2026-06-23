package projetoFinal;

public class Professor extends Pessoa {

	private String especialidade;
	
	public Professor(String matricula, String nomeCompleto, double dataNascimento,String especialidade) {
		super(matricula, nomeCompleto, dataNascimento);
		this.especialidade = especialidade;
	}
	
	public void setEspecialidade(String especialidade){
		if(especialidade.matches("\\d+") != false || especialidade.isEmpty() || especialidade == null ) {
			System.out.println("Especialidade invalido");
		}else {
			System.out.println("Especialidade valido");
			this.especialidade = especialidade;
		}
	}
	
	public String getEspecialidade(){
		return especialidade;
	}
	
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Especialidade: "+ especialidade);
	}
}
