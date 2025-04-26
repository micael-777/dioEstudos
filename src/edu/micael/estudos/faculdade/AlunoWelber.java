package edu.micael.estudos.faculdade;

public class AlunoWelber {
    String nome;
    int idade;

    public AlunoWelber(String nomeAluno, int idadeAluno){
        this.nome = nomeAluno;
        this.idade = idadeAluno;
    }
    public void exibirDados(){
        System.out.println(nome + " - " + idade );
    }

}
