public class Funcionario{
    private int codigo = 0;
    private float quantidadeHoras = 0;
    private float valorHora = 0;
    private float valorSalario = 0;
    private float quantidadeHorasExtras = 0;

    public Funcionario( int codigo, float quantidadeHoras, float valorHora){
        this.codigo = codigo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
        CalcularSalario();
    }

    public int Get codigo(){
        return codigo;
    }

    public void set codigo(int codigo){
        this.codigo = codigo;
    }


    public float quantidadeHoras(){}

    public void set quantidadeHoras( float quantidadeHoras){
        this.quantidadeHoras = quantidadeHoras;
    }

    public float CalcularHoraExtra(){
        float total = 0;
        float valorExtra = 0;
        valorExtra = valorHora * (1+(50/100));
        total = quantidadeHorasExtras * valorExtra;
        return total;
    }

    public void CalcularSalario(){
        float total = 0;
        total = (valorHora * quantidadeHoras) + CalcularHoraExtra();
        valorSalario = total;
    }

    public void Exibir(){
        System.out.println("\n");
        System.out.println("Funcionario: " + codigo);
        System.out.println("Quantidade de horas: " + quantidadeHoras);
        System.out.println("Salario: " + valorSalario);
    }

    

}