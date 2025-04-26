package edu.micael.estudos.faculdade;

public class CadastroAluno {
    public static void main(String[] args) {

        AlunoWelber aluno = new AlunoWelber("Lucca", 20);
        AlunoWelber aluno2 = new AlunoWelber("João", 24);

        aluno.exibirDados();
        aluno2.exibirDados();

    }
}
