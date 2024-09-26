public class Principal{

    int[] matricula = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] nome = {"João", "Maria", "Pedro", " Clara", "Jose", "Caria", "Fabio", "Mara", "Cesar", "Ana"};
    int[] idade = {14, 18, 15, 16, 17, 14, 17, 13, 16, 17};
    float[] altura = {1.75, 1.54, 1.62, 1.60, 1.65, 1.62, 1.62, 1.74, 1.61, 1.68};

    public static void main(String[] args){

    }

    public void Media(){
        double media = 0;
        double soma = 0;

        for(int i = 0; i < 10; i++){
            soma = soma + idade[i];
        }
        media = (soma / 10);
        System.out.printf("Sua média de idades será de:" + media);

    public void NomeAlunosJovens(){
        int menorIdade = Interger.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;
        String aluno1 = "", aluno2 = "";

        for(int i = 0; i < idade.lenght; i++)
            if(idade[i] < menorIdade){
                segundoMenor = menorIdade;
                aluno2 = aluno1;
                menorIdade = idade[i];
                aluno1 = nome[i];
            }
            else if (idade[i] < segundoMenor){
                segundoMenor = idade[i];
                aluno2 = nome[i];
            }
    
    public void percentual(){
        double soma = 0;
        
        for(int i = 0; i < 10; i++){
            if(idade[i] > 16 ){
                soma = soma + idade[i];
            }
        return soma * 100
        }
    }
    public void 
    }
         
    }
    
}