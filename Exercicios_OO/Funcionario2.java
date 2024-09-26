public class Funcionario2{
    private String nome;
    private double salario;
    private String cargo;

     /*Crie uma classe Funcionario com os atributos privados: nome, salario, e cargo.*/

    public Funcionario2(String nome, double salario,String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getnome(){
        return nome;
    }

    public double getsalario(){
        return salario;
    }

    public String getcargo(){
        return cargo;
    }

    public void setnome( String nome){
        this.nome = nome;
    }

    public void setsalario(double salario){
        this.salario = salario;
    }

    public void setcargo( String cargo){
        this.cargo = cargo;
    }

    /*O salário deve ser protegido de modificação direta. Crie um método aumentarSalario(double percentual) que só permita aumentos de até 20%.*/

    public double aumentarSalario(){
       double total = 0;
       return total = setsalario * 1.20;
    }

    /*O cargo só pode ser modificado por um método promover(String novoCargo), e só se o cargo anterior for compatível com o novo 
    (adicione uma validação básica para isso).*/

    public String promover(){
        String novoCargo;
        String auxiliar = "auxiliar";
        String analista = "analista";
        String gerente = "gerente";
        String diretor = "diretor";

        if (getcargo == auxiliar){
            novoCargo = analista;
            setcargo = novoCargo;
        }

        if (getcargo == analista){
            novoCargo = gerente;
            setcargo = novoCargo;
        }

        if (getcargo == gerente){
            novoCargo = diretor;
            setcargo = novoCargo;
        }

        return setcargo;
    }

    /*Crie métodos para exibir os dados completos do funcionário.*/

    public void Exibir(){
        system.out.printf("\n");
        System.out.printf("Nome do Funcionario é", getnome);
        System.out.printf("O Salario do Funcionario é:", getsalario);
        System.out.printf("O crago do Funcionario é:", getcargo);
        system.out.printf("\n");
    }
}