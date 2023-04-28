package GestaoPedidos;

import java.util.*;

import GestaoCliente.Endereco;
import GestaoCliente.Restaurante;
import GestaoCliente.Usuario;

public class Pedidos {

    private int id_Pedido;
    Restaurante restaurante;
    Usuario usuario;
    Endereco endereco_Entrega;
    private double valor_pedido;
    private float taxa_Entrega;
    Date data_Pedido;

    public Pedidos(int id_Pedido, Restaurante restaurante, Usuario usuario, Endereco endereco_Entrega, double valor_pedido, float taxa_Entrega, Date data_Pedido) {
        this.id_Pedido = id_Pedido;
        this.restaurante = restaurante;
        this.usuario = usuario;
        this.endereco_Entrega = endereco_Entrega;
        this.valor_pedido = valor_pedido;
        this.taxa_Entrega = taxa_Entrega;
        this.data_Pedido = data_Pedido;
    }

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco_Entrega() {
        return endereco_Entrega;
    }

    public void setEndereco_Entrega(Endereco endereco_Entrega) {
        this.endereco_Entrega = endereco_Entrega;
    }

    public double getValor_pedido() {
        return valor_pedido;
    }

    public void setValor_pedido(double valor_pedido) {
        this.valor_pedido = valor_pedido;
    }

    public float getTaxa_Entrega() {
        return taxa_Entrega;
    }

    public void setTaxa_Entrega(float taxa_Entrega) {
        this.taxa_Entrega = taxa_Entrega;
    }

    public Date getData_Pedido() {
        return data_Pedido;
    }

    public void setData_Pedido(Date data_Pedido) {
        this.data_Pedido = data_Pedido;
    }



}
