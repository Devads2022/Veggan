package GestaoCliente;

public class Restaurante {

    public Restaurante(int cad_Restaurante, int cnpj, Endereco endereco, String noome_Fantasia, String hora_Funcionamento, double valor) {
        this.cad_Restaurante = cad_Restaurante;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.noome_Fantasia = noome_Fantasia;
        this.hora_Funcionamento = hora_Funcionamento;
        this.valor = valor;
    }
       private int cad_Restaurante, cnpj;
        Endereco endereco;
       private String noome_Fantasia, hora_Funcionamento;
        private double valor;

    public void setCad_Restaurante(int cad_Restaurante) {
        this.cad_Restaurante = cad_Restaurante;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setNoome_Fantasia(String noome_Fantasia) {
        this.noome_Fantasia = noome_Fantasia;
    }

    public void setHora_Funcionamento(String hora_Funcionamento) {
        this.hora_Funcionamento = hora_Funcionamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCad_Restaurante() {
        return cad_Restaurante;
    }

    public int getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNoome_Fantasia() {
        return noome_Fantasia;
    }

    public String getHora_Funcionamento() {
        return hora_Funcionamento;
    }

    public double getValor() {
        return valor;
    }

    void adicionarProduto(){

    }
    boolean confirmar_Pedido(){
        return false;
    }

}
