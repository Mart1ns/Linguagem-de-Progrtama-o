public class Produtos {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    {}
    public Produtos(String nome, Double  preco){
        this.nome = nome;
        this.preco = preco;
    }
}
