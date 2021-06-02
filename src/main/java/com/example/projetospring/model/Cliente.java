package com.example.projetospring.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    private String nome;
    private String endereco;
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private List<Veiculo> veiculo = new ArrayList<>();

    public Cliente (){}

    public Cliente (int idCliente, String nome, String endereco, String telefone, List<Veiculo> veiculo) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public int getIdCliente () {
        return idCliente;
    }

    public void setIdCliente (int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getEndereco () {
        return endereco;
    }

    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone () {
        return telefone;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public List<Veiculo> getVeiculo () {
        return veiculo;
    }

    public void setVeiculo (List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString () {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculo=" + veiculo +
                '}';
    }
}
