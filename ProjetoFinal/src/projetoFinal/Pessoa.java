package projetoFinal;

abstract public class  Pessoa {

	private String matricula;
	private String nomeCompleto;
	private double dataNascimento;
	private int dia;
	private int mes;
	private int ano;
	
	public  Pessoa(String matricula,String nomeCompleto,double dataNascimento) {
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
	}
	
	//verificando se a matricula é um numero de 8 digitos,nao vazia e composta por somentes numeros e colocar a matricula
	public void setMatricula(String matricula) {
		if(matricula.matches("\\d+") == false || matricula.isEmpty() || matricula == null || matricula.length() != 8) {
			System.out.println("matricula invalida");
		}else {
			System.out.println("matricula aceita");
			this.matricula = matricula;
		}
	}
	
	//verificando  se é um nome composto por somente letras e nao ser vazia e colocando o nome
	public void setNomeCompleto(String nomeCompleto) {
		if(nomeCompleto.matches("\\d+") != false || nomeCompleto.isEmpty() || nomeCompleto == null ) {
			System.out.println("nome invalido");
		}else {
			System.out.println("nome valido");
			this.nomeCompleto = nomeCompleto;
		}
	}
	
	//verificando e colocando a matricula
	//Obs:para funcionar a data de nascimento deve ser parecido com o exemplo:(15112006)
	public void setDataNascimento(double dataNascimento) {
		double numeroGuardado;
		int numeroTransformado;
		int dia;
		int mes;
		int ano;
		
		//dividindo o dia,mes e ano para para a verificaçao
		numeroGuardado = dataNascimento / 1000000;
		numeroTransformado = (int) numeroGuardado;
		dia = numeroTransformado;
		
		
		
		numeroGuardado = numeroGuardado - dia;
		numeroGuardado = numeroGuardado *100;
		numeroTransformado = (int) numeroGuardado;
		mes = numeroTransformado;
		
		numeroGuardado = numeroGuardado - mes;
		numeroGuardado = numeroGuardado * 10000;
		numeroTransformado = (int) numeroGuardado;
		ano = numeroTransformado + 1;
		
		//verificando as condiçoes para ver se estar correto
		if(dia > 30 || dia < 0 || mes > 12 || mes < 0 || ano >= 2026 || ano < 1900) {
			System.out.println("Data de nascimento invalido");
		}else {
			System.out.println("Data de nascimento valido");
			this.dataNascimento = dataNascimento;
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public double getDataNascimento() {
		return dataNascimento;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+ nomeCompleto);
		System.out.println("Data de nascimento: "+ dia + "/" + mes + "/" + ano);
		System.out.println("Matricula: "+ matricula);
	}
	
}
