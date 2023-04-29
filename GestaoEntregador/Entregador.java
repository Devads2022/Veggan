package GestaoEntregador;
public class Entregador {
    private String nome;
    private int idade;
    private String veiculo;
    private int habilatacao;

    public Entregador(String nome, int idade, String veiculo, int habilatacao) {
        this.nome = nome;
        this.idade = idade;
        this.veiculo = veiculo;
        this.habilatacao = habilatacao;
    }

    public void fazer_Entrega(String endereco) {
        System.out.println("Entregando para " + endereco);
    }

    public void verificar_Veiculo() {
        System.out.println("O entregador está utilizando um " + this.veiculo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    public int getHabilatacao() {
        return habilatacao;
    }

    public void setHabilatacao(int habilatacao) {
        this.habilatacao = habilatacao;
    }
}