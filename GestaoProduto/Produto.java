package GestaoProduto;
import GestaoCliente.Restaurante;
public class Produto {

    private int cod_Produto, estoque_Produto;
    private String descricao_Produto, cardapio;
    double valor_Produto;
    Restaurante restaurante;

    public Produto(int cod_Produto, int estoque_Produto, String descricao_Produto, String cardapio, double valor_Produto, Restaurante restaurante) {
        this.cod_Produto = cod_Produto;
        this.estoque_Produto = estoque_Produto;
        this.descricao_Produto = descricao_Produto;
        this.cardapio = cardapio;
        this.valor_Produto = valor_Produto;
        this.restaurante = restaurante;
    }

    public int getCod_Produto() {
        return cod_Produto;
    }

    public void setCod_Produto(int cod_Produto) {
        this.cod_Produto = cod_Produto;
    }

    public int getEstoque_Produto() {
        return estoque_Produto;
    }

    public void setEstoque_Produto(int estoque_Produto) {
        this.estoque_Produto = estoque_Produto;
    }

    public String getDescricao_Produto() {
        return descricao_Produto;
    }

    public void setDescricao_Produto(String descricao_Produto) {
        this.descricao_Produto = descricao_Produto;
    }

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }

    public double getValor_Produto() {
        return valor_Produto;
    }

    public void setValor_Produto(double valor_Produto) {
        this.valor_Produto = valor_Produto;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
