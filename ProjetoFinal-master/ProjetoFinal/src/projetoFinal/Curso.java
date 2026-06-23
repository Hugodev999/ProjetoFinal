package projetoFinal;

public class Curso {
}

private int codigo;
private String nomeCurso;
private int cargaHoraria;

//Cria associação entre Curso e Professor
private Professor professorResponsavel;

//Construtor
public Curso(int codigo, String nomeCurso, int cargaHoraria, Professor professorResponsavel){
    this.codigo = codigo;
    this.nomeCurso = nomeCurso;
    this.cargaHoraria = cargaHoraria;
    this.professorResponsavel = professorResponsavel;

}

//Getters e setters
public int getCodigo(){
    return codigo;
}

public void setCodigo(){
    this.codigo = codigo;
}

public String getNomeCurso(){
    return nomeCurso;
}

public void setNomeCurso(){
    this.nomeCurso = nomeCurso;
}

public int getCargaHoraria(){
    return cargaHoraria;
}

public void setCargaHoraria(){
    this.cargaHoraria = cargaHoraria;
}

public Professor getProfessorResponsavel(){
    return professorResponsavel;
}

public void setProfessorResponsavel(){
    this.professorResponsavel = professorResponsavel;
}

//Mostrar os dados
public void exibirDados() {
    System.out.println("Informações do curso.");
    System.out.println("Código" + this.codigo);
    System.out.println("Curso" + this.nomeCurso);
    System.out.println("Carga Horária" + this.cargaHoraria + "horas");
    System.out.println("Professor responsável" + this.professorResponsavel.getNomeCompleto());
}