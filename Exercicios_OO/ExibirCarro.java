public class ExibirCarro{

    static Carro[] carros = new Carro[]{
        new Carro("Ferrari", "SP-8", 2023, 1.650000),
        new Carro("Ferrari", "SP-8", 2023, 1.650000),
        new Carro("Ferrari", "SP-8", 2023, 1.650000),
        new Carro("Ferrari", "SP-8", 2023, 1.650000)
    };

    public static void main(String[] args){
        System.out.printf("\n");
        
        // Acessando o método exibir de cada objeto em carros
        for (Carro i : carros) {
            System.out.println("\n");
            System.out.println("A Marca do carro: " + i.getMarca());
            System.out.println("O Modelo do carro: " + i.getModelo());
            System.out.println("O Ano do carro: " + i.getAno());
            System.out.println("O Preço do carro: " + i.getPreco());
        }

        

    }
}