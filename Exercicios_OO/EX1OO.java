public class Aluno{
    int matricula = 0;
    String nome = 0;
    int idade = 0;
    float altura = 0.0;

    public void exibir(){
        System.out.printf(matricula, nome, idade, altura)
    }

    public aluno(int matricula, String nome, int idade, float altura){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}