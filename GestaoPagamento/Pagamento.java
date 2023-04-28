package GestaoPagamento;

import java.util.Date;

public class Pagamento {

       private int num_Cartao, cod_Cartao, boleto;
       private String nome_Cartao, opcao_Cartao, pix;
       double valor_Compra;
       Date data_Compra;

    public Pagamento(int num_Cartao, int cod_Cartao, int boleto, String nome_Cartao, String opcao_Cartao, String pix, double valor_Compra, Date data_Compra) {
        this.num_Cartao = num_Cartao;
        this.cod_Cartao = cod_Cartao;
        this.boleto = boleto;
        this.nome_Cartao = nome_Cartao;
        this.opcao_Cartao = opcao_Cartao;
        this.pix = pix;
        this.valor_Compra = valor_Compra;
        this.data_Compra = data_Compra;
    }

    public int getNum_Cartao() {
        return num_Cartao;
    }

    public void setNum_Cartao(int num_Cartao) {
        this.num_Cartao = num_Cartao;
    }

    public int getCod_Cartao() {
        return cod_Cartao;
    }

    public void setCod_Cartao(int cod_Cartao) {
        this.cod_Cartao = cod_Cartao;
    }

    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }

    public String getNome_Cartao() {
        return nome_Cartao;
    }

    public void setNome_Cartao(String nome_Cartao) {
        this.nome_Cartao = nome_Cartao;
    }

    public String getOpcao_Cartao() {
        return opcao_Cartao;
    }

    public void setOpcao_Cartao(String opcao_Cartao) {
        this.opcao_Cartao = opcao_Cartao;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public double getValor_Compra() {
        return valor_Compra;
    }

    public void setValor_Compra(double valor_Compra) {
        this.valor_Compra = valor_Compra;
    }

    public Date getData_Compra() {
        return data_Compra;
    }

    public void setData_Compra(Date data_Compra) {
        this.data_Compra = data_Compra;
    }
}
