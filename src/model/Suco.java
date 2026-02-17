package model;

public class Suco extends Produto{

    private String saborFruta;

    public Suco(String saborFruta, double preco, int estoque, String nome) {

        super(nome, preco, estoque);
        this.saborFruta = saborFruta;
    }

    public String getSaborFruta() {
        return saborFruta;
    }

    public void setSaborFruta(String saborFruta) {
        this.saborFruta = saborFruta;
    }

    @Override
    public String infoProduto() {
        return "Sabor da fruta: " + saborFruta + "\nPreço: " + getPreco() + "\nEstoque: " + getEstoque();

    }
    
}
