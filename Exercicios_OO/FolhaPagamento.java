public class FolhaPagamento{
    static Funcionario[] funcionarios = new Funcionario[]{
        new Funcionario(1, 150, 25.0f),
        new Funcionario(2, 160, 30.0f),
        new Funcionario(3, 160, 22.0f),
        new Funcionario(4, 160, 28.0f),
        new Funcionario(5, 160, 35.0f),
        new Funcionario(6, 160, 20.0f),
        new Funcionario(7, 160, 27.0f),
        new Funcionario(8, 160, 33.0f),
        new Funcionario(9, 160, 26.0f),
        new Funcionario(10, 160, 29.0f),
        new Funcionario(11, 160, 32.0f),
        new Funcionario(12, 160, 24.0f),
        new Funcionario(13, 160, 31.0f),
        new Funcionario(14, 160, 23.0f),
        new Funcionario(15, 160, 34.0f),
        new Funcionario(16, 160, 25.0f),
        new Funcionario(17, 160, 28.0f),
        new Funcionario(18, 160, 22.0f),
        new Funcionario(19, 160, 27.0f),
        new Funcionario(20, 160, 30.0f),
        new Funcionario(21, 160, 26.0f),
        new Funcionario(22, 160, 31.0f),
        new Funcionario(23, 160, 29.0f),
        new Funcionario(24, 160, 23.0f),
        new Funcionario(25, 160, 35.0f),
        new Funcionario(26, 160, 24.0f),
        new Funcionario(27, 160, 33.0f),
        new Funcionario(28, 160, 32.0f),
        new Funcionario(29, 160, 21.0f),
        new Funcionario(30, 160, 25.0f),
        new Funcionario(31, 160, 30.0f),
        new Funcionario(32, 160, 27.0f),
        new Funcionario(33, 160, 29.0f),
        new Funcionario(34, 160, 26.0f),
        new Funcionario(35, 160, 28.0f),
        new Funcionario(36, 160, 31.0f),
        new Funcionario(37, 160, 22.0f),
        new Funcionario(38, 160, 33.0f),
        new Funcionario(39, 160, 20.0f),
        new Funcionario(40, 160, 24.0f),
        new Funcionario(41, 160, 29.0f),
        new Funcionario(42, 160, 34.0f),
        new Funcionario(43, 160, 21.0f),
        new Funcionario(44, 160, 30.0f),
        new Funcionario(45, 160, 32.0f),
        new Funcionario(46, 160, 25.0f),
        new Funcionario(47, 160, 27.0f),
        new Funcionario(48, 160, 28.0f),
        new Funcionario(49, 160, 22.0f),
        new Funcionario(50, 160, 31.0f)

    };

    public static void Ordernar(){
        Funcionario Temporario;
        int n = funcionarios.length;

        for(int i = 0; i< n; i++){
            for (int j = 0; j < n - 1; j++){
                if (funcionarios[j].valorSalario < funcionarios[j + 1].valorSalario){
                    Temporario = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = Temporario;
                }
            }           
        }
    }

    public static void Exibir(){
        for(int i = 0; i < 50; i++){
            funcionarios[i].Exibir();
        }
    }

    public static void main(String[] args){
        
        System.out.println("\n:::::::::: LISTA DE FUNCIONARIOS :::::::::::");
        Exibir();

        Ordernar();

        System.out.println("\n::::::::::: LISTA DE FUNCIONARIOS ORDENADA :::::::::::");
        Exibir();
    }
}