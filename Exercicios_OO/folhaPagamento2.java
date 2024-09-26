public class folhaPgamento2{
    static Funcionario2[] funcionarios = new Funcionario2[]{
        new funcionario("joão", 1.450, "auxiliar" ),
        new funcionario("Carla", 2.890, "analista"),
        new funcionario("Mario", 4.500, "gerente"),
        new funcionario("Maria", 8.480, "diretor")
    };

    public static void main(String[] args){
        System.out.println("\n:::::::::: LISTA DE FUNCIONARIOS :::::::::::");
        Exibir();

        promover();
        aumentarSalario();

         System.out.println("\n::::::::::: LISTA DE FUNCIONARIOS MODIFICADA:::::::::::");
         Exibir();
    }
}