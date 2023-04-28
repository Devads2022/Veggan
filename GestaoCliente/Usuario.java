package GestaoCliente;

public class Usuario {

    private long cd_Usuario;
    Restaurante restaurante;
    Endereco endereco;
    private String nome_Usuario, email, senha;

    public Usuario(long cd_Usuario, Restaurante restaurante, Endereco endereco, String nome_Usuario, String email, String senha) {
        this.cd_Usuario = cd_Usuario;
        this.restaurante = restaurante;
        this.endereco = endereco;
        this.nome_Usuario = nome_Usuario;
        this.email = email;
        this.senha = senha;
    }

    public long getCd_Usuario() {
        return cd_Usuario;
    }

    public void setCd_Usuario(long cd_Usuario) {
        this.cd_Usuario = cd_Usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome_Usuario() {
        return nome_Usuario;
    }

    public void setNome_Usuario(String nome_Usuario) {
        this.nome_Usuario = nome_Usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
