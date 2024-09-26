/*Criar uma classe Carro com atributos privados e métodos públicos de acesso.*/
/* Crie uma classe Carro com os atributos privados: marca, modelo, ano e preco.*/

public class Carro{
    
    private String Marca;
    private String Modelo;
    private int Ano;
    private double Preco;

    public Carro(String Marca, String Modelo, int Ano, double Preco){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Preco = Preco;
    }

/*  Crie métodos get e set para cada atributo*/

    public String getMarca(){
        return Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public int getAno(){
        return Ano;
    }

    public double getPreco(){
        return Preco;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }

    public void setAno(int Ano){
        this.Ano = Ano;
    }

/*No método setPreco(), adicione uma validação para que o preço não possa ser negativo.*/
    public void setPreco(float Preco){
        if(Preco >= 0){
            this.Preco = Preco;
        }
        else{
            System.out.printf("Esse valor é negativo por tanto é invalido");
        }
    }

}
/*Use a palavra-chave private para os atributos e public para os métodos.*/
